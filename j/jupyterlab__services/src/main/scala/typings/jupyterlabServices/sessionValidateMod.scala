package typings.jupyterlabServices

import typings.jupyterlabServices.sessionSessionMod.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionValidateMod {
  
  @JSImport("@jupyterlab/services/lib/session/validate", "updateLegacySessionModel")
  @js.native
  def updateLegacySessionModel(data: js.Any): Unit = js.native
  
  @JSImport("@jupyterlab/services/lib/session/validate", "validateModel")
  @js.native
  def validateModel(data: js.Any): /* asserts data is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, session, session)), TsIdentSimple(IModel))),IArray())*/ Boolean = js.native
  
  @JSImport("@jupyterlab/services/lib/session/validate", "validateModels")
  @js.native
  def validateModels(models: js.Array[IModel]): js.Array[
    /* asserts models is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, session, session)), TsIdentSimple(IModel))),IArray())*/ Boolean
  ] = js.native
}
