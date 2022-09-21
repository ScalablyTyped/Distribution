package typings.handsontable

import typings.handsontable.commonMod.CellValue
import typings.handsontable.handsontableStrings.autocomplete
import typings.handsontable.handsontableStrings.date
import typings.handsontable.handsontableStrings.numeric
import typings.handsontable.handsontableStrings.time
import typings.handsontable.settingsMod.CellProperties
import typings.handsontable.validatorsBaseMod.BaseValidator_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorsRegistryMod {
  
  @JSImport("handsontable/validators/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRegisteredValidatorNames(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredValidatorNames")().asInstanceOf[js.Array[String]]
  
  inline def getRegisteredValidators(): js.Array[BaseValidator_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredValidators")().asInstanceOf[js.Array[BaseValidator_]]
  
  inline def getValidator(name: String): BaseValidator_ = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidator")(name.asInstanceOf[js.Any]).asInstanceOf[BaseValidator_]
  
  inline def getValidator_autocomplete(name: autocomplete): js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidator")(name.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ]]
  
  inline def getValidator_date(name: date): js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidator")(name.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ]]
  
  inline def getValidator_numeric(name: numeric): js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidator")(name.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ]]
  
  inline def getValidator_time(name: time): js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidator")(name.asInstanceOf[js.Any]).asInstanceOf[js.ThisFunction2[
    /* this */ CellProperties, 
    /* value */ CellValue, 
    /* callback */ js.Function1[/* valid */ Boolean, Unit], 
    Unit
  ]]
  
  inline def hasValidator(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasValidator")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def registerValidator(name: String, validator: BaseValidator_): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerValidator")(name.asInstanceOf[js.Any], validator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerValidator(validator: BaseValidator_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerValidator")(validator.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
