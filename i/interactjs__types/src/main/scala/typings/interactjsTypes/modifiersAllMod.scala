package typings.interactjsTypes

import typings.interactjsTypes.anon.CallDefaults
import typings.interactjsTypes.anon.CallDefaultsMethods
import typings.interactjsTypes.anon.CallOptions
import typings.interactjsTypes.anon.Defaults
import typings.interactjsTypes.anon.DefaultsMethods
import typings.interactjsTypes.anon.DefaultsSnapEdgesOptions
import typings.interactjsTypes.anon.DefaultsSnapOptions
import typings.interactjsTypes.anon.DefaultsSnapSizeOptions
import typings.interactjsTypes.anon.Delta
import typings.interactjsTypes.anon.PartialAspectRatioOptions
import typings.interactjsTypes.anon.PartialRestrictEdgesOptio
import typings.interactjsTypes.anon.PartialRestrictOptions
import typings.interactjsTypes.anon.PartialRestrictOptionsele
import typings.interactjsTypes.anon.PartialRestrictSizeOption
import typings.interactjsTypes.anon.PartialSnapEdgesOptions
import typings.interactjsTypes.anon.PartialSnapOptions
import typings.interactjsTypes.anon.PartialSnapSizeOptions
import typings.interactjsTypes.anon.RestrictOptionselementRec
import typings.interactjsTypes.interactjsTypesStrings.noop
import typings.interactjsTypes.modifiersAspectRatioMod.AspectRatioOptions
import typings.interactjsTypes.modifiersAspectRatioMod.AspectRatioState
import typings.interactjsTypes.modifiersRestrictEdgesMod.RestrictEdgesOptions
import typings.interactjsTypes.modifiersRestrictEdgesMod.RestrictEdgesState
import typings.interactjsTypes.modifiersRestrictPointerMod.RestrictOptions
import typings.interactjsTypes.modifiersRestrictPointerMod.RestrictState
import typings.interactjsTypes.modifiersRestrictSizeMod.RestrictSizeOptions
import typings.interactjsTypes.modifiersSnapEdgesMod.SnapEdgesOptions
import typings.interactjsTypes.modifiersSnapPointerMod.SnapOptions
import typings.interactjsTypes.modifiersSnapPointerMod.SnapState
import typings.interactjsTypes.modifiersSnapSizeMod.SnapSizeOptions
import typings.interactjsTypes.modifiersTypesMod.Modifier
import typings.interactjsTypes.modifiersTypesMod.ModifierFunction
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersAllMod {
  
  object default {
    
    @JSImport("@interactjs/modifiers/all", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def aspectRatio(): Modifier[
        AspectRatioOptions, 
        AspectRatioState, 
        typings.interactjsTypes.interactjsTypesStrings.aspectRatio, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("aspectRatio")().asInstanceOf[Modifier[
        AspectRatioOptions, 
        AspectRatioState, 
        typings.interactjsTypes.interactjsTypesStrings.aspectRatio, 
        Any
      ]]
    inline def aspectRatio(_options: PartialAspectRatioOptions): Modifier[
        AspectRatioOptions, 
        AspectRatioState, 
        typings.interactjsTypes.interactjsTypesStrings.aspectRatio, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("aspectRatio")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[
        AspectRatioOptions, 
        AspectRatioState, 
        typings.interactjsTypes.interactjsTypesStrings.aspectRatio, 
        Any
      ]]
    @JSImport("@interactjs/modifiers/all", "default.aspectRatio")
    @js.native
    def aspectRatio_Fdefault: Defaults = js.native
    
    inline def aspectRatio_Fdefault_=(x: Defaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("aspectRatio")(x.asInstanceOf[js.Any])
    
    inline def avoid(): Modifier[Any, Any, noop, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("avoid")().asInstanceOf[Modifier[Any, Any, noop, Any]]
    inline def avoid(_options: Partial[Any]): Modifier[Any, Any, noop, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("avoid")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[Any, Any, noop, Any]]
    @JSImport("@interactjs/modifiers/all", "default.avoid")
    @js.native
    def avoid_Fdefault: ModifierFunction[Any, Any, noop] = js.native
    
    inline def avoid_Fdefault_=(x: ModifierFunction[Any, Any, noop]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("avoid")(x.asInstanceOf[js.Any])
    
    inline def restrict(): Modifier[
        RestrictOptions, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrict, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrict")().asInstanceOf[Modifier[
        RestrictOptions, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrict, 
        Any
      ]]
    inline def restrict(_options: PartialRestrictOptions): Modifier[
        RestrictOptions, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrict, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrict")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[
        RestrictOptions, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrict, 
        Any
      ]]
    
    inline def restrictEdges(): Modifier[
        RestrictEdgesOptions, 
        RestrictEdgesState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictEdges, 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictEdges")().asInstanceOf[Modifier[
        RestrictEdgesOptions, 
        RestrictEdgesState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictEdges, 
        Unit
      ]]
    inline def restrictEdges(_options: PartialRestrictEdgesOptio): Modifier[
        RestrictEdgesOptions, 
        RestrictEdgesState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictEdges, 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictEdges")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[
        RestrictEdgesOptions, 
        RestrictEdgesState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictEdges, 
        Unit
      ]]
    @JSImport("@interactjs/modifiers/all", "default.restrictEdges")
    @js.native
    def restrictEdges_Fdefault: CallDefaults = js.native
    
    inline def restrictEdges_Fdefault_=(x: CallDefaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictEdges")(x.asInstanceOf[js.Any])
    
    inline def restrictRect(): Modifier[
        RestrictOptionselementRec, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictRect, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictRect")().asInstanceOf[Modifier[
        RestrictOptionselementRec, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictRect, 
        Any
      ]]
    inline def restrictRect(_options: PartialRestrictOptionsele): Modifier[
        RestrictOptionselementRec, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictRect, 
        Any
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictRect")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[
        RestrictOptionselementRec, 
        RestrictState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictRect, 
        Any
      ]]
    @JSImport("@interactjs/modifiers/all", "default.restrictRect")
    @js.native
    def restrictRect_Fdefault: CallDefaultsMethods = js.native
    
    inline def restrictRect_Fdefault_=(x: CallDefaultsMethods): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictRect")(x.asInstanceOf[js.Any])
    
    inline def restrictSize(): Modifier[
        RestrictSizeOptions, 
        RestrictEdgesState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictSize, 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictSize")().asInstanceOf[Modifier[
        RestrictSizeOptions, 
        RestrictEdgesState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictSize, 
        Unit
      ]]
    inline def restrictSize(_options: PartialRestrictSizeOption): Modifier[
        RestrictSizeOptions, 
        RestrictEdgesState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictSize, 
        Unit
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("restrictSize")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[
        RestrictSizeOptions, 
        RestrictEdgesState, 
        typings.interactjsTypes.interactjsTypesStrings.restrictSize, 
        Unit
      ]]
    @JSImport("@interactjs/modifiers/all", "default.restrictSize")
    @js.native
    def restrictSize_Fdefault: CallOptions = js.native
    
    inline def restrictSize_Fdefault_=(x: CallOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrictSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/all", "default.restrict")
    @js.native
    def restrict_Fdefault: DefaultsMethods = js.native
    
    inline def restrict_Fdefault_=(x: DefaultsMethods): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restrict")(x.asInstanceOf[js.Any])
    
    inline def rubberband(): Modifier[Any, Any, noop, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")().asInstanceOf[Modifier[Any, Any, noop, Any]]
    inline def rubberband(_options: Partial[Any]): Modifier[Any, Any, noop, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("rubberband")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[Any, Any, noop, Any]]
    @JSImport("@interactjs/modifiers/all", "default.rubberband")
    @js.native
    def rubberband_Fdefault: ModifierFunction[Any, Any, noop] = js.native
    
    inline def rubberband_Fdefault_=(x: ModifierFunction[Any, Any, noop]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rubberband")(x.asInstanceOf[js.Any])
    
    inline def snap(): Modifier[SnapOptions, SnapState, typings.interactjsTypes.interactjsTypesStrings.snap, Delta] = ^.asInstanceOf[js.Dynamic].applyDynamic("snap")().asInstanceOf[Modifier[SnapOptions, SnapState, typings.interactjsTypes.interactjsTypesStrings.snap, Delta]]
    inline def snap(_options: PartialSnapOptions): Modifier[SnapOptions, SnapState, typings.interactjsTypes.interactjsTypesStrings.snap, Delta] = ^.asInstanceOf[js.Dynamic].applyDynamic("snap")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[SnapOptions, SnapState, typings.interactjsTypes.interactjsTypesStrings.snap, Delta]]
    
    inline def snapEdges(): Modifier[
        SnapEdgesOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapEdges, 
        Delta
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("snapEdges")().asInstanceOf[Modifier[
        SnapEdgesOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapEdges, 
        Delta
      ]]
    inline def snapEdges(_options: PartialSnapEdgesOptions): Modifier[
        SnapEdgesOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapEdges, 
        Delta
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("snapEdges")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[
        SnapEdgesOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapEdges, 
        Delta
      ]]
    @JSImport("@interactjs/modifiers/all", "default.snapEdges")
    @js.native
    def snapEdges_Fdefault: DefaultsSnapEdgesOptions = js.native
    
    inline def snapEdges_Fdefault_=(x: DefaultsSnapEdgesOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snapEdges")(x.asInstanceOf[js.Any])
    
    inline def snapSize(): Modifier[
        SnapSizeOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapSize, 
        Delta
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("snapSize")().asInstanceOf[Modifier[
        SnapSizeOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapSize, 
        Delta
      ]]
    inline def snapSize(_options: PartialSnapSizeOptions): Modifier[
        SnapSizeOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapSize, 
        Delta
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("snapSize")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[
        SnapSizeOptions, 
        SnapState, 
        typings.interactjsTypes.interactjsTypesStrings.snapSize, 
        Delta
      ]]
    @JSImport("@interactjs/modifiers/all", "default.snapSize")
    @js.native
    def snapSize_Fdefault: DefaultsSnapSizeOptions = js.native
    
    inline def snapSize_Fdefault_=(x: DefaultsSnapSizeOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snapSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@interactjs/modifiers/all", "default.snap")
    @js.native
    def snap_Fdefault: DefaultsSnapOptions = js.native
    
    inline def snap_Fdefault_=(x: DefaultsSnapOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("snap")(x.asInstanceOf[js.Any])
    
    inline def spring(): Modifier[Any, Any, noop, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("spring")().asInstanceOf[Modifier[Any, Any, noop, Any]]
    inline def spring(_options: Partial[Any]): Modifier[Any, Any, noop, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("spring")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[Any, Any, noop, Any]]
    @JSImport("@interactjs/modifiers/all", "default.spring")
    @js.native
    def spring_Fdefault: ModifierFunction[Any, Any, noop] = js.native
    
    inline def spring_Fdefault_=(x: ModifierFunction[Any, Any, noop]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spring")(x.asInstanceOf[js.Any])
    
    inline def transform(): Modifier[Any, Any, noop, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")().asInstanceOf[Modifier[Any, Any, noop, Any]]
    inline def transform(_options: Partial[Any]): Modifier[Any, Any, noop, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(_options.asInstanceOf[js.Any]).asInstanceOf[Modifier[Any, Any, noop, Any]]
    @JSImport("@interactjs/modifiers/all", "default.transform")
    @js.native
    def transform_Fdefault: ModifierFunction[Any, Any, noop] = js.native
    
    inline def transform_Fdefault_=(x: ModifierFunction[Any, Any, noop]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transform")(x.asInstanceOf[js.Any])
  }
}
