package typings.materialSegmentedButton.anon

import typings.materialSegmentedButton.typesMod.SegmentDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/segmented-button.@material/segmented-button/segmented-button/adapter.MDCSegmentedButtonAdapter> */
@js.native
trait PartialMDCSegmentedButton extends js.Object {
  
  var getSegments: js.UndefOr[js.Function0[js.Array[SegmentDetail]]] = js.native
  
  var hasClass: js.UndefOr[js.Function1[/* className */ String, Boolean]] = js.native
  
  var notifySelectedChange: js.UndefOr[js.Function1[/* detail */ SegmentDetail, Unit]] = js.native
  
  var selectSegment: js.UndefOr[js.Function1[/* indexOrSegmentId */ Double | String, Unit]] = js.native
  
  var unselectSegment: js.UndefOr[js.Function1[/* indexOrSegmentId */ Double | String, Unit]] = js.native
}
object PartialMDCSegmentedButton {
  
  @scala.inline
  def apply(): PartialMDCSegmentedButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCSegmentedButton]
  }
  
  @scala.inline
  implicit class PartialMDCSegmentedButtonOps[Self <: PartialMDCSegmentedButton] (val x: Self) extends AnyVal {
    
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
    def setGetSegments(value: () => js.Array[SegmentDetail]): Self = this.set("getSegments", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetSegments: Self = this.set("getSegments", js.undefined)
    
    @scala.inline
    def setHasClass(value: /* className */ String => Boolean): Self = this.set("hasClass", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHasClass: Self = this.set("hasClass", js.undefined)
    
    @scala.inline
    def setNotifySelectedChange(value: /* detail */ SegmentDetail => Unit): Self = this.set("notifySelectedChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteNotifySelectedChange: Self = this.set("notifySelectedChange", js.undefined)
    
    @scala.inline
    def setSelectSegment(value: /* indexOrSegmentId */ Double | String => Unit): Self = this.set("selectSegment", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSelectSegment: Self = this.set("selectSegment", js.undefined)
    
    @scala.inline
    def setUnselectSegment(value: /* indexOrSegmentId */ Double | String => Unit): Self = this.set("unselectSegment", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteUnselectSegment: Self = this.set("unselectSegment", js.undefined)
  }
}
