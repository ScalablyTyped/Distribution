package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Annotated extends js.Object {
  var output: hapiLib.hapiMod.PayloadOutput | hapiLib.hapiLibStrings.annotated
}

object Anon_Annotated {
  @scala.inline
  def apply(output: hapiLib.hapiMod.PayloadOutput | hapiLib.hapiLibStrings.annotated): Anon_Annotated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Annotated]
  }
}

