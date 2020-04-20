package typings.javascriptStringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsyncFunction extends js.Object {
  var AsyncFunction: String
  var AsyncGeneratorFunction: String
  var Function: String
  var GeneratorFunction: String
}

object AnonAsyncFunction {
  @scala.inline
  def apply(AsyncFunction: String, AsyncGeneratorFunction: String, Function: String, GeneratorFunction: String): AnonAsyncFunction = {
    val __obj = js.Dynamic.literal(AsyncFunction = AsyncFunction.asInstanceOf[js.Any], AsyncGeneratorFunction = AsyncGeneratorFunction.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], GeneratorFunction = GeneratorFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsyncFunction]
  }
}

