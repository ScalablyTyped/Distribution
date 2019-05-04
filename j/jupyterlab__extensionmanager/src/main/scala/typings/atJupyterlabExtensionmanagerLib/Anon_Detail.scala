package typings
package atJupyterlabExtensionmanagerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Detail extends js.Object {
  /**
    * Break down of the search score.
    */
  var detail: Anon_Maintenance
  /**
    * The final normalized search score.
    */
  var `final`: scala.Double
}

object Anon_Detail {
  @scala.inline
  def apply(detail: Anon_Maintenance, `final`: scala.Double): Anon_Detail = {
    val __obj = js.Dynamic.literal(detail = detail)
    __obj.updateDynamic("final")(`final`)
    __obj.asInstanceOf[Anon_Detail]
  }
}

