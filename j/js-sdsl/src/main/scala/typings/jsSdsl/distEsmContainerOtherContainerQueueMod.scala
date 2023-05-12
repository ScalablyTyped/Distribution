package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.Base
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerOtherContainerQueueMod {
  
  @JSImport("js-sdsl/dist/esm/container/OtherContainer/Queue", JSImport.Default)
  @js.native
  open class default[T] () extends Queue[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @js.native
  trait Queue[T] extends Base {
    
    /**
      * @description Access the first element.
      * @returns The first element.
      */
    def front(): js.UndefOr[T] = js.native
    
    /**
      * @description Removes the first element.
      * @returns The element you popped.
      */
    def pop(): js.UndefOr[T] = js.native
    
    /**
      * @description Inserts element to queue's end.
      * @param element - The element you want to push to the front.
      * @returns The container length after pushing.
      */
    def push(element: T): Double = js.native
  }
}
