package typings.jupyterlabDocregistry.registryMod.DocumentRegistry

import typings.luminoWidgets.docklayoutMod.DockLayout.InsertMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options used to open a widget.
  */
@js.native
trait IOpenOptions extends js.Object {
  
  /**
    * Whether to activate the widget.  Defaults to `true`.
    */
  var activate: js.UndefOr[Boolean] = js.native
  
  /**
    * The supported insertion modes.
    *
    * An insert mode is used to specify how a widget should be added
    * to the main area relative to a reference widget.
    */
  var mode: js.UndefOr[InsertMode] = js.native
  
  /**
    * The rank order of the widget among its siblings.
    *
    * #### Notes
    * This field may be used or ignored depending on shell implementation.
    */
  var rank: js.UndefOr[Double] = js.native
  
  /**
    * The reference widget id for the insert location.
    *
    * The default is `null`.
    */
  var ref: js.UndefOr[String | Null] = js.native
}
object IOpenOptions {
  
  @scala.inline
  def apply(): IOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOpenOptions]
  }
  
  @scala.inline
  implicit class IOpenOptionsOps[Self <: IOpenOptions] (val x: Self) extends AnyVal {
    
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
    def setActivate(value: Boolean): Self = this.set("activate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivate: Self = this.set("activate", js.undefined)
    
    @scala.inline
    def setMode(value: InsertMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRank: Self = this.set("rank", js.undefined)
    
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
}
