package typings
package lokijsLib.lokijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lokijs", "persistenceAdapters")
@js.native
object persistenceAdapters extends js.Object {
  var fs: lokijsLib._LokiFsAdapter = js.native
  var localStorage: lokijsLib._LokiLocalStorageAdapter = js.native
}

