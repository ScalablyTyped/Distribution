package typings.grammarkdown.grammarkdownMod

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Binder")
@js.native
class Binder () extends StObject {
  
  var bind: js.Any = js.native
  
  var bindChildren: js.Any = js.native
  
  var bindParameter: js.Any = js.native
  
  var bindProduction: js.Any = js.native
  
  def bindSourceFile(file: SourceFile, bindings: BindingTable): Unit = js.native
  def bindSourceFile(file: SourceFile, bindings: BindingTable, cancelable: Cancelable): Unit = js.native
  def bindSourceFile(file: SourceFile, bindings: BindingTable, cancelable: CancellationToken): Unit = js.native
  
  var declareSymbol: js.Any = js.native
  
  var parentNode: js.Any = js.native
  
  var parentSymbol: js.Any = js.native
}
