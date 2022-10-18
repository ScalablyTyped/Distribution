package typings.jupyterlabSharedModels.libApiMod

import typings.jupyterlabNbformat.mod.ILanguageInfoMetadata
import typings.luminoDisposable.mod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISharedLanguageInfoMetadata
  extends StObject
     with ILanguageInfoMetadata
     with IDisposable
object ISharedLanguageInfoMetadata {
  
  inline def apply(dispose: () => Unit, isDisposed: Boolean, name: String): ISharedLanguageInfoMetadata = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedLanguageInfoMetadata]
  }
}
