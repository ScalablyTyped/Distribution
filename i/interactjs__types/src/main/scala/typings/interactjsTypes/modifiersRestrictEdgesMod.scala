package typings.interactjsTypes

import typings.interactjsTypes.anon.PartialRestrictEdgesOptio
import typings.interactjsTypes.anon.Right
import typings.interactjsTypes.anon.SetStartStop
import typings.interactjsTypes.anon.Start
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.Element
import typings.interactjsTypes.coreTypesMod.Rect
import typings.interactjsTypes.coreTypesMod.RectResolvable
import typings.interactjsTypes.interactjsTypesStrings.restrictEdges
import typings.interactjsTypes.modifiersTypesMod.Modifier
import typings.interactjsTypes.modifiersTypesMod.ModifierArg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersRestrictEdgesMod {
  
  object default {
    
    inline def apply(): Modifier[RestrictEdgesOptions, RestrictEdgesState, restrictEdges, Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Modifier[RestrictEdgesOptions, RestrictEdgesState, restrictEdges, Unit]]
    inline def apply(_options: PartialRestrictEdgesOptio): Modifier[RestrictEdgesOptions, RestrictEdgesState, restrictEdges, Unit] = ^.asInstanceOf[js.Dynamic].apply(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[RestrictEdgesOptions, RestrictEdgesState, restrictEdges, Unit]]
    
    @JSImport("@interactjs/modifiers/restrict/edges", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/restrict/edges", "default._defaults")
    @js.native
    def defaults: RestrictEdgesOptions = js.native
    
    inline def defaults_=(x: RestrictEdgesOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/restrict/edges", "default._methods")
    @js.native
    def methods: SetStartStop = js.native
    
    inline def methods_=(x: SetStartStop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_methods")(x.asInstanceOf[js.Any])
  }
  
  object restrictEdges {
    
    @JSImport("@interactjs/modifiers/restrict/edges", "restrictEdges")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/restrict/edges", "restrictEdges.defaults")
    @js.native
    def defaults: RestrictEdgesOptions = js.native
    inline def defaults_=(x: RestrictEdgesOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/restrict/edges", "restrictEdges.noInner")
    @js.native
    def noInner: Right = js.native
    inline def noInner_=(x: Right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noInner")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/restrict/edges", "restrictEdges.noOuter")
    @js.native
    def noOuter: Right = js.native
    inline def noOuter_=(x: Right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noOuter")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/restrict/edges", "restrictEdges.set")
    @js.native
    def set: js.Function1[/* param0 */ ModifierArg[RestrictEdgesState], Unit] = js.native
    inline def set(param0: ModifierArg[RestrictEdgesState]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def set_=(x: js.Function1[/* param0 */ ModifierArg[RestrictEdgesState], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/restrict/edges", "restrictEdges.start")
    @js.native
    def start: js.Function1[/* param0 */ ModifierArg[RestrictEdgesState], Unit] = js.native
    inline def start(param0: ModifierArg[RestrictEdgesState]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(param0.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def start_=(x: js.Function1[/* param0 */ ModifierArg[RestrictEdgesState], Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("start")(x.asInstanceOf[js.Any])
  }
  
  trait RestrictEdgesOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var endOnly: Boolean
    
    var inner: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]]
    
    var offset: js.UndefOr[Rect] = js.undefined
    
    var outer: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]]
  }
  object RestrictEdgesOptions {
    
    inline def apply(
      endOnly: Boolean,
      inner: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]],
      outer: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]]
    ): RestrictEdgesOptions = {
      val __obj = js.Dynamic.literal(endOnly = endOnly.asInstanceOf[js.Any], inner = inner.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictEdgesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestrictEdgesOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
      
      inline def setInner(value: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]]): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      inline def setInnerFunction1(value: js.Tuple3[Double, Double, Interaction[ActionName]] => Rect | Element): Self = StObject.set(x, "inner", js.Any.fromFunction1(value))
      
      inline def setOffset(value: Rect): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOuter(value: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]]): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
      
      inline def setOuterFunction1(value: js.Tuple3[Double, Double, Interaction[ActionName]] => Rect | Element): Self = StObject.set(x, "outer", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined @interactjs/types.@interactjs/modifiers/types.ModifierState<@interactjs/types.@interactjs/modifiers/restrict/edges.RestrictEdgesOptions, {  inner :@interactjs/types.@interactjs/core/types.Rect,   outer :@interactjs/types.@interactjs/core/types.Rect,   offset :@interactjs/types.@interactjs/modifiers/restrict/edges.RestrictEdgesOptions['offset']}, any> */
  trait RestrictEdgesState extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var inner: Rect
    
    var methods: js.UndefOr[Start] = js.undefined
    
    var name: js.UndefOr[Any] = js.undefined
    
    var offset: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/modifiers/restrict/pointer.RestrictOptions['offset'] */ js.Any
      ] = js.undefined
    
    var options: RestrictEdgesOptions
    
    var outer: Rect
  }
  object RestrictEdgesState {
    
    inline def apply(inner: Rect, options: RestrictEdgesOptions, outer: Rect): RestrictEdgesState = {
      val __obj = js.Dynamic.literal(inner = inner.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], outer = outer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictEdgesState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RestrictEdgesState] (val x: Self) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setInner(value: Rect): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: Start): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOffset(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @interactjs/types.@interactjs/modifiers/restrict/pointer.RestrictOptions['offset'] */ js.Any
      ): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOptions(value: RestrictEdgesOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOuter(value: Rect): Self = StObject.set(x, "outer", value.asInstanceOf[js.Any])
    }
  }
}
