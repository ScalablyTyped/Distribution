package typings.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Utils
trait KnockoutUtils extends js.Object {
  def objectForEach(obj: js.Any, action: js.Function): Unit
  def objectMap(source: js.Any, mapping: js.Function): js.Any
}

object KnockoutUtils {
  @scala.inline
  def apply(objectForEach: (js.Any, js.Function) => Unit, objectMap: (js.Any, js.Function) => js.Any): KnockoutUtils = {
    val __obj = js.Dynamic.literal(objectForEach = js.Any.fromFunction2(objectForEach), objectMap = js.Any.fromFunction2(objectMap))
  
    __obj.asInstanceOf[KnockoutUtils]
  }
}

