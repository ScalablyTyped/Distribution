package typings.hapi.anon

import typings.hapi.hapiStrings.annotated
import typings.hapi.mod.PayloadOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  var output: PayloadOutput | annotated
}

object Output {
  @scala.inline
  def apply(output: PayloadOutput | annotated): Output = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

