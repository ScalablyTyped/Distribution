package typings.ioTs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("io-ts", "KeyofType")
@js.native
open class KeyofType[D /* <: StringDictionary[Any] */] protected () extends Type_[/* keyof D */ String, /* keyof D */ String, Any] {
  def this(
    name: String,
    is: Is[/* keyof D */ String],
    validate: Validate[Any, /* keyof D */ String],
    encode: Encode[/* keyof D */ String, /* keyof D */ String],
    keys: D
  ) = this()
  
  /**
    * @since 1.0.0
    */
  val _tag: typings.ioTs.ioTsStrings.KeyofType = js.native
  
  val keys: D = js.native
}
