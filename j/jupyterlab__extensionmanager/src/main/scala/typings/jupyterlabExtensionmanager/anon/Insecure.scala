package typings.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Insecure extends js.Object {
  /**
    * Package is insecure or have vulnerable dependencies (based on the nsp registry).
    */
  var insecure: Double
  /**
    * Package has a version < 1.0.0.
    */
  var unstable: Boolean
}

object Insecure {
  @scala.inline
  def apply(insecure: Double, unstable: Boolean): Insecure = {
    val __obj = js.Dynamic.literal(insecure = insecure.asInstanceOf[js.Any], unstable = unstable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Insecure]
  }
}

