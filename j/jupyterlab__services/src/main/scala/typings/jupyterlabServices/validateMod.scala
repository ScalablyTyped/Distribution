package typings.jupyterlabServices

import typings.jupyterlabServices.contentsMod.Contents.ICheckpointModel
import typings.jupyterlabServices.contentsMod.Contents.IModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validateMod {
  
  @JSImport("@jupyterlab/services/lib/contents/validate", "validateCheckpointModel")
  @js.native
  def validateCheckpointModel(model: ICheckpointModel): /* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, contents)), TsIdentSimple(Contents), TsIdentSimple(ICheckpointModel))),IArray())*/ Boolean = js.native
  
  @JSImport("@jupyterlab/services/lib/contents/validate", "validateContentsModel")
  @js.native
  def validateContentsModel(model: IModel): /* asserts model is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibraryScoped(jupyterlab,services), TsIdentModule(Some(jupyterlab),List(services, lib, contents)), TsIdentSimple(Contents), TsIdentSimple(IModel))),IArray())*/ Boolean = js.native
}
