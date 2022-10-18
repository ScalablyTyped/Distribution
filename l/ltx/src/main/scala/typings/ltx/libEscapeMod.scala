package typings.ltx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEscapeMod {
  
  @JSImport("ltx/lib/escape", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escapeXML(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXML")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeXMLText(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeXMLText")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unescapeXML(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeXML")(s.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def unescapeXMLText(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeXMLText")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
