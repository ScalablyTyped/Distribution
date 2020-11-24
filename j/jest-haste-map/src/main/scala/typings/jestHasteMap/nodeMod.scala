package typings.jestHasteMap

import typings.jestHasteMap.anon.HasteMap
import typings.jestHasteMap.typesMod.CrawlerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-haste-map/build/crawlers/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  
  def apply(options: CrawlerOptions): js.Promise[HasteMap] = js.native
}
