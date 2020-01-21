package typings.jestCore.snapshotInteractiveModeMod

import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTestResult.typesMod.AssertionLocation
import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/core/build/SnapshotInteractiveMode", JSImport.Default)
@js.native
class default protected () extends SnapshotInteractiveMode {
  def this(pipe: WritableStream) = this()
  /* CompleteClass */
  override var _clearTestSummary: js.Any = js.native
  /* CompleteClass */
  override var _countPaths: js.Any = js.native
  /* CompleteClass */
  override var _drawUIDone: js.Any = js.native
  /* CompleteClass */
  override var _drawUIDoneWithSkipped: js.Any = js.native
  /* CompleteClass */
  override var _drawUIOverlay: js.Any = js.native
  /* CompleteClass */
  override var _drawUIProgress: js.Any = js.native
  /* CompleteClass */
  override var _isActive: js.Any = js.native
  /* CompleteClass */
  override var _pipe: js.Any = js.native
  /* CompleteClass */
  override var _run: js.Any = js.native
  /* CompleteClass */
  override var _skippedNum: js.Any = js.native
  /* CompleteClass */
  override var _testAssertions: js.Any = js.native
  /* CompleteClass */
  override var _updateTestRunnerConfig: js.Any = js.native
  /* CompleteClass */
  override def abort(): Unit = js.native
  /* CompleteClass */
  override def getSkippedNum(): Double = js.native
  /* CompleteClass */
  override def isActive(): Boolean = js.native
  /* CompleteClass */
  override def put(key: String): Unit = js.native
  /* CompleteClass */
  override def restart(): Unit = js.native
  /* CompleteClass */
  override def run(
    failedSnapshotTestAssertions: js.Array[AssertionLocation],
    onConfigChange: js.Function2[/* assertion */ AssertionLocation | Null, /* shouldUpdateSnapshot */ Boolean, _]
  ): Unit = js.native
  /* CompleteClass */
  override def updateWithResults(results: AggregatedResult): Unit = js.native
}

