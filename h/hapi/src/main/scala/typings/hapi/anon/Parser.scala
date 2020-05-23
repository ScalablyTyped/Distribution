package typings.hapi.anon

import typings.hapi.mod.Util.Dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parser extends js.Object {
  /**
    * the method must return an object where each key is a parameter and matching value is the parameter value.
    * If the method throws, the error is used as the response or returned when `request.setUrl` is called.
    */
  def parser(raw: Dictionary[String]): Dictionary[_]
}

object Parser {
  @scala.inline
  def apply(parser: Dictionary[String] => Dictionary[_]): Parser = {
    val __obj = js.Dynamic.literal(parser = js.Any.fromFunction1(parser))
    __obj.asInstanceOf[Parser]
  }
}

