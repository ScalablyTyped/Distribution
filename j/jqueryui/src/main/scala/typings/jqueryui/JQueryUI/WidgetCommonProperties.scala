package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.std.Document
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetCommonProperties extends js.Object {
  
  var defaultElement: String = js.native
  
  var document: Document = js.native
  
  var element: JQuery = js.native
  
  var namespace: String = js.native
  
  var uuid: String = js.native
  
  var widgetEventPrefix: String = js.native
  
  var widgetFullName: String = js.native
  
  var window: Window = js.native
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
  
  @scala.inline
  implicit class WidgetCommonPropertiesOps[Self <: WidgetCommonProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultElement(value: String): Self = this.set("defaultElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: JQuery): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetEventPrefix(value: String): Self = this.set("widgetEventPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidgetFullName(value: String): Self = this.set("widgetFullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Window): Self = this.set("window", value.asInstanceOf[js.Any])
  }
}
