package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions5 extends js.Object {
  
  val allowUnknown_2: Boolean = js.native
  
  val stripUnknown_2: Boolean = js.native
}
object Typeofoptions5 {
  
  @scala.inline
  def apply(allowUnknown_2: Boolean, stripUnknown_2: Boolean): Typeofoptions5 = {
    val __obj = js.Dynamic.literal(allowUnknown_2 = allowUnknown_2.asInstanceOf[js.Any], stripUnknown_2 = stripUnknown_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions5]
  }
  
  @scala.inline
  implicit class Typeofoptions5Ops[Self <: Typeofoptions5] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown_2(value: Boolean): Self = this.set("allowUnknown_2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_2(value: Boolean): Self = this.set("stripUnknown_2", value.asInstanceOf[js.Any])
  }
}
