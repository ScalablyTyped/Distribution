package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hi extends js.Object {
  
  var hi: js.UndefOr[Latitude] = js.native
  
  var lo: js.UndefOr[Latitude] = js.native
}
object Hi {
  
  @scala.inline
  def apply(): Hi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hi]
  }
  
  @scala.inline
  implicit class HiOps[Self <: Hi] (val x: Self) extends AnyVal {
    
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
    def setHi(value: Latitude): Self = this.set("hi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHi: Self = this.set("hi", js.undefined)
    
    @scala.inline
    def setLo(value: Latitude): Self = this.set("lo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLo: Self = this.set("lo", js.undefined)
  }
}
