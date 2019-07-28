package typings.jsDashSchema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectConstructor extends js.Object {
  def like(obj: js.Any): ObjectConstructor
  def reference(obj: js.Any): ObjectConstructor
}

object ObjectConstructor {
  @scala.inline
  def apply(like: js.Any => ObjectConstructor, reference: js.Any => ObjectConstructor): ObjectConstructor = {
    val __obj = js.Dynamic.literal(like = js.Any.fromFunction1(like), reference = js.Any.fromFunction1(reference))
  
    __obj.asInstanceOf[ObjectConstructor]
  }
}

