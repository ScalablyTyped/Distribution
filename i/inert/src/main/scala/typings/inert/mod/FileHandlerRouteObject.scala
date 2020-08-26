package typings.inert.mod

import typings.hapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileHandlerRouteObject extends ReplyFileHandlerOptions {
  /**
    * path - a path string or function as described above (required).
    */
  var path: String | RequestHandler[String] = js.native
}

object FileHandlerRouteObject {
  @scala.inline
  def apply(path: String | RequestHandler[String]): FileHandlerRouteObject = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileHandlerRouteObject]
  }
  @scala.inline
  implicit class FileHandlerRouteObjectOps[Self <: FileHandlerRouteObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPathFunction1(value: /* request */ Request => String): Self = this.set("path", js.Any.fromFunction1(value))
    @scala.inline
    def setPath(value: String | RequestHandler[String]): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

