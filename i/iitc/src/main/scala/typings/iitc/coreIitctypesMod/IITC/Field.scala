package typings.iitc.coreIitctypesMod.IITC

import typings.iitc.leafletMod.GeodesicPolygon_
import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.PolylineOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Field-Polygon */
@JSImport("iitc/core/iitctypes", "IITC.Field")
@js.native
open class Field protected () extends GeodesicPolygon_ {
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression]) = this()
  def this(latlngs: js.Array[js.Array[LatLngExpression] | LatLngExpression], options: PolylineOptions) = this()
  
  @JSName("options")
  var options_Field: FieldOptions = js.native
}
