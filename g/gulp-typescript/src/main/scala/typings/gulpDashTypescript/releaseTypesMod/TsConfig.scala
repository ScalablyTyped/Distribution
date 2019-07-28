package typings.gulpDashTypescript.releaseTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TsConfig extends js.Object {
  var compilerOptions: js.UndefOr[js.Any] = js.undefined
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  var files: js.UndefOr[js.Array[String]] = js.undefined
  var include: js.UndefOr[js.Array[String]] = js.undefined
}

object TsConfig {
  @scala.inline
  def apply(
    compilerOptions: js.Any = null,
    exclude: js.Array[String] = null,
    files: js.Array[String] = null,
    include: js.Array[String] = null
  ): TsConfig = {
    val __obj = js.Dynamic.literal()
    if (compilerOptions != null) __obj.updateDynamic("compilerOptions")(compilerOptions)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (files != null) __obj.updateDynamic("files")(files)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[TsConfig]
  }
}

