package typings.graphemer

import typings.graphemer.anon.Done
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGraphemerIteratorMod {
  
  @JSImport("graphemer/lib/GraphemerIterator", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with GraphemerIterator {
    def this(str: String, nextBreak: js.Function2[/* str */ String, /* index */ Double, Double]) = this()
  }
  
  @js.native
  trait GraphemerIterator
    extends StObject
       with Iterator[String, Any, Unit] {
    
    /* private */ var _index: Any = js.native
    
    /* private */ var _nextBreak: Any = js.native
    
    /* private */ var _str: Any = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[this.type] = js.native
    
    def next(): Done = js.native
  }
}
