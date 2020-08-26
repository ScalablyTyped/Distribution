package typings.levelup.anon

import typings.abstractLeveldown.mod.ErrorValueCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Get extends js.Object {
  def get(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    callback: ErrorValueCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
    ]
  ): Unit = js.native
}

object Get {
  @scala.inline
  def apply(
    get: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorValueCallback[
      /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
    ]) => Unit
  ): Get = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
    __obj.asInstanceOf[Get]
  }
  @scala.inline
  implicit class GetOps[Self <: Get] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, ErrorValueCallback[
          /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any
        ]) => Unit
    ): Self = this.set("get", js.Any.fromFunction3(value))
  }
  
}

