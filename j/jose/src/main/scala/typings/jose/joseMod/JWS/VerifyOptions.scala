package typings.jose.joseMod.JWS

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions[komplet, parse] extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var complete: js.UndefOr[komplet] = js.undefined
  var crit: js.UndefOr[js.Array[String]] = js.undefined
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  var parse: js.UndefOr[parse] = js.undefined
}

object VerifyOptions {
  @scala.inline
  def apply[komplet, parse](
    algorithms: js.Array[String] = null,
    complete: komplet = null,
    crit: js.Array[String] = null,
    encoding: BufferEncoding = null,
    parse: parse = null
  ): VerifyOptions[komplet, parse] = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms)
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (crit != null) __obj.updateDynamic("crit")(crit)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (parse != null) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions[komplet, parse]]
  }
}

