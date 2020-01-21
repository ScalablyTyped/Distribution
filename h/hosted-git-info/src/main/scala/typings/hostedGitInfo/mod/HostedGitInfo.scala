package typings.hostedGitInfo.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedGitInfo extends js.Object {
  var auth: String | Null = js.native
  var browsefiletemplate: String = js.native
  var browsetemplate: String = js.native
  var bugstemplate: String = js.native
  var committish: String | Null = js.native
  var default: String = js.native
  var docstemplate: String = js.native
  var domain: String = js.native
  var filetemplate: String = js.native
  var gittemplate: String = js.native
  var host: hosts = js.native
  var httpstemplate: String = js.native
  var opts: Options = js.native
  var pathmatch: RegExp = js.native
  var pathtemplate: String = js.native
  var project: String | Null = js.native
  // special
  var protocols: js.Array[String] = js.native
  var protocols_re: RegExp = js.native
  var shortcuttemplate: String = js.native
  // From git-host-info
  // defaults
  var sshtemplate: String = js.native
  var sshurltemplate: String = js.native
  var tarballtemplate: String = js.native
  var treepath: String = js.native
  var user: String | Null = js.native
  def browse(): js.UndefOr[String] = js.native
  def browse(opts: FillOptions): js.UndefOr[String] = js.native
  def browse(path: String): js.UndefOr[String] = js.native
  def browse(path: String, fragment: String): js.UndefOr[String] = js.native
  def browse(path: String, fragment: String, opts: FillOptions): js.UndefOr[String] = js.native
  def browse(path: String, opts: FillOptions): js.UndefOr[String] = js.native
  def bugs(): js.UndefOr[String] = js.native
  def bugs(opts: FillOptions): js.UndefOr[String] = js.native
  def docs(): js.UndefOr[String] = js.native
  def docs(opts: FillOptions): js.UndefOr[String] = js.native
  def file(path: String): js.UndefOr[String] = js.native
  def file(path: String, opts: FillOptions): js.UndefOr[String] = js.native
  def getDefaultRepresentation(): String = js.native
  def git(): js.UndefOr[String] = js.native
  def git(opts: FillOptions): js.UndefOr[String] = js.native
  // /From git-host-info
  def hash(): String = js.native
  def hashformat(fragment: String): String = js.native
  def https(): js.UndefOr[String] = js.native
  def https(opts: FillOptions): js.UndefOr[String] = js.native
  def path(): js.UndefOr[String] = js.native
  def path(opts: FillOptions): js.UndefOr[String] = js.native
  def shortcut(): js.UndefOr[String] = js.native
  def shortcut(opts: FillOptions): js.UndefOr[String] = js.native
  def ssh(): js.UndefOr[String] = js.native
  def ssh(opts: FillOptions): js.UndefOr[String] = js.native
  def sshurl(): js.UndefOr[String] = js.native
  def sshurl(opts: FillOptions): js.UndefOr[String] = js.native
  def tarball(): js.UndefOr[String] = js.native
  def tarball(opts: FillOptions): js.UndefOr[String] = js.native
  def toString(opts: FillOptions): js.UndefOr[String] = js.native
}

