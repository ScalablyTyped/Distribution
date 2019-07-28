package typings.lasso.libWritersMod

import typings.lasso.libLassoMod.LassoConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lasso/lib/writers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createWriter(writerImpl: js.Any): Writer = js.native
  def fileWriter(fileWriterConfig: js.Any, lassoConfig: LassoConfig): js.Any = js.native
}

