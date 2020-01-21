package typings.mapsjs.mod

import typings.mapsjs.mod.geometry.polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "wkt")
@js.native
object wkt extends js.Object {
  def parse(wkt: String): js.Any = js.native
  def parseLineString(wkt: String): geometry = js.native
  def parseMultiLineString(wkt: String): geometry = js.native
  def parseMultiPoint(wkt: String): geometry = js.native
  def parseMultiPolygon(wkt: String): geometry = js.native
  def parsePoint(wkt: String): point = js.native
  def parsePolygon(wkt: String): geometry = js.native
  def toMultiPolygonString(polys: js.Array[polygon]): String = js.native
}

