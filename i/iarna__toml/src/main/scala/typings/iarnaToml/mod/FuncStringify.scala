package typings.iarnaToml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FuncStringify extends js.Object {
  
  /**
    * Serialize an object as TOML.
    *
    * If an object `TOML.stringify` is serializing has a `toJSON` method
    * then it will call it to transform the object before serializing it.
    * This matches the behavior of JSON.stringify.
    *
    * The one exception to this is that `toJSON` is not called for `Date` objects
    * because JSON represents dates as strings and TOML can represent them natively.
    *
    * `moment` objects are treated the same as native `Date` objects, in this respect.
    */
  def apply(obj: JsonMap): String = js.native
  
  /**
    * Serialize a value as TOML would. This is a fragment and not a complete valid TOML document.
    */
  def value(any: AnyJson): String = js.native
}
