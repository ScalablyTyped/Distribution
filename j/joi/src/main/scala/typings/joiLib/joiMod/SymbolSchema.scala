package typings
package joiLib.joiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolSchema extends AnySchema {
  def map(iterable: org.scalablytyped.runtime.StringDictionary[js.Symbol]): this.type = js.native
  // TODO: support number and symbol index
  def map(
    iterable: stdLib.Iterable[
      js.Tuple2[java.lang.String | scala.Double | scala.Boolean | js.Symbol, js.Symbol]
    ]
  ): this.type = js.native
}

