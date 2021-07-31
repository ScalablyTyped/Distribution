package typings.googlemaps.global.google.maps

import typings.googlemaps.google.maps.Data.DataOptions
import typings.googlemaps.google.maps.Data.FeatureOptions
import typings.googlemaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("google.maps.Data")
@js.native
class Data ()
  extends StObject
     with typings.googlemaps.google.maps.Data {
  def this(options: DataOptions) = this()
}
object Data {
  
  @JSGlobal("google.maps.Data.Feature")
  @js.native
  class Feature ()
    extends StObject
       with typings.googlemaps.google.maps.Data.Feature {
    def this(options: FeatureOptions) = this()
  }
  
  @JSGlobal("google.maps.Data.Geometry")
  @js.native
  class Geometry ()
    extends StObject
       with typings.googlemaps.google.maps.Data.Geometry {
    
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typings.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @JSGlobal("google.maps.Data.GeometryCollection")
  @js.native
  class GeometryCollection protected ()
    extends StObject
       with typings.googlemaps.google.maps.Data.GeometryCollection {
    def this(elements: js.Array[
            (js.Array[
              typings.googlemaps.google.maps.Data.Geometry | typings.googlemaps.google.maps.LatLng
            ]) | LatLngLiteral
          ]) = this()
    
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typings.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getArray(): js.Array[typings.googlemaps.google.maps.Data.Geometry] = js.native
    
    /* CompleteClass */
    override def getAt(n: Double): typings.googlemaps.google.maps.Data.Geometry = js.native
    
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @JSGlobal("google.maps.Data.LineString")
  @js.native
  class LineString protected ()
    extends StObject
       with typings.googlemaps.google.maps.Data.LineString {
    def this(elements: js.Array[typings.googlemaps.google.maps.LatLng | LatLngLiteral]) = this()
    
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typings.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getArray(): js.Array[typings.googlemaps.google.maps.LatLng] = js.native
    
    /* CompleteClass */
    override def getAt(n: Double): typings.googlemaps.google.maps.LatLng = js.native
    
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @JSGlobal("google.maps.Data.LinearRing")
  @js.native
  class LinearRing protected ()
    extends StObject
       with typings.googlemaps.google.maps.Data.LinearRing {
    def this(elements: js.Array[typings.googlemaps.google.maps.LatLng | LatLngLiteral]) = this()
    
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typings.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getArray(): js.Array[typings.googlemaps.google.maps.LatLng] = js.native
    
    /* CompleteClass */
    override def getAt(n: Double): typings.googlemaps.google.maps.LatLng = js.native
    
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @JSGlobal("google.maps.Data.MultiLineString")
  @js.native
  class MultiLineString protected ()
    extends StObject
       with typings.googlemaps.google.maps.Data.MultiLineString {
    def this(elements: js.Array[
            typings.googlemaps.google.maps.Data.LineString | (js.Array[typings.googlemaps.google.maps.LatLng | LatLngLiteral])
          ]) = this()
    
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typings.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getArray(): js.Array[typings.googlemaps.google.maps.Data.LineString] = js.native
    
    /* CompleteClass */
    override def getAt(n: Double): typings.googlemaps.google.maps.Data.LineString = js.native
    
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @JSGlobal("google.maps.Data.MultiPoint")
  @js.native
  class MultiPoint protected ()
    extends StObject
       with typings.googlemaps.google.maps.Data.MultiPoint {
    def this(elements: js.Array[typings.googlemaps.google.maps.LatLng | LatLngLiteral]) = this()
    
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typings.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getArray(): js.Array[typings.googlemaps.google.maps.LatLng] = js.native
    
    /* CompleteClass */
    override def getAt(n: Double): typings.googlemaps.google.maps.LatLng = js.native
    
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @JSGlobal("google.maps.Data.MultiPolygon")
  @js.native
  class MultiPolygon protected ()
    extends StObject
       with typings.googlemaps.google.maps.Data.MultiPolygon {
    def this(elements: js.Array[
            typings.googlemaps.google.maps.Data.Polygon | (js.Array[
              typings.googlemaps.google.maps.Data.LinearRing | (js.Array[typings.googlemaps.google.maps.LatLng | LatLngLiteral])
            ])
          ]) = this()
    
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typings.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getArray(): js.Array[typings.googlemaps.google.maps.Data.Polygon] = js.native
    
    /* CompleteClass */
    override def getAt(n: Double): typings.googlemaps.google.maps.Data.Polygon = js.native
    
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @JSGlobal("google.maps.Data.Point")
  @js.native
  class Point protected ()
    extends StObject
       with typings.googlemaps.google.maps.Data.Point {
    def this(latLng: typings.googlemaps.google.maps.LatLng) = this()
    def this(latLng: LatLngLiteral) = this()
    
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typings.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def get(): typings.googlemaps.google.maps.LatLng = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
  }
  
  @JSGlobal("google.maps.Data.Polygon")
  @js.native
  class Polygon protected ()
    extends StObject
       with typings.googlemaps.google.maps.Data.Polygon {
    def this(elements: js.Array[
            typings.googlemaps.google.maps.Data.LinearRing | (js.Array[typings.googlemaps.google.maps.LatLng | LatLngLiteral])
          ]) = this()
    
    /* CompleteClass */
    override def forEachLatLng(callback: js.Function1[/* latLng */ typings.googlemaps.google.maps.LatLng, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def getArray(): js.Array[typings.googlemaps.google.maps.Data.LinearRing] = js.native
    
    /* CompleteClass */
    override def getAt(n: Double): typings.googlemaps.google.maps.Data.LinearRing = js.native
    
    /* CompleteClass */
    override def getLength(): Double = js.native
    
    /* CompleteClass */
    override def getType(): String = js.native
  }
}
