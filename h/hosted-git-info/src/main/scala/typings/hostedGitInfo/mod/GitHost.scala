package typings.hostedGitInfo.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitHost extends js.Object {
  var auth: js.UndefOr[String] = js.native
  var browsefiletemplate: String = js.native
  var browsetemplate: String = js.native
  var bugstemplate: String = js.native
  var committish: js.UndefOr[String] = js.native
  var default: String = js.native
  var docstemplate: String = js.native
  var domain: String = js.native
  var filetemplate: String = js.native
  var gittemplate: js.UndefOr[String] = js.native
  var httpstemplate: String = js.native
  var opts: Options = js.native
  var pathmatch: RegExp = js.native
  var pathtemplate: String = js.native
  var project: String = js.native
  var protocols: js.Array[String] = js.native
  var protocols_re: RegExp = js.native
  var shortcuttemplate: String = js.native
  // Templates
  var sshtemplate: String = js.native
  var sshurltemplate: String = js.native
  var tarballtemplate: String = js.native
  var treepath: js.UndefOr[String] = js.native
  var `type`: Hosts = js.native
  var user: String = js.native
  def browse(): String = js.native
  def browse(opts: FillOptions): String = js.native
  def browse(path: String): String = js.native
  def browse(path: String, fragment: String): String = js.native
  def browse(path: String, fragment: String, opts: FillOptions): String = js.native
  def browse(path: String, opts: FillOptions): String = js.native
  def bugs(): String = js.native
  def bugs(opts: FillOptions): String = js.native
  def docs(): String = js.native
  def docs(opts: FillOptions): String = js.native
  def file(path: String): String = js.native
  def file(path: String, opts: FillOptions): String = js.native
  def getDefaultRepresentation(): String = js.native
  def git(): String = js.native
  def git(opts: FillOptions): String = js.native
  def hash(): String = js.native
  def hashformat(fragment: String): String = js.native
  def https(): String = js.native
  def https(opts: FillOptions): String = js.native
  def path(): String = js.native
  def path(opts: FillOptions): String = js.native
  def shortcut(): String = js.native
  def shortcut(opts: FillOptions): String = js.native
  def ssh(): String = js.native
  def ssh(opts: FillOptions): String = js.native
  def sshurl(): String = js.native
  def sshurl(opts: FillOptions): String = js.native
  def tarball(): String = js.native
  def tarball(opts: FillOptions): String = js.native
  def toString(opts: FillOptions): String = js.native
}

