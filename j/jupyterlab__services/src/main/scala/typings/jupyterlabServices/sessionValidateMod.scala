package typings.jupyterlabServices

import typings.jupyterlabServices.sessionSessionMod.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionValidateMod {
  
  @JSImport("@jupyterlab/services/lib/session/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateLegacySessionModel(data: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateLegacySessionModel")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateModel(data: Any): /* asserts data is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, session, session)), TsIdentSimple(IModel))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateModel")(data.asInstanceOf[js.Any]).asInstanceOf[/* asserts data is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, session, session)), TsIdentSimple(IModel))),IArray())*/ Boolean]
  
  inline def validateModels(models: js.Array[IModel]): /* asserts models is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, session, session)), TsIdentSimple(IModel))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateModels")(models.asInstanceOf[js.Any]).asInstanceOf[/* asserts models is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, session, session)), TsIdentSimple(IModel))),IArray())))*/ Boolean]
}
