package typings.levelup

import typings.abstractLeveldown.mod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  def clear(
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    callback: ErrorCallback
  ): Unit
}

object AnonClear {
  @scala.inline
  def apply(
    clear: (/* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
  ): AnonClear = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction2(clear))
    __obj.asInstanceOf[AnonClear]
  }
}

