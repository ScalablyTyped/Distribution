package typings.iitc.mapDataRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapDataRequestStatus extends js.Object {
  
  var long: js.UndefOr[String] = js.native
  
  var progress: js.UndefOr[Double] = js.native
  
  var short: String = js.native
}
object MapDataRequestStatus {
  
  @scala.inline
  def apply(short: String): MapDataRequestStatus = {
    val __obj = js.Dynamic.literal(short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDataRequestStatus]
  }
  
  @scala.inline
  implicit class MapDataRequestStatusOps[Self <: MapDataRequestStatus] (val x: Self) extends AnyVal {
    
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
    def setShort(value: String): Self = this.set("short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLong(value: String): Self = this.set("long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLong: Self = this.set("long", js.undefined)
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
  }
}
