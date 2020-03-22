package typings.ionicAngular.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var project: js.UndefOr[String] = js.undefined
}

object Schema {
  @scala.inline
  def apply(project: String = null): Schema = {
    val __obj = js.Dynamic.literal()
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

