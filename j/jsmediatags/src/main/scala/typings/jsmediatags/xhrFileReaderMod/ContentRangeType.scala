package typings.jsmediatags.xhrFileReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentRangeType extends js.Object {
  
  var firstBytePosition: js.UndefOr[Double] = js.native
  
  var instanceLength: js.UndefOr[Double] = js.native
  
  var lastBytePosition: js.UndefOr[Double] = js.native
}
object ContentRangeType {
  
  @scala.inline
  def apply(): ContentRangeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentRangeType]
  }
  
  @scala.inline
  implicit class ContentRangeTypeOps[Self <: ContentRangeType] (val x: Self) extends AnyVal {
    
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
    def setFirstBytePosition(value: Double): Self = this.set("firstBytePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstBytePosition: Self = this.set("firstBytePosition", js.undefined)
    
    @scala.inline
    def setInstanceLength(value: Double): Self = this.set("instanceLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceLength: Self = this.set("instanceLength", js.undefined)
    
    @scala.inline
    def setLastBytePosition(value: Double): Self = this.set("lastBytePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastBytePosition: Self = this.set("lastBytePosition", js.undefined)
  }
}
