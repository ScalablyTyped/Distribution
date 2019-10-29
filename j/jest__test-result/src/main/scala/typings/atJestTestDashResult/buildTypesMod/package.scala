package typings.atJestTestDashResult

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildTypesMod {
  import typings.atJestTestDashResult.Anon_CoverageMap
  import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageMapData
  import typings.std.Record

  type AggregatedResult = AggregatedResultWithoutCoverage with Anon_CoverageMap
  type Bytes = Double
  type CodeCoverageFormatter = js.Function2[
    /* coverage */ js.UndefOr[CoverageMapData | Null], 
    /* reporter */ CodeCoverageReporter, 
    js.UndefOr[(Record[String, js.Any]) | Null]
  ]
  type CodeCoverageReporter = js.Any
  type Milliseconds = Double
}
