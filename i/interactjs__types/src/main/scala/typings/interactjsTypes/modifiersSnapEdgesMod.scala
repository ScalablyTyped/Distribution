package typings.interactjsTypes

import typings.interactjsTypes.anon.Delta
import typings.interactjsTypes.anon.PartialSnapEdgesOptions
import typings.interactjsTypes.anon.SetStart
import typings.interactjsTypes.coreInteractionMod.Interaction
import typings.interactjsTypes.coreTypesMod.ActionName
import typings.interactjsTypes.coreTypesMod.Element
import typings.interactjsTypes.coreTypesMod.Point
import typings.interactjsTypes.coreTypesMod.Rect
import typings.interactjsTypes.coreTypesMod.RectResolvable
import typings.interactjsTypes.interactjsTypesStrings.startCoords
import typings.interactjsTypes.modifiersSnapPointerMod.SnapState
import typings.interactjsTypes.modifiersSnapPointerMod.SnapTarget
import typings.interactjsTypes.modifiersTypesMod.Modifier
import typings.interactjsTypes.modifiersTypesMod.ModifierModule
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersSnapEdgesMod {
  
  object default {
    
    inline def apply(): Modifier[
        SnapEdgesOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapEdges, 
        Delta
      ] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Modifier[
        SnapEdgesOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapEdges, 
        Delta
      ]]
    inline def apply(_options: PartialSnapEdgesOptions): Modifier[
        SnapEdgesOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapEdges, 
        Delta
      ] = ^.asInstanceOf[js.Dynamic].apply(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[
        SnapEdgesOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapEdges, 
        Delta
      ]]
    
    @JSImport("@interactjs/modifiers/snap/edges", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@interactjs/modifiers/snap/edges", "default._defaults")
    @js.native
    def defaults: SnapEdgesOptions = js.native
    
    inline def defaults_=(x: SnapEdgesOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_defaults")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/snap/edges", "default._methods")
    @js.native
    def methods: SetStart = js.native
    
    inline def methods_=(x: SetStart): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_methods")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@interactjs/modifiers/snap/edges", "snapEdges")
  @js.native
  val snapEdges: ModifierModule[
    SnapEdgesOptions, 
    SnapState, 
    ReturnType[/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof set */ Any]
  ] = js.native
  
  /* Inlined std.Pick<@interactjs/types.@interactjs/modifiers/snap/pointer.SnapOptions, 'targets' | 'range' | 'offset' | 'endOnly' | 'enabled'> */
  trait SnapEdgesOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var endOnly: js.UndefOr[Boolean] = js.undefined
    
    var offset: Point | RectResolvable[js.Array[Interaction[ActionName]]] | startCoords | Null
    
    var range: Double
    
    var targets: js.Array[SnapTarget] | Null
  }
  object SnapEdgesOptions {
    
    inline def apply(range: Double): SnapEdgesOptions = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], offset = null, targets = null)
      __obj.asInstanceOf[SnapEdgesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SnapEdgesOptions] (val x: Self) extends AnyVal {
      
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
