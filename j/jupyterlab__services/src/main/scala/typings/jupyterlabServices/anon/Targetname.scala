package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Targetname extends js.Object {
  /**
    * The comm target name to filter returned comms
    */
  var target_name: js.UndefOr[String] = js.undefined
}

object Targetname {
  @scala.inline
  def apply(target_name: String = null): Targetname = {
    val __obj = js.Dynamic.literal()
    if (target_name != null) __obj.updateDynamic("target_name")(target_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Targetname]
  }
}

