package typings.interactjsTypes

import org.scalablytyped.runtime.StringDictionary
import typings.interactjsTypes.anon.Delta
import typings.interactjsTypes.anon.PartialSnapOptions
import typings.interactjsTypes.anon.SetStart
import typings.interactjsTypes.anon.Start
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreInteractionMod.InteractionProxy
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.Element
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.Rect
import typings.interactjsTypes.coreTypesMod.RectResolvable
import typings.interactjsTypes.interactjsTypesStrings.snap
import typings.interactjsTypes.interactjsTypesStrings.startCoords
import typings.interactjsTypes.modifiersTypesMod.Modifier
import typings.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersSnapPointerMod {
  
  object default {
    
    inline def apply(): Modifier[SnapOptions, SnapState, snap, Delta] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Modifier[SnapOptions, SnapState, snap, Delta]]
    inline def apply(_options: PartialSnapOptions): Modifier[SnapOptions, SnapState, snap, Delta] = ^.asInstanceOf[js.Dynamic].apply(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[SnapOptions, SnapState, snap, Delta]]
    
    @JSImport("@interactjs/modifiers/snap/pointer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/snap/pointer", "default._defaults")
    @js.native
    def defaults: SnapOptions = js.native
    
    inline def defaults_=(x: SnapOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/snap/pointer", "default._methods")
    @js.native
    def methods: SetStart = js.native
    
    inline def methods_=(x: SetStart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_methods")(x.asInstanceOf[js.Any])
  }
  
  object snap {
    
    @JSImport("@interactjs/modifiers/snap/pointer", "snap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/snap/pointer", "snap.defaults")
    @js.native
    def defaults: SnapOptions = js.native
    inline def defaults_=(x: SnapOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/snap/pointer", "snap.set")
    @js.native
    def set: js.Function1[/* arg */ ModifierArg[SnapState], Delta] = js.native
    inline def set(arg: ModifierArg[SnapState]): Delta = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(arg.asInstanceOf[js.Any]).asInstanceOf[Delta]
    inline def set_=(x: js.Function1[/* arg */ ModifierArg[SnapState], Delta]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/snap/pointer", "snap.start")
    @js.native
    def start: js.Function1[/* arg */ ModifierArg[SnapState], Unit] = js.native
    inline def start(arg: ModifierArg[SnapState]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(arg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def start_=(x: js.Function1[/* arg */ ModifierArg[SnapState], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
  
  trait Offset extends StObject {
    
    var index: Double
    
    var relativePoint: js.UndefOr[Point | Null] = js.undefined
    
    var x: Double
    
    var y: Double
  }
  object Offset {
    
    inline def apply(index: Double, x: Double, y: Double): Offset = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setRelativePoint(value: Point): Self = StObject.set(x, "relativePoint", value.asInstanceOf[js.Any])
      
      inline def setRelativePointNull: Self = StObject.set(x, "relativePoint", null)
      
      inline def setRelativePointUndefined: Self = StObject.set(x, "relativePoint", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type SnapFunction = js.Function5[
    /* x */ Double, 
    /* y */ Double, 
    /* interaction */ InteractionProxy[ActionName], 
    /* offset */ Offset, 
    /* index */ Double, 
    SnapPosition
  ]
  
  trait SnapOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var endOnly: js.UndefOr[Boolean] = js.undefined
    
    var offset: Point | RectResolvable[js.Array[Interaction[ActionName]]] | startCoords | Null
    
    var offsetWithOrigin: js.UndefOr[Boolean] = js.undefined
    
    var origin: RectResolvable[js.Array[Element]] | Point | Null
    
    var range: Double
    
    var relativePoints: js.Array[Point] | Null
    
    var targets: js.Array[SnapTarget] | Null
  }
  object SnapOptions {
    
    inline def apply(range: Double): SnapOptions = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], offset = null, origin = null, relativePoints = null, targets = null)
      __obj.asInstanceOf[SnapOptions]
    }
    
    extension [Self <: SnapOptions](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
      
      inline def setEndOnlyUndefined: Self = StObject.set(x, "endOnly", js.undefined)
      
      inline def setOffset(value: Point | RectResolvable[js.Array[Interaction[ActionName]]] | startCoords): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetFunction1(value: js.Array[Interaction[ActionName]] => Rect | Element): Self = StObject.set(x, "offset", js.Any.fromFunction1(value))
      
      inline def setOffsetNull: Self = StObject.set(x, "offset", null)
      
      inline def setOffsetWithOrigin(value: Boolean): Self = StObject.set(x, "offsetWithOrigin", value.asInstanceOf[js.Any])
      
      inline def setOffsetWithOriginUndefined: Self = StObject.set(x, "offsetWithOrigin", js.undefined)
      
      inline def setOrigin(value: RectResolvable[js.Array[Element]] | Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginFunction1(value: js.Array[Element] => Rect | Element): Self = StObject.set(x, "origin", js.Any.fromFunction1(value))
      
      inline def setOriginNull: Self = StObject.set(x, "origin", null)
      
      inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRelativePoints(value: js.Array[Point]): Self = StObject.set(x, "relativePoints", value.asInstanceOf[js.Any])
      
      inline def setRelativePointsNull: Self = StObject.set(x, "relativePoints", null)
      
      inline def setRelativePointsVarargs(value: Point*): Self = StObject.set(x, "relativePoints", js.Array(value*))
      
      inline def setTargets(value: js.Array[SnapTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsNull: Self = StObject.set(x, "targets", null)
      
      inline def setTargetsVarargs(value: SnapTarget*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
  
  trait SnapPosition
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var offset: js.UndefOr[Offset] = js.undefined
    
    var range: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object SnapPosition {
    
    inline def apply(): SnapPosition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapPosition]
    }
    
    extension [Self <: SnapPosition](x: Self) {
      
      inline def setOffset(value: Offset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Inlined @interactjs/types.@interactjs/modifiers/types.ModifierState<@interactjs/types.@interactjs/modifiers/snap/pointer.SnapOptions, {  offsets :std.Array<@interactjs/types.@interactjs/modifiers/snap/pointer.Offset> | undefined,   closest :any | undefined,   targetFields :std.Array<std.Array<string>> | undefined}, any> */
  trait SnapState extends StObject {
    
    var closest: js.UndefOr[Any] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var methods: js.UndefOr[Start] = js.undefined
    
    var name: js.UndefOr[Any] = js.undefined
    
    var offsets: js.UndefOr[js.Array[Offset]] = js.undefined
    
    var options: SnapOptions
    
    var targetFields: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  }
  object SnapState {
    
    inline def apply(options: SnapOptions): SnapState = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapState]
    }
    
    extension [Self <: SnapState](x: Self) {
      
      inline def setClosest(value: Any): Self = StObject.set(x, "closest", value.asInstanceOf[js.Any])
      
      inline def setClosestUndefined: Self = StObject.set(x, "closest", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setMethods(value: Start): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOffsets(value: js.Array[Offset]): Self = StObject.set(x, "offsets", value.asInstanceOf[js.Any])
      
      inline def setOffsetsUndefined: Self = StObject.set(x, "offsets", js.undefined)
      
      inline def setOffsetsVarargs(value: Offset*): Self = StObject.set(x, "offsets", js.Array(value*))
      
      inline def setOptions(value: SnapOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setTargetFields(value: js.Array[js.Array[String]]): Self = StObject.set(x, "targetFields", value.asInstanceOf[js.Any])
      
      inline def setTargetFieldsUndefined: Self = StObject.set(x, "targetFields", js.undefined)
      
      inline def setTargetFieldsVarargs(value: js.Array[String]*): Self = StObject.set(x, "targetFields", js.Array(value*))
    }
  }
  
  type SnapTarget = SnapPosition | SnapFunction
}
