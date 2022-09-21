package typings.lost

import org.scalablytyped.runtime.Shortcut
import typings.lost.lostStrings.ltr
import typings.lost.lostStrings.rtl
import typings.postcss.mod.Container
import typings.postcss.mod.PluginCreator
import typings.postcss.mod.Result
import typings.postcss.nodeMod.ChildNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("lost", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[Settings] = js.native
  
  // These are used in the files under `lib/`
  // They all include the parameters for settings and result even when they're not used,
  // since the library's main file passes all 3 parameters to all of them
  /** Lib function that requires css and settings params */
  type LostLib[R] = js.Function3[
    /* css */ Container[ChildNode], 
    /* settings */ Settings, 
    /* _result */ js.UndefOr[Result], 
    R
  ]
  
  /** Lib function that only requires css param */
  type LostLibNoSettings[R] = js.Function3[
    /* css */ Container[ChildNode], 
    /* _settings */ js.UndefOr[Settings], 
    /* _result */ js.UndefOr[Result], 
    R
  ]
  
  /** Lib function that requires css, settings, and result params */
  type LostLibResult[R] = js.Function3[/* css */ Container[ChildNode], /* settings */ Settings, /* result */ Result, R]
  
  trait Settings extends StObject {
    
    /** @default 'both' */
    var clearing: js.UndefOr[String] = js.undefined
    
    /** @default 'auto' */
    var cycle: js.UndefOr[String] = js.undefined
    
    /** @default 'ltr' */
    var direction: js.UndefOr[ltr | rtl] = js.undefined
    
    /** @default 'no-flex' */
    var flexbox: js.UndefOr[String] = js.undefined
    
    /** @default '%' */
    var gridUnit: js.UndefOr[String] = js.undefined
    
    /** @default '30px' */
    var gutter: js.UndefOr[String] = js.undefined
    
    /** @default 99.9 */
    var rounder: js.UndefOr[Double] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setClearing(value: String): Self = StObject.set(x, "clearing", value.asInstanceOf[js.Any])
      
      inline def setClearingUndefined: Self = StObject.set(x, "clearing", js.undefined)
      
      inline def setCycle(value: String): Self = StObject.set(x, "cycle", value.asInstanceOf[js.Any])
      
      inline def setCycleUndefined: Self = StObject.set(x, "cycle", js.undefined)
      
      inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFlexbox(value: String): Self = StObject.set(x, "flexbox", value.asInstanceOf[js.Any])
      
      inline def setFlexboxUndefined: Self = StObject.set(x, "flexbox", js.undefined)
      
      inline def setGridUnit(value: String): Self = StObject.set(x, "gridUnit", value.asInstanceOf[js.Any])
      
      inline def setGridUnitUndefined: Self = StObject.set(x, "gridUnit", js.undefined)
      
      inline def setGutter(value: String): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setRounder(value: Double): Self = StObject.set(x, "rounder", value.asInstanceOf[js.Any])
      
      inline def setRounderUndefined: Self = StObject.set(x, "rounder", js.undefined)
    }
  }
  
  type _To = PluginCreator[Settings]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[Settings] = ^
}
