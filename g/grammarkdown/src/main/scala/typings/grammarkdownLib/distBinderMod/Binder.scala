package typings
package grammarkdownLib.distBinderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown/dist/binder", "Binder")
@js.native
class Binder () extends js.Object {
  var bind: js.Any = js.native
  var bindChildren: js.Any = js.native
  var bindParameter: js.Any = js.native
  var bindProduction: js.Any = js.native
  var declareSymbol: js.Any = js.native
  var parentNode: js.Any = js.native
  var parentSymbol: js.Any = js.native
  def bindSourceFile(file: grammarkdownLib.distNodesMod.SourceFile, bindings: BindingTable): scala.Unit = js.native
  def bindSourceFile(
    file: grammarkdownLib.distNodesMod.SourceFile,
    bindings: BindingTable,
    cancellationToken: prexLib.prexMod.CancellationToken
  ): scala.Unit = js.native
}

