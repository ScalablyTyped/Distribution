package typings.lasso

import typings.lasso.lassoMod.LassoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writersMod {
  
  @JSImport("lasso/lib/writers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createWriter(writerImpl: js.Any): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriter")(writerImpl.asInstanceOf[js.Any]).asInstanceOf[Writer]
  
  inline def fileWriter(fileWriterConfig: js.Any, lassoConfig: LassoConfig): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fileWriter")(fileWriterConfig.asInstanceOf[js.Any], lassoConfig.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type Writer = typings.lasso.writerMod.Writer
}
