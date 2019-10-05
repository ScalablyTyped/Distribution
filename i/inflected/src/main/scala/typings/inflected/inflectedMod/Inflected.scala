package typings.inflected.inflectedMod

import typings.inflected.inflectedMod.Options.Humanize
import typings.inflected.inflectedMod.Options.Parameterize
import typings.inflected.inflectedMod.Options.Transliterate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inflected extends js.Object {
  def camelize(term: String): String = js.native
  def camelize(term: String, uppercaseFirstLetter: Boolean): String = js.native
  def classify(tableName: String): String = js.native
  def dasherize(underscoredWord: String): String = js.native
  def foreignKey(className: String): String = js.native
  def foreignKey(className: String, separateClassNameAndIdWithUnderscore: Boolean): String = js.native
  def humanize(lowerCaseAndUnderscoredWord: String): String = js.native
  def humanize(lowerCaseAndUnderscoredWord: String, options: Humanize): String = js.native
  def ordinal(number: Double): String = js.native
  def ordinalize(number: Double): String = js.native
  def parameterize(sentence: String): String = js.native
  def parameterize(sentence: String, options: Parameterize): String = js.native
  def pluralize(word: String): String = js.native
  def pluralize(word: String, locale: String): String = js.native
  def singularize(word: String): String = js.native
  def singularize(word: String, locale: String): String = js.native
  def tableize(className: String): String = js.native
  def titleize(sentence: String): String = js.native
  def transliterate(sentence: String): String = js.native
  def transliterate(sentence: String, options: Transliterate): String = js.native
  def underscore(camelCaseWord: String): String = js.native
}

