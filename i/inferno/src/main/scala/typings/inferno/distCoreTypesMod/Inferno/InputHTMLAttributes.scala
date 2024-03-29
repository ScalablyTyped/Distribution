package typings.inferno.distCoreTypesMod.Inferno

import typings.inferno.infernoStrings.done
import typings.inferno.infernoStrings.enter
import typings.inferno.infernoStrings.environment
import typings.inferno.infernoStrings.go
import typings.inferno.infernoStrings.next
import typings.inferno.infernoStrings.previous
import typings.inferno.infernoStrings.search
import typings.inferno.infernoStrings.send
import typings.inferno.infernoStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var accept: js.UndefOr[String | Null] = js.undefined
  
  var alt: js.UndefOr[String | Null] = js.undefined
  
  var autoComplete: js.UndefOr[String | Null] = js.undefined
  
  var autoFocus: js.UndefOr[Boolean | Null] = js.undefined
  
  var capture: js.UndefOr[Boolean | user | environment | Null] = js.undefined
  
  var checked: js.UndefOr[Boolean | Null] = js.undefined
  
  var crossOrigin: js.UndefOr[String | Null] = js.undefined
  
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send | Null] = js.undefined
  
  var form: js.UndefOr[String | Null] = js.undefined
  
  var formAction: js.UndefOr[String | Null] = js.undefined
  
  var formEncType: js.UndefOr[String | Null] = js.undefined
  
  var formMethod: js.UndefOr[String | Null] = js.undefined
  
  var formNoValidate: js.UndefOr[Boolean | Null] = js.undefined
  
  var formTarget: js.UndefOr[String | Null] = js.undefined
  
  var height: js.UndefOr[Double | String | Null] = js.undefined
  
  var indeterminate: js.UndefOr[Boolean | Null] = js.undefined
  
  var list: js.UndefOr[String | Null] = js.undefined
  
  var max: js.UndefOr[Double | String | Null] = js.undefined
  
  var maxLength: js.UndefOr[Double | Null] = js.undefined
  
  var min: js.UndefOr[Double | String | Null] = js.undefined
  
  var minLength: js.UndefOr[Double | Null] = js.undefined
  
  var multiple: js.UndefOr[Boolean | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var pattern: js.UndefOr[String | Null] = js.undefined
  
  var readOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  var required: js.UndefOr[Boolean | Null] = js.undefined
  
  var size: js.UndefOr[Double | Null] = js.undefined
  
  var src: js.UndefOr[String | Null] = js.undefined
  
  var step: js.UndefOr[Double | String | Null] = js.undefined
  
  var `type`: js.UndefOr[HTMLInputTypeAttribute | Null] = js.undefined
  
  var value: js.UndefOr[String | js.Array[String] | Double | Null] = js.undefined
  
  var width: js.UndefOr[Double | String | Null] = js.undefined
}
object InputHTMLAttributes {
  
  inline def apply[T](): InputHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputHTMLAttributes[?], T] (val x: Self & InputHTMLAttributes[T]) extends AnyVal {
    
    inline def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
    
    inline def setAcceptNull: Self = StObject.set(x, "accept", null)
    
    inline def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltNull: Self = StObject.set(x, "alt", null)
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteNull: Self = StObject.set(x, "autoComplete", null)
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    
    inline def setAutoFocusNull: Self = StObject.set(x, "autoFocus", null)
    
    inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
    
    inline def setCapture(value: Boolean | user | environment): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureNull: Self = StObject.set(x, "capture", null)
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setCheckedNull: Self = StObject.set(x, "checked", null)
    
    inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
    
    inline def setEnterKeyHintNull: Self = StObject.set(x, "enterKeyHint", null)
    
    inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
    
    inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
    
    inline def setFormActionNull: Self = StObject.set(x, "formAction", null)
    
    inline def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
    
    inline def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
    
    inline def setFormEncTypeNull: Self = StObject.set(x, "formEncType", null)
    
    inline def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
    
    inline def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
    
    inline def setFormMethodNull: Self = StObject.set(x, "formMethod", null)
    
    inline def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
    
    inline def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
    
    inline def setFormNoValidateNull: Self = StObject.set(x, "formNoValidate", null)
    
    inline def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
    
    inline def setFormNull: Self = StObject.set(x, "form", null)
    
    inline def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
    
    inline def setFormTargetNull: Self = StObject.set(x, "formTarget", null)
    
    inline def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    inline def setIndeterminateNull: Self = StObject.set(x, "indeterminate", null)
    
    inline def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    inline def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListNull: Self = StObject.set(x, "list", null)
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthNull: Self = StObject.set(x, "maxLength", null)
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthNull: Self = StObject.set(x, "minLength", null)
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleNull: Self = StObject.set(x, "multiple", null)
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternNull: Self = StObject.set(x, "pattern", null)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyNull: Self = StObject.set(x, "readOnly", null)
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcNull: Self = StObject.set(x, "src", null)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepNull: Self = StObject.set(x, "step", null)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setType(value: HTMLInputTypeAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
