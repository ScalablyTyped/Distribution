package typings.graphqlToolsGitLoader.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content[T] extends js.Object {
  var content: String = js.native
  var options: T = js.native
  var path: String = js.native
  var pointer: String = js.native
}

object Content {
  @scala.inline
  def apply[T](content: String, options: T, path: String, pointer: String): Content[T] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pointer = pointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content[T]]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content[_], T] (val x: Self with Content[T]) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: T): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointer(value: String): Self = this.set("pointer", value.asInstanceOf[js.Any])
  }
  
}

