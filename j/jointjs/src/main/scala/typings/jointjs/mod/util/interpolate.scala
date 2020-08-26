package typings.jointjs.mod.util

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "util.interpolate")
@js.native
object interpolate extends js.Object {
  var hexColor: InterpolateFunction[String] = js.native
  var number: InterpolateFunction[Double] = js.native
  var `object`: InterpolateFunction[StringDictionary[js.Any]] = js.native
  var unit: InterpolateFunction[String] = js.native
  type InterpolateFunction[T] = js.Function2[/* start */ T, /* end */ T, js.Function1[/* time */ Double, T]]
}

