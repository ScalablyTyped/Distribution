package typings.gulpTslint.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TslintFile extends js.Object {
  var contents: Buffer | js.Any = js.native
  var path: String = js.native
  var relative: String = js.native
  var tslint: js.Any = js.native
  def isNull(): Boolean = js.native
  def isStream(): Boolean = js.native
}

object TslintFile {
  @scala.inline
  def apply(
    contents: Buffer | js.Any,
    isNull: () => Boolean,
    isStream: () => Boolean,
    path: String,
    relative: String,
    tslint: js.Any
  ): TslintFile = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], isNull = js.Any.fromFunction0(isNull), isStream = js.Any.fromFunction0(isStream), path = path.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], tslint = tslint.asInstanceOf[js.Any])
    __obj.asInstanceOf[TslintFile]
  }
  @scala.inline
  implicit class TslintFileOps[Self <: TslintFile] (val x: Self) extends AnyVal {
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
    def setContents(value: Buffer | js.Any): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNull(value: () => Boolean): Self = this.set("isNull", js.Any.fromFunction0(value))
    @scala.inline
    def setIsStream(value: () => Boolean): Self = this.set("isStream", js.Any.fromFunction0(value))
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative(value: String): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def setTslint(value: js.Any): Self = this.set("tslint", value.asInstanceOf[js.Any])
  }
  
}

