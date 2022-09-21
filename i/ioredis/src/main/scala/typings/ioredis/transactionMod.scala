package typings.ioredis

import typings.ioredis.anon.Pipeline
import typings.ioredis.anon.`2`
import typings.ioredis.ioredisStrings.OK
import typings.ioredis.redisCommanderMod.ChainableCommander
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transactionMod {
  
  @JSImport("ioredis/built/transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTransactionSupport(redis: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTransactionSupport")(redis.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait Transaction extends StObject {
    
    def multi(): ChainableCommander = js.native
    def multi(commands: js.Array[js.Array[Any]]): ChainableCommander = js.native
    def multi(options: Pipeline): js.Promise[OK] = js.native
    def multi(options: `2`): ChainableCommander = js.native
    
    def pipeline(): ChainableCommander = js.native
    def pipeline(commands: js.Array[js.Array[Any]]): ChainableCommander = js.native
  }
}
