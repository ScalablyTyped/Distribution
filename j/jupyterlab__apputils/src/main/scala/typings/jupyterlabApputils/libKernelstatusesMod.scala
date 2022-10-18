package typings.jupyterlabApputils

import typings.jupyterlabApputils.anon.RecordKernelDisplayStatus
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelstatusesMod {
  
  @JSImport("@jupyterlab/apputils/lib/kernelstatuses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def translateKernelStatuses(): RecordKernelDisplayStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("translateKernelStatuses")().asInstanceOf[RecordKernelDisplayStatus]
  inline def translateKernelStatuses(translator: ITranslator): RecordKernelDisplayStatus = ^.asInstanceOf[js.Dynamic].applyDynamic("translateKernelStatuses")(translator.asInstanceOf[js.Any]).asInstanceOf[RecordKernelDisplayStatus]
}
