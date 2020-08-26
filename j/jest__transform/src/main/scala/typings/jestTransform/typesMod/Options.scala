package typings.jestTransform.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @jest/transform.@jest/transform/build/types.ShouldInstrumentOptions & std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'extraGlobals'> & {  isCoreModule :boolean | undefined,   isInternalModule :boolean | undefined} */
@js.native
trait Options extends js.Object {
  var changedFiles: js.UndefOr[Set[Path]] = js.native
  var collectCoverage: Boolean = js.native
  var collectCoverageFrom: js.Array[Glob] = js.native
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean] | Null] = js.native
  var extraGlobals: js.Array[String] = js.native
  var isCoreModule: js.UndefOr[Boolean] = js.native
  var isInternalModule: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(collectCoverage: Boolean, collectCoverageFrom: js.Array[Glob], extraGlobals: js.Array[String]): Options = {
    val __obj = js.Dynamic.literal(collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], extraGlobals = extraGlobals.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setExtraGlobalsVarargs(value: String*): Self = this.set("extraGlobals", js.Array(value :_*))
    @scala.inline
    def setExtraGlobals(value: js.Array[String]): Self = this.set("extraGlobals", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setIsCoreModule(value: Boolean): Self = this.set("isCoreModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCoreModule: Self = this.set("isCoreModule", js.undefined)
    @scala.inline
    def setIsInternalModule(value: Boolean): Self = this.set("isInternalModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInternalModule: Self = this.set("isInternalModule", js.undefined)
  }
  
}

