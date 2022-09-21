package typings.knuddelsUserappBackendApi.mod.global

import typings.knuddelsUserappBackendApi.anon.Data
import typings.knuddelsUserappBackendApi.anon.Method
import typings.knuddelsUserappBackendApi.anon.OnFailure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html
  */
@JSGlobal("ExternalServerAccess")
@js.native
open class ExternalServerAccess () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_callURL
    */
  def callURL(urlString: java.lang.String): Unit = js.native
  def callURL(urlString: java.lang.String, parameters: Method): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_canAccessURL
    */
  def canAccessURL(urlString: java.lang.String): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_getAllAccessibleDomains
    */
  def getAllAccessibleDomains(): js.Array[Domain] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_getURL
    */
  def getURL(urlString: java.lang.String): Unit = js.native
  def getURL(urlString: java.lang.String, parameters: OnFailure): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_postURL
    */
  def postURL(urlString: java.lang.String): Unit = js.native
  def postURL(urlString: java.lang.String, parameters: Data): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerAccess.html#method_touchURL
    */
  def touchURL(urlString: java.lang.String): Unit = js.native
  def touchURL(urlString: java.lang.String, parameters: OnFailure): Unit = js.native
}
