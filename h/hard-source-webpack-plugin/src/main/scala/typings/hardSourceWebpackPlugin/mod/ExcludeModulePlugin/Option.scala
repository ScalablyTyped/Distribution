package typings.hardSourceWebpackPlugin.mod.ExcludeModulePlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var exclude: js.UndefOr[TestElement] = js.undefined
  var include: js.UndefOr[TestElement] = js.undefined
  var test: TestElement
}

object Option {
  @scala.inline
  def apply(test: TestElement, exclude: TestElement = null, include: TestElement = null): Option = {
    val __obj = js.Dynamic.literal(test = test.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

