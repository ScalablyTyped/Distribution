package typings.hapiHapi.anon

import typings.hapiHapi.hapiHapiStrings.annotated
import typings.hapiHapi.mod.PayloadOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Output extends js.Object {
  var output: PayloadOutput | annotated = js.native
}

object Output {
  @scala.inline
  def apply(output: PayloadOutput | annotated): Output = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  @scala.inline
  implicit class OutputOps[Self <: Output] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOutput(value: PayloadOutput | annotated): Self = this.set("output", value.asInstanceOf[js.Any])
  }
  
}

