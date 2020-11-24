package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions11 extends js.Object {
  
  val allowUnknown_5: Boolean = js.native
  
  val stripUnknown_5: Boolean = js.native
}
object Typeofoptions11 {
  
  @scala.inline
  def apply(allowUnknown_5: Boolean, stripUnknown_5: Boolean): Typeofoptions11 = {
    val __obj = js.Dynamic.literal(allowUnknown_5 = allowUnknown_5.asInstanceOf[js.Any], stripUnknown_5 = stripUnknown_5.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions11]
  }
  
  @scala.inline
  implicit class Typeofoptions11Ops[Self <: Typeofoptions11] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown_5(value: Boolean): Self = this.set("allowUnknown_5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_5(value: Boolean): Self = this.set("stripUnknown_5", value.asInstanceOf[js.Any])
  }
}
