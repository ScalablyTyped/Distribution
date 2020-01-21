package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Display transient, toaster-style desktop messages to the user
  */
@JSImport("sdk/notifications", JSImport.Namespace)
@js.native
object notificationsMod extends js.Object {
  def notify(options: AnonData): Unit = js.native
}

