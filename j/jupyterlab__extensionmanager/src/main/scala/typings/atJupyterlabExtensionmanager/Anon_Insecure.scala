package typings.atJupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Insecure extends js.Object {
  /**
    * Package is insecure or have vulnerable dependencies (based on the nsp registry).
    */
  var insecure: Double
  /**
    * Package has a version < 1.0.0.
    */
  var unstable: Boolean
}

object Anon_Insecure {
  @scala.inline
  def apply(insecure: Double, unstable: Boolean): Anon_Insecure = {
    val __obj = js.Dynamic.literal(insecure = insecure.asInstanceOf[js.Any], unstable = unstable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Insecure]
  }
}

