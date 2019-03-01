package typings
package jsonnetLib.jsonnetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Jsonnet extends js.Object {
  def destroy(): scala.Unit
  def eval(code: java.lang.String): js.Any
  def evalFile(): js.Any
}

object Jsonnet {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    eval: js.Function1[java.lang.String, js.Any],
    evalFile: js.Function0[js.Any]
  ): Jsonnet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("eval")(eval)
    __obj.updateDynamic("evalFile")(evalFile)
    __obj.asInstanceOf[Jsonnet]
  }
}

