package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions13 extends js.Object {
  
  val allowUnknown_6: Boolean = js.native
  
  val stripUnknown_6: Boolean = js.native
}
object Typeofoptions13 {
  
  @scala.inline
  def apply(allowUnknown_6: Boolean, stripUnknown_6: Boolean): Typeofoptions13 = {
    val __obj = js.Dynamic.literal(allowUnknown_6 = allowUnknown_6.asInstanceOf[js.Any], stripUnknown_6 = stripUnknown_6.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions13]
  }
  
  @scala.inline
  implicit class Typeofoptions13Ops[Self <: Typeofoptions13] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown_6(value: Boolean): Self = this.set("allowUnknown_6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_6(value: Boolean): Self = this.set("stripUnknown_6", value.asInstanceOf[js.Any])
  }
}
