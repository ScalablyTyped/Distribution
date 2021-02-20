package typings.jqueryEditableSelect

import typings.jqueryEditableSelect.jqueryEditableSelectStrings.default
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.fade
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.fast
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.focus
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.manual
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.slide
import typings.jqueryEditableSelect.jqueryEditableSelectStrings.slow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryEditableSelect {
  
  @js.native
  trait EditableSelectOptions extends StObject {
    
    /**
      * Where to append the dropdown list in the DOM.
      */
    var appendTo: js.UndefOr[String | JQuery] = js.native
    
    /**
      * Duration of the easings (in milliseconds).
      */
    var duration: js.UndefOr[Double | fast | slow] = js.native
    
    /**
      * Easing used for showing and hiding the dropdown list.
      */
    var effects: js.UndefOr[default | slide | fade] = js.native
    
    /**
      * Filter (or not) items in list while typing.
      */
    var filter: js.UndefOr[Boolean] = js.native
    
    /**
      * How dropdown list is triggered.
      */
    var trigger: js.UndefOr[focus | manual] = js.native
  }
  object EditableSelectOptions {
    
    @scala.inline
    def apply(): EditableSelectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableSelectOptions]
    }
    
    @scala.inline
    implicit class EditableSelectOptionsMutableBuilder[Self <: EditableSelectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(value: String | JQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setDuration(value: Double | fast | slow): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEffects(value: default | slide | fade): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      @scala.inline
      def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setTrigger(value: focus | manual): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
