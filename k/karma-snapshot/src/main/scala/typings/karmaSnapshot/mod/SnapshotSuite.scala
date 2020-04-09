package typings.karmaSnapshot.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// these are required to correctly implement custom serializer
/**
  * a tree with snapshots that has a similar structure to test suites
  */
trait SnapshotSuite extends js.Object {
  /** references to children suites, */
  var children: StringDictionary[SnapshotSuite]
  var dirty: js.UndefOr[Boolean] = js.undefined
  /** snapshot lists for tests in the current snapshot */
  var snapshots: StringDictionary[js.Array[Snapshot]]
  var visited: js.UndefOr[Boolean] = js.undefined
}

object SnapshotSuite {
  @scala.inline
  def apply(
    children: StringDictionary[SnapshotSuite],
    snapshots: StringDictionary[js.Array[Snapshot]],
    dirty: js.UndefOr[Boolean] = js.undefined,
    visited: js.UndefOr[Boolean] = js.undefined
  ): SnapshotSuite = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any])
    if (!js.isUndefined(dirty)) __obj.updateDynamic("dirty")(dirty.asInstanceOf[js.Any])
    if (!js.isUndefined(visited)) __obj.updateDynamic("visited")(visited.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSuite]
  }
}

