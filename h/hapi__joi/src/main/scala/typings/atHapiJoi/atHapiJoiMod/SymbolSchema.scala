package typings.atHapiJoi.atHapiJoiMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.atHapiJoi.atHapiJoiMod._Schema because Already inherited */ @js.native
trait SymbolSchema extends AnySchema {
  def map(iterable: StringDictionary[js.Symbol]): this.type = js.native
  // TODO: support number and symbol index
  def map(iterable: Iterable[js.Tuple2[String | Double | Boolean | js.Symbol, js.Symbol]]): this.type = js.native
}

