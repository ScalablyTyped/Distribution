package typings.jestDashSpecificDashSnapshot.jestDashSpecificDashSnapshotMod._Global_.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R, T] extends js.Object {
  def toMatchSpecificSnapshot(snapshotFilename: String): R
}

object Matchers {
  @scala.inline
  def apply[R, T](toMatchSpecificSnapshot: String => R): Matchers[R, T] = {
    val __obj = js.Dynamic.literal(toMatchSpecificSnapshot = js.Any.fromFunction1(toMatchSpecificSnapshot))
  
    __obj.asInstanceOf[Matchers[R, T]]
  }
}

