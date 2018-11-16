package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ScrollSpyOptions extends js.Object {
  /**
           * Class applied to active elements
           * @default 'active'
           */
  var activeClass: java.lang.String
  /**
           * Offset for centering element when scrolled to
           * @default 200
           */
  var scrollOffset: scala.Double
  /**
           * Throttle of scroll handler
           * @default 100
           */
  var throttle: scala.Double
  /**
           * Used to find active element
           * @default id => 'a[href="#' + id + '"]'
           */
  def getActiveElement(id: java.lang.String): java.lang.String
}

