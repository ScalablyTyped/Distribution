package typings
package jqueryDashEasyDashLoadingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jqueryDashEasyDashLoadingLibStrings {
  @js.native
  sealed trait resize
    extends jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs.Command
  
  @js.native
  sealed trait start
    extends jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs.Command
  
  @js.native
  sealed trait stop
    extends jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs.Command
  
  @js.native
  sealed trait toggle
    extends jqueryDashEasyDashLoadingLib.JQueryEasyLoadingNs.Command
  
  @scala.inline
  def resize: resize = "resize".asInstanceOf[resize]
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  @scala.inline
  def stop: stop = "stop".asInstanceOf[stop]
  @scala.inline
  def toggle: toggle = "toggle".asInstanceOf[toggle]
}

