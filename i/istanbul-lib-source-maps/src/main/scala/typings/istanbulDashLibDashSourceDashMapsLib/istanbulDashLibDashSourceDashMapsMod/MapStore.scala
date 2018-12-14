package typings
package istanbulDashLibDashSourceDashMapsLib.istanbulDashLibDashSourceDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MapStore extends js.Object {
  var baseDir: java.lang.String | scala.Null
  var data: org.scalablytyped.runtime.StringDictionary[istanbulDashLibDashSourceDashMapsLib.Anon_Type]
  var sourceStore: SourceStore
  var verbose: scala.Boolean
  def dispose(): scala.Unit
  def registerMap(filename: java.lang.String, sourceMap: sourceDashMapLib.sourceDashMapMod.RawSourceMap): scala.Unit
  def registerURL(transformedFilePath: java.lang.String, sourceMapUrl: java.lang.String): scala.Unit
  def transformCoverage(coverageMap: istanbulDashLibDashCoverageLib.istanbulDashLibDashCoverageMod.CoverageMap): istanbulDashLibDashSourceDashMapsLib.Anon_SourceFinder
}

