package typings.grammarkdown.distSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/symbols", "SymbolTable")
@js.native
class SymbolTable () extends js.Object {
  var getSymbols: js.Any = js.native
  val isEmpty: Boolean = js.native
  var nameMap: js.Any = js.native
  def resolveSymbol(name: String, kind: SymbolKind): js.UndefOr[Symbol] = js.native
}

