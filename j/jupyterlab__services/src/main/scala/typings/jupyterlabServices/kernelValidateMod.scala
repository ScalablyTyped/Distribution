package typings.jupyterlabServices

import typings.jupyterlabServices.kernelRestapiMod.IModel
import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelValidateMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/validate", "validateMessage")
  @js.native
  def validateMessage(msg: IMessage[MessageType]): /* asserts msg is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, messages)), TsIdentSimple(IMessage))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, messages)), TsIdentSimple(MessageType))),IArray())))*/ Boolean = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/validate", "validateModel")
  @js.native
  def validateModel(model: IModel): /* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, restapi)), TsIdentSimple(IModel))),IArray())*/ Boolean = js.native
  
  @JSImport("@jupyterlab/services/lib/kernel/validate", "validateModels")
  @js.native
  def validateModels(models: js.Array[IModel]): js.Array[
    /* asserts models is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, restapi)), TsIdentSimple(IModel))),IArray())*/ Boolean
  ] = js.native
}
