package typings
package materializeDashCssLib.MNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipOptions extends js.Object {
  /**
    * Delay time before tooltip appears.
    * @default 200
    */
  var enterDelay: scala.Double
  /**
    * Delay time before tooltip disappears.
    * @default 0
    */
  var exitDelay: scala.Double
  /**
    * Can take regular text or HTML strings.
    * @default null
    */
  var html: java.lang.String
  /**
    * Enter transition duration.
    * @default 300
    */
  var inDuration: scala.Double
  /**
    * Set distance tooltip appears away from its activator excluding transitionMovement.
    * @default 5
    */
  var margin: scala.Double
  /**
    * Exit transition duration.
    * @default 250
    */
  var outDuration: scala.Double
  /**
    * Set the direction of the tooltip.
    * @default 'bottom'
    */
  var position: materializeDashCssLib.materializeDashCssLibStrings.top | materializeDashCssLib.materializeDashCssLibStrings.right | materializeDashCssLib.materializeDashCssLibStrings.bottom | materializeDashCssLib.materializeDashCssLibStrings.left
  /**
    * Amount in px that the tooltip moves during its transition.
    * @default 10
    */
  var transitionMovement: scala.Double
}

object TooltipOptions {
  @scala.inline
  def apply(
    enterDelay: scala.Double,
    exitDelay: scala.Double,
    html: java.lang.String,
    inDuration: scala.Double,
    margin: scala.Double,
    outDuration: scala.Double,
    position: materializeDashCssLib.materializeDashCssLibStrings.top | materializeDashCssLib.materializeDashCssLibStrings.right | materializeDashCssLib.materializeDashCssLibStrings.bottom | materializeDashCssLib.materializeDashCssLibStrings.left,
    transitionMovement: scala.Double
  ): TooltipOptions = {
    val __obj = js.Dynamic.literal(enterDelay = enterDelay, exitDelay = exitDelay, html = html, inDuration = inDuration, margin = margin, outDuration = outDuration, position = position.asInstanceOf[js.Any], transitionMovement = transitionMovement)
  
    __obj.asInstanceOf[TooltipOptions]
  }
}

