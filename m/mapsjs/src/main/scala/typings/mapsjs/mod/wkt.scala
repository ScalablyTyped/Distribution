package typings.mapsjs.mod

import typings.mapsjs.mod.geometry.polygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wkt {
  
  @JSImport("mapsjs", "wkt")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(wkt: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(wkt.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def parseLineString(wkt: String): geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLineString")(wkt.asInstanceOf[js.Any]).asInstanceOf[geometry]
  
  @scala.inline
  def parseMultiLineString(wkt: String): geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMultiLineString")(wkt.asInstanceOf[js.Any]).asInstanceOf[geometry]
  
  @scala.inline
  def parseMultiPoint(wkt: String): geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMultiPoint")(wkt.asInstanceOf[js.Any]).asInstanceOf[geometry]
  
  @scala.inline
  def parseMultiPolygon(wkt: String): geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMultiPolygon")(wkt.asInstanceOf[js.Any]).asInstanceOf[geometry]
  
  @scala.inline
  def parsePoint(wkt: String): point = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePoint")(wkt.asInstanceOf[js.Any]).asInstanceOf[point]
  
  @scala.inline
  def parsePolygon(wkt: String): geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePolygon")(wkt.asInstanceOf[js.Any]).asInstanceOf[geometry]
  
  @scala.inline
  def toMultiPolygonString(polys: js.Array[polygon]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMultiPolygonString")(polys.asInstanceOf[js.Any]).asInstanceOf[String]
}
