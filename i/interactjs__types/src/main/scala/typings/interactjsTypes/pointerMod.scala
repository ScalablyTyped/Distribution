package typings.interactjsTypes

import typings.interactjsTypes.anon.BeforeEndSetStart
import typings.interactjsTypes.anon.PartialRestrictOptions
import typings.interactjsTypes.anon.Start
import typings.interactjsTypes.interactionMod.Interaction
import typings.interactjsTypes.interactjsModifiersTypesMod.Modifier
import typings.interactjsTypes.interactjsModifiersTypesMod.ModifierModule
import typings.interactjsTypes.typesMod.ActionName
import typings.interactjsTypes.typesMod.Element
import typings.interactjsTypes.typesMod.Point
import typings.interactjsTypes.typesMod.Rect
import typings.interactjsTypes.typesMod.RectResolvable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointerMod {
  
  @JSImport("@interactjs/modifiers/restrict/pointer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    inline def apply(): Modifier[
        RestrictOptions, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrict, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Modifier[
        RestrictOptions, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrict, 
        Any
      ]]
    inline def apply(_options: PartialRestrictOptions): Modifier[
        RestrictOptions, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrict, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].apply(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[
        RestrictOptions, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrict, 
        Any
      ]]
    
    @JSImport("@interactjs/modifiers/restrict/pointer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/restrict/pointer", "default._defaults")
    @js.native
    def defaults: RestrictOptions = js.native
    
    inline def defaults_=(x: RestrictOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/restrict/pointer", "default._methods")
    @js.native
    def methods: BeforeEndSetStart = js.native
    
    inline def methods_=(x: BeforeEndSetStart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_methods")(x.asInstanceOf[js.Any])
  }
  
  inline def getRestrictionRect(
    value: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]],
    interaction: Interaction[ActionName]
  ): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRestrictionRect")(value.asInstanceOf[js.Any], interaction.asInstanceOf[js.Any])).asInstanceOf[Rect]
  inline def getRestrictionRect(
    value: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]],
    interaction: Interaction[ActionName],
    coords: Point
  ): Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("getRestrictionRect")(value.asInstanceOf[js.Any], interaction.asInstanceOf[js.Any], coords.asInstanceOf[js.Any])).asInstanceOf[Rect]
  
  @JSImport("@interactjs/modifiers/restrict/pointer", "restrict")
  @js.native
  val restrict: ModifierModule[RestrictOptions, RestrictState, Any] = js.native
  
  trait RestrictOptions extends StObject {
    
    var elementRect: Rect
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var endOnly: Boolean
    
    var offset: Rect
    
    var restriction: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]]
  }
  object RestrictOptions {
    
    inline def apply(
      elementRect: Rect,
      endOnly: Boolean,
      offset: Rect,
      restriction: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]]
    ): RestrictOptions = {
      val __obj = js.Dynamic.literal(elementRect = elementRect.asInstanceOf[js.Any], endOnly = endOnly.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], restriction = restriction.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictOptions]
    }
    
    extension [Self <: RestrictOptions](x: Self) {
      
      inline def setElementRect(value: Rect): Self = StObject.set(x, "elementRect", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setEndOnly(value: Boolean): Self = StObject.set(x, "endOnly", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Rect): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setRestriction(value: RectResolvable[js.Tuple3[Double, Double, Interaction[ActionName]]]): Self = StObject.set(x, "restriction", value.asInstanceOf[js.Any])
      
      inline def setRestrictionFunction1(value: js.Tuple3[Double, Double, Interaction[ActionName]] => Rect | Element): Self = StObject.set(x, "restriction", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined @interactjs/types.@interactjs/modifiers/types.ModifierState<@interactjs/types.@interactjs/modifiers/restrict/pointer.RestrictOptions, {  offset :@interactjs/types.@interactjs/core/types.Rect}, any> */
  trait RestrictState extends StObject {
    
    var index: js.UndefOr[Double] = js.undefined
    
    var methods: js.UndefOr[Start] = js.undefined
    
    var name: js.UndefOr[Any] = js.undefined
    
    var offset: Rect
    
    var options: RestrictOptions
  }
  object RestrictState {
    
    inline def apply(offset: Rect, options: RestrictOptions): RestrictState = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[RestrictState]
    }
    
    extension [Self <: RestrictState](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setMethods(value: Start): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOffset(value: Rect): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: RestrictOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
