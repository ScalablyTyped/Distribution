package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaNodeTemplateNodeTypeFlexibility extends js.Object {
  
  var cpus: js.UndefOr[String] = js.native
  
  var localSsd: js.UndefOr[String] = js.native
  
  var memory: js.UndefOr[String] = js.native
}
object SchemaNodeTemplateNodeTypeFlexibility {
  
  @scala.inline
  def apply(): SchemaNodeTemplateNodeTypeFlexibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTemplateNodeTypeFlexibility]
  }
  
  @scala.inline
  implicit class SchemaNodeTemplateNodeTypeFlexibilityOps[Self <: SchemaNodeTemplateNodeTypeFlexibility] (val x: Self) extends AnyVal {
    
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
    def setCpus(value: String): Self = this.set("cpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCpus: Self = this.set("cpus", js.undefined)
    
    @scala.inline
    def setLocalSsd(value: String): Self = this.set("localSsd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalSsd: Self = this.set("localSsd", js.undefined)
    
    @scala.inline
    def setMemory(value: String): Self = this.set("memory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemory: Self = this.set("memory", js.undefined)
  }
}
