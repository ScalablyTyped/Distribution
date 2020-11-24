package typings.ionic.definitionsMod

import typings.ionic.anon.IdName
import typings.ionic.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StarterList extends js.Object {
  
  var integrations: js.Array[IdName] = js.native
  
  var starters: js.Array[Type] = js.native
}
object StarterList {
  
  @scala.inline
  def apply(integrations: js.Array[IdName], starters: js.Array[Type]): StarterList = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], starters = starters.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarterList]
  }
  
  @scala.inline
  implicit class StarterListOps[Self <: StarterList] (val x: Self) extends AnyVal {
    
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
    def setIntegrationsVarargs(value: IdName*): Self = this.set("integrations", js.Array(value :_*))
    
    @scala.inline
    def setIntegrations(value: js.Array[IdName]): Self = this.set("integrations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartersVarargs(value: Type*): Self = this.set("starters", js.Array(value :_*))
    
    @scala.inline
    def setStarters(value: js.Array[Type]): Self = this.set("starters", value.asInstanceOf[js.Any])
  }
}
