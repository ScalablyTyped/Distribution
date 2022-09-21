package typings.heremaps.global.H.map

import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.map.Circle.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Polygon with a circular shape.
  */
@JSGlobal("H.map.Circle")
@js.native
open class Circle protected ()
  extends StObject
     with typings.heremaps.H.map.Circle {
  /**
    * Constructor
    * @param center {H.geo.IPoint} - The geographical coordinates of the circle's center
    * @param radius {number} - The radius of the circle in meters
    * @param opt_options {H.map.Circle.Options=} - An object that specifies circle options and their initial values (among these, precision has a significant impact on the shape of the circle
    */
  def this(center: IPoint, radius: Double) = this()
  def this(center: IPoint, radius: Double, opt_options: Options) = this()
}
