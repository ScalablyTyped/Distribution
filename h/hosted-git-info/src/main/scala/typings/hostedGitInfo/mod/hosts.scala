package typings.hostedGitInfo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.hostedGitInfo.hostedGitInfoStrings.github
  - typings.hostedGitInfo.hostedGitInfoStrings.bitbucket
  - typings.hostedGitInfo.hostedGitInfoStrings.gitlab
  - typings.hostedGitInfo.hostedGitInfoStrings.gist
*/
trait hosts extends js.Object

object hosts {
  @scala.inline
  def bitbucket: typings.hostedGitInfo.hostedGitInfoStrings.bitbucket = this.cast("bitbucket")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gist: typings.hostedGitInfo.hostedGitInfoStrings.gist = this.cast("gist")
  @scala.inline
  def github: typings.hostedGitInfo.hostedGitInfoStrings.github = this.cast("github")
  @scala.inline
  def gitlab: typings.hostedGitInfo.hostedGitInfoStrings.gitlab = this.cast("gitlab")
}

