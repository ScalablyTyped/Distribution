package typings.jupyterlabServices

import typings.jupyterlabServices.restapiMod.ISpecModel
import typings.jupyterlabServices.restapiMod.ISpecModels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelspecValidateMod {
  
  @JSImport("@jupyterlab/services/lib/kernelspec/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateSpecModel(data: js.Any): ISpecModel = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSpecModel")(data.asInstanceOf[js.Any]).asInstanceOf[ISpecModel]
  
  inline def validateSpecModels(data: js.Any): ISpecModels = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSpecModels")(data.asInstanceOf[js.Any]).asInstanceOf[ISpecModels]
}
