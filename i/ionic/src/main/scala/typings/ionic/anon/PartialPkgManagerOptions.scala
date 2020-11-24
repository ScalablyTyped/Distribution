package typings.ionic.anon

import typings.ionic.npmMod.PkgManagerCommand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ionic.ionic/lib/utils/npm.PkgManagerOptions> */
@js.native
trait PartialPkgManagerOptions extends js.Object {
  
  var command: js.UndefOr[PkgManagerCommand] = js.native
  
  var global: js.UndefOr[Boolean] = js.native
  
  var json: js.UndefOr[Boolean] = js.native
  
  var pkg: js.UndefOr[String] = js.native
  
  var save: js.UndefOr[Boolean] = js.native
  
  var saveDev: js.UndefOr[Boolean] = js.native
  
  var saveExact: js.UndefOr[Boolean] = js.native
  
  var script: js.UndefOr[String] = js.native
  
  var scriptArgs: js.UndefOr[js.Array[String]] = js.native
}
object PartialPkgManagerOptions {
  
  @scala.inline
  def apply(): PartialPkgManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPkgManagerOptions]
  }
  
  @scala.inline
  implicit class PartialPkgManagerOptionsOps[Self <: PartialPkgManagerOptions] (val x: Self) extends AnyVal {
    
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
    def setCommand(value: PkgManagerCommand): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setGlobal(value: Boolean): Self = this.set("global", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    
    @scala.inline
    def setJson(value: Boolean): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setPkg(value: String): Self = this.set("pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
    
    @scala.inline
    def setSave(value: Boolean): Self = this.set("save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setSaveDev(value: Boolean): Self = this.set("saveDev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveDev: Self = this.set("saveDev", js.undefined)
    
    @scala.inline
    def setSaveExact(value: Boolean): Self = this.set("saveExact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveExact: Self = this.set("saveExact", js.undefined)
    
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScript: Self = this.set("script", js.undefined)
    
    @scala.inline
    def setScriptArgsVarargs(value: String*): Self = this.set("scriptArgs", js.Array(value :_*))
    
    @scala.inline
    def setScriptArgs(value: js.Array[String]): Self = this.set("scriptArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScriptArgs: Self = this.set("scriptArgs", js.undefined)
  }
}
