package typings.ioTs.mod

import typings.fpTs.libFunctionMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("io-ts", "RefinementType")
@js.native
open class RefinementType[C /* <: Any_ */, A, O, I] protected () extends Type_[A, O, I] {
  def this(
    name: String,
    is: Is[A],
    validate: Validate[I, A],
    encode: Encode[A, O],
    `type`: C,
    predicate: Predicate[A]
  ) = this()
  
  /**
    * @since 1.0.0
    */
  val _tag: typings.ioTs.ioTsStrings.RefinementType = js.native
  
  def predicate(a: A): Boolean = js.native
  
  val `type`: C = js.native
}
