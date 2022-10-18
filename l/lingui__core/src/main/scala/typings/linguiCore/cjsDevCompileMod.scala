package typings.linguiCore

import typings.linguiCore.cjsI18nMod.CompiledMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsDevCompileMod {
  
  @JSImport("@lingui/core/cjs/dev/compile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(message: String): CompiledMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(message.asInstanceOf[js.Any]).asInstanceOf[CompiledMessage]
}
