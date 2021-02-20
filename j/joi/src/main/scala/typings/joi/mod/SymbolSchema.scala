package typings.joi.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.joi.mod._Schema because Already inherited */ @js.native
trait SymbolSchema extends AnySchema {
  
  def map(iterable: StringDictionary[js.Symbol]): this.type = js.native
  // TODO: support number and symbol index
  def map(iterable: Iterable[js.Tuple2[String | Double | Boolean | js.Symbol, js.Symbol]]): this.type = js.native
}
