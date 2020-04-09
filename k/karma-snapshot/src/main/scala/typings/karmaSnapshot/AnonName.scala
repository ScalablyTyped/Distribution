package typings.karmaSnapshot

import typings.karmaSnapshot.mod.SnapshotSuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String
  var suite: SnapshotSuite
}

object AnonName {
  @scala.inline
  def apply(name: String, suite: SnapshotSuite): AnonName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonName]
  }
}

