package typings.lasso

import typings.lasso.lassoMod.LassoConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/lib/writers", JSImport.Namespace)
@js.native
object writersMod extends js.Object {
  def createWriter(writerImpl: js.Any): Writer = js.native
  def fileWriter(fileWriterConfig: js.Any, lassoConfig: LassoConfig): js.Any = js.native
  type Writer = typings.lasso.writerMod.Writer
}

