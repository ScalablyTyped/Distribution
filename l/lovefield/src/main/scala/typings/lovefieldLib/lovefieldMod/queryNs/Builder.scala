package typings
package lovefieldLib.lovefieldMod.queryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Builder extends js.Object {
  def bind(values: js.Any*): Builder
  def exec(): js.Promise[js.Array[js.Object]]
  def explain(): java.lang.String
  def toSql(): java.lang.String
}

object Builder {
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => Builder,
    exec: () => js.Promise[js.Array[js.Object]],
    explain: () => java.lang.String,
    toSql: () => java.lang.String
  ): Builder = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), toSql = js.Any.fromFunction0(toSql))
  
    __obj.asInstanceOf[Builder]
  }
}

