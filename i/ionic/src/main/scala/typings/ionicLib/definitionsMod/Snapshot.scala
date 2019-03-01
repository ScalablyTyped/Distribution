package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Snapshot extends js.Object {
  var created: java.lang.String
  var id: java.lang.String
  var note: java.lang.String
  var ref: java.lang.String
  var sha: java.lang.String
  var state: java.lang.String
}

object Snapshot {
  @scala.inline
  def apply(
    created: java.lang.String,
    id: java.lang.String,
    note: java.lang.String,
    ref: java.lang.String,
    sha: java.lang.String,
    state: java.lang.String
  ): Snapshot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("note")(note)
    __obj.updateDynamic("ref")(ref)
    __obj.updateDynamic("sha")(sha)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Snapshot]
  }
}

