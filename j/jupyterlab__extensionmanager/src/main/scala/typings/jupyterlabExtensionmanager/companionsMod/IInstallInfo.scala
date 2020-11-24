package typings.jupyterlabExtensionmanager.companionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInstallInfo extends js.Object {
  
  /**
    * The base/default install info.
    */
  var base: IInstallInfoEntry = js.native
  
  /**
    * Which package managers that have the package/module.
    */
  var managers: js.Array[String] = js.native
  
  /**
    * Overrides of the base install info on a per-manager basis.
    */
  var overrides: js.UndefOr[StringDictionary[js.UndefOr[IInstallInfoEntry]]] = js.native
}
object IInstallInfo {
  
  @scala.inline
  def apply(base: IInstallInfoEntry, managers: js.Array[String]): IInstallInfo = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInstallInfo]
  }
  
  @scala.inline
  implicit class IInstallInfoOps[Self <: IInstallInfo] (val x: Self) extends AnyVal {
    
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
    def setBase(value: IInstallInfoEntry): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagersVarargs(value: String*): Self = this.set("managers", js.Array(value :_*))
    
    @scala.inline
    def setManagers(value: js.Array[String]): Self = this.set("managers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrides(value: StringDictionary[js.UndefOr[IInstallInfoEntry]]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
