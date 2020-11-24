package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions17 extends js.Object {
  
  val allowUnknown_8: Boolean = js.native
  
  val stripUnknown_8: Boolean = js.native
}
object Typeofoptions17 {
  
  @scala.inline
  def apply(allowUnknown_8: Boolean, stripUnknown_8: Boolean): Typeofoptions17 = {
    val __obj = js.Dynamic.literal(allowUnknown_8 = allowUnknown_8.asInstanceOf[js.Any], stripUnknown_8 = stripUnknown_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions17]
  }
  
  @scala.inline
  implicit class Typeofoptions17Ops[Self <: Typeofoptions17] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown_8(value: Boolean): Self = this.set("allowUnknown_8", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_8(value: Boolean): Self = this.set("stripUnknown_8", value.asInstanceOf[js.Any])
  }
}
