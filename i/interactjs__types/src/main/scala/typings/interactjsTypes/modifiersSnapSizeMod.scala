package typings.interactjsTypes

import typings.interactjsTypes.anon.Delta
import typings.interactjsTypes.anon.PartialSnapSizeOptions
import typings.interactjsTypes.anon.SetStart
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.Element
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.Rect
import typings.interactjsTypes.coreTypesMod.RectResolvable
import typings.interactjsTypes.interactjsTypesStrings.snapSize
import typings.interactjsTypes.interactjsTypesStrings.startCoords
import typings.interactjsTypes.modifiersSnapPointerMod.SnapState
import typings.interactjsTypes.modifiersSnapPointerMod.SnapTarget
import typings.interactjsTypes.modifiersTypesMod.Modifier
import typings.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersSnapSizeMod {
  
  object default {
    
    inline def apply(): Modifier[SnapSizeOptions, SnapState, snapSize, Delta] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Modifier[SnapSizeOptions, SnapState, snapSize, Delta]]
    inline def apply(_options: PartialSnapSizeOptions): Modifier[SnapSizeOptions, SnapState, snapSize, Delta] = ^.asInstanceOf[js.Dynamic].apply(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[SnapSizeOptions, SnapState, snapSize, Delta]]
    
    @JSImport("@interactjs/modifiers/snap/size", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/snap/size", "default._defaults")
    @js.native
    def defaults: SnapSizeOptions = js.native
    
    inline def defaults_=(x: SnapSizeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/snap/size", "default._methods")
    @js.native
    def methods: SetStart = js.native
    
    inline def methods_=(x: SetStart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_methods")(x.asInstanceOf[js.Any])
  }
  
  object snapSize {
    
    @JSImport("@interactjs/modifiers/snap/size", "snapSize")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/snap/size", "snapSize.defaults")
    @js.native
    def defaults: SnapSizeOptions = js.native
    inline def defaults_=(x: SnapSizeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/snap/size", "snapSize.set")
    @js.native
    def set: js.Function1[/* arg */ Any, Delta] = js.native
    inline def set(arg: Any): Delta = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(arg.asInstanceOf[js.Any]).asInstanceOf[Delta]
    inline def set_=(x: js.Function1[/* arg */ Any, Delta]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/snap/size", "snapSize.start")
    @js.native
    def start: js.Function1[/* arg */ ModifierArg[SnapState], Any] = js.native
    inline def start(arg: ModifierArg[SnapState]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(arg.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def start_=(x: js.Function1[/* arg */ ModifierArg[SnapState], Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Pick<@interactjs/types.@interactjs/modifiers/snap/pointer.SnapOptions, 'targets' | 'offset' | 'endOnly' | 'range' | 'enabled'> */
  trait SnapSizeOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var endOnly: js.UndefOr[Boolean] = js.undefined
    
    var offset: Point | RectResolvable[js.Array[Interaction[ActionName]]] | startCoords | Null
    
    var range: Double
    
    var targets: js.Array[SnapTarget] | Null
  }
  object SnapSizeOptions {
    
    inline def apply(range: Double): SnapSizeOptions = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], offset = null, targets = null)
      __obj.asInstanceOf[SnapSizeOptions]
    }
    
    extension [Self <: SnapSizeOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
      
      inline def setEndOnlyUndefined: Self = StObject.set(x, "endOnly", js.undefined)
      
      inline def setOffset(value: Point | RectResolvable[js.Array[Interaction[ActionName]]] | startCoords): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(value: js.Array[Interaction[ActionName]] => Rect | Element): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      inline def setOffsetNull: Self = StObject.set(x, "offset", null)
      
      inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setTargets(value: js.Array[SnapTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsNull: Self = StObject.set(x, "targets", null)
      
      inline def setTargetsVarargs(value: SnapTarget*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
}
