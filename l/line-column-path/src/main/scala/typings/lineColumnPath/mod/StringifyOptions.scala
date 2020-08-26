package typings.lineColumnPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringifyOptions extends js.Object {
  /**
  	Output the column.
  	Setting this to `false` will result in `unicorn.js:8` instead of `unicorn.js:8:14`.
  	@default true
  	*/
  var column: js.UndefOr[Boolean] = js.native
  /**
  	Output the file path.
  	Setting this to `false` will result in `8:18` instead of `unicorn.js:8:14`.
  	@default true
  	*/
  val file: js.UndefOr[Boolean] = js.native
}

object StringifyOptions {
  @scala.inline
  def apply(): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringifyOptions]
  }
  @scala.inline
  implicit class StringifyOptionsOps[Self <: StringifyOptions] (val x: Self) extends AnyVal {
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
    def setColumn(value: Boolean): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setFile(value: Boolean): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
  
}

