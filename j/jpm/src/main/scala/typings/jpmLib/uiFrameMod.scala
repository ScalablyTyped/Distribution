package typings
package jpmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create HTML iframes, using bundled HTML, CSS and JavaScript,
  * that can be added to a designated area of the Firefox user interface. At the moment you can only add frames to a toolbar
  */
@JSImport("sdk/ui/frame", JSImport.Namespace)
@js.native
object uiFrameMod extends js.Object {
  def Frame(options: jpmLib.Anon_Event): jpmLib.FFAddonSDKNs.Frame = js.native
}

