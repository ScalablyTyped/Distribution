package typings.hirestime

import typings.hirestime.hirestimeMod.returnedFunction
import typings.hirestime.hirestimeStrings.ms
import typings.hirestime.hirestimeStrings.ns
import typings.hirestime.hirestimeStrings.s
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hirestime", JSImport.Namespace)
@js.native
object hirestimeMod extends js.Object {
  val MS: ms = js.native
  val NS: ns = js.native
  val S: s = js.native
  def apply(): returnedFunction = js.native
  type returnedFunction = js.Function1[/* unit */ js.UndefOr[s | ms | ns], Double]
}

