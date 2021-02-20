package typings.mapsjs.mod

import typings.mapsjs.mod.geometry.polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wkt {
  
  @JSImport("mapsjs", "wkt.parse")
  @js.native
  def parse(wkt: String): js.Any = js.native
  
  @JSImport("mapsjs", "wkt.parseLineString")
  @js.native
  def parseLineString(wkt: String): geometry = js.native
  
  @JSImport("mapsjs", "wkt.parseMultiLineString")
  @js.native
  def parseMultiLineString(wkt: String): geometry = js.native
  
  @JSImport("mapsjs", "wkt.parseMultiPoint")
  @js.native
  def parseMultiPoint(wkt: String): geometry = js.native
  
  @JSImport("mapsjs", "wkt.parseMultiPolygon")
  @js.native
  def parseMultiPolygon(wkt: String): geometry = js.native
  
  @JSImport("mapsjs", "wkt.parsePoint")
  @js.native
  def parsePoint(wkt: String): point = js.native
  
  @JSImport("mapsjs", "wkt.parsePolygon")
  @js.native
  def parsePolygon(wkt: String): geometry = js.native
  
  @JSImport("mapsjs", "wkt.toMultiPolygonString")
  @js.native
  def toMultiPolygonString(polys: js.Array[polygon]): String = js.native
}
