package typings.levelup

import typings.abstractLeveldown.mod.ErrorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDel extends js.Object {
  def del(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    callback: ErrorCallback
  ): Unit
}

object AnonDel {
  @scala.inline
  def apply(
    del: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorCallback) => Unit
  ): AnonDel = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction3(del))
  
    __obj.asInstanceOf[AnonDel]
  }
}

