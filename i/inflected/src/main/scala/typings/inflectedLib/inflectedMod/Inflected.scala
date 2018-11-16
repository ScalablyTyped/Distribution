package typings
package inflectedLib.inflectedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inflected extends js.Object {
  def camelize(term: java.lang.String): java.lang.String = js.native
  def camelize(term: java.lang.String, uppercaseFirstLetter: scala.Boolean): java.lang.String = js.native
  def classify(tableName: java.lang.String): java.lang.String = js.native
  def dasherize(underscoredWord: java.lang.String): java.lang.String = js.native
  def foreignKey(className: java.lang.String): java.lang.String = js.native
  def foreignKey(className: java.lang.String, separateClassNameAndIdWithUnderscore: scala.Boolean): java.lang.String = js.native
  def humanize(lowerCaseAndUnderscoredWord: java.lang.String): java.lang.String = js.native
  def humanize(
    lowerCaseAndUnderscoredWord: java.lang.String,
    options: inflectedLib.inflectedMod.OptionsNs.Humanize
  ): java.lang.String = js.native
  def ordinal(number: scala.Double): java.lang.String = js.native
  def ordinalize(number: scala.Double): java.lang.String = js.native
  def parameterize(sentence: java.lang.String): java.lang.String = js.native
  def parameterize(sentence: java.lang.String, options: inflectedLib.inflectedMod.OptionsNs.Parameterize): java.lang.String = js.native
  def pluralize(word: java.lang.String): java.lang.String = js.native
  def pluralize(word: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  def singularize(word: java.lang.String): java.lang.String = js.native
  def singularize(word: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  def tableize(className: java.lang.String): java.lang.String = js.native
  def titleize(sentence: java.lang.String): java.lang.String = js.native
  def transliterate(sentence: java.lang.String): java.lang.String = js.native
  def transliterate(sentence: java.lang.String, options: inflectedLib.inflectedMod.OptionsNs.Transliterate): java.lang.String = js.native
  def underscore(camelCaseWord: java.lang.String): java.lang.String = js.native
}

