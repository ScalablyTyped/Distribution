package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.mod.KnuddelsSerializable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/Persistence.html
  */
@JSGlobal("Persistence")
@js.native
open class Persistence () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_addNumber
    */
  def addNumber(key: java.lang.String, value: Double): Double = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_deleteNumber
    */
  def deleteNumber(key: java.lang.String): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_deleteObject
    */
  def deleteObject(key: java.lang.String): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_deleteString
    */
  def deleteString(key: java.lang.String): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getNumber
    */
  def getNumber(key: java.lang.String): Double = js.native
  def getNumber(key: java.lang.String, defaultValue: Double): Double = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getObject
    */
  def getObject(key: java.lang.String): KnuddelsJson | KnuddelsJsonArray | KnuddelsSerializable = js.native
  def getObject(key: java.lang.String, defaultValue: KnuddelsSerializable): KnuddelsJson | KnuddelsJsonArray | KnuddelsSerializable = js.native
  def getObject(key: java.lang.String, defaultValue: KnuddelsJson): KnuddelsJson | KnuddelsJsonArray | KnuddelsSerializable = js.native
  def getObject(key: java.lang.String, defaultValue: KnuddelsJsonArray): KnuddelsJson | KnuddelsJsonArray | KnuddelsSerializable = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_getString
    */
  def getString(key: java.lang.String): java.lang.String = js.native
  def getString(key: java.lang.String, defaultValue: java.lang.String): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_hasNumber
    */
  def hasNumber(key: java.lang.String): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_hasObject
    */
  def hasObject(key: java.lang.String): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_hasString
    */
  def hasString(key: java.lang.String): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_setNumber
    */
  def setNumber(key: java.lang.String, value: Double): Unit = js.native
  
  def setObject(key: java.lang.String, `object`: KnuddelsSerializable): Unit = js.native
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_setObject
    */
  def setObject(key: java.lang.String, `object`: KnuddelsJson): Unit = js.native
  def setObject(key: java.lang.String, `object`: KnuddelsJsonArray): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/Persistence.html#method_setString
    */
  def setString(key: java.lang.String, value: java.lang.String): Unit = js.native
}
