package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.settingsMod.CellProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsBaseMod {
  
  @JSImport("handsontable/validators/base", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseValidator(value: CellValue, callback: js.Function1[/* valid */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("baseValidator")(value.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type BaseValidator_ = js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ]
}
