package typings.importMetaResolve

import typings.importMetaResolve.anon.ParentURL
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getFormatMod {
  
  @JSImport("import-meta-resolve/lib/get-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultGetFormat(url: String, context: ParentURL): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetFormat")(url.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  inline def defaultGetFormatWithoutErrors(url: URL_, context: ParentURL): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultGetFormatWithoutErrors")(url.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  
  type ProtocolHandler = js.Function3[/* parsed */ URL_, /* context */ ParentURL, /* ignoreErrors */ Boolean, String | Null]
}
