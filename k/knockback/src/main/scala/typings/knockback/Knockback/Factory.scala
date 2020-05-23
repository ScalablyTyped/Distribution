package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Factory extends js.Object {
  def addPathMapping(path: String, create_info: js.Any): js.Any
  def addPathMappings(factories: js.Any, owner_path: String): js.Any
  def creatorForPath(obj: js.Any, path: String): js.Any
  def hasPath(path: String): Boolean
  def hasPathMappings(factories: js.Any, owner_path: String): Boolean
}

object Factory {
  @scala.inline
  def apply(
    addPathMapping: (String, js.Any) => js.Any,
    addPathMappings: (js.Any, String) => js.Any,
    creatorForPath: (js.Any, String) => js.Any,
    hasPath: String => Boolean,
    hasPathMappings: (js.Any, String) => Boolean
  ): Factory = {
    val __obj = js.Dynamic.literal(addPathMapping = js.Any.fromFunction2(addPathMapping), addPathMappings = js.Any.fromFunction2(addPathMappings), creatorForPath = js.Any.fromFunction2(creatorForPath), hasPath = js.Any.fromFunction1(hasPath), hasPathMappings = js.Any.fromFunction2(hasPathMappings))
    __obj.asInstanceOf[Factory]
  }
}

