package typings.jupyterlabFilebrowser.tokensMod.IFileBrowserFactory

import typings.jupyterlabStatedb.tokensMod.IStateDB
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The options for creating a file browser using a file browser factory.
  *
  * #### Notes
  * In future versions of JupyterLab, some of these options may disappear,
  * which is a backward-incompatible API change and will necessitate a new
  * version release. This is because in future versions, there will likely be
  * an application-wide notion of a singleton command registry and a singleton
  * state database.
  */
@js.native
trait IOptions extends js.Object {
  
  /**
    * Whether a file browser automatically loads its initial path.
    *
    * #### Notes
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
    * The time interval for browser refreshing, in ms.
    */
  var refreshInterval: js.UndefOr[Double] = js.native
  
  /**
    * Whether a file browser automatically restores state when instantiated.
    * The default is `true`.
    *
    * #### Notes
    * The file browser model will need to be restored before for the file
    * browser to start saving its state.
    */
  var restore: js.UndefOr[Boolean] = js.native
  
  /**
    * The state database to use for saving file browser state and restoring it.
    *
    * #### Notes
    * Unless the value `null` is set for this option, the application state
    * database will be automatically passed in and used for state restoration.
    */
  var state: js.UndefOr[IStateDB[ReadonlyPartialJSONValue] | Null] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
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
    def setRestore(value: Boolean): Self = this.set("restore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestore: Self = this.set("restore", js.undefined)
    
    @scala.inline
    def setState(value: IStateDB[ReadonlyPartialJSONValue]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
  }
}
