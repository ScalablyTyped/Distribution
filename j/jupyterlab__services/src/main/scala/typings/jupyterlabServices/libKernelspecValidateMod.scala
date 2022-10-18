package typings.jupyterlabServices

import typings.jupyterlabServices.libKernelspecRestapiMod.ISpecModel
import typings.jupyterlabServices.libKernelspecRestapiMod.ISpecModels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelspecValidateMod {
  
  @JSImport("@jupyterlab/services/lib/kernelspec/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateSpecModel(data: Any): ISpecModel = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSpecModel")(data.asInstanceOf[js.Any]).asInstanceOf[ISpecModel]
  
  inline def validateSpecModels(data: Any): ISpecModels = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSpecModels")(data.asInstanceOf[js.Any]).asInstanceOf[ISpecModels]
}
