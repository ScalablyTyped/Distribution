package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A mask that indicates which of the fields on the base EmbeddedObjectBorder
  * have been changed in this suggestion. For any field set to true, there is a
  * new suggested value.
  */
@js.native
trait SchemaEmbeddedObjectBorderSuggestionState extends js.Object {
  
  /**
    * Indicates if there was a suggested change to color.
    */
  var colorSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to dash_style.
    */
  var dashStyleSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to property_state.
    */
  var propertyStateSuggested: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if there was a suggested change to width.
    */
  var widthSuggested: js.UndefOr[Boolean] = js.native
}
object SchemaEmbeddedObjectBorderSuggestionState {
  
  @scala.inline
  def apply(): SchemaEmbeddedObjectBorderSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEmbeddedObjectBorderSuggestionState]
  }
  
  @scala.inline
  implicit class SchemaEmbeddedObjectBorderSuggestionStateOps[Self <: SchemaEmbeddedObjectBorderSuggestionState] (val x: Self) extends AnyVal {
    
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
    def setColorSuggested(value: Boolean): Self = this.set("colorSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSuggested: Self = this.set("colorSuggested", js.undefined)
    
    @scala.inline
    def setDashStyleSuggested(value: Boolean): Self = this.set("dashStyleSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDashStyleSuggested: Self = this.set("dashStyleSuggested", js.undefined)
    
    @scala.inline
    def setPropertyStateSuggested(value: Boolean): Self = this.set("propertyStateSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyStateSuggested: Self = this.set("propertyStateSuggested", js.undefined)
    
    @scala.inline
    def setWidthSuggested(value: Boolean): Self = this.set("widthSuggested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidthSuggested: Self = this.set("widthSuggested", js.undefined)
  }
}
