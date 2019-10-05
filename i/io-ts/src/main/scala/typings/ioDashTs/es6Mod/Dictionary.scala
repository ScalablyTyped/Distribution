package typings.ioDashTs.es6Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "Dictionary")
@js.native
object Dictionary extends TopLevel[UnknownRecordC]

@JSImport("io-ts/es6", "dictionary")
@js.native
object dictionary extends js.Object {
  def apply[D /* <: Mixed */, C /* <: Mixed */](domain: D, codomain: C): RecordC[D, C] = js.native
  def apply[D /* <: Mixed */, C /* <: Mixed */](domain: D, codomain: C, name: String): RecordC[D, C] = js.native
}

