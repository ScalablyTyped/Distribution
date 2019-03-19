package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Endmediasession extends js.Object {
  def end_media_session(): scala.Double
  def engage_media_proxy(): scala.Double
  def use_media_proxy(): scala.Double
}

object Anon_Endmediasession {
  @scala.inline
  def apply(
    end_media_session: () => scala.Double,
    engage_media_proxy: () => scala.Double,
    use_media_proxy: () => scala.Double
  ): Anon_Endmediasession = {
    val __obj = js.Dynamic.literal(end_media_session = js.Any.fromFunction0(end_media_session), engage_media_proxy = js.Any.fromFunction0(engage_media_proxy), use_media_proxy = js.Any.fromFunction0(use_media_proxy))
  
    __obj.asInstanceOf[Anon_Endmediasession]
  }
}

