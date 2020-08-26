package typings.languageTags.tagMod

import typings.languageTags.languageTagsStrings.grandfathered
import typings.languageTags.languageTagsStrings.redundant
import typings.languageTags.languageTagsStrings.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * For grandfathered or redundant tags, returns a date string reflecting the date the tag was added to the registry.
    */
  def added(): String = js.native
  /**
    * For grandfathered or redundant tags, returns a date string reflecting the deprecation date if the tag is
    * deprecated.
    *
    * ```
    * > tags('zh-cmn-Hant').deprecated();
    * '2009-07-29'
    * ```
    */
  def deprecated(): String | Null = js.native
  /**
    * Returns an array of tag descriptions for grandfathered or redundant tags, otherwise returns an empty array.
    */
  def descriptions(): js.Array[String] = js.native
  /**
    * Returns an array of `Error` objects if the tag is invalid. The `message` property of each is readable and helpful
    * enough for UI output. The `code` property can be checked against the `Tag.ERR_*` constants. Each error will also
    * have either a `subtag` or `tag` property with the code of the offending tag.
    */
  def errors(): js.Array[LanguageTagsError] = js.native
  /**
    * Find a subtag of the given type from those making up the tag.
    */
  def find(`type`: String): typings.languageTags.subtagMod.^ = js.native
  /**
    * Format a tag according to the case conventions defined in
    * [RFC 5646 section 2.1.1](http://tools.ietf.org/html/rfc5646#section-2.1.1).
    *
    * ```
    * > tags('en-gb').format();
    * 'en-GB'
    * ```
    */
  def format(): String = js.native
  /**
    * Shortcut for `tag.find('language')`.
    */
  def language(): typings.languageTags.subtagMod.^ = js.native
  /**
    * If the tag is listed as 'deprecated' or 'redundant' it might have a preferred value. This method returns a `Tag`
    * object if so.
    *
    * ```
    * > tags('zh-cmn-Hant').preferred();
    * Tag
    * ```
    */
  def preferred(): Tag = js.native
  /**
    * Shortcut for `tag.find('region')`.
    */
  def region(): typings.languageTags.subtagMod.^ = js.native
  /**
    * Shortcut for `tag.find('script')`.
    */
  def script(): typings.languageTags.subtagMod.^ = js.native
  /**
    * Returns an array of subtags making up the tag, as `Subtag` objects.
    */
  def subtags(): js.Array[typings.languageTags.subtagMod.^] = js.native
  /**
    * Returns `grandfathered` if the tag is grandfathered, `redundant` if the tag is redundant, and `tag` if neither.
    * For a definition of grandfathered and redundant tags, see
    * [RFC 5646 section 2.2.8](http://tools.ietf.org/html/rfc5646#section-2.2.8).
    */
  def `type`(): grandfathered | redundant | tag = js.native
  /**
    * Returns `true` if the tag is valid, `false` otherwise.
    */
  def valid(): Boolean = js.native
}

object Tag {
  @scala.inline
  def apply(
    added: () => String,
    deprecated: () => String | Null,
    descriptions: () => js.Array[String],
    errors: () => js.Array[LanguageTagsError],
    find: String => typings.languageTags.subtagMod.^,
    format: () => String,
    language: () => typings.languageTags.subtagMod.^,
    preferred: () => Tag,
    region: () => typings.languageTags.subtagMod.^,
    script: () => typings.languageTags.subtagMod.^,
    subtags: () => js.Array[typings.languageTags.subtagMod.^],
    `type`: () => grandfathered | redundant | tag,
    valid: () => Boolean
  ): Tag = {
    val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), deprecated = js.Any.fromFunction0(deprecated), descriptions = js.Any.fromFunction0(descriptions), errors = js.Any.fromFunction0(errors), find = js.Any.fromFunction1(find), format = js.Any.fromFunction0(format), language = js.Any.fromFunction0(language), preferred = js.Any.fromFunction0(preferred), region = js.Any.fromFunction0(region), script = js.Any.fromFunction0(script), subtags = js.Any.fromFunction0(subtags), valid = js.Any.fromFunction0(valid))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Tag]
  }
  @scala.inline
  implicit class TagOps[Self <: Tag] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdded(value: () => String): Self = this.set("added", js.Any.fromFunction0(value))
    @scala.inline
    def setDeprecated(value: () => String | Null): Self = this.set("deprecated", js.Any.fromFunction0(value))
    @scala.inline
    def setDescriptions(value: () => js.Array[String]): Self = this.set("descriptions", js.Any.fromFunction0(value))
    @scala.inline
    def setErrors(value: () => js.Array[LanguageTagsError]): Self = this.set("errors", js.Any.fromFunction0(value))
    @scala.inline
    def setFind(value: String => typings.languageTags.subtagMod.^): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setFormat(value: () => String): Self = this.set("format", js.Any.fromFunction0(value))
    @scala.inline
    def setLanguage(value: () => typings.languageTags.subtagMod.^): Self = this.set("language", js.Any.fromFunction0(value))
    @scala.inline
    def setPreferred(value: () => Tag): Self = this.set("preferred", js.Any.fromFunction0(value))
    @scala.inline
    def setRegion(value: () => typings.languageTags.subtagMod.^): Self = this.set("region", js.Any.fromFunction0(value))
    @scala.inline
    def setScript(value: () => typings.languageTags.subtagMod.^): Self = this.set("script", js.Any.fromFunction0(value))
    @scala.inline
    def setSubtags(value: () => js.Array[typings.languageTags.subtagMod.^]): Self = this.set("subtags", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: () => grandfathered | redundant | tag): Self = this.set("type", js.Any.fromFunction0(value))
    @scala.inline
    def setValid(value: () => Boolean): Self = this.set("valid", js.Any.fromFunction0(value))
  }
  
}

