package typings.logkitty

import typings.logkitty.buildErrorsMod.CodeError
import typings.logkitty.buildTypesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFormattersMod {
  
  @JSImport("logkitty/build/formatters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatEntry(entry: Entry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def formatError(error: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatError(error: CodeError): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(error.asInstanceOf[js.Any]).asInstanceOf[String]
}
