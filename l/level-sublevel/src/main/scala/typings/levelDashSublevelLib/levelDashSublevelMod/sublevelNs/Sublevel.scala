package typings
package levelDashSublevelLib.levelDashSublevelMod.sublevelNs

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
  def apply(pre: js.Function1[Hook, js.Function], sublevel: js.Function1[java.lang.String, Sublevel]): Sublevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pre")(pre)
    __obj.updateDynamic("sublevel")(sublevel)
    __obj.asInstanceOf[Sublevel]
  }
}

