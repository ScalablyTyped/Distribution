package typings.javascriptObfuscator.igeneratoroutputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeneratorOutput extends js.Object {
  var code: String
  var map: String
}

object IGeneratorOutput {
  @scala.inline
  def apply(code: String, map: String): IGeneratorOutput = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGeneratorOutput]
  }
}

