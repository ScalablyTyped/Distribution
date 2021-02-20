package typings.lasso

import typings.lasso.lassoMod.LassoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writersMod {
  
  @JSImport("lasso/lib/writers", "createWriter")
  @js.native
  def createWriter(writerImpl: js.Any): Writer = js.native
  
  @JSImport("lasso/lib/writers", "fileWriter")
  @js.native
  def fileWriter(fileWriterConfig: js.Any, lassoConfig: LassoConfig): js.Any = js.native
  
  type Writer = typings.lasso.writerMod.Writer
}
