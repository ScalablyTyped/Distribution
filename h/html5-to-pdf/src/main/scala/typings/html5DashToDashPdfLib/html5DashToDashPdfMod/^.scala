package typings
package html5DashToDashPdfLib.html5DashToDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html5-to-pdf", JSImport.Namespace)
@js.native
class ^ protected () extends HTML5ToPDF {
  def this(options: Options) = this()
  /* CompleteClass */
  override def build(): js.Promise[nodeLib.Buffer] = js.native
  /* CompleteClass */
  override def close(): js.Promise[scala.Unit] = js.native
  /* CompleteClass */
  override def includeAssets(): js.Promise[scala.Unit] = js.native
  /* CompleteClass */
  override def parseOptions(options: Options): ParsedOptions = js.native
  /* CompleteClass */
  override def start(): js.Promise[puppeteerLib.puppeteerMod.Page] = js.native
}

