package typings
package makerDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: makerDotJsLib.MakerJsNs.IPoint
  var path: makerDotJsLib.MakerJsNs.IPath | makerDotJsLib.MakerJsNs.IModel
}

object Anon_Offset {
  @scala.inline
  def apply(
    offset: makerDotJsLib.MakerJsNs.IPoint,
    path: makerDotJsLib.MakerJsNs.IPath | makerDotJsLib.MakerJsNs.IModel
  ): Anon_Offset = {
    val __obj = js.Dynamic.literal(offset = offset, path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Offset]
  }
}

