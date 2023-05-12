package typings.linguiMessageUtils

import typings.linguiMessageUtils.anon.Offset
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileMessageMod {
  
  @JSImport("@lingui/message-utils/dist/compileMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileMessage(message: String): CompiledMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("compileMessage")(message.asInstanceOf[js.Any]).asInstanceOf[CompiledMessage]
  inline def compileMessage(message: String, mapText: MapTextFn): CompiledMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("compileMessage")(message.asInstanceOf[js.Any], mapText.asInstanceOf[js.Any])).asInstanceOf[CompiledMessage]
  
  type CompiledIcuChoices = (Record[String, CompiledMessage]) & Offset
  
  type CompiledMessage = String | js.Array[CompiledMessageToken]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type CompiledMessageToken = string | [name: string, type: string | undefined, format: null | string | @lingui/message-utils.@lingui/message-utils/dist/compileMessage.CompiledIcuChoices | undefined]
  }}}
  to avoid circular code involving: 
  - @lingui/message-utils.@lingui/message-utils/dist/compileMessage.CompiledIcuChoices
  - @lingui/message-utils.@lingui/message-utils/dist/compileMessage.CompiledMessage
  - @lingui/message-utils.@lingui/message-utils/dist/compileMessage.CompiledMessageToken
  */
  type CompiledMessageToken = String | (js.Tuple3[
    /* name */ String, 
    /* type */ js.UndefOr[String], 
    /* format */ js.UndefOr[Null | String | Any]
  ])
  
  type MapTextFn = js.Function1[/* value */ String, String]
}
