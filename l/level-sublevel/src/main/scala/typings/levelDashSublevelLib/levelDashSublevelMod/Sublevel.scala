package typings
package levelDashSublevelLib.levelDashSublevelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait Sublevel extends js.Object {
  def pre(hook: Hook): js.Function
  def sublevel(key: java.lang.String): Sublevel
}

object Sublevel {
  @scala.inline
  def apply(pre: Hook => js.Function, sublevel: java.lang.String => Sublevel): Sublevel = {
    val __obj = js.Dynamic.literal(pre = js.Any.fromFunction1(pre), sublevel = js.Any.fromFunction1(sublevel))
  
    __obj.asInstanceOf[Sublevel]
  }
}

