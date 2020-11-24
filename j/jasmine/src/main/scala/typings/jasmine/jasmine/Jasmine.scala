package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jasmine extends js.Object {
  
  var Spec: typings.jasmine.jasmine.Spec = js.native
  
  var clock: Clock = js.native
  
  var util: Util = js.native
}
object Jasmine {
  
  @scala.inline
  def apply(Spec: Spec, clock: Clock, util: Util): Jasmine = {
    val __obj = js.Dynamic.literal(Spec = Spec.asInstanceOf[js.Any], clock = clock.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
    __obj.asInstanceOf[Jasmine]
  }
  
  @scala.inline
  implicit class JasmineOps[Self <: Jasmine] (val x: Self) extends AnyVal {
    
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
    def setSpec(value: Spec): Self = this.set("Spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClock(value: Clock): Self = this.set("clock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtil(value: Util): Self = this.set("util", value.asInstanceOf[js.Any])
  }
}
