package typings.atJupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Flags extends js.Object {
  /**
    * Metadata about the found package.
    */
  @JSName("package")
  var _package: Anon_Date
  /**
    * Flags about the package.
    */
  var flags: Anon_Insecure
  /**
    * Object detailing the normalized search score.
    */
  var score: Anon_Detail
  /**
    * The search score.
    */
  var searchScore: Double
}

object Anon_Flags {
  @scala.inline
  def apply(_package: Anon_Date, flags: Anon_Insecure, score: Anon_Detail, searchScore: Double): Anon_Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Flags]
  }
}

