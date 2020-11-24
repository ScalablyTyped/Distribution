package typings.jqueryCleditor

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryCLEditorButtonDefinition extends js.Object {
  
  var buttonClick: js.UndefOr[
    js.Function2[/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.native
  
  var command: js.UndefOr[String] = js.native
  
  var css: js.UndefOr[js.Any] = js.native
  
  var getEnabled: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.native
  
  var getPressed: js.UndefOr[js.Function1[/* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var popupClick: js.UndefOr[
    js.Function2[/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData, Boolean]
  ] = js.native
  
  var popupContent: js.UndefOr[String] = js.native
  
  var popupName: js.UndefOr[String] = js.native
  
  var stripIndex: js.UndefOr[Double] = js.native
  
  var title: String = js.native
}
object JQueryCLEditorButtonDefinition {
  
  @scala.inline
  def apply(name: String, title: String): JQueryCLEditorButtonDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryCLEditorButtonDefinition]
  }
  
  @scala.inline
  implicit class JQueryCLEditorButtonDefinitionOps[Self <: JQueryCLEditorButtonDefinition] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonClick(value: (/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData) => Boolean): Self = this.set("buttonClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteButtonClick: Self = this.set("buttonClick", js.undefined)
    
    @scala.inline
    def setCommand(value: String): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    
    @scala.inline
    def setCss(value: js.Any): Self = this.set("css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCss: Self = this.set("css", js.undefined)
    
    @scala.inline
    def setGetEnabled(value: /* data */ JQueryCLEditorButtonDefinitionEventData => Boolean): Self = this.set("getEnabled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetEnabled: Self = this.set("getEnabled", js.undefined)
    
    @scala.inline
    def setGetPressed(value: /* data */ JQueryCLEditorButtonDefinitionEventData => Boolean): Self = this.set("getPressed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetPressed: Self = this.set("getPressed", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setPopupClick(value: (/* event */ Event, /* data */ JQueryCLEditorButtonDefinitionEventData) => Boolean): Self = this.set("popupClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePopupClick: Self = this.set("popupClick", js.undefined)
    
    @scala.inline
    def setPopupContent(value: String): Self = this.set("popupContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupContent: Self = this.set("popupContent", js.undefined)
    
    @scala.inline
    def setPopupName(value: String): Self = this.set("popupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopupName: Self = this.set("popupName", js.undefined)
    
    @scala.inline
    def setStripIndex(value: Double): Self = this.set("stripIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripIndex: Self = this.set("stripIndex", js.undefined)
  }
}
