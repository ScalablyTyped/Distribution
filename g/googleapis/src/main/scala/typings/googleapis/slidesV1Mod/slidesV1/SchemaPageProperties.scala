package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the Page.  The page will inherit properties from the
  * parent page. Depending on the page type the hierarchy is defined in either
  * SlideProperties or LayoutProperties.
  */
@js.native
trait SchemaPageProperties extends js.Object {
  
  /**
    * The color scheme of the page. If unset, the color scheme is inherited
    * from a parent page. If the page has no parent, the color scheme uses a
    * default Slides color scheme. This field is read-only.
    */
  var colorScheme: js.UndefOr[SchemaColorScheme] = js.native
  
  /**
    * The background fill of the page. If unset, the background fill is
    * inherited from a parent page if it exists. If the page has no parent,
    * then the background fill defaults to the corresponding fill in the Slides
    * editor.
    */
  var pageBackgroundFill: js.UndefOr[SchemaPageBackgroundFill] = js.native
}
object SchemaPageProperties {
  
  @scala.inline
  def apply(): SchemaPageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageProperties]
  }
  
  @scala.inline
  implicit class SchemaPagePropertiesOps[Self <: SchemaPageProperties] (val x: Self) extends AnyVal {
    
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
    def setColorScheme(value: SchemaColorScheme): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorScheme: Self = this.set("colorScheme", js.undefined)
    
    @scala.inline
    def setPageBackgroundFill(value: SchemaPageBackgroundFill): Self = this.set("pageBackgroundFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageBackgroundFill: Self = this.set("pageBackgroundFill", js.undefined)
  }
}
