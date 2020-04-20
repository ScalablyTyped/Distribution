package typings.jupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInsecure extends js.Object {
  /**
    * Package is insecure or have vulnerable dependencies (based on the nsp registry).
    */
  var insecure: Double
  /**
    * Package has a version < 1.0.0.
    */
  var unstable: Boolean
}

object AnonInsecure {
  @scala.inline
  def apply(insecure: Double, unstable: Boolean): AnonInsecure = {
    val __obj = js.Dynamic.literal(insecure = insecure.asInstanceOf[js.Any], unstable = unstable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInsecure]
  }
}

