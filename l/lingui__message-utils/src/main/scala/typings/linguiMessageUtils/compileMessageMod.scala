package typings.linguiMessageUtils

import typings.linguiMessageUtils.distCompileMessageMod.CompiledMessage
import typings.linguiMessageUtils.distCompileMessageMod.MapTextFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object compileMessageMod {
  
  @JSImport("@lingui/message-utils/compileMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileMessage(message: String): CompiledMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("compileMessage")(message.asInstanceOf[js.Any]).asInstanceOf[CompiledMessage]
  inline def compileMessage(message: String, mapText: MapTextFn): CompiledMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("compileMessage")(message.asInstanceOf[js.Any], mapText.asInstanceOf[js.Any])).asInstanceOf[CompiledMessage]
}
