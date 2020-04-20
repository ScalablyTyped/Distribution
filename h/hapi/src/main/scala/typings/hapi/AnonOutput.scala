package typings.hapi

import typings.hapi.hapiStrings.annotated
import typings.hapi.mod.PayloadOutput
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

