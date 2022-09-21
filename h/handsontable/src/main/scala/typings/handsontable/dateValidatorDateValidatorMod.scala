package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.handsontableStrings.date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateValidatorDateValidatorMod {
  
  @JSImport("handsontable/validators/dateValidator/dateValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/validators/dateValidator/dateValidator", "VALIDATOR_TYPE")
  @js.native
  val VALIDATOR_TYPE: date = js.native
  
  inline def dateValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dateValidator")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
