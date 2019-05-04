package typings
package atJupyterlabExtensionmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flags extends js.Object {
  /**
    * Flags about the package.
    */
  var flags: Anon_Insecure
  /**
    * Metadata about the found package.
    */
  var `package`: Anon_Date
  /**
    * Object detailing the normalized search score.
    */
  var score: Anon_Detail
  /**
    * The search score.
    */
  var searchScore: scala.Double
}

object Anon_Flags {
  @scala.inline
  def apply(flags: Anon_Insecure, `package`: Anon_Date, score: Anon_Detail, searchScore: scala.Double): Anon_Flags = {
    val __obj = js.Dynamic.literal(flags = flags, score = score, searchScore = searchScore)
    __obj.updateDynamic("package")(`package`)
    __obj.asInstanceOf[Anon_Flags]
  }
}

