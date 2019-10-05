package typings.ibmDashMobilefirst.WL.App

import typings.ibmDashMobilefirst.WL.App.BackgroundHandler.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.App.BackgroundHandler")
@js.native
object BackgroundHandler extends js.Object {
  var defaultIOSBehavior: Handler = js.native
  /**
    * @deprecated since version 6.0.0
    */
  var hideElements: Handler = js.native
  var hideView: Handler = js.native
  def setOnAppEnteringBackground(handler: Handler): Unit = js.native
  type Handler = js.Function0[Unit]
}

