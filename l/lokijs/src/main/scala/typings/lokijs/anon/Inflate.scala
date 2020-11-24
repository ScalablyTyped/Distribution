package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Inflate extends js.Object {
  
  var inflate: js.UndefOr[js.Function2[/* src */ js.Object, /* dest */ js.UndefOr[js.Object], Unit]] = js.native
  
  var proto: js.UndefOr[js.Any] = js.native
}
object Inflate {
  
  @scala.inline
  def apply(): Inflate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inflate]
  }
  
  @scala.inline
  implicit class InflateOps[Self <: Inflate] (val x: Self) extends AnyVal {
    
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
    def setInflate(value: (/* src */ js.Object, /* dest */ js.UndefOr[js.Object]) => Unit): Self = this.set("inflate", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInflate: Self = this.set("inflate", js.undefined)
    
    @scala.inline
    def setProto(value: js.Any): Self = this.set("proto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProto: Self = this.set("proto", js.undefined)
  }
}
