package typings
package levelupLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  def get(
    key: /* import warning: ImportType.apply Failed type conversion: infer K */ js.Any,
    options: /* import warning: ImportType.apply Failed type conversion: infer O */ js.Any,
    callback: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorValueCallback[/* import warning: ImportType.apply Failed type conversion: infer V */ js.Any]
  ): scala.Unit
}

object Anon_Callback {
  @scala.inline
  def apply(
    get: (/* import warning: ImportType.apply Failed type conversion: infer K */ js.Any, /* import warning: ImportType.apply Failed type conversion: infer O */ js.Any, abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorValueCallback[/* import warning: ImportType.apply Failed type conversion: infer V */ js.Any]) => scala.Unit
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction3(get))
  
    __obj.asInstanceOf[Anon_Callback]
  }
}

