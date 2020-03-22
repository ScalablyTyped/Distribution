package typings.jsdevtoolsFilePathFilter

import typings.jsdevtoolsFilePathFilter.typesMod.AnyFilter
import typings.jsdevtoolsFilePathFilter.typesMod.FilterFunction
import typings.jsdevtoolsFilePathFilter.typesMod.Filters
import typings.jsdevtoolsFilePathFilter.typesMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jsdevtools/file-path-filter/lib/normalize", JSImport.Namespace)
@js.native
object normalizeMod extends js.Object {
  def normalize(criteria: AnyFilter, opts: Options): Filters[js.Array[FilterFunction]] = js.native
}

