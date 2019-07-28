package typings.grammarkdown.distSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/symbols", "Symbol")
@js.native
class Symbol protected () extends js.Object {
  def this(kind: SymbolKind, name: String) = this()
  var id: Double = js.native
  var kind: SymbolKind = js.native
  var locals: js.UndefOr[SymbolTable] = js.native
  var name: String = js.native
  var parent: js.UndefOr[Symbol] = js.native
}

