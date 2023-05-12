package typings.jupyterYdoc.anon

import typings.jupyterlabNbformat.mod.IKernelspecMetadata
import typings.jupyterlabNbformat.mod.ILanguageInfoMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.INotebookMetadata> */
trait PartialINotebookMetadata extends StObject {
  
  var kernelspec: js.UndefOr[IKernelspecMetadata] = js.undefined
  
  var language_info: js.UndefOr[ILanguageInfoMetadata] = js.undefined
  
  var orig_nbformat: js.UndefOr[Double] = js.undefined
}
object PartialINotebookMetadata {
  
  inline def apply(): PartialINotebookMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialINotebookMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialINotebookMetadata] (val x: Self) extends AnyVal {
    
    inline def setKernelspec(value: IKernelspecMetadata): Self = StObject.set(x, "kernelspec", value.asInstanceOf[js.Any])
    
    inline def setKernelspecUndefined: Self = StObject.set(x, "kernelspec", js.undefined)
    
    inline def setLanguage_info(value: ILanguageInfoMetadata): Self = StObject.set(x, "language_info", value.asInstanceOf[js.Any])
    
    inline def setLanguage_infoUndefined: Self = StObject.set(x, "language_info", js.undefined)
    
    inline def setOrig_nbformat(value: Double): Self = StObject.set(x, "orig_nbformat", value.asInstanceOf[js.Any])
    
    inline def setOrig_nbformatUndefined: Self = StObject.set(x, "orig_nbformat", js.undefined)
  }
}
