package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions3 extends js.Object {
  
  val allowUnknown_1: Boolean = js.native
  
  val stripUnknown_1: Boolean = js.native
}
object Typeofoptions3 {
  
  @scala.inline
  def apply(allowUnknown_1: Boolean, stripUnknown_1: Boolean): Typeofoptions3 = {
    val __obj = js.Dynamic.literal(allowUnknown_1 = allowUnknown_1.asInstanceOf[js.Any], stripUnknown_1 = stripUnknown_1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions3]
  }
  
  @scala.inline
  implicit class Typeofoptions3Ops[Self <: Typeofoptions3] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown_1(value: Boolean): Self = this.set("allowUnknown_1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_1(value: Boolean): Self = this.set("stripUnknown_1", value.asInstanceOf[js.Any])
  }
}
