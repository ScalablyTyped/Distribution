package typings.hostedDashGitDashInfo.hostedDashGitDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hostedDashGitDashInfo.hostedDashGitDashInfoStrings.github
  - typings.hostedDashGitDashInfo.hostedDashGitDashInfoStrings.bitbucket
  - typings.hostedDashGitDashInfo.hostedDashGitDashInfoStrings.gitlab
  - typings.hostedDashGitDashInfo.hostedDashGitDashInfoStrings.gist
*/
trait hosts extends js.Object

object hosts {
  @scala.inline
  def bitbucket: typings.hostedDashGitDashInfo.hostedDashGitDashInfoStrings.bitbucket = this.cast("bitbucket")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gist: typings.hostedDashGitDashInfo.hostedDashGitDashInfoStrings.gist = this.cast("gist")
  @scala.inline
  def github: typings.hostedDashGitDashInfo.hostedDashGitDashInfoStrings.github = this.cast("github")
  @scala.inline
  def gitlab: typings.hostedDashGitDashInfo.hostedDashGitDashInfoStrings.gitlab = this.cast("gitlab")
}

