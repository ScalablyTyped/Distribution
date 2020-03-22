package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDbName extends js.Object {
  var dbName: js.UndefOr[String] = js.undefined
  var indexedDB: js.Any
  var workerApi: js.UndefOr[js.Any] = js.undefined
  var workerScript: js.UndefOr[String] = js.undefined
}

object AnonDbName {
  @scala.inline
  def apply(indexedDB: js.Any, dbName: String = null, workerApi: js.Any = null, workerScript: String = null): AnonDbName = {
    val __obj = js.Dynamic.literal(indexedDB = indexedDB.asInstanceOf[js.Any])
    if (dbName != null) __obj.updateDynamic("dbName")(dbName.asInstanceOf[js.Any])
    if (workerApi != null) __obj.updateDynamic("workerApi")(workerApi.asInstanceOf[js.Any])
    if (workerScript != null) __obj.updateDynamic("workerScript")(workerScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDbName]
  }
}

