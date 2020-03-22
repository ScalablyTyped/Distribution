package typings.istanbulLibSourceMaps.mod

import typings.istanbulLibSourceMaps.PartialMapStoreOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("istanbul-lib-source-maps", "createSourceMapStore")
@js.native
object createSourceMapStore extends js.Object {
  def apply(): MapStore = js.native
  def apply(options: PartialMapStoreOptions): MapStore = js.native
}

