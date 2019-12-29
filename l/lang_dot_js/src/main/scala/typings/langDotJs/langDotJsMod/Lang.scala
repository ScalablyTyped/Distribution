package typings.langDotJs.langDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lang extends js.Object {
  /**
    * Gets the plural or singular form of the message specified based on an integer value.
    *
    * @param key The key of the message.
    * @param count The number of elements.
    * @param replacements The replacements to be done in the message.
    * @param locale The locale to use, if not passed use the default locale.
    *
    * @return The translation message according to an integer value.
    */
  def choice(key: String, count: Double): String = js.native
  def choice(key: String, count: Double, replacements: Replacements): String = js.native
  def choice(key: String, count: Double, replacements: Replacements, locale: String): String = js.native
  /**
    * Gets a translation message.
    *
    * @param key The key of the message.
    * @param replacements The replacements to be done in the message.
    * @param locale The locale to use, if not passed use the default locale.
    *
    * @return The translation message, if not found the given key.
    */
  def get(key: String): String = js.native
  def get(key: String, replacements: Replacements): String = js.native
  def get(key: String, replacements: Replacements, locale: String): String = js.native
  /**
    * Get the fallback locale being used.
    *
    * @return The fallback locale.
    */
  def getFallback(): String = js.native
  /**
    * Get the current locale.
    *
    * @return The current locale.
    */
  def getLocale(): String = js.native
  /**
    * Checks whether a given key exists in the messages source.
    *
    * @param key The key of the message.
    * @param locale The locale of the message.
    *
    * @return true if the given key is defined on the messages source, otherwise false.
    */
  def has(key: String): Boolean = js.native
  def has(key: String, locale: String): Boolean = js.native
  /**
    * Set the fallback locale being used.
    *
    * @param fallback The fallback locale.
    */
  def setFallback(fallback: String): Unit = js.native
  /**
    * Set the current locale.
    *
    * @return void
    */
  def setLocale(locale: String): Unit = js.native
  /**
    * Set messages source.
    *
    * @param messages The messages source.
    */
  def setMessages(messages: Messages): Unit = js.native
  /**
    * Gets a translation message.
    *
    * This method act as an alias to get() method, just without the locale parameter.
    *
    * @param key The key of the message.
    * @param replacements The replacements to be done in the message.
    *
    * @return The translation message, if not found the given key.
    */
  def trans(key: String): String = js.native
  def trans(key: String, replacements: Replacements): String = js.native
  /**
    * Gets the plural or singular form of the message specified based on an integer value.
    *
    * This method act as an alias to choice() method, just without the locale parameter.
    *
    * @param key The key of the message.
    * @param count The number of elements.
    * @param replacements The replacements to be done in the message.
    *
    * @return The translation message according to an integer value.
    */
  def transChoice(key: String, count: Double): String = js.native
  def transChoice(key: String, count: Double, replacements: Replacements): String = js.native
}

