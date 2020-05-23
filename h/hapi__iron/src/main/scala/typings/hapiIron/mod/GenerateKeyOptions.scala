package typings.hapiIron.mod

import typings.hapiIron.hapiIronStrings.`aes-128-ctr`
import typings.hapiIron.hapiIronStrings.`aes-256-cbc`
import typings.hapiIron.hapiIronStrings.sha256
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Pick<@hapi/iron.@hapi/iron.SealOptionsSub, 'algorithm' | 'iterations' | 'minPasswordlength'> */
trait GenerateKeyOptions extends js.Object {
  var algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256
  var iterations: Double
  var iv: js.UndefOr[Buffer] = js.undefined
  var minPasswordlength: Double
  var salt: js.UndefOr[String] = js.undefined
  var saltBits: js.UndefOr[Double] = js.undefined
}

object GenerateKeyOptions {
  @scala.inline
  def apply(
    algorithm: `aes-128-ctr` | `aes-256-cbc` | sha256,
    iterations: Double,
    minPasswordlength: Double,
    iv: Buffer = null,
    salt: String = null,
    saltBits: js.UndefOr[Double] = js.undefined
  ): GenerateKeyOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], minPasswordlength = minPasswordlength.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (!js.isUndefined(saltBits)) __obj.updateDynamic("saltBits")(saltBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateKeyOptions]
  }
}

