package typings.ioTs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("io-ts", "LiteralType")
@js.native
open class LiteralType[V /* <: LiteralValue */] protected () extends Type_[V, V, Any] {
  def this(name: String, is: Is[V], validate: Validate[Any, V], encode: Encode[V, V], value: V) = this()
  
  /**
    * @since 1.0.0
    */
  val _tag: typings.ioTs.ioTsStrings.LiteralType = js.native
  
  val value: V = js.native
}
