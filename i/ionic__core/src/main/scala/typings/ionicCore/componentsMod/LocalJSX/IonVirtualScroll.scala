package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.virtualScrollInterfaceMod.Cell
import typings.ionicCore.virtualScrollInterfaceMod.FooterHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemRenderFn
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonVirtualScroll extends js.Object {
  
  /**
    * The approximate width of each footer template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxFooterHeight: js.UndefOr[Double] = js.native
  
  /**
    * The approximate height of each header template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxHeaderHeight: js.UndefOr[Double] = js.native
  
  /**
    * It is important to provide this if virtual item height will be significantly larger than the default The approximate height of each virtual item template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxItemHeight: js.UndefOr[Double] = js.native
  
  /**
    * Section footers and the data used within its given template can be dynamically created by passing a function to `footerFn`. The logic within the footer function can decide if the footer template should be used, and what data to give to the footer template. The function must return `null` if a footer cell shouldn't be created.
    */
  var footerFn: js.UndefOr[HeaderFn] = js.native
  
  /**
    * An optional function that maps each item footer within their height.
    */
  var footerHeight: js.UndefOr[FooterHeightFn] = js.native
  
  /**
    * Section headers and the data used within its given template can be dynamically created by passing a function to `headerFn`. For example, a large list of contacts usually has dividers between each letter in the alphabet. App's can provide their own custom `headerFn` which is called with each record within the dataset. The logic within the header function can decide if the header template should be used, and what data to give to the header template. The function must return `null` if a header cell shouldn't be created.
    */
  var headerFn: js.UndefOr[HeaderFn] = js.native
  
  /**
    * An optional function that maps each item header within their height.
    */
  var headerHeight: js.UndefOr[HeaderHeightFn] = js.native
  
  /**
    * An optional function that maps each item within their height. When this function is provides, heavy optimizations and fast path can be taked by `ion-virtual-scroll` leading to massive performance improvements.  This function allows to skip all DOM reads, which can be Doing so leads to massive performance
    */
  var itemHeight: js.UndefOr[ItemHeightFn] = js.native
  
  /**
    * The data that builds the templates within the virtual scroll. It's important to note that when this data has changed, then the entire virtual scroll is reset, which is an expensive operation and should be avoided if possible.
    */
  var items: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * NOTE: only Vanilla JS API.
    */
  var nodeRender: js.UndefOr[ItemRenderFn] = js.native
  
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the footer to be rendered. Returns a JSX virtual-dom.
    */
  var renderFooter: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.native
  
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the header to be rendered. Returns a JSX virtual-dom.
    */
  var renderHeader: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.native
  
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the items to be rendered. Returns a JSX virtual-dom.
    */
  var renderItem: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, _]] = js.native
}
object IonVirtualScroll {
  
  @scala.inline
  def apply(): IonVirtualScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonVirtualScroll]
  }
  
  @scala.inline
  implicit class IonVirtualScrollOps[Self <: IonVirtualScroll] (val x: Self) extends AnyVal {
    
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
    def setApproxFooterHeight(value: Double): Self = this.set("approxFooterHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproxFooterHeight: Self = this.set("approxFooterHeight", js.undefined)
    
    @scala.inline
    def setApproxHeaderHeight(value: Double): Self = this.set("approxHeaderHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproxHeaderHeight: Self = this.set("approxHeaderHeight", js.undefined)
    
    @scala.inline
    def setApproxItemHeight(value: Double): Self = this.set("approxItemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproxItemHeight: Self = this.set("approxItemHeight", js.undefined)
    
    @scala.inline
    def setFooterFn(
      value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => js.UndefOr[String | Null]
    ): Self = this.set("footerFn", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteFooterFn: Self = this.set("footerFn", js.undefined)
    
    @scala.inline
    def setFooterHeight(value: (/* item */ js.Any, /* index */ Double) => Double): Self = this.set("footerHeight", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFooterHeight: Self = this.set("footerHeight", js.undefined)
    
    @scala.inline
    def setHeaderFn(
      value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => js.UndefOr[String | Null]
    ): Self = this.set("headerFn", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHeaderFn: Self = this.set("headerFn", js.undefined)
    
    @scala.inline
    def setHeaderHeight(value: (/* item */ js.Any, /* index */ Double) => Double): Self = this.set("headerHeight", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHeaderHeight: Self = this.set("headerHeight", js.undefined)
    
    @scala.inline
    def setItemHeight(value: (/* item */ js.Any, /* index */ Double) => Double): Self = this.set("itemHeight", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setNodeRender(value: (/* el */ HTMLElement | Null, /* cell */ Cell, /* domIndex */ Double) => HTMLElement): Self = this.set("nodeRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteNodeRender: Self = this.set("nodeRender", js.undefined)
    
    @scala.inline
    def setRenderFooter(value: (/* item */ js.Any, /* index */ Double) => _): Self = this.set("renderFooter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderFooter: Self = this.set("renderFooter", js.undefined)
    
    @scala.inline
    def setRenderHeader(value: (/* item */ js.Any, /* index */ Double) => _): Self = this.set("renderHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderHeader: Self = this.set("renderHeader", js.undefined)
    
    @scala.inline
    def setRenderItem(value: (/* item */ js.Any, /* index */ Double) => _): Self = this.set("renderItem", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRenderItem: Self = this.set("renderItem", js.undefined)
  }
}
