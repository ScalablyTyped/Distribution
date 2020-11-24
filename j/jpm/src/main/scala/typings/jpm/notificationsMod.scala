package typings.jpm

import typings.jpm.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Display transient, toaster-style desktop messages to the user
  */
@JSImport("sdk/notifications", JSImport.Namespace)
@js.native
object notificationsMod extends js.Object {
  
  def notify(options: Data): Unit = js.native
}
