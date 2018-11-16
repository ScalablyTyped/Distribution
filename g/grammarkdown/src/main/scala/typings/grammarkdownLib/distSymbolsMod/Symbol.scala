package typings
package grammarkdownLib.distSymbolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/symbols", "Symbol")
@js.native
class Symbol protected () extends js.Object {
  def this(kind: SymbolKind, name: java.lang.String) = this()
  var id: scala.Double = js.native
  var kind: SymbolKind = js.native
  var locals: js.UndefOr[SymbolTable] = js.native
  var name: java.lang.String = js.native
  var parent: js.UndefOr[Symbol] = js.native
}

