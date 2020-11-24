package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdaptiveBinaryIndices extends js.Object {
  
  var adaptiveBinaryIndices: js.UndefOr[Boolean] = js.native
}
object AdaptiveBinaryIndices {
  
  @scala.inline
  def apply(): AdaptiveBinaryIndices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdaptiveBinaryIndices]
  }
  
  @scala.inline
  implicit class AdaptiveBinaryIndicesOps[Self <: AdaptiveBinaryIndices] (val x: Self) extends AnyVal {
    
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
    def setAdaptiveBinaryIndices(value: Boolean): Self = this.set("adaptiveBinaryIndices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptiveBinaryIndices: Self = this.set("adaptiveBinaryIndices", js.undefined)
  }
}
