package typings.jestMessageUtil.typesMod

import typings.stackUtils.mod.StackData
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
    column: js.UndefOr[Double] = js.undefined,
    constructor: js.UndefOr[Boolean] = js.undefined,
    evalOrigin: String = null,
    function: String = null,
    line: js.UndefOr[Double] = js.undefined,
    method: String = null,
    native: js.UndefOr[Boolean] = js.undefined
  ): Frame = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(constructor)) __obj.updateDynamic("constructor")(constructor.get.asInstanceOf[js.Any])
    if (evalOrigin != null) __obj.updateDynamic("evalOrigin")(evalOrigin.asInstanceOf[js.Any])
    if (function != null) __obj.updateDynamic("function")(function.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(native)) __obj.updateDynamic("native")(native.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
}

