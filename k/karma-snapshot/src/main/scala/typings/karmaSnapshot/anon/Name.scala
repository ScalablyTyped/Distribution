package typings.karmaSnapshot.anon

import typings.karmaSnapshot.mod.SnapshotSuite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Name extends js.Object {
  var name: String
  var suite: SnapshotSuite
}

object Name {
  @scala.inline
  def apply(name: String, suite: SnapshotSuite): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
}

