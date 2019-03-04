package typings
package jestDashSpecificDashSnapshotLib.jestDashSpecificDashSnapshotMod.Global.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Matchers[R] extends js.Object {
  def toMatchSpecificSnapshot(snapshotFilename: java.lang.String): R
}

object Matchers {
  @scala.inline
  def apply[R](toMatchSpecificSnapshot: js.Function1[java.lang.String, R]): Matchers[R] = {
    val __obj = js.Dynamic.literal(toMatchSpecificSnapshot = toMatchSpecificSnapshot)
  
    __obj.asInstanceOf[Matchers[R]]
  }
}

