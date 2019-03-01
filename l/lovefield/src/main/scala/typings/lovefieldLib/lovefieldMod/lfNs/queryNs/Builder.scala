package typings
package lovefieldLib.lovefieldMod.lfNs.queryNs

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
    bind: js.Function1[/* repeated */ js.Any, Builder],
    exec: js.Function0[js.Promise[js.Array[js.Object]]],
    explain: js.Function0[java.lang.String],
    toSql: js.Function0[java.lang.String]
  ): Builder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(bind)
    __obj.updateDynamic("exec")(exec)
    __obj.updateDynamic("explain")(explain)
    __obj.updateDynamic("toSql")(toSql)
    __obj.asInstanceOf[Builder]
  }
}

