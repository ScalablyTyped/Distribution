package typings.loaderDashUtils.loaderDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.loaderDashUtils.loaderDashUtilsStrings.sha1
  - typings.loaderDashUtils.loaderDashUtilsStrings.md5
  - typings.loaderDashUtils.loaderDashUtilsStrings.sha256
  - typings.loaderDashUtils.loaderDashUtilsStrings.sha512
*/
trait HashType extends js.Object

object HashType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def md5: typings.loaderDashUtils.loaderDashUtilsStrings.md5 = this.cast("md5")
  @scala.inline
  def sha1: typings.loaderDashUtils.loaderDashUtilsStrings.sha1 = this.cast("sha1")
  @scala.inline
  def sha256: typings.loaderDashUtils.loaderDashUtilsStrings.sha256 = this.cast("sha256")
  @scala.inline
  def sha512: typings.loaderDashUtils.loaderDashUtilsStrings.sha512 = this.cast("sha512")
}

