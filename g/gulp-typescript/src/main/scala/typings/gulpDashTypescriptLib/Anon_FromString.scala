package typings
package gulpDashTypescriptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FromString extends js.Object {
  def fromString(text: java.lang.String): typescriptLib.typescriptMod.IScriptSnapshot
}

object Anon_FromString {
  @scala.inline
  def apply(fromString: java.lang.String => typescriptLib.typescriptMod.IScriptSnapshot): Anon_FromString = {
    val __obj = js.Dynamic.literal(fromString = js.Any.fromFunction1(fromString))
  
    __obj.asInstanceOf[Anon_FromString]
  }
}

