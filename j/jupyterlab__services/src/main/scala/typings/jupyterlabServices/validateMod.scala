package typings.jupyterlabServices

import typings.jupyterlabServices.contentsMod.Contents.ICheckpointModel
import typings.jupyterlabServices.contentsMod.Contents.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("@jupyterlab/services/lib/contents/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateCheckpointModel(model: ICheckpointModel): /* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, contents)), TsIdentSimple(Contents), TsIdentSimple(ICheckpointModel))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateCheckpointModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, contents)), TsIdentSimple(Contents), TsIdentSimple(ICheckpointModel))),IArray())*/ Boolean]
  
  inline def validateContentsModel(model: IModel): /* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, contents)), TsIdentSimple(Contents), TsIdentSimple(IModel))),IArray())*/ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validateContentsModel")(model.asInstanceOf[js.Any]).asInstanceOf[/* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, contents)), TsIdentSimple(Contents), TsIdentSimple(IModel))),IArray())*/ Boolean]
}
