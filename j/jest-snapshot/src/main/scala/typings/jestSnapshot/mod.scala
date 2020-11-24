package typings.jestSnapshot

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.jestHasteMap.mod.FS
import typings.jestSnapshot.anon.FilesRemoved
import typings.jestSnapshot.anon.Typeofutils
import typings.jestSnapshot.stateMod.SnapshotStateOptions
import typings.jestSnapshot.stateMod.default
import typings.jestSnapshot.typesMod.ExpectationResult
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import typings.jestTypes.configMod.SnapshotUpdateState
import typings.prettyFormat.typesMod.Plugin
import typings.prettyFormat.typesMod.Plugins
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-snapshot", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  var EXTENSION: String = js.native
  
  def addSerializer(plugin: Plugin): Unit = js.native
  
  def buildSnapshotResolver(config: ProjectConfig): typings.jestSnapshot.snapshotResolverMod.SnapshotResolver = js.native
  
  def cleanup(
    hasteFS: FS,
    update: SnapshotUpdateState,
    snapshotResolver: typings.jestSnapshot.snapshotResolverMod.SnapshotResolver
  ): FilesRemoved = js.native
  def cleanup(
    hasteFS: FS,
    update: SnapshotUpdateState,
    snapshotResolver: typings.jestSnapshot.snapshotResolverMod.SnapshotResolver,
    testPathIgnorePatterns: js.Array[String]
  ): FilesRemoved = js.native
  
  def getSerializers(): Plugins = js.native
  
  def isSnapshotPath(path: String): Boolean = js.native
  
  def toMatchInlineSnapshot(received: js.Any): ExpectationResult = js.native
  def toMatchInlineSnapshot(received: js.Any, propertiesOrSnapshot: js.UndefOr[scala.Nothing], inlineSnapshot: String): ExpectationResult = js.native
  def toMatchInlineSnapshot(received: js.Any, propertiesOrSnapshot: String): ExpectationResult = js.native
  def toMatchInlineSnapshot(received: js.Any, propertiesOrSnapshot: String, inlineSnapshot: String): ExpectationResult = js.native
  def toMatchInlineSnapshot(received: js.Any, propertiesOrSnapshot: js.Object): ExpectationResult = js.native
  def toMatchInlineSnapshot(received: js.Any, propertiesOrSnapshot: js.Object, inlineSnapshot: String): ExpectationResult = js.native
  
  def toMatchSnapshot(received: js.Any): ExpectationResult = js.native
  def toMatchSnapshot(received: js.Any, propertiesOrHint: js.UndefOr[scala.Nothing], hint: String): ExpectationResult = js.native
  def toMatchSnapshot(received: js.Any, propertiesOrHint: String): ExpectationResult = js.native
  def toMatchSnapshot(received: js.Any, propertiesOrHint: String, hint: String): ExpectationResult = js.native
  def toMatchSnapshot(received: js.Any, propertiesOrHint: js.Object): ExpectationResult = js.native
  def toMatchSnapshot(received: js.Any, propertiesOrHint: js.Object, hint: String): ExpectationResult = js.native
  
  def toThrowErrorMatchingInlineSnapshot(received: js.Any): ExpectationResult = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: js.UndefOr[scala.Nothing], fromPromise: Boolean): ExpectationResult = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: String): ExpectationResult = js.native
  def toThrowErrorMatchingInlineSnapshot(received: js.Any, inlineSnapshot: String, fromPromise: Boolean): ExpectationResult = js.native
  
  def toThrowErrorMatchingSnapshot(received: js.Any, hint: js.UndefOr[scala.Nothing], fromPromise: Boolean): ExpectationResult = js.native
  def toThrowErrorMatchingSnapshot(received: js.Any, hint: String, fromPromise: Boolean): ExpectationResult = js.native
  
  var utils: Typeofutils = js.native
  
  @js.native
  class SnapshotState protected () extends default {
    def this(snapshotPath: Path, options: SnapshotStateOptions) = this()
  }
  @js.native
  object SnapshotState extends TopLevel[
          Instantiable2[/* snapshotPath */ Path, /* options */ SnapshotStateOptions, default]
        ]
  
  type SnapshotResolver = typings.jestSnapshot.snapshotResolverMod.SnapshotResolver
  
  type SnapshotStateType = default
}
