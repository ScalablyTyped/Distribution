package typings.ioredis

import typings.ioredis.commandMod.ArgumentType
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoPipeliningMod {
  
  @JSImport("ioredis/built/autoPipelining", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def executeWithAutoPipelining(
    client: Any,
    functionName: String,
    commandName: String,
    args: js.Array[ArgumentType],
    callback: Any
  ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeWithAutoPipelining")(client.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def getFirstValueInFlattenedArray(args: js.Array[ArgumentType]): js.UndefOr[String | Buffer | Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstValueInFlattenedArray")(args.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String | Buffer | Double | Null]]
  
  @JSImport("ioredis/built/autoPipelining", "kCallbacks")
  @js.native
  val kCallbacks: js.Symbol = js.native
  
  @JSImport("ioredis/built/autoPipelining", "kExec")
  @js.native
  val kExec: js.Symbol = js.native
  
  @JSImport("ioredis/built/autoPipelining", "notAllowedAutoPipelineCommands")
  @js.native
  val notAllowedAutoPipelineCommands: js.Array[String] = js.native
  
  inline def shouldUseAutoPipelining(client: Any, functionName: String, commandName: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldUseAutoPipelining")(client.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
