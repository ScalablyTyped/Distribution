package typings.interactjsTypes.anon

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

trait AspectRatio extends StObject {
  
  def aspectRatio(): Modifier[
    AspectRatioOptions, 
    AspectRatioState, 
    typings.interactjsTypes.interactjsTypesStrings.aspectRatio, 
    Any
  ]
  def aspectRatio(_options: PartialAspectRatioOptions): Modifier[
    AspectRatioOptions, 
    AspectRatioState, 
    typings.interactjsTypes.interactjsTypesStrings.aspectRatio, 
    Any
  ]
  @JSName("aspectRatio")
  var aspectRatio_Original: Defaults
  
  def avoid(): Modifier[Any, Any, noop, Any]
  def avoid(_options: Partial[Any]): Modifier[Any, Any, noop, Any]
  @JSName("avoid")
  var avoid_Original: ModifierFunction[Any, Any, noop]
  
  def restrict(): Modifier[
    RestrictOptions, 
    RestrictState, 
    typings.interactjsTypes.interactjsTypesStrings.restrict, 
    Any
  ]
  def restrict(_options: PartialRestrictOptions): Modifier[
    RestrictOptions, 
    RestrictState, 
    typings.interactjsTypes.interactjsTypesStrings.restrict, 
    Any
  ]
  
  def restrictEdges(): Modifier[
    RestrictEdgesOptions, 
    RestrictEdgesState, 
    typings.interactjsTypes.interactjsTypesStrings.restrictEdges, 
    Unit
  ]
  def restrictEdges(_options: PartialRestrictEdgesOptio): Modifier[
    RestrictEdgesOptions, 
    RestrictEdgesState, 
    typings.interactjsTypes.interactjsTypesStrings.restrictEdges, 
    Unit
  ]
  @JSName("restrictEdges")
  var restrictEdges_Original: CallDefaults
  
  def restrictRect(): Modifier[
    RestrictOptionselementRec, 
    RestrictState, 
    typings.interactjsTypes.interactjsTypesStrings.restrictRect, 
    Any
  ]
  def restrictRect(_options: PartialRestrictOptionsele): Modifier[
    RestrictOptionselementRec, 
    RestrictState, 
    typings.interactjsTypes.interactjsTypesStrings.restrictRect, 
    Any
  ]
  @JSName("restrictRect")
  var restrictRect_Original: CallDefaultsMethods
  
  def restrictSize(): Modifier[
    RestrictSizeOptions, 
    RestrictEdgesState, 
    typings.interactjsTypes.interactjsTypesStrings.restrictSize, 
    Unit
  ]
  def restrictSize(_options: PartialRestrictSizeOption): Modifier[
    RestrictSizeOptions, 
    RestrictEdgesState, 
    typings.interactjsTypes.interactjsTypesStrings.restrictSize, 
    Unit
  ]
  @JSName("restrictSize")
  var restrictSize_Original: CallOptions
  
  @JSName("restrict")
  var restrict_Original: DefaultsMethods
  
  def rubberband(): Modifier[Any, Any, noop, Any]
  def rubberband(_options: Partial[Any]): Modifier[Any, Any, noop, Any]
  @JSName("rubberband")
  var rubberband_Original: ModifierFunction[Any, Any, noop]
  
  def snap(): Modifier[SnapOptions, SnapState, typings.interactjsTypes.interactjsTypesStrings.snap, Delta]
  def snap(_options: PartialSnapOptions): Modifier[SnapOptions, SnapState, typings.interactjsTypes.interactjsTypesStrings.snap, Delta]
  
  def snapEdges(): Modifier[
    SnapEdgesOptions, 
    SnapState, 
    typings.interactjsTypes.interactjsTypesStrings.snapEdges, 
    Delta
  ]
  def snapEdges(_options: PartialSnapEdgesOptions): Modifier[
    SnapEdgesOptions, 
    SnapState, 
    typings.interactjsTypes.interactjsTypesStrings.snapEdges, 
    Delta
  ]
  @JSName("snapEdges")
  var snapEdges_Original: DefaultsSnapEdgesOptions
  
  def snapSize(): Modifier[
    SnapSizeOptions, 
    SnapState, 
    typings.interactjsTypes.interactjsTypesStrings.snapSize, 
    Delta
  ]
  def snapSize(_options: PartialSnapSizeOptions): Modifier[
    SnapSizeOptions, 
    SnapState, 
    typings.interactjsTypes.interactjsTypesStrings.snapSize, 
    Delta
  ]
  @JSName("snapSize")
  var snapSize_Original: DefaultsSnapSizeOptions
  
  @JSName("snap")
  var snap_Original: DefaultsSnapOptions
  
  def spring(): Modifier[Any, Any, noop, Any]
  def spring(_options: Partial[Any]): Modifier[Any, Any, noop, Any]
  @JSName("spring")
  var spring_Original: ModifierFunction[Any, Any, noop]
  
  def transform(): Modifier[Any, Any, noop, Any]
  def transform(_options: Partial[Any]): Modifier[Any, Any, noop, Any]
  @JSName("transform")
  var transform_Original: ModifierFunction[Any, Any, noop]
}
object AspectRatio {
  
  inline def apply(
    aspectRatio: Defaults,
    avoid: ModifierFunction[Any, Any, noop],
    restrict: DefaultsMethods,
    restrictEdges: CallDefaults,
    restrictRect: CallDefaultsMethods,
    restrictSize: CallOptions,
    rubberband: ModifierFunction[Any, Any, noop],
    snap: DefaultsSnapOptions,
    snapEdges: DefaultsSnapEdgesOptions,
    snapSize: DefaultsSnapSizeOptions,
    spring: ModifierFunction[Any, Any, noop],
    transform: ModifierFunction[Any, Any, noop]
  ): AspectRatio = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], avoid = avoid.asInstanceOf[js.Any], restrict = restrict.asInstanceOf[js.Any], restrictEdges = restrictEdges.asInstanceOf[js.Any], restrictRect = restrictRect.asInstanceOf[js.Any], restrictSize = restrictSize.asInstanceOf[js.Any], rubberband = rubberband.asInstanceOf[js.Any], snap = snap.asInstanceOf[js.Any], snapEdges = snapEdges.asInstanceOf[js.Any], snapSize = snapSize.asInstanceOf[js.Any], spring = spring.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AspectRatio]
  }
  
  extension [Self <: AspectRatio](x: Self) {
    
    inline def setAspectRatio(value: Defaults): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAvoid(value: ModifierFunction[Any, Any, noop]): Self = StObject.set(x, "avoid", value.asInstanceOf[js.Any])
    
    inline def setRestrict(value: DefaultsMethods): Self = StObject.set(x, "restrict", value.asInstanceOf[js.Any])
    
    inline def setRestrictEdges(value: CallDefaults): Self = StObject.set(x, "restrictEdges", value.asInstanceOf[js.Any])
    
    inline def setRestrictRect(value: CallDefaultsMethods): Self = StObject.set(x, "restrictRect", value.asInstanceOf[js.Any])
    
    inline def setRestrictSize(value: CallOptions): Self = StObject.set(x, "restrictSize", value.asInstanceOf[js.Any])
    
    inline def setRubberband(value: ModifierFunction[Any, Any, noop]): Self = StObject.set(x, "rubberband", value.asInstanceOf[js.Any])
    
    inline def setSnap(value: DefaultsSnapOptions): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapEdges(value: DefaultsSnapEdgesOptions): Self = StObject.set(x, "snapEdges", value.asInstanceOf[js.Any])
    
    inline def setSnapSize(value: DefaultsSnapSizeOptions): Self = StObject.set(x, "snapSize", value.asInstanceOf[js.Any])
    
    inline def setSpring(value: ModifierFunction[Any, Any, noop]): Self = StObject.set(x, "spring", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: ModifierFunction[Any, Any, noop]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
