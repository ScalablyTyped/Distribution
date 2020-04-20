package typings.hapiHapi

import typings.hapiHapi.mod.Util.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParser extends js.Object {
  /**
    * the method must return an object where each key is a parameter and matching value is the parameter value.
    * If the method throws, the error is used as the response or returned when `request.setUrl` is called.
    */
  def parser(raw: Dictionary[String]): Dictionary[_]
}

object AnonParser {
  @scala.inline
  def apply(parser: Dictionary[String] => Dictionary[_]): AnonParser = {
    val __obj = js.Dynamic.literal(parser = js.Any.fromFunction1(parser))
    __obj.asInstanceOf[AnonParser]
  }
}

