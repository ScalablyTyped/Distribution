package typings.jestHasteMap

import typings.jestHasteMap.typesMod.CrawlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-haste-map/build/crawlers/watchman", JSImport.Namespace)
@js.native
object watchmanMod extends js.Object {
  def apply(options: CrawlerOptions): js.Promise[AnonChangedFiles] = js.native
}

