package typings
package html5DashToDashPdfLib.html5DashToDashPdfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html5-to-pdf", JSImport.Namespace)
@js.native
class namespaced protected () extends HTML5ToPDF {
  def this(options: html5DashToDashPdfLib.html5DashToDashPdfMod.HTML5ToPDFNs.Options) = this()
  /* CompleteClass */
  override def build(): js.Promise[nodeLib.Buffer] = js.native
  /* CompleteClass */
  override def close(): js.Promise[scala.Unit] = js.native
  /* CompleteClass */
  override def includeAssets(): js.Promise[scala.Unit] = js.native
  /* CompleteClass */
  override def parseOptions(options: html5DashToDashPdfLib.html5DashToDashPdfMod.HTML5ToPDFNs.Options): html5DashToDashPdfLib.html5DashToDashPdfMod.HTML5ToPDFNs.ParsedOptions = js.native
  /* CompleteClass */
  override def start(): js.Promise[puppeteerLib.puppeteerMod.Page] = js.native
}

