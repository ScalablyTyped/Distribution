package typings.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(description: String = null, name: String = null): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Description]
  }
}

