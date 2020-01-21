package typings.jestSnapshot

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.expect.mod.MatcherState
import typings.jestSnapshot.stateMod.SnapshotStateOptions
import typings.jestSnapshot.stateMod.default
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import typings.jestTypes.configMod.SnapshotUpdateState
import typings.prettyFormat.typesMod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-snapshot", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  def toMatchInlineSnapshot(received: js.Any): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toMatchInlineSnapshot(received: js.Any, propertyMatchersOrInlineSnapshot: js.Any): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toMatchInlineSnapshot(received: js.Any, propertyMatchersOrInlineSnapshot: js.Any, inlineSnapshot: String): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toMatchSnapshot(received: js.Any): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toMatchSnapshot(received: js.Any, propertyMatchers: js.Any): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toMatchSnapshot(received: js.Any, propertyMatchers: js.Any, hint: String): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: js.UndefOr[scala.Nothing], fromPromise: Boolean): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: String): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: String, fromPromise: Boolean): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toThrowErrorMatchingSnapshot(received: js.Any, hint: js.UndefOr[scala.Nothing], fromPromise: Boolean): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  def toThrowErrorMatchingSnapshot(received: js.Any, hint: String, fromPromise: Boolean): AnonActualExpected | AnonActualExpectedMessage | AnonActualExpectedMessageName = js.native
  @js.native
  object SnapshotState extends TopLevel[
          Instantiable2[/* snapshotPath */ Path, /* options */ SnapshotStateOptions, default]
        ]
  
  type Context = MatcherState with AnonSnapshotState
  type SnapshotResolver = typings.jestSnapshot.snapshotResolverMod.SnapshotResolver
  type SnapshotStateType = default
}

