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
    val __obj = js.Dynamic.literal(defaultElement = defaultElement, document = document, element = element, namespace = namespace, uuid = uuid, widgetEventPrefix = widgetEventPrefix, widgetFullName = widgetFullName, window = window)
  
    __obj.asInstanceOf[WidgetCommonProperties]
  }
}

