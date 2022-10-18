package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersStringMod {
  
  @JSImport("handsontable/helpers/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equalsIgnoreCase(strings: String*): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equalsIgnoreCase")(strings.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Boolean]
  
  inline def isPercentValue(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPercentValue")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def randomString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")().asInstanceOf[String]
  
  inline def sanitize(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sanitize(string: String, options: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitize")(string.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stripTags(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripTags")(string.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def substitute(template: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("substitute")(template.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def substitute(template: String, variables: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("substitute")(template.asInstanceOf[js.Any], variables.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toUpperCaseFirst(string: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUpperCaseFirst")(string.asInstanceOf[js.Any]).asInstanceOf[String]
}
