package typings.jestSnapshot.inlineSnapshotsMod

import typings.jestSnapshot.typesMod.BabelTraverse
import typings.jestSnapshot.typesMod.Prettier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jest-snapshot/build/InlineSnapshots", "saveInlineSnapshots")
@js.native
object saveInlineSnapshots extends js.Object {
  
  def apply(snapshots: js.Array[InlineSnapshot], prettier: Null, babelTraverse: BabelTraverse): Unit = js.native
  def apply(snapshots: js.Array[InlineSnapshot], prettier: Prettier, babelTraverse: BabelTraverse): Unit = js.native
}
