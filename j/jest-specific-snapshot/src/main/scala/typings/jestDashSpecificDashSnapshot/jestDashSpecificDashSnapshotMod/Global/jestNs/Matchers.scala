package typings.jestDashSpecificDashSnapshot.jestDashSpecificDashSnapshotMod.Global.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R] extends js.Object {
  def toMatchSpecificSnapshot(snapshotFilename: String): R
}

object Matchers {
  @scala.inline
  def apply[R](toMatchSpecificSnapshot: String => R): Matchers[R] = {
    val __obj = js.Dynamic.literal(toMatchSpecificSnapshot = js.Any.fromFunction1(toMatchSpecificSnapshot))
  
    __obj.asInstanceOf[Matchers[R]]
  }
}

