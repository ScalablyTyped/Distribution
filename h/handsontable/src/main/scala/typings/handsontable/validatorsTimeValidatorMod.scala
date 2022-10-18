package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.handsontableStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsTimeValidatorMod {
  
  @JSImport("handsontable/validators/timeValidator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("handsontable/validators/timeValidator", "VALIDATOR_TYPE")
  @js.native
  val VALIDATOR_TYPE: time = js.native
  
  inline def timeValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("timeValidator")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
