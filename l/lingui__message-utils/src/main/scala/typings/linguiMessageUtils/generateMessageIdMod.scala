package typings.linguiMessageUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object generateMessageIdMod {
  
  @JSImport("@lingui/message-utils/generateMessageId", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateMessageId(msg: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMessageId")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateMessageId(msg: String, context: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMessageId")(msg.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
}
