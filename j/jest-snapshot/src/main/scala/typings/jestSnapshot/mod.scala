package typings.jestSnapshot

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.expect.readonlyprintExpectedvalu
import typings.expect.typesMod.Tester
import typings.jestSnapshot.stateMod.SnapshotStateOptions
import typings.jestSnapshot.stateMod.default
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import typings.jestTypes.configMod.SnapshotUpdateState
import typings.prettyFormat.typesMod.Plugin
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* Inlined expect.expect.MatcherState & {  snapshotState  :jest-snapshot.jest-snapshot/build/State.default} */
  @js.native
  trait Context extends js.Object {
    var assertionCalls: Double = js.native
    var currentTestName: js.UndefOr[String] = js.native
    var dontThrow: js.UndefOr[js.Function0[Unit]] = js.native
    var error: js.UndefOr[Error] = js.native
    var expand: js.UndefOr[Boolean] = js.native
    var expectedAssertionsNumber: js.UndefOr[Double] = js.native
    var isExpectingAssertions: js.UndefOr[Boolean] = js.native
    var isNot: Boolean = js.native
    var promise: String = js.native
    var snapshotState: default = js.native
    var suppressedErrors: js.Array[Error] = js.native
    var testPath: js.UndefOr[Path] = js.native
    var utils: readonlyprintExpectedvalu = js.native
    def equals(a: js.Any, b: js.Any): Boolean = js.native
    def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester]): Boolean = js.native
    def equals(a: js.Any, b: js.Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean = js.native
  }
  
  @js.native
  class SnapshotState protected () extends default {
    def this(snapshotPath: Path, options: SnapshotStateOptions) = this()
  }
  
  var EXTENSION: String = js.native
  var utils: Typeofutils = js.native
  def addSerializer(plugin: Plugin): Unit = js.native
  def buildSnapshotResolver(config: ProjectConfig): typings.jestSnapshot.snapshotResolverMod.SnapshotResolver = js.native
  def cleanup(
    hasteFS: typings.jestHasteMap.hasteFSMod.default,
    update: SnapshotUpdateState,
    snapshotResolver: typings.jestSnapshot.snapshotResolverMod.SnapshotResolver
  ): AnonFilesRemoved = js.native
  def cleanup(
    hasteFS: typings.jestHasteMap.hasteFSMod.default,
    update: SnapshotUpdateState,
    snapshotResolver: typings.jestSnapshot.snapshotResolverMod.SnapshotResolver,
    testPathIgnorePatterns: js.Array[String]
  ): AnonFilesRemoved = js.native
  def getSerializers(): js.Array[Plugin] = js.native
  def isSnapshotPath(path: String): Boolean = js.native
  def toMatchInlineSnapshot(received: js.Any): AnonExpected | AnonMessage | AnonName = js.native
  def toMatchInlineSnapshot(received: js.Any, propertyMatchersOrInlineSnapshot: js.Any): AnonExpected | AnonMessage | AnonName = js.native
  def toMatchInlineSnapshot(received: js.Any, propertyMatchersOrInlineSnapshot: js.Any, inlineSnapshot: String): AnonExpected | AnonMessage | AnonName = js.native
  def toMatchSnapshot(received: js.Any): AnonExpected | AnonMessage | AnonName = js.native
  def toMatchSnapshot(received: js.Any, propertyMatchers: js.Any): AnonExpected | AnonMessage | AnonName = js.native
  def toMatchSnapshot(received: js.Any, propertyMatchers: js.Any, hint: String): AnonExpected | AnonMessage | AnonName = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any): AnonExpected | AnonMessage | AnonName = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: js.UndefOr[scala.Nothing], fromPromise: Boolean): AnonExpected | AnonMessage | AnonName = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: String): AnonExpected | AnonMessage | AnonName = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: String, fromPromise: Boolean): AnonExpected | AnonMessage | AnonName = js.native
  def toThrowErrorMatchingSnapshot(received: js.Any, hint: js.UndefOr[scala.Nothing], fromPromise: Boolean): AnonExpected | AnonMessage | AnonName = js.native
  def toThrowErrorMatchingSnapshot(received: js.Any, hint: String, fromPromise: Boolean): AnonExpected | AnonMessage | AnonName = js.native
  @js.native
  object SnapshotState extends TopLevel[
          Instantiable2[/* snapshotPath */ Path, /* options */ SnapshotStateOptions, default]
        ]
  
  type SnapshotResolver = typings.jestSnapshot.snapshotResolverMod.SnapshotResolver
  type SnapshotStateType = default
}

