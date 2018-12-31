package typings
package matterDashJsLib.matterDashJsMod.MatterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEvent[T] extends js.Object {
  /**
    * The name of the event
    */
  var name: java.lang.String
  /**
    * The source object of the event
    */
  var source: T
}

