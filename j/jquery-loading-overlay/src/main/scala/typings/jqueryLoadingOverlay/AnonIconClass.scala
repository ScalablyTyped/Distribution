package typings.jqueryLoadingOverlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIconClass extends js.Object {
  /**
    * Class added to loading overlay spinner
    */
  var iconClass: String
  /**
    * Class added to target while loading
    */
  var loadingClass: String
  /**
    * Text within loading overlay
    */
  var loadingText: String
  /**
    * Class added to overlay (style with CSS)
    */
  var overlayClass: String
  /**
    * Class added to loading overlay spinner
    */
  var spinnerClass: String
  /**
    * Class added to loading overlay spinner
    */
  var textClass: String
}

object AnonIconClass {
  @scala.inline
  def apply(
    iconClass: String,
    loadingClass: String,
    loadingText: String,
    overlayClass: String,
    spinnerClass: String,
    textClass: String
  ): AnonIconClass = {
    val __obj = js.Dynamic.literal(iconClass = iconClass.asInstanceOf[js.Any], loadingClass = loadingClass.asInstanceOf[js.Any], loadingText = loadingText.asInstanceOf[js.Any], overlayClass = overlayClass.asInstanceOf[js.Any], spinnerClass = spinnerClass.asInstanceOf[js.Any], textClass = textClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIconClass]
  }
}

