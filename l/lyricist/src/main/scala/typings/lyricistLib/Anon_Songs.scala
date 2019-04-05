package typings
package lyricistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Songs extends js.Object {
  var songs: js.Array[_]
  var `type`: java.lang.String
}

object Anon_Songs {
  @scala.inline
  def apply(songs: js.Array[_], `type`: java.lang.String): Anon_Songs = {
    val __obj = js.Dynamic.literal(songs = songs)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Songs]
  }
}

