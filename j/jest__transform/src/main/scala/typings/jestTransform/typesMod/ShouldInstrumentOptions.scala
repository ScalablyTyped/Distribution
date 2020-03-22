package typings.jestTransform.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'collectCoverage' | 'collectCoverageFrom' | 'collectCoverageOnlyFrom'> & {  changedFiles  :std.Set<@jest/types.@jest/types.Config.Path> | undefined} */
trait ShouldInstrumentOptions extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.undefined
  var collectCoverage: Boolean
  var collectCoverageFrom: js.Array[Glob]
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
}

object ShouldInstrumentOptions {
  @scala.inline
  def apply(
    collectCoverage: Boolean,
    collectCoverageFrom: js.Array[Glob],
    changedFiles: Set[Path] = null,
    collectCoverageOnlyFrom: StringDictionary[Boolean] = null
  ): ShouldInstrumentOptions = {
    val __obj = js.Dynamic.literal(collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any])
    if (changedFiles != null) __obj.updateDynamic("changedFiles")(changedFiles.asInstanceOf[js.Any])
    if (collectCoverageOnlyFrom != null) __obj.updateDynamic("collectCoverageOnlyFrom")(collectCoverageOnlyFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldInstrumentOptions]
  }
}

