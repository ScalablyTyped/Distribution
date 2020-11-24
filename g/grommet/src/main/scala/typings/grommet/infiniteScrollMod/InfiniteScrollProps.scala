package typings.grommet.infiniteScrollMod

import typings.grommet.grommetStrings.window
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteScrollProps extends js.Object {
  
  var items: js.UndefOr[js.Array[String | Double | ReactElement | (Record[String, _])]] = js.native
  
  var onMore: js.UndefOr[js.Function0[Unit]] = js.native
  
  var renderMarker: js.UndefOr[js.Function1[/* marker */ ReactElement, ReactElement]] = js.native
  
  var replace: js.UndefOr[Boolean] = js.native
  
  var scrollableAncestor: js.UndefOr[ReactNode | window] = js.native
  
  var show: js.UndefOr[Double] = js.native
  
  var step: js.UndefOr[Double] = js.native
}
object InfiniteScrollProps {
  
  @scala.inline
  def apply(): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InfiniteScrollProps]
  }
  
  @scala.inline
  implicit class InfiniteScrollPropsOps[Self <: InfiniteScrollProps] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: (String | Double | ReactElement | (Record[String, js.Any]))*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String | Double | ReactElement | (Record[String, _])]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setOnMore(value: () => Unit): Self = this.set("onMore", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnMore: Self = this.set("onMore", js.undefined)
    
    @scala.inline
    def setRenderMarker(value: /* marker */ ReactElement => ReactElement): Self = this.set("renderMarker", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRenderMarker: Self = this.set("renderMarker", js.undefined)
    
    @scala.inline
    def setReplace(value: Boolean): Self = this.set("replace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace: Self = this.set("replace", js.undefined)
    
    @scala.inline
    def setScrollableAncestor(value: ReactNode | window): Self = this.set("scrollableAncestor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollableAncestor: Self = this.set("scrollableAncestor", js.undefined)
    
    @scala.inline
    def setShow(value: Double): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
