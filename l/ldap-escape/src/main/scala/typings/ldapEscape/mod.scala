package typings.ldapEscape

import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ldap-escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def dn(
    TemplateStringsArray: TemplateStringsArray,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param str because its type Array<string> | Array<number> is not an array type */ str: js.Array[Double | String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("dn")(TemplateStringsArray.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def filter(
    TemplateStringsArray: TemplateStringsArray,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param str because its type Array<string> | Array<number> is not an array type */ str: js.Array[Double | String]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("filter")(TemplateStringsArray.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[String]
}
