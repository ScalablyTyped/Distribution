package typings.karmaSnapshot.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// these are required to correctly implement custom serializer
/**
  * a tree with snapshots that has a similar structure to test suites
  */
@js.native
trait SnapshotSuite extends js.Object {
  /** references to children suites, */
  var children: StringDictionary[SnapshotSuite] = js.native
  var dirty: js.UndefOr[Boolean] = js.native
  /** snapshot lists for tests in the current snapshot */
  var snapshots: StringDictionary[js.Array[Snapshot]] = js.native
  var visited: js.UndefOr[Boolean] = js.native
}

object SnapshotSuite {
  @scala.inline
  def apply(children: StringDictionary[SnapshotSuite], snapshots: StringDictionary[js.Array[Snapshot]]): SnapshotSuite = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotSuite]
  }
  @scala.inline
  implicit class SnapshotSuiteOps[Self <: SnapshotSuite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: StringDictionary[SnapshotSuite]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshots(value: StringDictionary[js.Array[Snapshot]]): Self = this.set("snapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirty: Self = this.set("dirty", js.undefined)
    @scala.inline
    def setVisited(value: Boolean): Self = this.set("visited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisited: Self = this.set("visited", js.undefined)
  }
  
}

