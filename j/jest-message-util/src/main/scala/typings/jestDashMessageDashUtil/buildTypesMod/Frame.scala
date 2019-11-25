package typings.jestDashMessageDashUtil.buildTypesMod

import typings.stackDashUtils.stackDashUtilsMod.StackData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends StackData {
  @JSName("file")
  var file_Frame: String
}

object Frame {
  @scala.inline
  def apply(
    file: String,
    column: Int | Double = null,
    constructor: js.UndefOr[Boolean] = js.undefined,
    evalOrigin: String = null,
    function: String = null,
    line: Int | Double = null,
    method: String = null,
    native: js.UndefOr[Boolean] = js.undefined
  ): Frame = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (!js.isUndefined(constructor)) __obj.updateDynamic("constructor")(constructor.asInstanceOf[js.Any])
    if (evalOrigin != null) __obj.updateDynamic("evalOrigin")(evalOrigin.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

