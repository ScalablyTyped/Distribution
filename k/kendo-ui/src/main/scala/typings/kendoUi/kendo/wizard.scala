package typings.kendoUi.kendo

import typings.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wizard {
  
  trait Step
    extends StObject
       with Class {
    
    def buttons(): js.Array[js.Any]
    
    def load(): Unit
    
    var options: WizardStepOptions
    
    def resetButtons(): Unit
  }
  object Step {
    
    @scala.inline
    def apply(
      buttons: () => js.Array[js.Any],
      load: () => Unit,
      options: WizardStepOptions,
      resetButtons: () => Unit
    ): Step = {
      val __obj = js.Dynamic.literal(buttons = js.Any.fromFunction0(buttons), load = js.Any.fromFunction0(load), options = options.asInstanceOf[js.Any], resetButtons = js.Any.fromFunction0(resetButtons))
      __obj.asInstanceOf[Step]
    }
    
    @scala.inline
    implicit class StepMutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtons(value: () => js.Array[js.Any]): Self = StObject.set(x, "buttons", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOptions(value: WizardStepOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetButtons(value: () => Unit): Self = StObject.set(x, "resetButtons", js.Any.fromFunction0(value))
    }
  }
  
  trait WizardStepOptions extends StObject {
    
    var actionBar: js.UndefOr[Boolean] = js.undefined
    
    var buttons: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentId: js.UndefOr[String] = js.undefined
    
    var contentUrl: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var form: js.UndefOr[js.Any] = js.undefined
    
    var formTag: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var markupContainer: js.UndefOr[JQuery] = js.undefined
    
    var messages: js.UndefOr[js.Any] = js.undefined
    
    var pager: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var totalSteps: Double
    
    var wizardId: js.UndefOr[String] = js.undefined
  }
  object WizardStepOptions {
    
    @scala.inline
    def apply(totalSteps: Double): WizardStepOptions = {
      val __obj = js.Dynamic.literal(totalSteps = totalSteps.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizardStepOptions]
    }
    
    @scala.inline
    implicit class WizardStepOptionsMutableBuilder[Self <: WizardStepOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionBar(value: Boolean): Self = StObject.set(x, "actionBar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionBarUndefined: Self = StObject.set(x, "actionBar", js.undefined)
      
      @scala.inline
      def setButtons(value: js.Array[js.Any]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setButtonsVarargs(value: js.Any*): Self = StObject.set(x, "buttons", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setForm(value: js.Any): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormTag(value: String): Self = StObject.set(x, "formTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormTagUndefined: Self = StObject.set(x, "formTag", js.undefined)
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setMarkupContainer(value: JQuery): Self = StObject.set(x, "markupContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkupContainerUndefined: Self = StObject.set(x, "markupContainer", js.undefined)
      
      @scala.inline
      def setMessages(value: js.Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setPager(value: Boolean): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTotalSteps(value: Double): Self = StObject.set(x, "totalSteps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWizardId(value: String): Self = StObject.set(x, "wizardId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWizardIdUndefined: Self = StObject.set(x, "wizardId", js.undefined)
    }
  }
}
