package typings.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Not[T] extends js.Object {
  var not: T
}

object Anon_Not {
  @scala.inline
  def apply[T](not: T): Anon_Not[T] = {
    val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Not[T]]
  }
}

