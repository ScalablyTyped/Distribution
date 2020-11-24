package typings.jupyterlabMarkdownviewer.widgetMod.MarkdownViewerFactory

import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IFileType
import typings.jupyterlabDocregistry.registryMod.DocumentRegistry.IWidgetFactoryOptions
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to initialize a MarkdownViewerFactory.
  */
@js.native
trait IOptions extends IWidgetFactoryOptions[Widget] {
  
  /**
    * The primary file type associated with the document.
    */
  var primaryFileType: js.UndefOr[IFileType] = js.native
  
  /**
    * The rendermime instance.
    */
  var rendermime: IRenderMimeRegistry = js.native
}
object IOptions {
  
  @scala.inline
  def apply(fileTypes: js.Array[String], name: String, rendermime: IRenderMimeRegistry): IOptions = {
    val __obj = js.Dynamic.literal(fileTypes = fileTypes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rendermime = rendermime.asInstanceOf[js.Any])
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
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryFileType(value: IFileType): Self = this.set("primaryFileType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryFileType: Self = this.set("primaryFileType", js.undefined)
  }
}
