package typings.atMaterialDashUiTypes

import typings.atMaterialDashUiTypes.atMaterialDashUiTypesMod.And
import typings.atMaterialDashUiTypes.atMaterialDashUiTypesMod.IsAny
import typings.atMaterialDashUiTypes.atMaterialDashUiTypesMod.Or
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atMaterialDashUiTypesBooleans {
  @js.native
  sealed trait `false`
    extends And[js.Any, js.Any, js.Any]
       with IsAny[js.Any]
       with Or[js.Any, js.Any, js.Any]
  
  @js.native
  sealed trait `true`
    extends And[js.Any, js.Any, js.Any]
       with IsAny[js.Any]
       with Or[js.Any, js.Any, js.Any]
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

