package typings.jsSdsl

import typings.jsSdsl.containerContainerBaseMod.Base
import typings.jsSdsl.containerContainerBaseMod.initContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object otherContainerQueueMod {
  
  @JSImport("js-sdsl/dist/esm/container/OtherContainer/Queue", JSImport.Default)
  @js.native
  open class default[T] () extends Queue[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @js.native
  trait Queue[T] extends Base {
    
    /**
      * @description Access the first element.
      */
    def front(): js.UndefOr[T] = js.native
    
    /**
      * @description Removes the first element.
      */
    def pop(): Unit = js.native
    
    /**
      * @description Inserts element to queue's end.
      */
    def push(element: T): Unit = js.native
  }
}
