package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Created extends js.Object {
  var created: Double
   // Date().getTime()
  var revision: Double
  var updated: Double
   // Date().getTime()
  var version: Double
}

object Created {
  @scala.inline
  def apply(created: Double, revision: Double, updated: Double, version: Double): Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created]
  }
}

