package typings.jestTransform.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'collectCoverage' | 'collectCoverageFrom' | 'collectCoverageOnlyFrom'> & {  changedFiles :std.Set<@jest/types.@jest/types.Config.Path> | undefined} */
@js.native
trait ShouldInstrumentOptions extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.native
  var collectCoverage: Boolean = js.native
  var collectCoverageFrom: js.Array[Glob] = js.native
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean] | Null] = js.native
}

object ShouldInstrumentOptions {
  @scala.inline
  def apply(collectCoverage: Boolean, collectCoverageFrom: js.Array[Glob]): ShouldInstrumentOptions = {
    val __obj = js.Dynamic.literal(collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShouldInstrumentOptions]
  }
  @scala.inline
  implicit class ShouldInstrumentOptionsOps[Self <: ShouldInstrumentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollectCoverage(value: Boolean): Self = this.set("collectCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollectCoverageFromVarargs(value: Glob*): Self = this.set("collectCoverageFrom", js.Array(value :_*))
    @scala.inline
    def setCollectCoverageFrom(value: js.Array[Glob]): Self = this.set("collectCoverageFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangedFiles(value: Set[Path]): Self = this.set("changedFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangedFiles: Self = this.set("changedFiles", js.undefined)
    @scala.inline
    def setCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = this.set("collectCoverageOnlyFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollectCoverageOnlyFrom: Self = this.set("collectCoverageOnlyFrom", js.undefined)
    @scala.inline
    def setCollectCoverageOnlyFromNull: Self = this.set("collectCoverageOnlyFrom", null)
  }
  
}

