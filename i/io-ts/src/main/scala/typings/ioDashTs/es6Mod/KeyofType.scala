package typings.ioDashTs.es6Mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "KeyofType")
@js.native
class KeyofType[D /* <: StringDictionary[js.Any] */] protected ()
  extends Type[String, String, js.Any] {
  def this(
    name: String,
    is: Is[String],
    validate: Validate[_, String],
    encode: Encode[String, String],
    keys: D
  ) = this()
  val _tag: typings.ioDashTs.ioDashTsStrings.KeyofType = js.native
  val keys: D = js.native
}

