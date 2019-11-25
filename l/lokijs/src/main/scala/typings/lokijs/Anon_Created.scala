package typings.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Created extends js.Object {
  var created: Double
   // Date().getTime()
  var revision: Double
  var updated: Double
   // Date().getTime()
  var version: Double
}

object Anon_Created {
  @scala.inline
  def apply(created: Double, revision: Double, updated: Double, version: Double): Anon_Created = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Created]
  }
}

