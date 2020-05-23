package typings.jupyterlabExtensionmanager.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Flags extends js.Object {
  /**
    * Metadata about the found package.
    */
  @JSName("package")
  var _package: Date
  /**
    * Flags about the package.
    */
  var flags: Insecure
  /**
    * Object detailing the normalized search score.
    */
  var score: Detail
  /**
    * The search score.
    */
  var searchScore: Double
}

object Flags {
  @scala.inline
  def apply(_package: Date, flags: Insecure, score: Detail, searchScore: Double): Flags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
}

