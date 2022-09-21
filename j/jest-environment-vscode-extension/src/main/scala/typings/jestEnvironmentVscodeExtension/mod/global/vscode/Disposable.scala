package typings.jestEnvironmentVscodeExtension.mod.global.vscode

import typings.vscode.anon.Dispose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("vscode.Disposable")
@js.native
open class Disposable protected ()
  extends typings.vscode.mod.Disposable {
  /**
    * Creates a new disposable that calls the provided function
    * on dispose.
    *
    * *Note* that an asynchronous function is not awaited.
    *
    * @param callOnDispose Function that disposes something.
    */
  def this(callOnDispose: js.Function0[Any]) = this()
}
/* static members */
object Disposable {
  
  @JSGlobal("vscode.Disposable")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Combine many disposable-likes into one. You can use this method when having objects with
    * a dispose function which aren't instances of `Disposable`.
    *
    * @param disposableLikes Objects that have at least a `dispose`-function member. Note that asynchronous
    * dispose-functions aren't awaited.
    * @return Returns a new disposable which, upon dispose, will
    * dispose all provided disposables.
    */
  inline def from(disposableLikes: Dispose*): typings.vscode.mod.Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(disposableLikes.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.vscode.mod.Disposable]
}
