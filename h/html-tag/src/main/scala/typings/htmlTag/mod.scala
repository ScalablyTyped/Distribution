package typings.htmlTag

import typings.htmlTag.htmlTagBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(name: String): String = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(name: String, attribs: Unit, text: String): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(name: String, attribs: Unit, text: `false`): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(name: String, attribs: Record[String, String | Double | Boolean]): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(name: String, attribs: Record[String, String | Double | Boolean], text: String): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(name: String, attribs: Record[String, String | Double | Boolean], text: `false`): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(name: String, text: String): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(name: String, text: `false`): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("html-tag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
