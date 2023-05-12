package typings.jsSdsl

import typings.jsSdsl.distEsmContainerContainerBaseMod.Base
import typings.jsSdsl.distEsmContainerContainerBaseMod.initContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmContainerOtherContainerStackMod {
  
  @JSImport("js-sdsl/dist/esm/container/OtherContainer/Stack", JSImport.Default)
  @js.native
  open class default[T] () extends Stack[T] {
    def this(container: initContainer[T]) = this()
  }
  
  @js.native
  trait Stack[T] extends Base {
    
    /**
      * @description Removes the end element.
      * @returns The element you popped.
      */
    def pop(): js.UndefOr[T] = js.native
    
    /**
      * @description Insert element to stack's end.
      * @description The element you want to push to the back.
      * @returns The container length after erasing.
      */
    def push(element: T): Double = js.native
    
    /**
      * @description Accesses the end element.
      * @returns The last element.
      */
    def top(): js.UndefOr[T] = js.native
  }
}
