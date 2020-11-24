package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions15 extends js.Object {
  
  val allowUnknown_7: Boolean = js.native
  
  val stripUnknown_7: Boolean = js.native
}
object Typeofoptions15 {
  
  @scala.inline
  def apply(allowUnknown_7: Boolean, stripUnknown_7: Boolean): Typeofoptions15 = {
    val __obj = js.Dynamic.literal(allowUnknown_7 = allowUnknown_7.asInstanceOf[js.Any], stripUnknown_7 = stripUnknown_7.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions15]
  }
  
  @scala.inline
  implicit class Typeofoptions15Ops[Self <: Typeofoptions15] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown_7(value: Boolean): Self = this.set("allowUnknown_7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_7(value: Boolean): Self = this.set("stripUnknown_7", value.asInstanceOf[js.Any])
  }
}
