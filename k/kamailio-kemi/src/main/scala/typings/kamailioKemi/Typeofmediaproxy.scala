package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofmediaproxy extends js.Object {
  def end_media_session(): Double
  def engage_media_proxy(): Double
  def use_media_proxy(): Double
}

object Typeofmediaproxy {
  @scala.inline
  def apply(end_media_session: () => Double, engage_media_proxy: () => Double, use_media_proxy: () => Double): Typeofmediaproxy = {
    val __obj = js.Dynamic.literal(end_media_session = js.Any.fromFunction0(end_media_session), engage_media_proxy = js.Any.fromFunction0(engage_media_proxy), use_media_proxy = js.Any.fromFunction0(use_media_proxy))
  
    __obj.asInstanceOf[Typeofmediaproxy]
  }
}

