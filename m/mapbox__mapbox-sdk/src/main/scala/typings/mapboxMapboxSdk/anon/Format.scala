package typings.mapboxMapboxSdk.anon

import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.json
import typings.mapboxMapboxSdk.mapboxMapboxSdkStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  var format: js.UndefOr[json | png] = js.undefined
  
  var highRes: js.UndefOr[Boolean] = js.undefined
  
  var ownerId: js.UndefOr[String] = js.undefined
  
  var styleId: String
}
object Format {
  
  @scala.inline
  def apply(styleId: String): Format = {
    val __obj = js.Dynamic.literal(styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: json | png): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHighRes(value: Boolean): Self = StObject.set(x, "highRes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighResUndefined: Self = StObject.set(x, "highRes", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
    
    @scala.inline
    def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
  }
}
