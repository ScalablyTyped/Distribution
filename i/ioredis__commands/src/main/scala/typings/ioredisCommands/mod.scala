package typings.ioredisCommands

import typings.ioredisCommands.anon.ParseExternalKey
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ioredis/commands/built", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exists(commandName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(commandName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getKeyIndexes(commandName: String, args: js.Array[String | Buffer | Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyIndexes")(commandName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getKeyIndexes(commandName: String, args: js.Array[String | Buffer | Double], options: ParseExternalKey): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getKeyIndexes")(commandName.asInstanceOf[js.Any], args.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def hasFlag(commandName: String, flag: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFlag")(commandName.asInstanceOf[js.Any], flag.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@ioredis/commands/built", "list")
  @js.native
  val list: js.Array[String] = js.native
}
