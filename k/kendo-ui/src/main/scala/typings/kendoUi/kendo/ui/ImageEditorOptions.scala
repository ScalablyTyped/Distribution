package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorOptions extends js.Object {
  
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
  implicit class ImageEditorOptionsOps[Self <: ImageEditorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: /* e */ ImageEditorErrorEvent => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExecute(value: /* e */ ImageEditorExecuteEvent => Unit): Self = this.set("execute", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExecute: Self = this.set("execute", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setImageLoaded(value: /* e */ ImageEditorImageLoadedEvent => Unit): Self = this.set("imageLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteImageLoaded: Self = this.set("imageLoaded", js.undefined)
    
    @scala.inline
    def setImageRendered(value: /* e */ ImageEditorImageRenderedEvent => Unit): Self = this.set("imageRendered", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteImageRendered: Self = this.set("imageRendered", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setMessages(value: ImageEditorMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSaveAs(value: ImageEditorSaveAs): Self = this.set("saveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveAs: Self = this.set("saveAs", js.undefined)
    
    @scala.inline
    def setToolbar(value: Boolean | ImageEditorToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
