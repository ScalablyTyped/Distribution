package typings.ionicAngular.interfacesMod

import typings.std.FrameRequestCallback
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonicWindow extends Window {
  
  var Ionic: IonicGlobal = js.native
  
  var __zone_symbol__requestAnimationFrame: js.UndefOr[js.Function1[/* ts */ FrameRequestCallback, Double]] = js.native
}
