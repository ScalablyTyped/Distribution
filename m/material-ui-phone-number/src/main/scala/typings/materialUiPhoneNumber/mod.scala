package typings.materialUiPhoneNumber

import typings.react.mod.Component
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("material-ui-phone-number", JSImport.Default)
  @js.native
  open class default ()
    extends Component[MaterialUiPhoneNumberProps, js.Object, Any]
  
  type MaterialUiPhoneNumber = Component[MaterialUiPhoneNumberProps, js.Object, Any]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @material-ui/core.@material-ui/core/TextField/TextField.TextFieldProps, 'onChange'> ]: @material-ui/core.@material-ui/core/TextField/TextField.TextFieldProps[P]} */ trait MaterialUiPhoneNumberProps extends StObject {
    
    var autoFormat: js.UndefOr[Boolean] = js.undefined
    
    var classes: js.UndefOr[Record[String, Any]] = js.undefined
    
    var countryCodeEditable: js.UndefOr[Boolean] = js.undefined
    
    var defaultCountry: js.UndefOr[String] = js.undefined
    
    var disableAreaCodes: js.UndefOr[Boolean] = js.undefined
    
    var disableCountryCode: js.UndefOr[Boolean] = js.undefined
    
    var disableDropdown: js.UndefOr[Boolean] = js.undefined
    
    var dropdownClass: js.UndefOr[String] = js.undefined
    
    var enableLongNumbers: js.UndefOr[Boolean] = js.undefined
    
    var excludeCountries: js.UndefOr[js.Array[String]] = js.undefined
    
    var inputClass: js.UndefOr[String] = js.undefined
    
    /**
      * @param value - Holds current value of `MuiPhoneInput`.
      */
    var onChange: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var onlyCountries: js.UndefOr[js.Array[String]] = js.undefined
    
    var preferredCountries: js.UndefOr[js.Array[String]] = js.undefined
    
    var ref: js.UndefOr[Any] = js.undefined
  }
  object MaterialUiPhoneNumberProps {
    
    inline def apply(): MaterialUiPhoneNumberProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaterialUiPhoneNumberProps]
    }
    
    extension [Self <: MaterialUiPhoneNumberProps](x: Self) {
      
      inline def setAutoFormat(value: Boolean): Self = StObject.set(x, "autoFormat", value.asInstanceOf[js.Any])
      
      inline def setAutoFormatUndefined: Self = StObject.set(x, "autoFormat", js.undefined)
      
      inline def setClasses(value: Record[String, Any]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setCountryCodeEditable(value: Boolean): Self = StObject.set(x, "countryCodeEditable", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeEditableUndefined: Self = StObject.set(x, "countryCodeEditable", js.undefined)
      
      inline def setDefaultCountry(value: String): Self = StObject.set(x, "defaultCountry", value.asInstanceOf[js.Any])
      
      inline def setDefaultCountryUndefined: Self = StObject.set(x, "defaultCountry", js.undefined)
      
      inline def setDisableAreaCodes(value: Boolean): Self = StObject.set(x, "disableAreaCodes", value.asInstanceOf[js.Any])
      
      inline def setDisableAreaCodesUndefined: Self = StObject.set(x, "disableAreaCodes", js.undefined)
      
      inline def setDisableCountryCode(value: Boolean): Self = StObject.set(x, "disableCountryCode", value.asInstanceOf[js.Any])
      
      inline def setDisableCountryCodeUndefined: Self = StObject.set(x, "disableCountryCode", js.undefined)
      
      inline def setDisableDropdown(value: Boolean): Self = StObject.set(x, "disableDropdown", value.asInstanceOf[js.Any])
      
      inline def setDisableDropdownUndefined: Self = StObject.set(x, "disableDropdown", js.undefined)
      
      inline def setDropdownClass(value: String): Self = StObject.set(x, "dropdownClass", value.asInstanceOf[js.Any])
      
      inline def setDropdownClassUndefined: Self = StObject.set(x, "dropdownClass", js.undefined)
      
      inline def setEnableLongNumbers(value: Boolean): Self = StObject.set(x, "enableLongNumbers", value.asInstanceOf[js.Any])
      
      inline def setEnableLongNumbersUndefined: Self = StObject.set(x, "enableLongNumbers", js.undefined)
      
      inline def setExcludeCountries(value: js.Array[String]): Self = StObject.set(x, "excludeCountries", value.asInstanceOf[js.Any])
      
      inline def setExcludeCountriesUndefined: Self = StObject.set(x, "excludeCountries", js.undefined)
      
      inline def setExcludeCountriesVarargs(value: String*): Self = StObject.set(x, "excludeCountries", js.Array(value*))
      
      inline def setInputClass(value: String): Self = StObject.set(x, "inputClass", value.asInstanceOf[js.Any])
      
      inline def setInputClassUndefined: Self = StObject.set(x, "inputClass", js.undefined)
      
      inline def setOnChange(value: /* value */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnlyCountries(value: js.Array[String]): Self = StObject.set(x, "onlyCountries", value.asInstanceOf[js.Any])
      
      inline def setOnlyCountriesUndefined: Self = StObject.set(x, "onlyCountries", js.undefined)
      
      inline def setOnlyCountriesVarargs(value: String*): Self = StObject.set(x, "onlyCountries", js.Array(value*))
      
      inline def setPreferredCountries(value: js.Array[String]): Self = StObject.set(x, "preferredCountries", value.asInstanceOf[js.Any])
      
      inline def setPreferredCountriesUndefined: Self = StObject.set(x, "preferredCountries", js.undefined)
      
      inline def setPreferredCountriesVarargs(value: String*): Self = StObject.set(x, "preferredCountries", js.Array(value*))
      
      inline def setRef(value: Any): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
