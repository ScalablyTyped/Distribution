package typings
package jqueryDashCountdownLib.jQueryCountdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Event
  extends jqueryLib.JQueryNs.Event[stdLib.EventTarget, scala.Null] {
  /**
           * Passed away the final date?
           */
  var elapsed: scala.Boolean
  /**
           * The parsed final date native object
           */
  var finalDate: stdLib.Date
  var offset: OffsetEvent
  /**
           * The formatter function
           */
  def strftime(format: java.lang.String): java.lang.String
}

