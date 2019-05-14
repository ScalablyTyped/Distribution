package typings
package levelupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cb extends js.Object {
  def put(
    key: /* import warning: ImportType.apply Failed type conversion: infer K */ js.Any,
    value: /* import warning: ImportType.apply Failed type conversion: infer V */ js.Any,
    options: /* import warning: ImportType.apply Failed type conversion: infer O */ js.Any,
    cb: js.Any
  ): scala.Unit
}

object Anon_Cb {
  @scala.inline
  def apply(
    put: (/* import warning: ImportType.apply Failed type conversion: infer K */ js.Any, /* import warning: ImportType.apply Failed type conversion: infer V */ js.Any, /* import warning: ImportType.apply Failed type conversion: infer O */ js.Any, js.Any) => scala.Unit
  ): Anon_Cb = {
    val __obj = js.Dynamic.literal(put = js.Any.fromFunction4(put))
  
    __obj.asInstanceOf[Anon_Cb]
  }
}

