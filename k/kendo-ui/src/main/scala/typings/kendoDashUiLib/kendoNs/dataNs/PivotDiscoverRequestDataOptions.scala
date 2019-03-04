package typings
package kendoDashUiLib.kendoNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotDiscoverRequestDataOptions extends js.Object {
  var command: java.lang.String
  var restrictions: PivotDiscoverRequestRestrictionOptions
}

object PivotDiscoverRequestDataOptions {
  @scala.inline
  def apply(command: java.lang.String, restrictions: PivotDiscoverRequestRestrictionOptions): PivotDiscoverRequestDataOptions = {
    val __obj = js.Dynamic.literal(command = command, restrictions = restrictions)
  
    __obj.asInstanceOf[PivotDiscoverRequestDataOptions]
  }
}

