package typings.jupyterlabExtensionmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlags extends js.Object {
  /**
    * Metadata about the found package.
    */
  @JSName("package")
  var _package: AnonDate
  /**
    * Flags about the package.
    */
  var flags: AnonInsecure
  /**
    * Object detailing the normalized search score.
    */
  var score: AnonDetail
  /**
    * The search score.
    */
  var searchScore: Double
}

object AnonFlags {
  @scala.inline
  def apply(_package: AnonDate, flags: AnonInsecure, score: AnonDetail, searchScore: Double): AnonFlags = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], searchScore = searchScore.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlags]
  }
}

