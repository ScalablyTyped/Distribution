package typings
package heremapsLib.HNs.geoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("H.geo.MultiLineString")
@js.native
class MultiLineString protected () extends MultiGeometry[LineString] {
  /**
               * A MultiLineString is a collection of line strings represented as a H.geo.MultiGeometry with a H.geo.LineString as generic type parameter T.
               * @param lineStrings {H.geo.LineString[]} - The list of line-strings which are initially represented by the MultiLineString.
               * @throws {H.lang.InvalidArgumentError} - if the lineStrings argument is not valid
               */
  def this(lineStrings: js.Array[LineString]) = this()
}

