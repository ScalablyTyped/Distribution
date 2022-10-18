package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.handsontableStrings.numeric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsNumericValidatorMod {
  
  @JSImport("handsontable/validators/numericValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/validators/numericValidator", "VALIDATOR_TYPE")
  @js.native
  val VALIDATOR_TYPE: numeric = js.native
  
  inline def numericValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("numericValidator")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
