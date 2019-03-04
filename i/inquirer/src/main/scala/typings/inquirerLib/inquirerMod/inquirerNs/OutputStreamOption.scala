package typings
package inquirerLib.inquirerMod.inquirerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputStreamOption extends _StreamOptions {
  var output: nodeLib.NodeJSNs.WriteStream
}

object OutputStreamOption {
  @scala.inline
  def apply(output: nodeLib.NodeJSNs.WriteStream): OutputStreamOption = {
    val __obj = js.Dynamic.literal(output = output)
  
    __obj.asInstanceOf[OutputStreamOption]
  }
}

