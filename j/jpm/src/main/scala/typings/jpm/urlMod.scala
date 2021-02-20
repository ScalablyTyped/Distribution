package typings.jpm

import typings.jpm.FFAddonSDK.SDKURL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Construct, validate, and parse URLs
  */
object urlMod {
  
  @js.native
  trait DataURL extends StObject {
    
    var base64: String = js.native
    
    var data: String = js.native
    
    var mimeType: String = js.native
    
    var parameters: js.Object = js.native
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
  
  @JSImport("sdk/url", "URL")
  @js.native
  def URL(source: String): SDKURL = js.native
  @JSImport("sdk/url", "URL")
  @js.native
  def URL(source: String, base: String): SDKURL = js.native
  
  @JSImport("sdk/url", "getTLD")
  @js.native
  def getTLD(url: String): String = js.native
  
  @JSImport("sdk/url", "isValidURI")
  @js.native
  def isValidURI(uri: String): Boolean = js.native
  
  @JSImport("sdk/url", "toFileName")
  @js.native
  def toFileName_(url: String): String = js.native
  
  @JSImport("sdk/url", "toFilename")
  @js.native
  def toFilename(url: SDKURL): String = js.native
}
