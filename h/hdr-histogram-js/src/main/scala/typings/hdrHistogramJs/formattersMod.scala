package typings.hdrHistogramJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hdr-histogram-js/formatters", JSImport.Namespace)
@js.native
object formattersMod extends js.Object {
  def floatFormatter(size: Double, fractionDigits: Double): js.Function1[/* float */ Double, String] = js.native
  def integerFormatter(size: Double): js.Function1[/* integer */ Double, String] = js.native
}

