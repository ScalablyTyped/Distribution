package typings
package idyllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compiler extends js.Object {
  var compiler: idyllDashCompilerLib.idyllDashCompilerMod.Options
  var components: js.Any
  var transform: js.Array[_]
}

object Anon_Compiler {
  @scala.inline
  def apply(
    compiler: idyllDashCompilerLib.idyllDashCompilerMod.Options,
    components: js.Any,
    transform: js.Array[_]
  ): Anon_Compiler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compiler")(compiler)
    __obj.updateDynamic("components")(components)
    __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Anon_Compiler]
  }
}

