package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsBinary extends js.Object {
  var isBinary: Boolean
  var mimeType: String
}

object Anon_IsBinary {
  @scala.inline
  def apply(isBinary: Boolean, mimeType: String): Anon_IsBinary = {
    val __obj = js.Dynamic.literal(isBinary = isBinary.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_IsBinary]
  }
}

