package typings.hapiHapi

import typings.hapiHapi.hapiHapiStrings.annotated
import typings.hapiHapi.mod.PayloadOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOutput extends js.Object {
  var output: PayloadOutput | annotated
}

object AnonOutput {
  @scala.inline
  def apply(output: PayloadOutput | annotated): AnonOutput = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOutput]
  }
}

