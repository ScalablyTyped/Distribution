package typings.leafletLabel

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.leaflet.mod.LatLng_
import typings.leaflet.mod.Map_
import typings.leaflet.mod.Point_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IEventPowered<Label> * / any */ trait Label extends StObject {
    
    def close(): Unit
    
    def onAdd(map: Map_): Unit
    
    def onRemove(map: Map_): Unit
    
    def setContent(content: String): Label
    
    def setLatLng(latlng: LatLng_): Label
    
    def setOpacity(opacity: Double): Unit
    
    def updateZIndex(zIndex: Double): Unit
  }
  object Label {
    
    @JSImport("leaflet", "Label")
    @js.native
    val ^ : LabelStatic = js.native
    
    extension [Self <: Label](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setOnAdd(value: Map_ => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnRemove(value: Map_ => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setSetContent(value: String => Label): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
      
      inline def setSetLatLng(value: LatLng_ => Label): Self = StObject.set(x, "setLatLng", js.Any.fromFunction1(value))
      
      inline def setSetOpacity(value: Double => Unit): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1(value))
      
      inline def setUpdateZIndex(value: Double => Unit): Self = StObject.set(x, "updateZIndex", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait CircleMarker extends StObject {
    
    def bindLabel(content: String): CircleMarker = js.native
    def bindLabel(content: String, options: LabelOptions): CircleMarker = js.native
    
    def getLabel(): Label = js.native
    
    def hideLabel(): CircleMarker = js.native
    
    def setLabelNoHide(noHide: Boolean): Unit = js.native
    
    def showLabel(): CircleMarker = js.native
    
    def unbindLabel(): CircleMarker = js.native
    
    def updateLabelContent(content: String): Unit = js.native
  }
  
  trait CircleMarkerOptions extends StObject {
    
    var labelAnchor: js.UndefOr[Point_] = js.undefined
  }
  object CircleMarkerOptions {
    
    inline def apply(): CircleMarkerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CircleMarkerOptions]
    }
    
    extension [Self <: CircleMarkerOptions](x: Self) {
      
      inline def setLabelAnchor(value: Point_): Self = StObject.set(x, "labelAnchor", value.asInstanceOf[js.Any])
      
      inline def setLabelAnchorUndefined: Self = StObject.set(x, "labelAnchor", js.undefined)
    }
  }
  
  @js.native
  trait FeatureGroup[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ILayer */ Any */] extends StObject {
    
    def bindLabel(content: String): FeatureGroup[T] = js.native
    def bindLabel(content: String, options: LabelOptions): FeatureGroup[T] = js.native
    
    def clearLayers(): FeatureGroup[T] = js.native
    
    def unbindLabel(): FeatureGroup[T] = js.native
    
    def updateLabelContent(content: String): FeatureGroup[T] = js.native
  }
  
  trait IconOptions extends StObject {
    
    var labelAnchor: js.UndefOr[Point_] = js.undefined
  }
  object IconOptions {
    
    inline def apply(): IconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconOptions]
    }
    
    extension [Self <: IconOptions](x: Self) {
      
      inline def setLabelAnchor(value: Point_): Self = StObject.set(x, "labelAnchor", value.asInstanceOf[js.Any])
      
      inline def setLabelAnchorUndefined: Self = StObject.set(x, "labelAnchor", js.undefined)
    }
  }
  
  trait LabelOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[String] = js.undefined
    
    var noHide: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[Point_] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    // 'left' | 'right' | 'auto';
    var pane: js.UndefOr[String] = js.undefined
    
    var zoomAnimation: js.UndefOr[Boolean] = js.undefined
  }
  object LabelOptions {
    
    inline def apply(): LabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelOptions]
    }
    
    extension [Self <: LabelOptions](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setNoHide(value: Boolean): Self = StObject.set(x, "noHide", value.asInstanceOf[js.Any])
      
      inline def setNoHideUndefined: Self = StObject.set(x, "noHide", js.undefined)
      
      inline def setOffset(value: Point_): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPane(value: String): Self = StObject.set(x, "pane", value.asInstanceOf[js.Any])
      
      inline def setPaneUndefined: Self = StObject.set(x, "pane", js.undefined)
      
      inline def setZoomAnimation(value: Boolean): Self = StObject.set(x, "zoomAnimation", value.asInstanceOf[js.Any])
      
      inline def setZoomAnimationUndefined: Self = StObject.set(x, "zoomAnimation", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClassStatic * / any */ @js.native
  trait LabelStatic
    extends StObject
       with Instantiable0[Label]
       with Instantiable1[/* options */ LabelOptions, Label]
  
  @js.native
  trait Marker extends StObject {
    
    def bindLabel(content: String): Marker = js.native
    def bindLabel(content: String, options: LabelOptions): Marker = js.native
    
    def getLabel(): Label = js.native
    
    def hideLabel(): Marker = js.native
    
    def setLabelNoHide(noHide: Boolean): Unit = js.native
    
    def setOpacity(opacity: Double, labelHasSemiTransparency: Boolean): Unit = js.native
    
    def showLabel(): Marker = js.native
    
    def unbindLabel(): Marker = js.native
    
    def updateLabelContent(content: String): Unit = js.native
  }
  
  @js.native
  trait Path extends StObject {
    
    def bindLabel(content: String): Path = js.native
    def bindLabel(content: String, options: LabelOptions): Path = js.native
    
    def unbindLabel(): Path = js.native
    
    def updateLabelContent(content: String): Unit = js.native
  }
  
  trait PathOptions extends StObject {
    
    var labelAnchor: js.UndefOr[Point_] = js.undefined
  }
  object PathOptions {
    
    inline def apply(): PathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PathOptions]
    }
    
    extension [Self <: PathOptions](x: Self) {
      
      inline def setLabelAnchor(value: Point_): Self = StObject.set(x, "labelAnchor", value.asInstanceOf[js.Any])
      
      inline def setLabelAnchorUndefined: Self = StObject.set(x, "labelAnchor", js.undefined)
    }
  }
}
