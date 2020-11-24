package typings.jointjs.mod.shapes.standard

import typings.jointjs.mod.attributes.SVGAttributes
import typings.jointjs.mod.attributes.SVGRectAttributes
import typings.jointjs.mod.attributes.SVGTextAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderedRectangleSelectors extends js.Object {
  
  var body: js.UndefOr[SVGRectAttributes] = js.native
  
  var bodyText: js.UndefOr[SVGTextAttributes] = js.native
  
  var header: js.UndefOr[SVGRectAttributes] = js.native
  
  var headerText: js.UndefOr[SVGTextAttributes] = js.native
  
  var root: js.UndefOr[SVGAttributes] = js.native
}
object HeaderedRectangleSelectors {
  
  @scala.inline
  def apply(): HeaderedRectangleSelectors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeaderedRectangleSelectors]
  }
  
  @scala.inline
  implicit class HeaderedRectangleSelectorsOps[Self <: HeaderedRectangleSelectors] (val x: Self) extends AnyVal {
    
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
    def setBody(value: SVGRectAttributes): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyText(value: SVGTextAttributes): Self = this.set("bodyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodyText: Self = this.set("bodyText", js.undefined)
    
    @scala.inline
    def setHeader(value: SVGRectAttributes): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setHeaderText(value: SVGTextAttributes): Self = this.set("headerText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderText: Self = this.set("headerText", js.undefined)
    
    @scala.inline
    def setRoot(value: SVGAttributes): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
