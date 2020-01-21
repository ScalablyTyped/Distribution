package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.std.Document_
import typings.std.Window_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetCommonProperties extends js.Object {
  var defaultElement: String
  var document: Document_
  var element: JQuery
  var namespace: String
  var uuid: String
  var widgetEventPrefix: String
  var widgetFullName: String
  var window: Window_
}

object WidgetCommonProperties {
  @scala.inline
  def apply(
    defaultElement: String,
    document: Document_,
    element: JQuery,
    namespace: String,
    uuid: String,
    widgetEventPrefix: String,
    widgetFullName: String,
    window: Window_
  ): WidgetCommonProperties = {
    val __obj = js.Dynamic.literal(defaultElement = defaultElement.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], widgetEventPrefix = widgetEventPrefix.asInstanceOf[js.Any], widgetFullName = widgetFullName.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WidgetCommonProperties]
  }
}

