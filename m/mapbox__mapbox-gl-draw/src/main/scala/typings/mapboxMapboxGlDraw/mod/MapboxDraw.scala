package typings.mapboxMapboxGlDraw.mod

import typings.geojson.mod.Feature
import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.mapboxGl.mod.IControl
import typings.mapboxMapboxGlDraw.anon.FeatureId
import typings.mapboxMapboxGlDraw.anon.FeatureIds
import typings.mapboxMapboxGlDraw.anon.From
import typings.mapboxMapboxGlDraw.anon.X
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.direct_select
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.draw_line_string
import typings.mapboxMapboxGlDraw.mapboxMapboxGlDrawStrings.simple_select
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapboxDraw
  extends StObject
     with IControl {
  
  def add(geojson: Feature[Geometry, GeoJsonProperties]): js.Array[String] = js.native
  def add(geojson: FeatureCollection[Geometry, GeoJsonProperties]): js.Array[String] = js.native
  def add(geojson: Geometry): js.Array[String] = js.native
  
  def changeMode(mode: Exclude[DrawMode, direct_select | simple_select | draw_line_string]): this.type = js.native
  def changeMode[T /* <: String */](
    mode: T & (/* import warning: importer.ImportType#apply Failed type conversion: T extends @mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.DrawMode ? never : T */ js.Any)
  ): this.type = js.native
  def changeMode[T /* <: String */](
    mode: T & (/* import warning: importer.ImportType#apply Failed type conversion: T extends @mapbox/mapbox-gl-draw.@mapbox/mapbox-gl-draw.DrawMode ? never : T */ js.Any),
    options: Any
  ): this.type = js.native
  @JSName("changeMode")
  def changeMode_directselect(mode: direct_select, options: FeatureId): this.type = js.native
  @JSName("changeMode")
  def changeMode_drawlinestring(mode: draw_line_string): this.type = js.native
  @JSName("changeMode")
  def changeMode_drawlinestring(mode: draw_line_string, options: From): this.type = js.native
  @JSName("changeMode")
  def changeMode_simpleselect(mode: simple_select): this.type = js.native
  @JSName("changeMode")
  def changeMode_simpleselect(mode: simple_select, options: FeatureIds): this.type = js.native
  
  def combineFeatures(): this.type = js.native
  
  def delete(ids: String): this.type = js.native
  def delete(ids: js.Array[String]): this.type = js.native
  
  def deleteAll(): this.type = js.native
  
  def get(featureId: String): js.UndefOr[Feature[Geometry, GeoJsonProperties]] = js.native
  
  def getAll(): FeatureCollection[Geometry, GeoJsonProperties] = js.native
  
  @JSName("getDefaultPosition")
  def getDefaultPosition_MMapboxDraw(): String = js.native
  
  def getFeatureIdsAt(point: X): js.Array[String] = js.native
  
  def getMode(): DrawMode = js.native
  
  def getSelected(): FeatureCollection[Geometry, GeoJsonProperties] = js.native
  
  def getSelectedIds(): js.Array[String] = js.native
  
  def getSelectedPoints(): FeatureCollection[Geometry, GeoJsonProperties] = js.native
  
  var modes: DrawModes = js.native
  
  def set(featureCollection: FeatureCollection[Geometry, GeoJsonProperties]): js.Array[String] = js.native
  
  def setFeatureProperty(featureId: String, property: String, value: Any): this.type = js.native
  
  def trash(): this.type = js.native
  
  def uncombineFeatures(): this.type = js.native
}
