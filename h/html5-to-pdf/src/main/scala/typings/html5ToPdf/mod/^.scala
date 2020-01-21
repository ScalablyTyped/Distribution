package typings.html5ToPdf.mod

import typings.node.Buffer
import typings.puppeteer.mod.Page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html5-to-pdf", JSImport.Namespace)
@js.native
class ^ protected () extends HTML5ToPDF {
  def this(options: Options) = this()
  /* CompleteClass */
  override def build(): js.Promise[Buffer] = js.native
  /* CompleteClass */
  override def close(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def includeAssets(): js.Promise[Unit] = js.native
  /* CompleteClass */
  override def parseOptions(options: Options): ParsedOptions = js.native
  /* CompleteClass */
  override def start(): js.Promise[Page] = js.native
}

