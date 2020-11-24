package typings.jsonRulesEngine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fact extends js.Object {
  
  var fact: String = js.native
}
object Fact {
  
  @scala.inline
  def apply(fact: String): Fact = {
    val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fact]
  }
  
  @scala.inline
  implicit class FactOps[Self <: Fact] (val x: Self) extends AnyVal {
    
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
    def setFact(value: String): Self = this.set("fact", value.asInstanceOf[js.Any])
  }
}
