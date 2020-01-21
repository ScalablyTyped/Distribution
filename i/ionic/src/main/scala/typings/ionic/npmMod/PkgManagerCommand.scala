package typings.ionic.npmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ionic.ionicStrings.dedupe
  - typings.ionic.ionicStrings.rebuild
  - typings.ionic.ionicStrings.install
  - typings.ionic.ionicStrings.uninstall
  - typings.ionic.ionicStrings.run
  - typings.ionic.ionicStrings.info
*/
trait PkgManagerCommand extends js.Object

object PkgManagerCommand {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dedupe: typings.ionic.ionicStrings.dedupe = this.cast("dedupe")
  @scala.inline
  def info: typings.ionic.ionicStrings.info = this.cast("info")
  @scala.inline
  def install: typings.ionic.ionicStrings.install = this.cast("install")
  @scala.inline
  def rebuild: typings.ionic.ionicStrings.rebuild = this.cast("rebuild")
  @scala.inline
  def run: typings.ionic.ionicStrings.run = this.cast("run")
  @scala.inline
  def uninstall: typings.ionic.ionicStrings.uninstall = this.cast("uninstall")
}

