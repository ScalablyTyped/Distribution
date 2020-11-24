package typings.jupyterlabFilebrowser.modelMod.FileBrowserModel

import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An options object for initializing a file browser.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * Whether a file browser automatically loads its initial path.
    * The default is `true`.
    */
  var auto: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional `Contents.IDrive` name for the model.
    * If given, the model will prepend `driveName:` to
    * all paths used in file operations.
    */
  var driveName: js.UndefOr[String] = js.native
  
  /**
    * A document manager instance.
    */
  var manager: IDocumentManager = js.native
  
  /**
    * The time interval for browser refreshing, in ms.
    */
  var refreshInterval: js.UndefOr[Double] = js.native
  
  /**
    * An optional state database. If provided, the model will restore which
    * folder was last opened when it is restored.
    */
  var state: js.UndefOr[IStateDB[ReadonlyPartialJSONValue]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(manager: IDocumentManager): IOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
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
    def setManager(value: IDocumentManager): Self = this.set("manager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto(value: Boolean): Self = this.set("auto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuto: Self = this.set("auto", js.undefined)
    
    @scala.inline
    def setDriveName(value: String): Self = this.set("driveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveName: Self = this.set("driveName", js.undefined)
    
    @scala.inline
    def setRefreshInterval(value: Double): Self = this.set("refreshInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshInterval: Self = this.set("refreshInterval", js.undefined)
    
    @scala.inline
    def setState(value: IStateDB[ReadonlyPartialJSONValue]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
