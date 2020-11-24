package typings.intercomClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Segmentid extends js.Object {
  
  var segment_id: js.UndefOr[String] = js.native
  
  var tag_id: js.UndefOr[String] = js.native
}
object Segmentid {
  
  @scala.inline
  def apply(): Segmentid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Segmentid]
  }
  
  @scala.inline
  implicit class SegmentidOps[Self <: Segmentid] (val x: Self) extends AnyVal {
    
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
    def setSegment_id(value: String): Self = this.set("segment_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSegment_id: Self = this.set("segment_id", js.undefined)
    
    @scala.inline
    def setTag_id(value: String): Self = this.set("tag_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag_id: Self = this.set("tag_id", js.undefined)
  }
}
