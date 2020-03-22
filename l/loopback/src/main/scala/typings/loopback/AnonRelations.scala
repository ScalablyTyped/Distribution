package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRelations extends js.Object {
  var dataSource: js.Any
  var relations: js.UndefOr[js.Any] = js.undefined
}

object AnonRelations {
  @scala.inline
  def apply(dataSource: js.Any, relations: js.Any = null): AnonRelations = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRelations]
  }
}

