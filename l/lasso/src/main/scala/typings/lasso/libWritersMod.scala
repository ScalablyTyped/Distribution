package typings.lasso

import typings.lasso.libLassoMod.LassoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWritersMod {
  
  @JSImport("lasso/lib/writers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWriter(writerImpl: Any): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(writerImpl.asInstanceOf[js.Any]).asInstanceOf[Writer]
  
  inline def fileWriter(fileWriterConfig: Any, lassoConfig: LassoConfig): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fileWriter")(fileWriterConfig.asInstanceOf[js.Any], lassoConfig.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  type Writer = typings.lasso.libWritersWriterMod.Writer
}
