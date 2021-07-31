package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("io-ts", "IntersectionType")
@js.native
class IntersectionType[CS /* <: js.Array[Any_] */, A, O, I] protected () extends Type_[A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], types: CS) = this()
  
  /**
    * @since 1.0.0
    */
  val _tag: typings.ioTs.ioTsStrings.IntersectionType = js.native
  
  val types: CS = js.native
}
