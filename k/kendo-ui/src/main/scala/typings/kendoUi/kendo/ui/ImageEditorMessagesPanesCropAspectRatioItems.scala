package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorMessagesPanesCropAspectRatioItems extends StObject {
  
  var originalRatio: js.UndefOr[String] = js.undefined
}
object ImageEditorMessagesPanesCropAspectRatioItems {
  
  inline def apply(): ImageEditorMessagesPanesCropAspectRatioItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesPanesCropAspectRatioItems]
  }
  
  extension [Self <: ImageEditorMessagesPanesCropAspectRatioItems](x: Self) {
    
    inline def setOriginalRatio(value: String): Self = StObject.set(x, "originalRatio", value.asInstanceOf[js.Any])
    
    inline def setOriginalRatioUndefined: Self = StObject.set(x, "originalRatio", js.undefined)
  }
}
