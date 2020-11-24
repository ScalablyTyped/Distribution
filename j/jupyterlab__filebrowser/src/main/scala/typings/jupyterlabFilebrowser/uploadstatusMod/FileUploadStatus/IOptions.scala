package typings.jupyterlabFilebrowser.uploadstatusMod.FileUploadStatus

import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabFilebrowser.mod.FileBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for creating the upload status item.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * The application file browser tracker.
    */
  val tracker: WidgetTracker[FileBrowser] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(tracker: WidgetTracker[FileBrowser]): IOptions = {
    val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setTracker(value: WidgetTracker[FileBrowser]): Self = this.set("tracker", value.asInstanceOf[js.Any])
  }
}
