package typings.jpm

import typings.jpm.FFAddonSDK.SDKURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Construct, validate, and parse URLs
  */
object urlMod {
  
  @JSImport("sdk/url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DataURL extends StObject {
    
    var base64: String
    
    var data: String
    
    var mimeType: String
    
    var parameters: js.Object
  }
  object DataURL {
    
    @JSImport("sdk/url", "DataURL")
    @js.native
    def apply(uri: String): DataURL = js.native
    
    @scala.inline
    implicit class DataURLMutableBuilder[Self <: DataURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase64(value: String): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameters(value: js.Object): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    }
  }
  
  @scala.inline
  def URL(source: String): SDKURL = ^.asInstanceOf[js.Dynamic].applyDynamic("URL")(source.asInstanceOf[js.Any]).asInstanceOf[SDKURL]
  @scala.inline
  def URL(source: String, base: String): SDKURL = (^.asInstanceOf[js.Dynamic].applyDynamic("URL")(source.asInstanceOf[js.Any], base.asInstanceOf[js.Any])).asInstanceOf[SDKURL]
  
  @scala.inline
  def getTLD(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTLD")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isValidURI(uri: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidURI")(uri.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def toFileName_(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toFileName")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toFilename(url: SDKURL): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toFilename")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
