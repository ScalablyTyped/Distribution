package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.handsontableStrings.autocomplete
import typings.handsontable.handsontableStrings.date
import typings.handsontable.handsontableStrings.numeric
import typings.handsontable.handsontableStrings.time
import typings.handsontable.settingsMod.CellProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsMod {
  
  @JSImport("handsontable/validators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/validators", "AUTOCOMPLETE_VALIDATOR")
  @js.native
  val AUTOCOMPLETE_VALIDATOR: autocomplete = js.native
  
  @JSImport("handsontable/validators", "DATE_VALIDATOR")
  @js.native
  val DATE_VALIDATOR: date = js.native
  
  @JSImport("handsontable/validators", "NUMERIC_VALIDATOR")
  @js.native
  val NUMERIC_VALIDATOR: numeric = js.native
  
  @JSImport("handsontable/validators", "TIME_VALIDATOR")
  @js.native
  val TIME_VALIDATOR: time = js.native
  
  inline def autocompleteValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autocompleteValidator")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dateValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dateValidator")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def numericValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("numericValidator")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerAllValidators(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAllValidators")().asInstanceOf[Unit]
  
  inline def timeValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timeValidator")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.handsontable.handsontableStrings.autocomplete
    - typings.handsontable.handsontableStrings.date
    - typings.handsontable.handsontableStrings.numeric
    - typings.handsontable.handsontableStrings.time
  */
  trait ValidatorType extends StObject
  
  trait Validators extends StObject {
    
    def autocomplete(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit
    @JSName("autocomplete")
    var autocomplete_Original: js.ThisFunction2[
        /* this */ CellProperties, 
        /* value */ CellValue, 
        /* callback */ js.Function1[/* valid */ Boolean, Unit], 
        Unit
      ]
    
    def date(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit
    @JSName("date")
    var date_Original: js.ThisFunction2[
        /* this */ CellProperties, 
        /* value */ CellValue, 
        /* callback */ js.Function1[/* valid */ Boolean, Unit], 
        Unit
      ]
    
    def numeric(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit
    @JSName("numeric")
    var numeric_Original: js.ThisFunction2[
        /* this */ CellProperties, 
        /* value */ CellValue, 
        /* callback */ js.Function1[/* valid */ Boolean, Unit], 
        Unit
      ]
    
    def time(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit
    @JSName("time")
    var time_Original: js.ThisFunction2[
        /* this */ CellProperties, 
        /* value */ CellValue, 
        /* callback */ js.Function1[/* valid */ Boolean, Unit], 
        Unit
      ]
  }
  object Validators {
    
    inline def apply(
      autocomplete: js.ThisFunction2[
          /* this */ CellProperties, 
          /* value */ CellValue, 
          /* callback */ js.Function1[/* valid */ Boolean, Unit], 
          Unit
        ],
      date: js.ThisFunction2[
          /* this */ CellProperties, 
          /* value */ CellValue, 
          /* callback */ js.Function1[/* valid */ Boolean, Unit], 
          Unit
        ],
      numeric: js.ThisFunction2[
          /* this */ CellProperties, 
          /* value */ CellValue, 
          /* callback */ js.Function1[/* valid */ Boolean, Unit], 
          Unit
        ],
      time: js.ThisFunction2[
          /* this */ CellProperties, 
          /* value */ CellValue, 
          /* callback */ js.Function1[/* valid */ Boolean, Unit], 
          Unit
        ]
    ): Validators = {
      val __obj = js.Dynamic.literal(autocomplete = autocomplete.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], numeric = numeric.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Validators]
    }
    
    extension [Self <: Validators](x: Self) {
      
      inline def setAutocomplete(
        value: js.ThisFunction2[
              /* this */ CellProperties, 
              /* value */ CellValue, 
              /* callback */ js.Function1[/* valid */ Boolean, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setDate(
        value: js.ThisFunction2[
              /* this */ CellProperties, 
              /* value */ CellValue, 
              /* callback */ js.Function1[/* valid */ Boolean, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setNumeric(
        value: js.ThisFunction2[
              /* this */ CellProperties, 
              /* value */ CellValue, 
              /* callback */ js.Function1[/* valid */ Boolean, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
      
      inline def setTime(
        value: js.ThisFunction2[
              /* this */ CellProperties, 
              /* value */ CellValue, 
              /* callback */ js.Function1[/* valid */ Boolean, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
