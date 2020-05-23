package typings.jsdevtoolsFilePathFilter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AnyFilter = typings.jsdevtoolsFilePathFilter.typesMod.FilterCriteria | typings.jsdevtoolsFilePathFilter.anon.PartialFiltersFilterCrite
  type FilterCriteria = typings.jsdevtoolsFilePathFilter.typesMod.FilterCriterion | js.Array[typings.jsdevtoolsFilePathFilter.typesMod.FilterCriterion]
  type FilterCriterion = scala.Boolean | java.lang.String | typings.std.RegExp | typings.jsdevtoolsFilePathFilter.typesMod.FilterFunction
  type FilterFunction = js.Function1[/* repeated */ js.Any, js.Any]
  type MapFunction = js.Function1[/* repeated */ js.Any, java.lang.String]
}
