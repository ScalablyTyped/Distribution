package typings
package jqueryDotPjaxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for pjax:popstate event.
  */
trait PjaxPopStateEventObject
  extends jqueryLib.JQueryNs.Event {
  /**
    * Navigation direction. Could be "back" or "forward".
    */
  var direction: java.lang.String
}

