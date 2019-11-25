package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.std.Document
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetCommonProperties extends js.Object {
  var defaultElement: String
  var document: Document
  var element: JQuery
  var namespace: String
  var uuid: String
  var widgetEventPrefix: String
  var widgetFullName: String
  var window: Window
}

object WidgetCommonProperties {
  @scala.inline
  def apply(
    defaultElement: String,
    document: Document,
    element: JQuery,
    namespace: String,
    uuid: String,
    widgetEventPrefix: String,
    widgetFullName: String,
    window: Window
  ): WidgetCommonProperties = {
    val __obj = js.Dynamic.literal(defaultElement = defaultElement.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], widgetEventPrefix = widgetEventPrefix.asInstanceOf[js.Any], widgetFullName = widgetFullName.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WidgetCommonProperties]
  }
}

