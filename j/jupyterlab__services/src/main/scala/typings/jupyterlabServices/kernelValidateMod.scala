package typings.jupyterlabServices

import typings.jupyterlabServices.kernelRestapiMod.IModel
import typings.jupyterlabServices.messagesMod.IMessage
import typings.jupyterlabServices.messagesMod.MessageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelValidateMod {
  
  @JSImport("@jupyterlab/services/lib/kernel/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateMessage(msg: IMessage[MessageType]): /* asserts msg is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, messages)), TsIdentSimple(IMessage))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, messages)), TsIdentSimple(MessageType))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateMessage")(msg.asInstanceOf[js.Any]).asInstanceOf[/* asserts msg is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, messages)), TsIdentSimple(IMessage))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, messages)), TsIdentSimple(MessageType))),IArray())))*/ Boolean]
  
  inline def validateModel(model: IModel): /* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, restapi)), TsIdentSimple(IModel))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, restapi)), TsIdentSimple(IModel))),IArray())*/ Boolean]
  
  inline def validateModels(models: js.Array[IModel]): /* asserts models is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, restapi)), TsIdentSimple(IModel))),IArray())))*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateModels")(models.asInstanceOf[js.Any]).asInstanceOf[/* asserts models is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(Array))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, kernel, restapi)), TsIdentSimple(IModel))),IArray())))*/ Boolean]
}
