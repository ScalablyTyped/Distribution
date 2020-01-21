package typings.hapi

import typings.hapi.hapiStrings.annotated
import typings.hapi.mod.PayloadOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnnotated extends js.Object {
  var output: PayloadOutput | annotated
}

object AnonAnnotated {
  @scala.inline
  def apply(output: PayloadOutput | annotated): AnonAnnotated = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnnotated]
  }
}

