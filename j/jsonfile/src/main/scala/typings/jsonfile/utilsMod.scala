package typings.jsonfile

import typings.jsonfile.anon.FinalEOL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("jsonfile/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stringify(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(obj: Any, options: FinalEOL): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stripBom(content: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripBom")(content.asInstanceOf[js.Any]).asInstanceOf[String]
}
