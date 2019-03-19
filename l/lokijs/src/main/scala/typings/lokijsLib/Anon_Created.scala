package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Created extends js.Object {
  var created: scala.Double
   // Date().getTime()
  var revision: scala.Double
  var updated: scala.Double
   // Date().getTime()
  var version: scala.Double
}

object Anon_Created {
  @scala.inline
  def apply(created: scala.Double, revision: scala.Double, updated: scala.Double, version: scala.Double): Anon_Created = {
    val __obj = js.Dynamic.literal(created = created, revision = revision, updated = updated, version = version)
  
    __obj.asInstanceOf[Anon_Created]
  }
}

