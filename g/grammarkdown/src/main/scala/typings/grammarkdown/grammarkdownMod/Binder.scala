package typings.grammarkdown.grammarkdownMod

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Binder")
@js.native
class Binder () extends StObject {
  
  /* private */ var bind: js.Any = js.native
  
  /* private */ var bindChildren: js.Any = js.native
  
  /* private */ var bindParameter: js.Any = js.native
  
  /* private */ var bindProduction: js.Any = js.native
  
  def bindSourceFile(file: SourceFile, bindings: BindingTable): Unit = js.native
  def bindSourceFile(file: SourceFile, bindings: BindingTable, cancelable: Cancelable): Unit = js.native
  def bindSourceFile(file: SourceFile, bindings: BindingTable, cancelable: CancellationToken): Unit = js.native
  
  /* private */ var declareSymbol: js.Any = js.native
  
  /* private */ var parentNode: js.Any = js.native
  
  /* private */ var parentSymbol: js.Any = js.native
}
