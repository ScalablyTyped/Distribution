package typings.jestTransform.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.jestTypes.configMod.CoverageProvider
import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.Path
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @jest/transform.@jest/transform/build/types.ShouldInstrumentOptions & std.Partial<{  isCoreModule :boolean,   isInternalModule :boolean}> & @jest/transform.@jest/transform/build/types.CallerTransformOptions */
@js.native
trait Options extends js.Object {
  
  var changedFiles: js.UndefOr[Set[Path]] = js.native
  
  var collectCoverage: Boolean = js.native
  
  var collectCoverageFrom: js.Array[Glob] = js.native
  
  var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var coverageProvider: CoverageProvider = js.native
  
  var isCoreModule: js.UndefOr[Boolean] = js.native
  
  var isInternalModule: js.UndefOr[Boolean] = js.native
  
  var sourcesRelatedToTestsInChangedFiles: js.UndefOr[Set[Path]] = js.native
  
  var supportsDynamicImport: js.UndefOr[Boolean] = js.native
  
  var supportsExportNamespaceFrom: js.UndefOr[Boolean] = js.native
  
  var supportsStaticESM: js.UndefOr[Boolean] = js.native
  
  var supportsTopLevelAwait: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(collectCoverage: Boolean, collectCoverageFrom: js.Array[Glob], coverageProvider: CoverageProvider): Options = {
    val __obj = js.Dynamic.literal(collectCoverage = collectCoverage.asInstanceOf[js.Any], collectCoverageFrom = collectCoverageFrom.asInstanceOf[js.Any], coverageProvider = coverageProvider.asInstanceOf[js.Any])
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
    def setCoverageProvider(value: CoverageProvider): Self = this.set("coverageProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangedFiles(value: Set[Path]): Self = this.set("changedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangedFiles: Self = this.set("changedFiles", js.undefined)
    
    @scala.inline
    def setCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = this.set("collectCoverageOnlyFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectCoverageOnlyFrom: Self = this.set("collectCoverageOnlyFrom", js.undefined)
    
    @scala.inline
    def setIsCoreModule(value: Boolean): Self = this.set("isCoreModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCoreModule: Self = this.set("isCoreModule", js.undefined)
    
    @scala.inline
    def setIsInternalModule(value: Boolean): Self = this.set("isInternalModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsInternalModule: Self = this.set("isInternalModule", js.undefined)
    
    @scala.inline
    def setSourcesRelatedToTestsInChangedFiles(value: Set[Path]): Self = this.set("sourcesRelatedToTestsInChangedFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourcesRelatedToTestsInChangedFiles: Self = this.set("sourcesRelatedToTestsInChangedFiles", js.undefined)
    
    @scala.inline
    def setSupportsDynamicImport(value: Boolean): Self = this.set("supportsDynamicImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsDynamicImport: Self = this.set("supportsDynamicImport", js.undefined)
    
    @scala.inline
    def setSupportsExportNamespaceFrom(value: Boolean): Self = this.set("supportsExportNamespaceFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsExportNamespaceFrom: Self = this.set("supportsExportNamespaceFrom", js.undefined)
    
    @scala.inline
    def setSupportsStaticESM(value: Boolean): Self = this.set("supportsStaticESM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsStaticESM: Self = this.set("supportsStaticESM", js.undefined)
    
    @scala.inline
    def setSupportsTopLevelAwait(value: Boolean): Self = this.set("supportsTopLevelAwait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsTopLevelAwait: Self = this.set("supportsTopLevelAwait", js.undefined)
  }
}
