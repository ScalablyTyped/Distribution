package typings.levelup.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Put extends js.Object {
  def put(
    key: /* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any,
    value: /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any,
    options: /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any,
    cb: js.Any
  ): Unit = js.native
}

object Put {
  @scala.inline
  def apply(
    put: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, js.Any) => Unit
  ): Put = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction4(put))
    __obj.asInstanceOf[Put]
  }
  @scala.inline
  implicit class PutOps[Self <: Put] (val x: Self) extends AnyVal {
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
    def setPut(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: infer K */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer V */ js.Any, /* import warning: importer.ImportType#apply Failed type conversion: infer O */ js.Any, js.Any) => Unit
    ): Self = this.set("put", js.Any.fromFunction4(value))
  }
  
}

