package typings.instagramPrivateApi.timelineFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimelineFeedResponseClientGapEnforcerMatrixItem extends js.Object {
  
  var list: js.Array[Double] = js.native
}
object TimelineFeedResponseClientGapEnforcerMatrixItem {
  
  @scala.inline
  def apply(list: js.Array[Double]): TimelineFeedResponseClientGapEnforcerMatrixItem = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineFeedResponseClientGapEnforcerMatrixItem]
  }
  
  @scala.inline
  implicit class TimelineFeedResponseClientGapEnforcerMatrixItemOps[Self <: TimelineFeedResponseClientGapEnforcerMatrixItem] (val x: Self) extends AnyVal {
    
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
    def setListVarargs(value: Double*): Self = this.set("list", js.Array(value :_*))
    
    @scala.inline
    def setList(value: js.Array[Double]): Self = this.set("list", value.asInstanceOf[js.Any])
  }
}
