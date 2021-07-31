package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of the Page.  The page will inherit properties from the
  * parent page. Depending on the page type the hierarchy is defined in either
  * SlideProperties or LayoutProperties.
  */
trait SchemaPageProperties extends StObject {
  
  /**
    * The color scheme of the page. If unset, the color scheme is inherited
    * from a parent page. If the page has no parent, the color scheme uses a
    * default Slides color scheme. This field is read-only.
    */
  var colorScheme: js.UndefOr[SchemaColorScheme] = js.undefined
  
  /**
    * The background fill of the page. If unset, the background fill is
    * inherited from a parent page if it exists. If the page has no parent,
    * then the background fill defaults to the corresponding fill in the Slides
    * editor.
    */
  var pageBackgroundFill: js.UndefOr[SchemaPageBackgroundFill] = js.undefined
}
object SchemaPageProperties {
  
  @scala.inline
  def apply(): SchemaPageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPageProperties]
  }
  
  @scala.inline
  implicit class SchemaPagePropertiesMutableBuilder[Self <: SchemaPageProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorScheme(value: SchemaColorScheme): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
    
    @scala.inline
    def setPageBackgroundFill(value: SchemaPageBackgroundFill): Self = StObject.set(x, "pageBackgroundFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageBackgroundFillUndefined: Self = StObject.set(x, "pageBackgroundFill", js.undefined)
  }
}
