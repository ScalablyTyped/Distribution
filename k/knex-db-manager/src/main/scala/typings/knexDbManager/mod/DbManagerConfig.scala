package typings.knexDbManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbManagerConfig extends js.Object {
  var collate: js.UndefOr[js.Array[String]] = js.undefined
  var superPassword: js.UndefOr[String] = js.undefined
  var superUser: js.UndefOr[String] = js.undefined
}

object DbManagerConfig {
  @scala.inline
  def apply(collate: js.Array[String] = null, superPassword: String = null, superUser: String = null): DbManagerConfig = {
    val __obj = js.Dynamic.literal()
    if (collate != null) __obj.updateDynamic("collate")(collate.asInstanceOf[js.Any])
    if (superPassword != null) __obj.updateDynamic("superPassword")(superPassword.asInstanceOf[js.Any])
    if (superUser != null) __obj.updateDynamic("superUser")(superUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbManagerConfig]
  }
}

