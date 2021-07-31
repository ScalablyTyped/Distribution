package typings.jsonStringifyPrettyCompact

import typings.jsonStringifyPrettyCompact.anon.Indent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(`object`: js.Any): String = ^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(`object`: js.Any, options: Indent): String = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("json-stringify-pretty-compact", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
