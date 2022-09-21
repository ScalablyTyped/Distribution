package typings.json2xml

import typings.json2xml.anon.Attributeskey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(json: Any): String = ^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(json: Any, opts: Attributeskey): String = (^.asInstanceOf[js.Dynamic].apply(json.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("json2xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
