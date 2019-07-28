package typings.atHapiHapi

import typings.atHapiHapi.atHapiHapiMod.PayloadOutput
import typings.atHapiHapi.atHapiHapiStrings.annotated
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Annotated extends js.Object {
  var output: PayloadOutput | annotated
}

object Anon_Annotated {
  @scala.inline
  def apply(output: PayloadOutput | annotated): Anon_Annotated = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Annotated]
  }
}

