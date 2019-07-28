package typings.jqueryDashLoadingDashOverlay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IconClass extends js.Object {
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

object Anon_IconClass {
  @scala.inline
  def apply(
    iconClass: String,
    loadingClass: String,
    loadingText: String,
    overlayClass: String,
    spinnerClass: String,
    textClass: String
  ): Anon_IconClass = {
    val __obj = js.Dynamic.literal(iconClass = iconClass, loadingClass = loadingClass, loadingText = loadingText, overlayClass = overlayClass, spinnerClass = spinnerClass, textClass = textClass)
  
    __obj.asInstanceOf[Anon_IconClass]
  }
}

