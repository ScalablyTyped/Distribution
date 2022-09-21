package typings.jpm

import typings.jpm.jpmStrings.html
import typings.jpm.jpmStrings.image
import typings.jpm.jpmStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardMod {
  
  @JSImport("sdk/clipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[String]
  inline def get(datatype: text | html | image): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(datatype.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def set(data: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def set(data: String, datatype: text | html | image): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(data.asInstanceOf[js.Any], datatype.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
