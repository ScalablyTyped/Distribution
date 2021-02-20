package typings.lodash.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Primitive[T]
  extends LoDashImplicitWrapper[T]
     with _ImpChain[T] {
  
  /**
    * @see _.after
    */
  def after[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): Function[TFunc] = js.native
  
  /**
    * @see _.before
    */
  def before[TFunc /* <: js.Function1[/* repeated */ js.Any, _] */](func: TFunc): Function[TFunc] = js.native
  
  /**
    * @see _.castArray
    */
  def castArray(): Collection[T] = js.native
  
  /**
    * @see _.chain
    */
  def chain(): PrimitiveChain[T] = js.native
  
  /**
    * @see _.concat
    */
  def concat(values: Many[T]*): Collection[T] = js.native
}
