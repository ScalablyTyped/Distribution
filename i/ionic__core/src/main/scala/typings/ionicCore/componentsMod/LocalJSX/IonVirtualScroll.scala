package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.virtualScrollInterfaceMod.Cell
import typings.ionicCore.virtualScrollInterfaceMod.FooterHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderFn
import typings.ionicCore.virtualScrollInterfaceMod.HeaderHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemHeightFn
import typings.ionicCore.virtualScrollInterfaceMod.ItemRenderFn
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonVirtualScroll extends StObject {
  
  /**
    * The approximate width of each footer template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxFooterHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * The approximate height of each header template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxHeaderHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * It is important to provide this if virtual item height will be significantly larger than the default The approximate height of each virtual item template's cell. This dimension is used to help determine how many cells should be created when initialized, and to help calculate the height of the scrollable area. This height value can only use `px` units. Note that the actual rendered size of each cell comes from the app's CSS, whereas this approximation is used to help calculate initial dimensions before the item has been rendered.
    */
  var approxItemHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Section footers and the data used within its given template can be dynamically created by passing a function to `footerFn`. The logic within the footer function can decide if the footer template should be used, and what data to give to the footer template. The function must return `null` if a footer cell shouldn't be created.
    */
  var footerFn: js.UndefOr[HeaderFn] = js.undefined
  
  /**
    * An optional function that maps each item footer within their height.
    */
  var footerHeight: js.UndefOr[FooterHeightFn] = js.undefined
  
  /**
    * Section headers and the data used within its given template can be dynamically created by passing a function to `headerFn`. For example, a large list of contacts usually has dividers between each letter in the alphabet. App's can provide their own custom `headerFn` which is called with each record within the dataset. The logic within the header function can decide if the header template should be used, and what data to give to the header template. The function must return `null` if a header cell shouldn't be created.
    */
  var headerFn: js.UndefOr[HeaderFn] = js.undefined
  
  /**
    * An optional function that maps each item header within their height.
    */
  var headerHeight: js.UndefOr[HeaderHeightFn] = js.undefined
  
  /**
    * An optional function that maps each item within their height. When this function is provides, heavy optimizations and fast path can be taked by `ion-virtual-scroll` leading to massive performance improvements.  This function allows to skip all DOM reads, which can be Doing so leads to massive performance
    */
  var itemHeight: js.UndefOr[ItemHeightFn] = js.undefined
  
  /**
    * The data that builds the templates within the virtual scroll. It's important to note that when this data has changed, then the entire virtual scroll is reset, which is an expensive operation and should be avoided if possible.
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * NOTE: only Vanilla JS API.
    */
  var nodeRender: js.UndefOr[ItemRenderFn] = js.undefined
  
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the footer to be rendered. Returns a JSX virtual-dom.
    */
  var renderFooter: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, js.Any]] = js.undefined
  
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the header to be rendered. Returns a JSX virtual-dom.
    */
  var renderHeader: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, js.Any]] = js.undefined
  
  /**
    * NOTE: only JSX API for stencil.  Provide a render function for the items to be rendered. Returns a JSX virtual-dom.
    */
  var renderItem: js.UndefOr[js.Function2[/* item */ js.Any, /* index */ Double, js.Any]] = js.undefined
}
object IonVirtualScroll {
  
  inline def apply(): IonVirtualScroll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonVirtualScroll]
  }
  
  extension [Self <: IonVirtualScroll](x: Self) {
    
    inline def setApproxFooterHeight(value: Double): Self = StObject.set(x, "approxFooterHeight", value.asInstanceOf[js.Any])
    
    inline def setApproxFooterHeightUndefined: Self = StObject.set(x, "approxFooterHeight", js.undefined)
    
    inline def setApproxHeaderHeight(value: Double): Self = StObject.set(x, "approxHeaderHeight", value.asInstanceOf[js.Any])
    
    inline def setApproxHeaderHeightUndefined: Self = StObject.set(x, "approxHeaderHeight", js.undefined)
    
    inline def setApproxItemHeight(value: Double): Self = StObject.set(x, "approxItemHeight", value.asInstanceOf[js.Any])
    
    inline def setApproxItemHeightUndefined: Self = StObject.set(x, "approxItemHeight", js.undefined)
    
    inline def setFooterFn(
      value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => js.UndefOr[String | Null]
    ): Self = StObject.set(x, "footerFn", js.Any.fromFunction3(value))
    
    inline def setFooterFnUndefined: Self = StObject.set(x, "footerFn", js.undefined)
    
    inline def setFooterHeight(value: (/* item */ js.Any, /* index */ Double) => Double): Self = StObject.set(x, "footerHeight", js.Any.fromFunction2(value))
    
    inline def setFooterHeightUndefined: Self = StObject.set(x, "footerHeight", js.undefined)
    
    inline def setHeaderFn(
      value: (/* item */ js.Any, /* index */ Double, /* items */ js.Array[js.Any]) => js.UndefOr[String | Null]
    ): Self = StObject.set(x, "headerFn", js.Any.fromFunction3(value))
    
    inline def setHeaderFnUndefined: Self = StObject.set(x, "headerFn", js.undefined)
    
    inline def setHeaderHeight(value: (/* item */ js.Any, /* index */ Double) => Double): Self = StObject.set(x, "headerHeight", js.Any.fromFunction2(value))
    
    inline def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
    
    inline def setItemHeight(value: (/* item */ js.Any, /* index */ Double) => Double): Self = StObject.set(x, "itemHeight", js.Any.fromFunction2(value))
    
    inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
    
    inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setNodeRender(value: (/* el */ HTMLElement | Null, /* cell */ Cell, /* domIndex */ Double) => HTMLElement): Self = StObject.set(x, "nodeRender", js.Any.fromFunction3(value))
    
    inline def setNodeRenderUndefined: Self = StObject.set(x, "nodeRender", js.undefined)
    
    inline def setRenderFooter(value: (/* item */ js.Any, /* index */ Double) => js.Any): Self = StObject.set(x, "renderFooter", js.Any.fromFunction2(value))
    
    inline def setRenderFooterUndefined: Self = StObject.set(x, "renderFooter", js.undefined)
    
    inline def setRenderHeader(value: (/* item */ js.Any, /* index */ Double) => js.Any): Self = StObject.set(x, "renderHeader", js.Any.fromFunction2(value))
    
    inline def setRenderHeaderUndefined: Self = StObject.set(x, "renderHeader", js.undefined)
    
    inline def setRenderItem(value: (/* item */ js.Any, /* index */ Double) => js.Any): Self = StObject.set(x, "renderItem", js.Any.fromFunction2(value))
    
    inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
  }
}
