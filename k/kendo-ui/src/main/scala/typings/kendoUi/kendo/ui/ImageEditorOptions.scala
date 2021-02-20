package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorOptions extends StObject {
  
  var error: js.UndefOr[js.Function1[/* e */ ImageEditorErrorEvent, Unit]] = js.native
  
  var execute: js.UndefOr[js.Function1[/* e */ ImageEditorExecuteEvent, Unit]] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var imageLoaded: js.UndefOr[js.Function1[/* e */ ImageEditorImageLoadedEvent, Unit]] = js.native
  
  var imageRendered: js.UndefOr[js.Function1[/* e */ ImageEditorImageRenderedEvent, Unit]] = js.native
  
  var imageUrl: js.UndefOr[String] = js.native
  
  var messages: js.UndefOr[ImageEditorMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var saveAs: js.UndefOr[ImageEditorSaveAs] = js.native
  
  var toolbar: js.UndefOr[Boolean | ImageEditorToolbar] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object ImageEditorOptions {
  
  @scala.inline
  def apply(): ImageEditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorOptions]
  }
  
  @scala.inline
  implicit class ImageEditorOptionsMutableBuilder[Self <: ImageEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: /* e */ ImageEditorErrorEvent => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExecute(value: /* e */ ImageEditorExecuteEvent => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImageLoaded(value: /* e */ ImageEditorImageLoadedEvent => Unit): Self = StObject.set(x, "imageLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImageLoadedUndefined: Self = StObject.set(x, "imageLoaded", js.undefined)
    
    @scala.inline
    def setImageRendered(value: /* e */ ImageEditorImageRenderedEvent => Unit): Self = StObject.set(x, "imageRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def setImageRenderedUndefined: Self = StObject.set(x, "imageRendered", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setMessages(value: ImageEditorMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSaveAs(value: ImageEditorSaveAs): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsUndefined: Self = StObject.set(x, "saveAs", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | ImageEditorToolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
