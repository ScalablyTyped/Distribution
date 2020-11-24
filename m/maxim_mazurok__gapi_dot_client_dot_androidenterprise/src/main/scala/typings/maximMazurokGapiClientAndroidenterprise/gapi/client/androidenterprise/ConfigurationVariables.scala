package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationVariables extends js.Object {
  
  /** The ID of the managed configurations settings. */
  var mcmId: js.UndefOr[String] = js.native
  
  /** The variable set that is attributed to the user. */
  var variableSet: js.UndefOr[js.Array[VariableSet]] = js.native
}
object ConfigurationVariables {
  
  @scala.inline
  def apply(): ConfigurationVariables = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationVariables]
  }
  
  @scala.inline
  implicit class ConfigurationVariablesOps[Self <: ConfigurationVariables] (val x: Self) extends AnyVal {
    
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
    def setMcmId(value: String): Self = this.set("mcmId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMcmId: Self = this.set("mcmId", js.undefined)
    
    @scala.inline
    def setVariableSetVarargs(value: VariableSet*): Self = this.set("variableSet", js.Array(value :_*))
    
    @scala.inline
    def setVariableSet(value: js.Array[VariableSet]): Self = this.set("variableSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariableSet: Self = this.set("variableSet", js.undefined)
  }
}
