package typings
package istanbulDashLibDashSourceDashMapsLib.istanbulDashLibDashSourceDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStore extends js.Object {
  var baseDir: java.lang.String | scala.Null
  var data: org.scalablytyped.runtime.StringDictionary[istanbulDashLibDashSourceDashMapsLib.Anon_Data]
  var sourceStore: SourceStore
  var verbose: scala.Boolean
  def dispose(): scala.Unit
  def registerMap(filename: java.lang.String, sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap): scala.Unit
  def registerURL(transformedFilePath: java.lang.String, sourceMapUrl: java.lang.String): scala.Unit
  def transformCoverage(coverageMap: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap): istanbulDashLibDashSourceDashMapsLib.Anon_Map
}

object MapStore {
  @scala.inline
  def apply(
    data: org.scalablytyped.runtime.StringDictionary[istanbulDashLibDashSourceDashMapsLib.Anon_Data],
    dispose: js.Function0[scala.Unit],
    registerMap: js.Function2[java.lang.String, sourceDashMapLib.sourceDashMapMod.RawSourceMap, scala.Unit],
    registerURL: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    sourceStore: SourceStore,
    transformCoverage: js.Function1[
      istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap, 
      istanbulDashLibDashSourceDashMapsLib.Anon_Map
    ],
    verbose: scala.Boolean,
    baseDir: java.lang.String = null
  ): MapStore = {
    val __obj = js.Dynamic.literal(data = data, dispose = dispose, registerMap = registerMap, registerURL = registerURL, sourceStore = sourceStore, transformCoverage = transformCoverage, verbose = verbose)
    if (baseDir != null) __obj.updateDynamic("baseDir")(baseDir)
    __obj.asInstanceOf[MapStore]
  }
}

