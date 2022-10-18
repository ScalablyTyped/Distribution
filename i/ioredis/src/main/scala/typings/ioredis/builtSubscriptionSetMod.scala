package typings.ioredis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtSubscriptionSetMod {
  
  @JSImport("ioredis/built/SubscriptionSet", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with SubscriptionSet
  
  /* Rewritten from type alias, can be one of: 
    - typings.ioredis.ioredisStrings.subscribe
    - typings.ioredis.ioredisStrings.psubscribe
  */
  trait AddSet extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typings.ioredis.ioredisStrings.unsubscribe
    - typings.ioredis.ioredisStrings.punsubscribe
  */
  trait DelSet extends StObject
  
  @js.native
  trait SubscriptionSet extends StObject {
    
    def add(set: AddSet, channel: String): Unit = js.native
    
    def channels(set: AddSet): js.Array[String] = js.native
    def channels(set: DelSet): js.Array[String] = js.native
    
    def del(set: DelSet, channel: String): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    /* private */ var set: Any = js.native
  }
}
