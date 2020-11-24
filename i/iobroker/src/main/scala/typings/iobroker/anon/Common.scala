package typings.iobroker.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Common extends js.Object {
  
  var common: Record[String, _] = js.native
  
  var native: Record[String, _] = js.native
}
object Common {
  
  @scala.inline
  def apply(common: Record[String, _], native: Record[String, _]): Common = {
    val __obj = js.Dynamic.literal(common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common]
  }
  
  @scala.inline
  implicit class CommonOps[Self <: Common] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: Record[String, _]): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative(value: Record[String, _]): Self = this.set("native", value.asInstanceOf[js.Any])
  }
}
