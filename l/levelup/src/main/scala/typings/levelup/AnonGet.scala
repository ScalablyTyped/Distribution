package typings.levelup

import typings.abstractLeveldown.mod.ErrorValueCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  def get(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    callback: ErrorValueCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
    ]
  ): Unit
}

object AnonGet {
  @scala.inline
  def apply(
    get: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorValueCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
    ]) => Unit
  ): AnonGet = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
    __obj.asInstanceOf[AnonGet]
  }
}

