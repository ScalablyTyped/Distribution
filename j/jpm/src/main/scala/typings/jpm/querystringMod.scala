package typings.jpm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object querystringMod {
  
  @JSImport("sdk/querystring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def escape(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(querystring: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(querystring.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def parse(querystring: String, separator: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(querystring.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parse(querystring: String, separator: String, assignment: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(querystring.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], assignment.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def parse(querystring: String, separator: Unit, assignment: String): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(querystring.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], assignment.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def stringify(`object`: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(`object`: js.Object, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(`object`: js.Object, separator: String, assignment: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], assignment.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def stringify(`object`: js.Object, separator: Unit, assignment: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`object`.asInstanceOf[js.Any], separator.asInstanceOf[js.Any], assignment.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unescape(query: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescape")(query.asInstanceOf[js.Any]).asInstanceOf[String]
}
