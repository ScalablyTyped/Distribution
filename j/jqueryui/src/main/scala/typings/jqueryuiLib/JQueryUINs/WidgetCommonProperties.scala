package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetCommonProperties extends js.Object {
  var defaultElement: java.lang.String
  var document: stdLib.Document
  var element: jqueryuiLib.JQuery
  var namespace: java.lang.String
  var uuid: java.lang.String
  var widgetEventPrefix: java.lang.String
  var widgetFullName: java.lang.String
  var window: stdLib.Window
}

object WidgetCommonProperties {
  @scala.inline
  def apply(
    defaultElement: java.lang.String,
    document: stdLib.Document,
    element: jqueryuiLib.JQuery,
    namespace: java.lang.String,
    uuid: java.lang.String,
    widgetEventPrefix: java.lang.String,
    widgetFullName: java.lang.String,
    window: stdLib.Window
  ): WidgetCommonProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultElement")(defaultElement)
    __obj.updateDynamic("document")(document)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("namespace")(namespace)
    __obj.updateDynamic("uuid")(uuid)
    __obj.updateDynamic("widgetEventPrefix")(widgetEventPrefix)
    __obj.updateDynamic("widgetFullName")(widgetFullName)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[WidgetCommonProperties]
  }
}

