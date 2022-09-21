package typings.googleapis.searchconsoleV1Mod.searchconsoleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRunMobileFriendlyTestRequest extends StObject {
  
  /**
    * Whether or not screenshot is requested. Default is false.
    */
  var requestScreenshot: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * URL for inspection.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaRunMobileFriendlyTestRequest {
  
  inline def apply(): SchemaRunMobileFriendlyTestRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRunMobileFriendlyTestRequest]
  }
  
  extension [Self <: SchemaRunMobileFriendlyTestRequest](x: Self) {
    
    inline def setRequestScreenshot(value: Boolean): Self = StObject.set(x, "requestScreenshot", value.asInstanceOf[js.Any])
    
    inline def setRequestScreenshotNull: Self = StObject.set(x, "requestScreenshot", null)
    
    inline def setRequestScreenshotUndefined: Self = StObject.set(x, "requestScreenshot", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
