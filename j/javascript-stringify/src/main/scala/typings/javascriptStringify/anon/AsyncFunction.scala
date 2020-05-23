package typings.javascriptStringify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncFunction extends js.Object {
  var AsyncFunction: String
  var AsyncGeneratorFunction: String
  var Function: String
  var GeneratorFunction: String
}

object AsyncFunction {
  @scala.inline
  def apply(AsyncFunction: String, AsyncGeneratorFunction: String, Function: String, GeneratorFunction: String): AsyncFunction = {
    val __obj = js.Dynamic.literal(AsyncFunction = AsyncFunction.asInstanceOf[js.Any], AsyncGeneratorFunction = AsyncGeneratorFunction.asInstanceOf[js.Any], Function = Function.asInstanceOf[js.Any], GeneratorFunction = GeneratorFunction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncFunction]
  }
}

