package typings.kakaomaps

import typings.kakaomaps.kakao.maps.LatLng
import typings.kakaomaps.kakao.maps.LatLngBounds
import typings.kakaomaps.kakao.maps.Map
import typings.kakaomaps.kakao.maps.MarkerImage
import typings.kakaomaps.kakao.maps.Point
import typings.kakaomaps.kakao.maps.Roadview
import typings.kakaomaps.kakao.maps.Size
import typings.kakaomaps.kakao.maps.Viewpoint
import typings.kakaomaps.kakao.maps.services.AnalyzeType
import typings.kakaomaps.kakao.maps.services.Coords
import typings.kakaomaps.kakao.maps.services.SortBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alt extends StObject {
    
    var alt: js.UndefOr[String] = js.undefined
    
    var coords: js.UndefOr[String] = js.undefined
    
    var offset: js.UndefOr[Point] = js.undefined
    
    var shape: js.UndefOr[String] = js.undefined
    
    var spriteOrigin: js.UndefOr[Point] = js.undefined
    
    var spriteSize: js.UndefOr[Size] = js.undefined
  }
  object Alt {
    
    inline def apply(): Alt = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
      
      inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      inline def setOffset(value: Point): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSpriteOrigin(value: Point): Self = StObject.set(x, "spriteOrigin", value.asInstanceOf[js.Any])
      
      inline def setSpriteOriginUndefined: Self = StObject.set(x, "spriteOrigin", js.undefined)
      
      inline def setSpriteSize(value: Size): Self = StObject.set(x, "spriteSize", value.asInstanceOf[js.Any])
      
      inline def setSpriteSizeUndefined: Self = StObject.set(x, "spriteSize", js.undefined)
    }
  }
  
  trait Altitude extends StObject {
    
    var altitude: js.UndefOr[Double] = js.undefined
    
    var clickable: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var image: js.UndefOr[MarkerImage] = js.undefined
    
    var map: js.UndefOr[Map | Roadview] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[LatLng | Viewpoint] = js.undefined
    
    var range: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Altitude {
    
    inline def apply(): Altitude = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Altitude]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
      
      inline def setClickable(value: Boolean): Self = StObject.set(x, "clickable", value.asInstanceOf[js.Any])
      
      inline def setClickableUndefined: Self = StObject.set(x, "clickable", js.undefined)
      
      inline def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      inline def setImage(value: MarkerImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setMap(value: Map | Roadview): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPosition(value: LatLng | Viewpoint): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait Analyzetype extends StObject {
    
    var analyze_type: js.UndefOr[AnalyzeType] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Analyzetype {
    
    inline def apply(): Analyzetype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Analyzetype]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Analyzetype] (val x: Self) extends AnyVal {
      
      inline def setAnalyze_type(value: AnalyzeType): Self = StObject.set(x, "analyze_type", value.asInstanceOf[js.Any])
      
      inline def setAnalyze_typeUndefined: Self = StObject.set(x, "analyze_type", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Anchor extends StObject {
    
    var anchor: js.UndefOr[LatLng] = js.undefined
    
    var animate: js.UndefOr[Boolean | Duration] = js.undefined
  }
  object Anchor {
    
    inline def apply(): Anchor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Anchor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Anchor] (val x: Self) extends AnyVal {
      
      inline def setAnchor(value: LatLng): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setAnimate(value: Boolean | Duration): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    }
  }
  
  trait Bounds extends StObject {
    
    var bounds: js.UndefOr[LatLngBounds] = js.undefined
    
    var category_group_code: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[LatLng] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var rect: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sort: js.UndefOr[SortBy] = js.undefined
    
    var useMapBounds: js.UndefOr[Boolean] = js.undefined
    
    var useMapCenter: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Bounds {
    
    inline def apply(): Bounds = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bounds]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: LatLngBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setCategory_group_code(value: String): Self = StObject.set(x, "category_group_code", value.asInstanceOf[js.Any])
      
      inline def setCategory_group_codeUndefined: Self = StObject.set(x, "category_group_code", js.undefined)
      
      inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRect(value: String): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSort(value: SortBy): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setUseMapBounds(value: Boolean): Self = StObject.set(x, "useMapBounds", value.asInstanceOf[js.Any])
      
      inline def setUseMapBoundsUndefined: Self = StObject.set(x, "useMapBounds", js.undefined)
      
      inline def setUseMapCenter(value: Boolean): Self = StObject.set(x, "useMapCenter", value.asInstanceOf[js.Any])
      
      inline def setUseMapCenterUndefined: Self = StObject.set(x, "useMapCenter", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait DrawingManager extends StObject {
    
    var drawingManager: js.UndefOr[typings.kakaomaps.kakao.maps.drawing.DrawingManager] = js.undefined
  }
  object DrawingManager {
    
    inline def apply(): DrawingManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawingManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrawingManager] (val x: Self) extends AnyVal {
      
      inline def setDrawingManager(value: typings.kakaomaps.kakao.maps.drawing.DrawingManager): Self = StObject.set(x, "drawingManager", value.asInstanceOf[js.Any])
      
      inline def setDrawingManagerUndefined: Self = StObject.set(x, "drawingManager", js.undefined)
    }
  }
  
  trait Duration extends StObject {
    
    var duration: js.UndefOr[Double] = js.undefined
  }
  object Duration {
    
    inline def apply(): Duration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    }
  }
  
  trait Inputcoord extends StObject {
    
    var input_coord: js.UndefOr[Coords] = js.undefined
  }
  object Inputcoord {
    
    inline def apply(): Inputcoord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inputcoord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Inputcoord] (val x: Self) extends AnyVal {
      
      inline def setInput_coord(value: Coords): Self = StObject.set(x, "input_coord", value.asInstanceOf[js.Any])
      
      inline def setInput_coordUndefined: Self = StObject.set(x, "input_coord", js.undefined)
    }
  }
  
  trait Location extends StObject {
    
    var bounds: js.UndefOr[LatLngBounds] = js.undefined
    
    var location: js.UndefOr[LatLng] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var radius: js.UndefOr[Double] = js.undefined
    
    var rect: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var sort: js.UndefOr[SortBy] = js.undefined
    
    var useMapBounds: js.UndefOr[Boolean] = js.undefined
    
    var useMapCenter: js.UndefOr[Boolean] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Location {
    
    inline def apply(): Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: LatLngBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRect(value: String): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
      
      inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSort(value: SortBy): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
      
      inline def setUseMapBounds(value: Boolean): Self = StObject.set(x, "useMapBounds", value.asInstanceOf[js.Any])
      
      inline def setUseMapBoundsUndefined: Self = StObject.set(x, "useMapBounds", js.undefined)
      
      inline def setUseMapCenter(value: Boolean): Self = StObject.set(x, "useMapCenter", value.asInstanceOf[js.Any])
      
      inline def setUseMapCenterUndefined: Self = StObject.set(x, "useMapCenter", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait Outputcoord extends StObject {
    
    var input_coord: js.UndefOr[Coords] = js.undefined
    
    var output_coord: js.UndefOr[Coords] = js.undefined
  }
  object Outputcoord {
    
    inline def apply(): Outputcoord = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Outputcoord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Outputcoord] (val x: Self) extends AnyVal {
      
      inline def setInput_coord(value: Coords): Self = StObject.set(x, "input_coord", value.asInstanceOf[js.Any])
      
      inline def setInput_coordUndefined: Self = StObject.set(x, "input_coord", js.undefined)
      
      inline def setOutput_coord(value: Coords): Self = StObject.set(x, "output_coord", value.asInstanceOf[js.Any])
      
      inline def setOutput_coordUndefined: Self = StObject.set(x, "output_coord", js.undefined)
    }
  }
  
  trait Rx extends StObject {
    
    var rx: Double
    
    var ry: Double
  }
  object Rx {
    
    inline def apply(rx: Double, ry: Double): Rx = {
      val __obj = js.Dynamic.literal(rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rx]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rx] (val x: Self) extends AnyVal {
      
      inline def setRx(value: Double): Self = StObject.set(x, "rx", value.asInstanceOf[js.Any])
      
      inline def setRy(value: Double): Self = StObject.set(x, "ry", value.asInstanceOf[js.Any])
    }
  }
}
