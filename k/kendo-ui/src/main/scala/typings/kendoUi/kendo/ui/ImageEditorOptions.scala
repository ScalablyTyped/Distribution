package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorOptions extends StObject {
  
  var error: js.UndefOr[js.Function1[/* e */ ImageEditorErrorEvent, Unit]] = js.undefined
  
  var execute: js.UndefOr[js.Function1[/* e */ ImageEditorExecuteEvent, Unit]] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var imageLabel: js.UndefOr[String] = js.undefined
  
  var imageLoaded: js.UndefOr[js.Function1[/* e */ ImageEditorImageLoadedEvent, Unit]] = js.undefined
  
  var imageRendered: js.UndefOr[js.Function1[/* e */ ImageEditorImageRenderedEvent, Unit]] = js.undefined
  
  var imageUrl: js.UndefOr[String] = js.undefined
  
  var messages: js.UndefOr[ImageEditorMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var saveAs: js.UndefOr[ImageEditorSaveAs] = js.undefined
  
  var toolbar: js.UndefOr[Boolean | ImageEditorToolbar] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object ImageEditorOptions {
  
  inline def apply(): ImageEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageEditorOptions] (val x: Self) extends AnyVal {
    
    inline def setError(value: /* e */ ImageEditorErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExecute(value: /* e */ ImageEditorExecuteEvent => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setImageLabel(value: String): Self = StObject.set(x, "imageLabel", value.asInstanceOf[js.Any])
    
    inline def setImageLabelUndefined: Self = StObject.set(x, "imageLabel", js.undefined)
    
    inline def setImageLoaded(value: /* e */ ImageEditorImageLoadedEvent => Unit): Self = StObject.set(x, "imageLoaded", js.Any.fromFunction1(value))
    
    inline def setImageLoadedUndefined: Self = StObject.set(x, "imageLoaded", js.undefined)
    
    inline def setImageRendered(value: /* e */ ImageEditorImageRenderedEvent => Unit): Self = StObject.set(x, "imageRendered", js.Any.fromFunction1(value))
    
    inline def setImageRenderedUndefined: Self = StObject.set(x, "imageRendered", js.undefined)
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setMessages(value: ImageEditorMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSaveAs(value: ImageEditorSaveAs): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
    
    inline def setSaveAsUndefined: Self = StObject.set(x, "saveAs", js.undefined)
    
    inline def setToolbar(value: Boolean | ImageEditorToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
