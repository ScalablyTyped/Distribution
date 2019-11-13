package typings.atMaterialDashUiLab

import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClassName extends js.Object {
  var className: String
  var endAdornment: ReactNode
  var ref: Ref[_]
  var startAdornment: ReactNode
}

object Anon_ClassName {
  @scala.inline
  def apply(
    className: String,
    endAdornment: ReactNode = null,
    ref: Ref[_] = null,
    startAdornment: ReactNode = null
  ): Anon_ClassName = {
    val __obj = js.Dynamic.literal(className = className)
    if (endAdornment != null) __obj.updateDynamic("endAdornment")(endAdornment.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (startAdornment != null) __obj.updateDynamic("startAdornment")(startAdornment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClassName]
  }
}

