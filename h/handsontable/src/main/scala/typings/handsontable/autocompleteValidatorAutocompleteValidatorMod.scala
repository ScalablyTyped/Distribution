package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.handsontableStrings.autocomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autocompleteValidatorAutocompleteValidatorMod {
  
  @JSImport("handsontable/validators/autocompleteValidator/autocompleteValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/validators/autocompleteValidator/autocompleteValidator", "VALIDATOR_TYPE")
  @js.native
  val VALIDATOR_TYPE: autocomplete = js.native
  
  inline def autocompleteValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autocompleteValidator")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
