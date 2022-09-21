package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mixedMod {
  
  @JSImport("handsontable/helpers/mixed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDefined(variable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(variable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(variable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(variable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRegExp(variable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRegExp")(variable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isUndefined(variable: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(variable.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
}
