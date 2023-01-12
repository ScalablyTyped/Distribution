package typings.kendoUi.kendo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stepper {
  
  trait Step
    extends StObject
       with Class {
    
    def deselect(): Unit
    
    def enable(value: Boolean): Unit
    
    def getEnabled(): Boolean
    
    def getIndex(): Double
    
    def getSelectable(): Boolean
    
    def getSelected(): Boolean
    
    var options: StepOptions
    
    def select(): Unit
    
    def setPrevious(value: Boolean): Unit
    
    def setValid(value: Boolean): Unit
  }
  object Step {
    
    inline def apply(
      deselect: () => Unit,
      enable: Boolean => Unit,
      getEnabled: () => Boolean,
      getIndex: () => Double,
      getSelectable: () => Boolean,
      getSelected: () => Boolean,
      options: StepOptions,
      select: () => Unit,
      setPrevious: Boolean => Unit,
      setValid: Boolean => Unit
    ): Step = {
      val __obj = js.Dynamic.literal(deselect = js.Any.fromFunction0(deselect), enable = js.Any.fromFunction1(enable), getEnabled = js.Any.fromFunction0(getEnabled), getIndex = js.Any.fromFunction0(getIndex), getSelectable = js.Any.fromFunction0(getSelectable), getSelected = js.Any.fromFunction0(getSelected), options = options.asInstanceOf[js.Any], select = js.Any.fromFunction0(select), setPrevious = js.Any.fromFunction1(setPrevious), setValid = js.Any.fromFunction1(setValid))
      __obj.asInstanceOf[Step]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
      
      inline def setDeselect(value: () => Unit): Self = StObject.set(x, "deselect", js.Any.fromFunction0(value))
      
      inline def setEnable(value: Boolean => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
      
      inline def setGetEnabled(value: () => Boolean): Self = StObject.set(x, "getEnabled", js.Any.fromFunction0(value))
      
      inline def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
      
      inline def setGetSelectable(value: () => Boolean): Self = StObject.set(x, "getSelectable", js.Any.fromFunction0(value))
      
      inline def setGetSelected(value: () => Boolean): Self = StObject.set(x, "getSelected", js.Any.fromFunction0(value))
      
      inline def setOptions(value: StepOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSelect(value: () => Unit): Self = StObject.set(x, "select", js.Any.fromFunction0(value))
      
      inline def setSetPrevious(value: Boolean => Unit): Self = StObject.set(x, "setPrevious", js.Any.fromFunction1(value))
      
      inline def setSetValid(value: Boolean => Unit): Self = StObject.set(x, "setValid", js.Any.fromFunction1(value))
    }
  }
  
  trait StepOptions extends StObject {
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Boolean] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var iconTemplate: js.UndefOr[String | js.Function] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var indicatorVisible: js.UndefOr[Boolean] = js.undefined
    
    var isFirstStep: js.UndefOr[Boolean] = js.undefined
    
    var isLastStep: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var labelVisible: js.UndefOr[Boolean] = js.undefined
    
    var previous: js.UndefOr[Boolean] = js.undefined
    
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var successIcon: js.UndefOr[String] = js.undefined
  }
  object StepOptions {
    
    inline def apply(): StepOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StepOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconTemplate(value: String | js.Function): Self = StObject.set(x, "iconTemplate", value.asInstanceOf[js.Any])
      
      inline def setIconTemplateUndefined: Self = StObject.set(x, "iconTemplate", js.undefined)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIndicatorVisible(value: Boolean): Self = StObject.set(x, "indicatorVisible", value.asInstanceOf[js.Any])
      
      inline def setIndicatorVisibleUndefined: Self = StObject.set(x, "indicatorVisible", js.undefined)
      
      inline def setIsFirstStep(value: Boolean): Self = StObject.set(x, "isFirstStep", value.asInstanceOf[js.Any])
      
      inline def setIsFirstStepUndefined: Self = StObject.set(x, "isFirstStep", js.undefined)
      
      inline def setIsLastStep(value: Boolean): Self = StObject.set(x, "isLastStep", value.asInstanceOf[js.Any])
      
      inline def setIsLastStepUndefined: Self = StObject.set(x, "isLastStep", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVisible(value: Boolean): Self = StObject.set(x, "labelVisible", value.asInstanceOf[js.Any])
      
      inline def setLabelVisibleUndefined: Self = StObject.set(x, "labelVisible", js.undefined)
      
      inline def setPrevious(value: Boolean): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSuccessIcon(value: String): Self = StObject.set(x, "successIcon", value.asInstanceOf[js.Any])
      
      inline def setSuccessIconUndefined: Self = StObject.set(x, "successIcon", js.undefined)
    }
  }
}
