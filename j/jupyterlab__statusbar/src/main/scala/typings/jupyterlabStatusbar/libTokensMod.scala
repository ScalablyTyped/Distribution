package typings.jupyterlabStatusbar

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabStatusbar.libTokensMod.IStatusBar.IItem
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  trait IStatusBar extends StObject {
    
    /**
      * Register a new status item.
      *
      * @param id - a unique id for the status item.
      *
      * @param options - The options for how to add the status item.
      *
      * @returns an `IDisposable` that can be disposed to remove the item.
      */
    def registerStatusItem(id: String, statusItem: IItem): IDisposable
  }
  object IStatusBar extends Shortcut {
    
    inline def apply(registerStatusItem: (String, IItem) => IDisposable): IStatusBar = {
      val __obj = js.Dynamic.literal(registerStatusItem = js.Any.fromFunction2(registerStatusItem))
      __obj.asInstanceOf[IStatusBar]
    }
    
    @JSImport("@jupyterlab/statusbar/lib/tokens", "IStatusBar")
    @js.native
    val ^ : Token[IStatusBar] = js.native
    
    /* Rewritten from type alias, can be one of: 
      - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.right
      - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.left
      - typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.middle
    */
    trait Alignment extends StObject
    object Alignment {
      
      inline def left: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.left = "left".asInstanceOf[typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.left]
      
      inline def middle: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.middle = "middle".asInstanceOf[typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.middle]
      
      inline def right: typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.right = "right".asInstanceOf[typings.jupyterlabStatusbar.jupyterlabStatusbarStrings.right]
    }
    
    /**
      * Options for status bar items.
      */
    trait IItem extends StObject {
      
      /**
        * A signal that is fired when the item active state changes.
        */
      var activeStateChanged: js.UndefOr[ISignal[Any, Unit]] = js.undefined
      
      /**
        * Which side to place item.
        * Permanent items are intended for the right and left side,
        * with more transient items in the middle.
        */
      var align: js.UndefOr[Alignment] = js.undefined
      
      /**
        * Whether the item is shown or hidden.
        */
      var isActive: js.UndefOr[js.Function0[Boolean]] = js.undefined
      
      /**
        * The item to add to the status bar.
        */
      var item: Widget
      
      /**
        *  Ordering of Items -- higher rank items are closer to the middle.
        */
      var rank: js.UndefOr[Double] = js.undefined
    }
    object IItem {
      
      inline def apply(item: Widget): IItem = {
        val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
        __obj.asInstanceOf[IItem]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IItem] (val x: Self) extends AnyVal {
        
        inline def setActiveStateChanged(value: ISignal[Any, Unit]): Self = StObject.set(x, "activeStateChanged", value.asInstanceOf[js.Any])
        
        inline def setActiveStateChangedUndefined: Self = StObject.set(x, "activeStateChanged", js.undefined)
        
        inline def setAlign(value: Alignment): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
        
        inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
        
        inline def setItem(value: Widget): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IStatusBar] (val x: Self) extends AnyVal {
      
      inline def setRegisterStatusItem(value: (String, IItem) => IDisposable): Self = StObject.set(x, "registerStatusItem", js.Any.fromFunction2(value))
    }
    
    type _To = Token[IStatusBar]
    
    /* This means you don't have to write `^`, but can instead just say `IStatusBar.foo` */
    override def _to: Token[IStatusBar] = ^
  }
}
