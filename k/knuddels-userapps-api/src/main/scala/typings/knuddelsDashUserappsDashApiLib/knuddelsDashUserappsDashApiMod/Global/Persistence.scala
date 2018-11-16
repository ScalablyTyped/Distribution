package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/Persistence.html
	 */
@JSGlobal("Persistence")
@js.native
class Persistence () extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_addNumber
  		 */
  def addNumber(key: java.lang.String, value: scala.Double): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_deleteNumber
  		 */
  def deleteNumber(key: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_deleteObject
  		 */
  def deleteObject(key: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_deleteString
  		 */
  def deleteString(key: java.lang.String): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getNumber
  		 */
  def getNumber(key: java.lang.String): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getNumber
  		 */
  def getNumber(key: java.lang.String, defaultValue: scala.Double): scala.Double = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getObject
  		 */
  def getObject(key: java.lang.String): KnuddelsJson | KnuddelsJsonArray | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsSerializable = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getObject
  		 */
  def getObject(key: java.lang.String, defaultValue: KnuddelsJson): KnuddelsJson | KnuddelsJsonArray | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsSerializable = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getObject
  		 */
  def getObject(key: java.lang.String, defaultValue: KnuddelsJsonArray): KnuddelsJson | KnuddelsJsonArray | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsSerializable = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getObject
  		 */
  def getObject(
    key: java.lang.String,
    defaultValue: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsSerializable
  ): KnuddelsJson | KnuddelsJsonArray | knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsSerializable = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getString
  		 */
  def getString(key: java.lang.String): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getString
  		 */
  def getString(key: java.lang.String, defaultValue: java.lang.String): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_hasNumber
  		 */
  def hasNumber(key: java.lang.String): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_hasObject
  		 */
  def hasObject(key: java.lang.String): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_hasString
  		 */
  def hasString(key: java.lang.String): scala.Boolean = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_setNumber
  		 */
  def setNumber(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_setObject
  		 */
  def setObject(key: java.lang.String, `object`: KnuddelsJson): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_setObject
  		 */
  def setObject(key: java.lang.String, `object`: KnuddelsJsonArray): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_setObject
  		 */
  def setObject(
    key: java.lang.String,
    `object`: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsSerializable
  ): scala.Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_setString
  		 */
  def setString(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
}

