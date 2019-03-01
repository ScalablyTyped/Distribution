package typings
package jqueryDashLoadingDashOverlayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IconClass extends js.Object {
  /**
    * Class added to loading overlay spinner
    */
  var iconClass: java.lang.String
  /**
    * Class added to target while loading
    */
  var loadingClass: java.lang.String
  /**
    * Text within loading overlay
    */
  var loadingText: java.lang.String
  /**
    * Class added to overlay (style with CSS)
    */
  var overlayClass: java.lang.String
  /**
    * Class added to loading overlay spinner
    */
  var spinnerClass: java.lang.String
  /**
    * Class added to loading overlay spinner
    */
  var textClass: java.lang.String
}

object Anon_IconClass {
  @scala.inline
  def apply(
    iconClass: java.lang.String,
    loadingClass: java.lang.String,
    loadingText: java.lang.String,
    overlayClass: java.lang.String,
    spinnerClass: java.lang.String,
    textClass: java.lang.String
  ): Anon_IconClass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iconClass")(iconClass)
    __obj.updateDynamic("loadingClass")(loadingClass)
    __obj.updateDynamic("loadingText")(loadingText)
    __obj.updateDynamic("overlayClass")(overlayClass)
    __obj.updateDynamic("spinnerClass")(spinnerClass)
    __obj.updateDynamic("textClass")(textClass)
    __obj.asInstanceOf[Anon_IconClass]
  }
}

