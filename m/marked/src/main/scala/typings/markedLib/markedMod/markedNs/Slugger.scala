package typings
package markedLib.markedMod.markedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Slugger extends js.Object {
  def slug(value: java.lang.String): java.lang.String
}

object Slugger {
  @scala.inline
  def apply(slug: java.lang.String => java.lang.String): Slugger = {
    val __obj = js.Dynamic.literal(slug = js.Any.fromFunction1(slug))
  
    __obj.asInstanceOf[Slugger]
  }
}

