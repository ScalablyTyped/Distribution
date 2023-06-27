package typings.lezerLr

import typings.lezerLr.anon.Hash
import typings.lezerLr.anon.ReadonlyUint16Array
import typings.lezerLr.distTokenMod.ExternalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lezer/lr", "ContextTracker")
  @js.native
  open class ContextTracker[T] protected ()
    extends typings.lezerLr.distParseMod.ContextTracker[T] {
    def this(spec: Hash[T]) = this()
  }
  
  @JSImport("@lezer/lr", "ExternalTokenizer")
  @js.native
  open class ExternalTokenizer protected ()
    extends typings.lezerLr.distTokenMod.ExternalTokenizer {
    def this(token: js.Function2[
            /* input */ typings.lezerLr.distTokenMod.InputStream, 
            /* stack */ typings.lezerLr.distStackMod.Stack, 
            Unit
          ]) = this()
    def this(
      token: js.Function2[
            /* input */ typings.lezerLr.distTokenMod.InputStream, 
            /* stack */ typings.lezerLr.distStackMod.Stack, 
            Unit
          ],
      options: ExternalOptions
    ) = this()
  }
  
  @JSImport("@lezer/lr", "InputStream")
  @js.native
  open class InputStream ()
    extends typings.lezerLr.distTokenMod.InputStream
  
  @JSImport("@lezer/lr", "LRParser")
  @js.native
  open class LRParser ()
    extends typings.lezerLr.distParseMod.LRParser
  /* static members */
  object LRParser {
    
    @JSImport("@lezer/lr", "LRParser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def deserialize(spec: Any): typings.lezerLr.distParseMod.LRParser = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(spec.asInstanceOf[js.Any]).asInstanceOf[typings.lezerLr.distParseMod.LRParser]
  }
  
  @JSImport("@lezer/lr", "LocalTokenGroup")
  @js.native
  open class LocalTokenGroup protected ()
    extends typings.lezerLr.distTokenMod.LocalTokenGroup {
    def this(data: String, precTable: Double) = this()
    def this(data: ReadonlyUint16Array, precTable: Double) = this()
    def this(data: String, precTable: Double, elseToken: Double) = this()
    def this(data: ReadonlyUint16Array, precTable: Double, elseToken: Double) = this()
  }
  
  @JSImport("@lezer/lr", "Stack")
  @js.native
  open class Stack ()
    extends typings.lezerLr.distStackMod.Stack
}
