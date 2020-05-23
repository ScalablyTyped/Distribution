package typings.levelup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Put extends js.Object {
  def put(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    cb: js.Any
  ): Unit
}

object Put {
  @scala.inline
  def apply(
    put: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, js.Any) => Unit
  ): Put = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction4(put))
    __obj.asInstanceOf[Put]
  }
}

