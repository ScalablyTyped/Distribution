package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/HTMLFile.html
  */
@JSGlobal("HTMLFile")
@js.native
open class HTMLFile protected () extends StObject {
  /**
    * @see https://developer.knuddels.de/docs/classes/HTMLFile.html#method_HTMLFile
    */
  def this(assetPath: java.lang.String) = this()
  def this(assetPath: java.lang.String, pageData: Json) = this()
  
  /**
    * @see https://developer.knuddels.de/docs/classes/HTMLFile.html#method_getAssetPath
    */
  def getAssetPath(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/HTMLFile.html#method_getPageData
    */
  def getPageData(): Json = js.native
}
