package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AggRow extends js.Object {
  var aggregateFunction: js.UndefOr[
    js.Function3[/* srcRow */ js.Any, /* cmpRow */ js.Any, /* aggRow */ js.Any, scala.Unit]
  ] = js.undefined
  var data: js.Array[js.Object]
  var mapUnitsPerPixel: scala.Double
  var marginPixels: js.UndefOr[scala.Double] = js.undefined
  var pointKey: java.lang.String
  var valueFunction: js.UndefOr[js.Function1[/* row */ js.Any, scala.Double]] = js.undefined
  def radiusFunction(row: js.Any): scala.Double
}

