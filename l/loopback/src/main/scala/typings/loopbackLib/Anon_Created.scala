package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Created[T] extends js.Object {
  var created: scala.Boolean
  var instance: T
}

object Anon_Created {
  @scala.inline
  def apply[T](created: scala.Boolean, instance: T): Anon_Created[T] = {
    val __obj = js.Dynamic.literal(created = created, instance = instance.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Created[T]]
  }
}

