package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EngineOptions extends js.Object {
  
  var allowUndefinedFacts: Boolean = js.native
}
object EngineOptions {
  
  @scala.inline
  def apply(allowUndefinedFacts: Boolean): EngineOptions = {
    val __obj = js.Dynamic.literal(allowUndefinedFacts = allowUndefinedFacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineOptions]
  }
  
  @scala.inline
  implicit class EngineOptionsOps[Self <: EngineOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowUndefinedFacts(value: Boolean): Self = this.set("allowUndefinedFacts", value.asInstanceOf[js.Any])
  }
}
