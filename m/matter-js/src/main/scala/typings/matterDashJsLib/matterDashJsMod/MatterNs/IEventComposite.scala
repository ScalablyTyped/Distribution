package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventComposite[T] extends IEvent[T] {
  /**
    * EventObjects (may be a single body, constraint, composite or a mixed array of these)
    */
  var `object`: js.Any
}

object IEventComposite {
  @scala.inline
  def apply[T](name: java.lang.String, `object`: js.Any, source: T): IEventComposite[T] = {
    val __obj = js.Dynamic.literal(name = name, source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[IEventComposite[T]]
  }
}

