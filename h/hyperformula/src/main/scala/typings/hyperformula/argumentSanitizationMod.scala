package typings.hyperformula

import typings.hyperformula.anon.Name
import typings.hyperformula.configMod.ConfigParamsList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argumentSanitizationMod {
  
  @JSImport("hyperformula/typings/ArgumentSanitization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def configCheckIfParametersNotInConflict(params: Name*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configCheckIfParametersNotInConflict")(params.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def configValueFromParam(inputValue: Any, expectedType: String, paramName: ConfigParamsList): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("configValueFromParam")(inputValue.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any], paramName.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def configValueFromParam(inputValue: Any, expectedType: js.Array[String], paramName: ConfigParamsList): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("configValueFromParam")(inputValue.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any], paramName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def configValueFromParamCheck(
    inputValue: Any,
    typeCheck: js.Function1[/* object */ Any, Boolean],
    expectedType: String,
    paramName: ConfigParamsList
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("configValueFromParamCheck")(inputValue.asInstanceOf[js.Any], typeCheck.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any], paramName.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def validateArgToType(inputValue: Any, expectedType: String, paramName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateArgToType")(inputValue.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any], paramName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateNumberToBeAtLeast(value: Double, paramName: String, minimum: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNumberToBeAtLeast")(value.asInstanceOf[js.Any], paramName.asInstanceOf[js.Any], minimum.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateNumberToBeAtMost(value: Double, paramName: String, maximum: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateNumberToBeAtMost")(value.asInstanceOf[js.Any], paramName.asInstanceOf[js.Any], maximum.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
