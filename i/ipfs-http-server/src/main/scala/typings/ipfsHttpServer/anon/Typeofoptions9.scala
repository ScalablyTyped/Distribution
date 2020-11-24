package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions9 extends js.Object {
  
  val allowUnknown_4: Boolean = js.native
  
  val stripUnknown_4: Boolean = js.native
}
object Typeofoptions9 {
  
  @scala.inline
  def apply(allowUnknown_4: Boolean, stripUnknown_4: Boolean): Typeofoptions9 = {
    val __obj = js.Dynamic.literal(allowUnknown_4 = allowUnknown_4.asInstanceOf[js.Any], stripUnknown_4 = stripUnknown_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions9]
  }
  
  @scala.inline
  implicit class Typeofoptions9Ops[Self <: Typeofoptions9] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown_4(value: Boolean): Self = this.set("allowUnknown_4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_4(value: Boolean): Self = this.set("stripUnknown_4", value.asInstanceOf[js.Any])
  }
}
