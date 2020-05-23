package typings.lokijs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A loki persistence adapter which persists using node fs module
  * @constructor LokiFsAdapter
  */
@JSGlobal("LokiFsAdapter")
@js.native
class LokiFsAdapter ()
  extends typings.lokijs.LokiFsAdapter {
  /* CompleteClass */
  override def loadDatabase(dbname: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
}

