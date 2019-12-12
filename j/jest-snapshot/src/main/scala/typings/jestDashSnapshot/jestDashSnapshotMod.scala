package typings.jestDashSnapshot

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.atJestTypes.buildConfigMod.SnapshotUpdateState
import typings.expect.expectMod.MatcherState
import typings.jestDashSnapshot.buildStateMod.SnapshotStateOptions
import typings.jestDashSnapshot.buildStateMod.default
import typings.jestDashSnapshot.jestDashSnapshotMod.Context
import typings.prettyDashFormat.buildTypesMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot", JSImport.Namespace)
@js.native
object jestDashSnapshotMod extends js.Object {
  @js.native
  class SnapshotState protected () extends default {
    def this(snapshotPath: Path, options: SnapshotStateOptions) = this()
  }
  
  var EXTENSION: String = js.native
  var utils: Typeofutils = js.native
  def addSerializer(plugin: Plugin): Unit = js.native
  def buildSnapshotResolver(config: ProjectConfig): typings.jestDashSnapshot.buildSnapshotUnderscoreResolverMod.SnapshotResolver = js.native
  def cleanup(
    hasteFS: typings.jestDashHasteDashMap.buildHasteFSMod.default,
    update: SnapshotUpdateState,
    snapshotResolver: typings.jestDashSnapshot.buildSnapshotUnderscoreResolverMod.SnapshotResolver
  ): Anon_FilesRemoved = js.native
  def cleanup(
    hasteFS: typings.jestDashHasteDashMap.buildHasteFSMod.default,
    update: SnapshotUpdateState,
    snapshotResolver: typings.jestDashSnapshot.buildSnapshotUnderscoreResolverMod.SnapshotResolver,
    testPathIgnorePatterns: js.Array[String]
  ): Anon_FilesRemoved = js.native
  def getSerializers(): js.Array[Plugin] = js.native
  def isSnapshotPath(path: String): Boolean = js.native
  def toMatchInlineSnapshot(`this`: Context, received: js.Any): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toMatchInlineSnapshot(`this`: Context, received: js.Any, propertyMatchersOrInlineSnapshot: js.Any): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toMatchInlineSnapshot(
    `this`: Context,
    received: js.Any,
    propertyMatchersOrInlineSnapshot: js.Any,
    inlineSnapshot: String
  ): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toMatchSnapshot(`this`: Context, received: js.Any): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toMatchSnapshot(`this`: Context, received: js.Any, propertyMatchers: js.Any): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toMatchSnapshot(`this`: Context, received: js.Any, propertyMatchers: js.Any, hint: String): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(`this`: Context, received: js.Any): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(`this`: Context, received: js.Any, inlineSnapshot: js.UndefOr[scala.Nothing], fromPromise: Boolean): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(`this`: Context, received: js.Any, inlineSnapshot: String): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(`this`: Context, received: js.Any, inlineSnapshot: String, fromPromise: Boolean): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingSnapshot(`this`: Context, received: js.Any, hint: js.UndefOr[scala.Nothing], fromPromise: Boolean): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  def toThrowErrorMatchingSnapshot(`this`: Context, received: js.Any, hint: String, fromPromise: Boolean): Anon_ActualExpected | Anon_ActualExpectedMessage | Anon_ActualExpectedMessageName = js.native
  @js.native
  object SnapshotState extends TopLevel[
          Instantiable2[/* snapshotPath */ Path, /* options */ SnapshotStateOptions, default]
        ]
  
  type Context = MatcherState with Anon_SnapshotState
  type SnapshotResolver = typings.jestDashSnapshot.buildSnapshotUnderscoreResolverMod.SnapshotResolver
  type SnapshotStateType = default
}

