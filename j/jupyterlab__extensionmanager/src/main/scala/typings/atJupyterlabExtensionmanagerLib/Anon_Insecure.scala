package typings
package atJupyterlabExtensionmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Insecure extends js.Object {
  /**
    * Package is insecure or have vulnerable dependencies (based on the nsp registry).
    */
  var insecure: scala.Double
  /**
    * Package has a version < 1.0.0.
    */
  var unstable: scala.Boolean
}

object Anon_Insecure {
  @scala.inline
  def apply(insecure: scala.Double, unstable: scala.Boolean): Anon_Insecure = {
    val __obj = js.Dynamic.literal(insecure = insecure, unstable = unstable)
  
    __obj.asInstanceOf[Anon_Insecure]
  }
}

