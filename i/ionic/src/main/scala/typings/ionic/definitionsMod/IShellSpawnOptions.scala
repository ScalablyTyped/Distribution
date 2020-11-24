package typings.ionic.definitionsMod

import typings.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShellSpawnOptions extends SpawnOptions {
  
  var showCommand: js.UndefOr[Boolean] = js.native
}
object IShellSpawnOptions {
  
  @scala.inline
  def apply(): IShellSpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShellSpawnOptions]
  }
  
  @scala.inline
  implicit class IShellSpawnOptionsOps[Self <: IShellSpawnOptions] (val x: Self) extends AnyVal {
    
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
    def setShowCommand(value: Boolean): Self = this.set("showCommand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCommand: Self = this.set("showCommand", js.undefined)
  }
}
