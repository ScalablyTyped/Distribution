package typings.istanbulLibHook.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformerOptions extends js.Object {
  var filename: String
}

object TransformerOptions {
  @scala.inline
  def apply(filename: String): TransformerOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransformerOptions]
  }
}

