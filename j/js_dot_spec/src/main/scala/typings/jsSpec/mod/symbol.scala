package typings.jsSpec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js.spec", "symbol")
@js.native
object symbol extends js.Object {
  /**
    * Used as an option in collection() to specify the size of a collection.
    */
  val count: js.Symbol = js.native
  /**
    * Returned by conform() to indicate a value does not conform to a spec.
    */
  val invalid: js.Symbol = js.native
  /**
    * Used as an option in collection() to specify the maximum size of a collection.
    */
  val maxCount: js.Symbol = js.native
  /**
    * Used as an option in collection() to specify the minimum size of a collection.
    */
  val minCount: js.Symbol = js.native
  /**
    * Used as an option in map() to specify a key spec that is optional.
    */
  val optional: js.Symbol = js.native
}

