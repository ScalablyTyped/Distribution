package typings.languageTags.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note that all lookups and checks for tags and subtags are case insensitive. For formatting according to common
  * conventions, see `tag.format`.
  */
@js.native
trait Tags extends js.Object {
  /**
    * Check whether a hyphen-separated tag is valid and well-formed.
    */
  def apply(tag: String): typings.languageTags.tagMod.^ = js.native
  /**
    * Shortcut for `tags(tag).valid()`. Return `true` if the tag is valid, `false` otherwise. For meaningful error
    * output see `tag.errors()`.
    */
  def check(tag: String): Boolean = js.native
  /**
    * Returns the file date for the underlying data, as a string.
    *
    * ```
    * > tags.date();
    * '2004-06-28'
    * ```
    */
  def date(): String = js.native
  /**
    * The opposite of `tags.subtags(subtags)`. Returns an array of codes that are not registered subtags, otherwise
    * returns an empty array.
    *
    * ```
    * > tags.filter(['en', 'Aargh']);
    * ['Aargh']
    * ```
    */
  def filter(tags: js.Array[String]): js.Array[String] = js.native
  /**
    * Convenience method to get a single 'language' type subtag. Can be used to validate an input value as a language
    * subtag. Returns a `Subtag` object or `null`.
    *
    * ```
    * > tags.language('en');
    * Subtag
    * > tags.language('us');
    * null
    * ```
    */
  def language(subtag: String): typings.languageTags.subtagMod.^  | Null = js.native
  /**
    * Returns an array of `Subtag` objects representing all the 'language' type subtags belonging to the given
    * 'macrolanguage' type subtag.
    *
    * Throws an error if `macrolanguage` is not a macrolanguage.
    *
    * ```
    * > tags.languages('zh');
    * [Subtag, Subtag...]
    * > tags.languages('en');
    * Error: 'en' is not a valid macrolanguage.
    * ```
    */
  def languages(macrolanguage: String): js.Array[typings.languageTags.subtagMod.^] = js.native
  /**
    * As above, but with 'region' type subtags.
    *
    * ```
    * > tags.region('mt');
    * Subtag
    * > tags.region('en');
    * null
    * ```
    */
  def region(subtag: String): typings.languageTags.subtagMod.^  | Null = js.native
  /**
    * Search for tags and subtags by description. Supports either a RegExp object or a string for `description`.
    * Returns an array of `Subtag` and `Tag` objects or an empty array if no results were found.
    *
    * Note that `Tag` objects in the results represent 'grandfathered' or 'redundant' tags. These are excluded by
    * default. Set the `all` parameter to `true` to include them.
    *
    * Search is case-insensitive if `description` is a string.
    */
  def search(description: String): js.Array[typings.languageTags.subtagMod.^  | typings.languageTags.tagMod.^ ] = js.native
  def search(description: String, all: Boolean): js.Array[typings.languageTags.subtagMod.^  | typings.languageTags.tagMod.^ ] = js.native
  def search(description: RegExp): js.Array[typings.languageTags.subtagMod.^  | typings.languageTags.tagMod.^ ] = js.native
  def search(description: RegExp, all: Boolean): js.Array[typings.languageTags.subtagMod.^  | typings.languageTags.tagMod.^ ] = js.native
  /**
    * Look up one or more subtags. Returns an array of `Subtag` objects. Returns an empty array if all of the subtags
    * are non-existent.
    *
    * Calling `tags.subtags('mt')` will return an array with two `Subtag` objects: one for Malta (the 'region' type
    * subtag) and one for Maltese (the 'language' type subtag).
    *
    * ```
    * > tags.subtags('mt');
    * [Subtag, Subtag]
    * > tags.subtags('bumblebee');
    * []
    * ```
    *
    * To get or check a single subtag by type use `tags.language(subtag)`, `tags.region(subtag)` or
    * `tags.type(subtag, type)`.
    */
  def subtags(tag: String): js.Array[typings.languageTags.subtagMod.^] = js.native
  def subtags(tag: js.Array[String]): js.Array[typings.languageTags.subtagMod.^] = js.native
  /**
    * Get a subtag by type. Returns the subtag matching `type` as a `Subtag` object otherwise returns `null`.
    *
    * A `type` consists of one of the following strings: 'language', 'extlang', 'script', 'region' or 'variant'. To get
    * a 'grandfathered' or 'redundant' type tag use `tags(tag)`.
    *
    * ```
    * > tags.type('zh', 'macrolanguage');
    * Subtag
    * > tags.type('zh', 'script');
    * null
    * ```
    */
  def `type`(subtag: String, `type`: String): typings.languageTags.subtagMod.^  | Null = js.native
}

