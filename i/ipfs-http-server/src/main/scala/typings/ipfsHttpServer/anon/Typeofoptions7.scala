package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions7 extends js.Object {
  
  val allowUnknown_3: Boolean = js.native
  
  val stripUnknown_3: Boolean = js.native
}
object Typeofoptions7 {
  
  @scala.inline
  def apply(allowUnknown_3: Boolean, stripUnknown_3: Boolean): Typeofoptions7 = {
    val __obj = js.Dynamic.literal(allowUnknown_3 = allowUnknown_3.asInstanceOf[js.Any], stripUnknown_3 = stripUnknown_3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions7]
  }
  
  @scala.inline
  implicit class Typeofoptions7Ops[Self <: Typeofoptions7] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown_3(value: Boolean): Self = this.set("allowUnknown_3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_3(value: Boolean): Self = this.set("stripUnknown_3", value.asInstanceOf[js.Any])
  }
}
