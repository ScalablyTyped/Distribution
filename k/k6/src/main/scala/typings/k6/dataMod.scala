package typings.k6

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("k6/data", "SharedArray")
  @js.native
  open class SharedArray[T] protected ()
    extends StObject
       with Array[T] {
    /**
      * Given a name and a function that returns an array, the SharedArray constructor returns the same array but sharing the array memory between VUs.
      * https://k6.io/docs/javascript-api/k6-data/sharedarray/
      */
    def this(name: String, callback: js.Function0[js.Array[T]]) = this()
  }
}
