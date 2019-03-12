package typings
package jsonDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Compile extends js.Object {
  def compile(template: java.lang.String): js.Function1[/* vars */ js.Any, java.lang.String]
}

object Anon_Compile {
  @scala.inline
  def apply(compile: java.lang.String => js.Function1[/* vars */ js.Any, java.lang.String]): Anon_Compile = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile))
  
    __obj.asInstanceOf[Anon_Compile]
  }
}

