package typings.materialGridList

import typings.materialGridList.materialGridListStrings.length
import typings.materialGridList.materialGridListStrings.parentRule
import typings.std.EventListener
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@material/grid-list.@material/grid-list/adapter.MDCGridListAdapter> */
  trait PartialMDCGridListAdapter extends StObject {
    
    var deregisterResizeHandler: js.UndefOr[js.Function1[/* handler */ EventListener, Unit]] = js.undefined
    
    var getNumberOfTiles: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOffsetWidthForTileAtIndex: js.UndefOr[js.Function1[/* index */ Double, Double]] = js.undefined
    
    var registerResizeHandler: js.UndefOr[js.Function1[/* handler */ EventListener, Unit]] = js.undefined
    
    var setStyleForTilesElement: js.UndefOr[
        js.Function2[
          /* property */ Exclude[
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 472, starting with typings.materialGridList.materialGridListStrings.accentColor, typings.materialGridList.materialGridListStrings.alignContent, typings.materialGridList.materialGridListStrings.alignItems */ Any, 
            length | parentRule
          ], 
          /* value */ String | Null, 
          Unit
        ]
      ] = js.undefined
  }
  object PartialMDCGridListAdapter {
    
    inline def apply(): PartialMDCGridListAdapter = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMDCGridListAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialMDCGridListAdapter] (val x: Self) extends AnyVal {
      
      inline def setDeregisterResizeHandler(value: /* handler */ EventListener => Unit): Self = StObject.set(x, "deregisterResizeHandler", js.Any.fromFunction1(value))
      
      inline def setDeregisterResizeHandlerUndefined: Self = StObject.set(x, "deregisterResizeHandler", js.undefined)
      
      inline def setGetNumberOfTiles(value: () => Double): Self = StObject.set(x, "getNumberOfTiles", js.Any.fromFunction0(value))
      
      inline def setGetNumberOfTilesUndefined: Self = StObject.set(x, "getNumberOfTiles", js.undefined)
      
      inline def setGetOffsetWidth(value: () => Double): Self = StObject.set(x, "getOffsetWidth", js.Any.fromFunction0(value))
      
      inline def setGetOffsetWidthForTileAtIndex(value: /* index */ Double => Double): Self = StObject.set(x, "getOffsetWidthForTileAtIndex", js.Any.fromFunction1(value))
      
      inline def setGetOffsetWidthForTileAtIndexUndefined: Self = StObject.set(x, "getOffsetWidthForTileAtIndex", js.undefined)
      
      inline def setGetOffsetWidthUndefined: Self = StObject.set(x, "getOffsetWidth", js.undefined)
      
      inline def setRegisterResizeHandler(value: /* handler */ EventListener => Unit): Self = StObject.set(x, "registerResizeHandler", js.Any.fromFunction1(value))
      
      inline def setRegisterResizeHandlerUndefined: Self = StObject.set(x, "registerResizeHandler", js.undefined)
      
      inline def setSetStyleForTilesElement(
        value: (/* property */ Exclude[
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 472, starting with typings.materialGridList.materialGridListStrings.accentColor, typings.materialGridList.materialGridListStrings.alignContent, typings.materialGridList.materialGridListStrings.alignItems */ Any, 
              length | parentRule
            ], /* value */ String | Null) => Unit
      ): Self = StObject.set(x, "setStyleForTilesElement", js.Any.fromFunction2(value))
      
      inline def setSetStyleForTilesElementUndefined: Self = StObject.set(x, "setStyleForTilesElement", js.undefined)
    }
  }
  
  trait TILESELECTOR extends StObject {
    
    var TILES_SELECTOR: String
    
    var TILE_SELECTOR: String
  }
  object TILESELECTOR {
    
    inline def apply(TILES_SELECTOR: String, TILE_SELECTOR: String): TILESELECTOR = {
      val __obj = js.Dynamic.literal(TILES_SELECTOR = TILES_SELECTOR.asInstanceOf[js.Any], TILE_SELECTOR = TILE_SELECTOR.asInstanceOf[js.Any])
      __obj.asInstanceOf[TILESELECTOR]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TILESELECTOR] (val x: Self) extends AnyVal {
      
      inline def setTILES_SELECTOR(value: String): Self = StObject.set(x, "TILES_SELECTOR", value.asInstanceOf[js.Any])
      
      inline def setTILE_SELECTOR(value: String): Self = StObject.set(x, "TILE_SELECTOR", value.asInstanceOf[js.Any])
    }
  }
}
