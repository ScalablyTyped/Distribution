package typings.istanbulDashLibDashSourceDashMaps.istanbulDashLibDashSourceDashMapsMod

import org.scalablytyped.runtime.StringDictionary
import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageMap
import typings.istanbulDashLibDashSourceDashMaps.Anon_Data
import typings.istanbulDashLibDashSourceDashMaps.Anon_Map
import typings.sourceDashMap.sourceDashMapMod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStore extends js.Object {
  var baseDir: String | Null
  var data: StringDictionary[Anon_Data]
  var sourceStore: SourceStore
  var verbose: Boolean
  def dispose(): Unit
  def registerMap(filename: String, sourceMap: RawSourceMap): Unit
  def registerURL(transformedFilePath: String, sourceMapUrl: String): Unit
  def transformCoverage(coverageMap: CoverageMap): Anon_Map
}

object MapStore {
  @scala.inline
  def apply(
    data: StringDictionary[Anon_Data],
    dispose: () => Unit,
    registerMap: (String, RawSourceMap) => Unit,
    registerURL: (String, String) => Unit,
    sourceStore: SourceStore,
    transformCoverage: CoverageMap => Anon_Map,
    verbose: Boolean,
    baseDir: String = null
  ): MapStore = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), registerMap = js.Any.fromFunction2(registerMap), registerURL = js.Any.fromFunction2(registerURL), sourceStore = sourceStore.asInstanceOf[js.Any], transformCoverage = js.Any.fromFunction1(transformCoverage), verbose = verbose.asInstanceOf[js.Any])
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStore]
  }
}

