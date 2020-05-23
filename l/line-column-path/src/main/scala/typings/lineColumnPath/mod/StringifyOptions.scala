package typings.lineColumnPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringifyOptions extends js.Object {
  /**
  	Output the column.
  	Setting this to `false` will result in `unicorn.js:8` instead of `unicorn.js:8:14`.
  	@default true
  	*/
  var column: js.UndefOr[Boolean] = js.undefined
  /**
  	Output the file path.
  	Setting this to `false` will result in `8:18` instead of `unicorn.js:8:14`.
  	@default true
  	*/
  val file: js.UndefOr[Boolean] = js.undefined
}

object StringifyOptions {
  @scala.inline
  def apply(column: js.UndefOr[Boolean] = js.undefined, file: js.UndefOr[Boolean] = js.undefined): StringifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(file)) __obj.updateDynamic("file")(file.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringifyOptions]
  }
}

