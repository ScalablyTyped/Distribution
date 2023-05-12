package typings.luminoCollections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@lumino/collections", "LinkedList")
  @js.native
  open class LinkedList[T] ()
    extends typings.luminoCollections.typesLinkedlistMod.LinkedList[T]
  object LinkedList {
    
    @JSImport("@lumino/collections", "LinkedList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a linked list from an iterable of values.
      *
      * @param values - The iterable object of interest.
      *
      * @returns A new linked list initialized with the given values.
      *
      * #### Complexity
      * Linear.
      */
    inline def from[T](values: js.Iterable[T]): typings.luminoCollections.typesLinkedlistMod.LinkedList[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(values.asInstanceOf[js.Any]).asInstanceOf[typings.luminoCollections.typesLinkedlistMod.LinkedList[T]]
  }
}
