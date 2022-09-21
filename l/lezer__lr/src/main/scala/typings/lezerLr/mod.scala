package typings.lezerLr

import typings.lezerLr.anon.Hash
import typings.lezerLr.tokenMod.ExternalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lezer/lr", "ContextTracker")
  @js.native
  open class ContextTracker[T] protected ()
    extends typings.lezerLr.parseMod.ContextTracker[T] {
    def this(spec: Hash[T]) = this()
  }
  
  @JSImport("@lezer/lr", "ExternalTokenizer")
  @js.native
  open class ExternalTokenizer protected ()
    extends typings.lezerLr.tokenMod.ExternalTokenizer {
    def this(token: js.Function2[
            /* input */ typings.lezerLr.tokenMod.InputStream, 
            /* stack */ typings.lezerLr.stackMod.Stack, 
            Unit
          ]) = this()
    def this(
      token: js.Function2[
            /* input */ typings.lezerLr.tokenMod.InputStream, 
            /* stack */ typings.lezerLr.stackMod.Stack, 
            Unit
          ],
      options: ExternalOptions
    ) = this()
  }
  
  @JSImport("@lezer/lr", "InputStream")
  @js.native
  open class InputStream ()
    extends typings.lezerLr.tokenMod.InputStream
  
  @JSImport("@lezer/lr", "LRParser")
  @js.native
  open class LRParser ()
    extends typings.lezerLr.parseMod.LRParser
  /* static members */
  object LRParser {
    
    @JSImport("@lezer/lr", "LRParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserialize(spec: Any): typings.lezerLr.parseMod.LRParser = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(spec.asInstanceOf[js.Any]).asInstanceOf[typings.lezerLr.parseMod.LRParser]
  }
  
  @JSImport("@lezer/lr", "Stack")
  @js.native
  open class Stack ()
    extends typings.lezerLr.stackMod.Stack
}
