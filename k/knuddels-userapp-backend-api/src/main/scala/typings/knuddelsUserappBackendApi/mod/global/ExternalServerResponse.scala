package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/ExternalServerResponse.html
  */
@JSGlobal("ExternalServerResponse")
@js.native
open class ExternalServerResponse () extends StObject {
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerResponse.html#method_getHeaderFieldNames
    * @since AppServer 108668
    */
  def getHeaderFieldNames(): js.Array[java.lang.String] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerResponse.html#method_getHeaderFieldValues
    * @since AppServer 108668
    */
  def getHeaderFieldValues(headerFieldName: java.lang.String): js.Array[java.lang.String] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerResponse.html#method_getHeaderFields
    */
  def getHeaderFields(): StringDictionary[js.Array[java.lang.String]] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerResponse.html#method_getResponseCode
    */
  def getResponseCode(): Double = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/ExternalServerResponse.html#method_getURLString
    */
  def getURLString(): java.lang.String = js.native
}
