package typings.levelup.anon

import typings.abstractLeveldown.mod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Del extends js.Object {
  def del(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    callback: ErrorCallback
  ): Unit
}

object Del {
  @scala.inline
  def apply(
    del: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
  ): Del = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction3(del))
    __obj.asInstanceOf[Del]
  }
}

