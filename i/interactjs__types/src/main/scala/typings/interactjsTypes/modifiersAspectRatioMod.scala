package typings.interactjsTypes

import typings.interactjsTypes.anon.PartialAspectRatioOptions
import typings.interactjsTypes.anon.Start
import typings.interactjsTypes.anon.StartStop
import typings.interactjsTypes.anon.X
import typings.interactjsTypes.coreTypesMod.EdgeOptions
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.Rect
import typings.interactjsTypes.interactjsTypesStrings.preserve
import typings.interactjsTypes.modifiersModificationMod.default
import typings.interactjsTypes.modifiersTypesMod.Modifier
import typings.interactjsTypes.modifiersTypesMod.ModifierModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersAspectRatioMod {
  
  object default {
    
    inline def apply(): Modifier[
        AspectRatioOptions, 
        AspectRatioState, 
        typings.interactjsTypes.interactjsTypesStrings.aspectRatio, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Modifier[
        AspectRatioOptions, 
        AspectRatioState, 
        typings.interactjsTypes.interactjsTypesStrings.aspectRatio, 
        Any
      ]]
    inline def apply(_options: PartialAspectRatioOptions): Modifier[
        AspectRatioOptions, 
        AspectRatioState, 
        typings.interactjsTypes.interactjsTypesStrings.aspectRatio, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].apply(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[
        AspectRatioOptions, 
        AspectRatioState, 
        typings.interactjsTypes.interactjsTypesStrings.aspectRatio, 
        Any
      ]]
    
    @JSImport("@interactjs/modifiers/aspectRatio", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/aspectRatio", "default._defaults")
    @js.native
    def defaults: AspectRatioOptions = js.native
    
    inline def defaults_=(x: AspectRatioOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/aspectRatio", "default._methods")
    @js.native
    def methods: StartStop = js.native
    
    inline def methods_=(x: StartStop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_methods")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@interactjs/modifiers/aspectRatio", "aspectRatio")
  @js.native
  val aspectRatio: ModifierModule[AspectRatioOptions, AspectRatioState, Any] = js.native
  
  trait AspectRatioOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var equalDelta: js.UndefOr[Boolean] = js.undefined
    
    var modifiers: js.UndefOr[js.Array[Modifier[Any, Any, Any, Any]]] = js.undefined
    
    var ratio: js.UndefOr[Double | preserve] = js.undefined
  }
  object AspectRatioOptions {
    
    inline def apply(): AspectRatioOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AspectRatioOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AspectRatioOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEqualDelta(value: Boolean): Self = StObject.set(x, "equalDelta", value.asInstanceOf[js.Any])
      
      inline def setEqualDeltaUndefined: Self = StObject.set(x, "equalDelta", js.undefined)
      
      inline def setModifiers(value: js.Array[Modifier[Any, Any, Any, Any]]): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
      
      inline def setModifiersVarargs(value: (Modifier[Any, Any, Any, Any])*): Self = StObject.set(x, "modifiers", js.Array(value*))
      
      inline def setRatio(value: Double | preserve): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
  
  /* Inlined @interactjs/types.@interactjs/modifiers/types.ModifierState<@interactjs/types.@interactjs/modifiers/aspectRatio.AspectRatioOptions, {  startCoords :@interactjs/types.@interactjs/core/types.Point,   startRect :@interactjs/types.@interactjs/core/types.Rect,   linkedEdges :@interactjs/types.@interactjs/core/types.EdgeOptions,   ratio :number,   equalDelta :boolean,   xIsPrimaryAxis :boolean,   edgeSign :{  x :number,   y :number},   subModification :@interactjs/types.@interactjs/modifiers/Modification.default}, any> */
  trait AspectRatioState extends StObject {
    
    var edgeSign: X
    
    var equalDelta: Boolean
    
    var index: js.UndefOr[Double] = js.undefined
    
    var linkedEdges: EdgeOptions
    
    var methods: js.UndefOr[Start] = js.undefined
    
    var name: js.UndefOr[Any] = js.undefined
    
    var options: AspectRatioOptions
    
    var ratio: Double
    
    var startCoords: Point
    
    var startRect: Rect
    
    var subModification: default
    
    var xIsPrimaryAxis: Boolean
  }
  object AspectRatioState {
    
    inline def apply(
      edgeSign: X,
      equalDelta: Boolean,
      linkedEdges: EdgeOptions,
      options: AspectRatioOptions,
      ratio: Double,
      startCoords: Point,
      startRect: Rect,
      subModification: default,
      xIsPrimaryAxis: Boolean
    ): AspectRatioState = {
      val __obj = js.Dynamic.literal(edgeSign = edgeSign.asInstanceOf[js.Any], equalDelta = equalDelta.asInstanceOf[js.Any], linkedEdges = linkedEdges.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], startCoords = startCoords.asInstanceOf[js.Any], startRect = startRect.asInstanceOf[js.Any], subModification = subModification.asInstanceOf[js.Any], xIsPrimaryAxis = xIsPrimaryAxis.asInstanceOf[js.Any])
      __obj.asInstanceOf[AspectRatioState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AspectRatioState] (val x: Self) extends AnyVal {
      
      inline def setEdgeSign(value: X): Self = StObject.set(x, "edgeSign", value.asInstanceOf[js.Any])
      
      inline def setEqualDelta(value: Boolean): Self = StObject.set(x, "equalDelta", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setLinkedEdges(value: EdgeOptions): Self = StObject.set(x, "linkedEdges", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: Start): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOptions(value: AspectRatioOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setStartCoords(value: Point): Self = StObject.set(x, "startCoords", value.asInstanceOf[js.Any])
      
      inline def setStartRect(value: Rect): Self = StObject.set(x, "startRect", value.asInstanceOf[js.Any])
      
      inline def setSubModification(value: default): Self = StObject.set(x, "subModification", value.asInstanceOf[js.Any])
      
      inline def setXIsPrimaryAxis(value: Boolean): Self = StObject.set(x, "xIsPrimaryAxis", value.asInstanceOf[js.Any])
    }
  }
}
