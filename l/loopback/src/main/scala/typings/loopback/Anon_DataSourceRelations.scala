package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSourceRelations extends js.Object {
  var dataSource: js.Any
  var relations: js.UndefOr[js.Any] = js.undefined
}

object Anon_DataSourceRelations {
  @scala.inline
  def apply(dataSource: js.Any, relations: js.Any = null): Anon_DataSourceRelations = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    if (relations != null) __obj.updateDynamic("relations")(relations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataSourceRelations]
  }
}

