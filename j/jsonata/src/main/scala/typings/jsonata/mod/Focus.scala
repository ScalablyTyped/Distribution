package typings.jsonata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Focus extends js.Object {
  val environment: Environment
  val input: js.Any
}

object Focus {
  @scala.inline
  def apply(environment: Environment, input: js.Any): Focus = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Focus]
  }
}

