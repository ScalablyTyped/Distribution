package typings.ipfsHttpServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofoptions19 extends js.Object {
  
  val allowUnknown_9: Boolean = js.native
  
  val stripUnknown_9: Boolean = js.native
}
object Typeofoptions19 {
  
  @scala.inline
  def apply(allowUnknown_9: Boolean, stripUnknown_9: Boolean): Typeofoptions19 = {
    val __obj = js.Dynamic.literal(allowUnknown_9 = allowUnknown_9.asInstanceOf[js.Any], stripUnknown_9 = stripUnknown_9.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofoptions19]
  }
  
  @scala.inline
  implicit class Typeofoptions19Ops[Self <: Typeofoptions19] (val x: Self) extends AnyVal {
    
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
    def setAllowUnknown_9(value: Boolean): Self = this.set("allowUnknown_9", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStripUnknown_9(value: Boolean): Self = this.set("stripUnknown_9", value.asInstanceOf[js.Any])
  }
}
