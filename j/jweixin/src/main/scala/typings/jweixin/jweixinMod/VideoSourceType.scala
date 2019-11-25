package typings.jweixin.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jweixin.jweixinStrings.album
  - typings.jweixin.jweixinStrings.camera
*/
trait VideoSourceType extends js.Object

object VideoSourceType {
  @scala.inline
  def album: typings.jweixin.jweixinStrings.album = this.cast("album")
  @scala.inline
  def camera: typings.jweixin.jweixinStrings.camera = this.cast("camera")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

