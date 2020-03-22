package typings.jupyterlabServices

import typings.jupyterlabServices.sessionSessionMod.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/validate", JSImport.Namespace)
@js.native
object sessionValidateMod extends js.Object {
  def updateLegacySessionModel(data: js.Any): Unit = js.native
  def validateModel(data: js.Any): /* asserts data is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, session, session)), TsIdentSimple(IModel))),IArray())*/ Boolean = js.native
  def validateModels(models: js.Array[IModel]): js.Array[
    /* asserts models is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, session, session)), TsIdentSimple(IModel))),IArray())*/ Boolean
  ] = js.native
}

