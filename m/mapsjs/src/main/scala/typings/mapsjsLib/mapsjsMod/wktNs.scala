package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "wkt")
@js.native
object wktNs extends js.Object {
  def parse(wkt: java.lang.String): js.Any = js.native
  def parseLineString(wkt: java.lang.String): mapsjsLib.mapsjsMod.geometry = js.native
  def parseMultiLineString(wkt: java.lang.String): mapsjsLib.mapsjsMod.geometry = js.native
  def parseMultiPoint(wkt: java.lang.String): mapsjsLib.mapsjsMod.geometry = js.native
  def parseMultiPolygon(wkt: java.lang.String): mapsjsLib.mapsjsMod.geometry = js.native
  def parsePoint(wkt: java.lang.String): mapsjsLib.mapsjsMod.point = js.native
  def parsePolygon(wkt: java.lang.String): mapsjsLib.mapsjsMod.geometry = js.native
  def toMultiPolygonString(polys: js.Array[mapsjsLib.mapsjsMod.geometryNs.polygon]): java.lang.String = js.native
}

