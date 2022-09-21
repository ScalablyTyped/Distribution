package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayLikeMatchers[T]
  extends StObject
     with Matchers[ArrayLike[T]] {
  
  /**
    * Invert the matcher following this expect.
    */
  @JSName("not")
  var not_ArrayLikeMatchers: ArrayLikeMatchers[T] = js.native
  
  def toBe(expected: ArrayContaining[T]): Unit = js.native
  def toBe(expected: ArrayContaining[T], expectationFailOutput: scala.Any): Unit = js.native
  
  def toEqual(expected: ArrayContaining[T]): Unit = js.native
  def toEqual(expected: ArrayContaining[T], expectationFailOutput: scala.Any): Unit = js.native
}
