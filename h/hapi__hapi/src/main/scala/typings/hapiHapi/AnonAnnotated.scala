package typings.hapiHapi

import typings.hapiHapi.hapiHapiStrings.annotated
import typings.hapiHapi.mod.PayloadOutput
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

