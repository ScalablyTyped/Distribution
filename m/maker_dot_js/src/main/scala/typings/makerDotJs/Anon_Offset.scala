package typings.makerDotJs

import typings.makerDotJs.MakerJsNs.IModel
import typings.makerDotJs.MakerJsNs.IPath
import typings.makerDotJs.MakerJsNs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: IPoint
  var path: IPath | IModel
}

object Anon_Offset {
  @scala.inline
  def apply(offset: IPoint, path: IPath | IModel): Anon_Offset = {
    val __obj = js.Dynamic.literal(offset = offset, path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Offset]
  }
}

