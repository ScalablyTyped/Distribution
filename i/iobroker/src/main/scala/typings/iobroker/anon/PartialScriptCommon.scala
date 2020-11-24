package typings.iobroker.anon

import typings.iobroker.iobrokerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<iobroker.iobroker/objects.<global>.ioBroker.ScriptCommon> */
@js.native
trait PartialScriptCommon extends js.Object {
  
  var compiled: js.UndefOr[String] = js.native
  
  var custom: js.UndefOr[scala.Nothing] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var declarations: js.UndefOr[String] = js.native
  
  var dontDelete: js.UndefOr[`true`] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
  
  var engine: js.UndefOr[String] = js.native
  
  var engineType: js.UndefOr[String] = js.native
  
  var expert: js.UndefOr[`true`] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var source: js.UndefOr[String] = js.native
  
  var sourceHash: js.UndefOr[String] = js.native
  
  var verbose: js.UndefOr[Boolean] = js.native
}
object PartialScriptCommon {
  
  @scala.inline
  def apply(): PartialScriptCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScriptCommon]
  }
  
  @scala.inline
  implicit class PartialScriptCommonOps[Self <: PartialScriptCommon] (val x: Self) extends AnyVal {
    
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
    def setCompiled(value: String): Self = this.set("compiled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompiled: Self = this.set("compiled", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDeclarations(value: String): Self = this.set("declarations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclarations: Self = this.set("declarations", js.undefined)
    
    @scala.inline
    def setDontDelete(value: `true`): Self = this.set("dontDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDontDelete: Self = this.set("dontDelete", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setEngineType(value: String): Self = this.set("engineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineType: Self = this.set("engineType", js.undefined)
    
    @scala.inline
    def setExpert(value: `true`): Self = this.set("expert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpert: Self = this.set("expert", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setSourceHash(value: String): Self = this.set("sourceHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceHash: Self = this.set("sourceHash", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
  }
}
