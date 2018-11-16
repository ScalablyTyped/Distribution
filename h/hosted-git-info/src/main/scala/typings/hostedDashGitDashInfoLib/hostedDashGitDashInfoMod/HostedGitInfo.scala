package typings
package hostedDashGitDashInfoLib.hostedDashGitDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedGitInfo extends js.Object {
  var auth: java.lang.String | scala.Null = js.native
  var browsefiletemplate: java.lang.String = js.native
  var browsetemplate: java.lang.String = js.native
  var bugstemplate: java.lang.String = js.native
  var committish: java.lang.String | scala.Null = js.native
  var default: java.lang.String = js.native
  var docstemplate: java.lang.String = js.native
  var domain: java.lang.String = js.native
  var filetemplate: java.lang.String = js.native
  var gittemplate: java.lang.String = js.native
  var host: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.hosts = js.native
  var httpstemplate: java.lang.String = js.native
  var opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.Options = js.native
  var pathmatch: stdLib.RegExp = js.native
  var pathtemplate: java.lang.String = js.native
  var project: java.lang.String | scala.Null = js.native
  // special
  var protocols: js.Array[java.lang.String] = js.native
  var protocols_re: stdLib.RegExp = js.native
  var shortcuttemplate: java.lang.String = js.native
  // From git-host-info
  // defaults
  var sshtemplate: java.lang.String = js.native
  var sshurltemplate: java.lang.String = js.native
  var tarballtemplate: java.lang.String = js.native
  var treepath: java.lang.String = js.native
  var user: java.lang.String | scala.Null = js.native
  def browse(): js.UndefOr[java.lang.String] = js.native
  def browse(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
  def browse(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def browse(path: java.lang.String, fragment: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def browse(
    path: java.lang.String,
    fragment: java.lang.String,
    opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions
  ): js.UndefOr[java.lang.String] = js.native
  def browse(
    path: java.lang.String,
    opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions
  ): js.UndefOr[java.lang.String] = js.native
  def bugs(): js.UndefOr[java.lang.String] = js.native
  def bugs(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
  def docs(): js.UndefOr[java.lang.String] = js.native
  def docs(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
  def file(path: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def file(
    path: java.lang.String,
    opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions
  ): js.UndefOr[java.lang.String] = js.native
  def getDefaultRepresentation(): java.lang.String = js.native
  def git(): js.UndefOr[java.lang.String] = js.native
  def git(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
  // /From git-host-info
  def hash(): java.lang.String = js.native
  def hashformat(fragment: java.lang.String): java.lang.String = js.native
  def https(): js.UndefOr[java.lang.String] = js.native
  def https(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
  def path(): js.UndefOr[java.lang.String] = js.native
  def path(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
  def shortcut(): js.UndefOr[java.lang.String] = js.native
  def shortcut(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
  def ssh(): js.UndefOr[java.lang.String] = js.native
  def ssh(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
  def sshurl(): js.UndefOr[java.lang.String] = js.native
  def sshurl(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
  def tarball(): js.UndefOr[java.lang.String] = js.native
  def tarball(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
  def toString(opts: hostedDashGitDashInfoLib.hostedDashGitDashInfoMod.HostedGitInfoNs.FillOptions): js.UndefOr[java.lang.String] = js.native
}

