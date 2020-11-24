package typings.materialGridList.anon

import typings.materialGridList.materialGridListStrings.length
import typings.materialGridList.materialGridListStrings.parentRule
import typings.std.EventListener
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material/grid-list.@material/grid-list/adapter.MDCGridListAdapter> */
@js.native
trait PartialMDCGridListAdapter extends js.Object {
  
  var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ EventListener, Unit]] = js.native
  
  var getNumberOfTiles: js.UndefOr[js.Function0[Double]] = js.native
  
  var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.native
  
  var getOffsetWidthForTileAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.native
  
  var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ EventListener, Unit]] = js.native
  
  var setStyleForTilesElement: js.UndefOr[
    js.Function2[
      /* property */ Exclude[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 388 */ js.Any, 
        length | parentRule
      ], 
      /* value */ String | Null, 
      Unit
    ]
  ] = js.native
}
object PartialMDCGridListAdapter {
  
  @scala.inline
  def apply(): PartialMDCGridListAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMDCGridListAdapter]
  }
  
  @scala.inline
  implicit class PartialMDCGridListAdapterOps[Self <: PartialMDCGridListAdapter] (val x: Self) extends AnyVal {
    
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
    def setDeregisterResizeHandler(value: /* handler */ EventListener => Unit): Self = this.set("deregisterResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeregisterResizeHandler: Self = this.set("deregisterResizeHandler", js.undefined)
    
    @scala.inline
    def setGetNumberOfTiles(value: () => Double): Self = this.set("getNumberOfTiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetNumberOfTiles: Self = this.set("getNumberOfTiles", js.undefined)
    
    @scala.inline
    def setGetOffsetWidth(value: () => Double): Self = this.set("getOffsetWidth", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGetOffsetWidth: Self = this.set("getOffsetWidth", js.undefined)
    
    @scala.inline
    def setGetOffsetWidthForTileAtIndex(value: /* index */ Double => Double): Self = this.set("getOffsetWidthForTileAtIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetOffsetWidthForTileAtIndex: Self = this.set("getOffsetWidthForTileAtIndex", js.undefined)
    
    @scala.inline
    def setRegisterResizeHandler(value: /* handler */ EventListener => Unit): Self = this.set("registerResizeHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRegisterResizeHandler: Self = this.set("registerResizeHandler", js.undefined)
    
    @scala.inline
    def setSetStyleForTilesElement(
      value: (/* property */ Exclude[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 388 */ js.Any, 
          length | parentRule
        ], /* value */ String | Null) => Unit
    ): Self = this.set("setStyleForTilesElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSetStyleForTilesElement: Self = this.set("setStyleForTilesElement", js.undefined)
  }
}
