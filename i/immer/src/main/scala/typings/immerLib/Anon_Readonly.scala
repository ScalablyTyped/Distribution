package typings
package immerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Readonly[T] extends js.Object {
  var readonly: js.Any
}

object Anon_Readonly {
  @scala.inline
  def apply[T](readonly: js.Any): Anon_Readonly[T] = {
    val __obj = js.Dynamic.literal(readonly = readonly)
  
    __obj.asInstanceOf[Anon_Readonly[T]]
  }
}

