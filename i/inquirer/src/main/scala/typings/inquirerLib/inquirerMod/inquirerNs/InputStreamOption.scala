package typings
package inquirerLib.inquirerMod.inquirerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputStreamOption extends _StreamOptions {
  var input: nodeLib.NodeJSNs.ReadStream
}

object InputStreamOption {
  @scala.inline
  def apply(input: nodeLib.NodeJSNs.ReadStream): InputStreamOption = {
    val __obj = js.Dynamic.literal(input = input)
  
    __obj.asInstanceOf[InputStreamOption]
  }
}

