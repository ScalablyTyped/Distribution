package typings.hostedGitInfo

import typings.hostedGitInfo.mod.hosts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hostedGitInfoStrings {
  @js.native
  sealed trait bitbucket extends hosts
  
  @js.native
  sealed trait gist extends hosts
  
  @js.native
  sealed trait github extends hosts
  
  @js.native
  sealed trait gitlab extends hosts
  
  @scala.inline
  def bitbucket: bitbucket = "bitbucket".asInstanceOf[bitbucket]
  @scala.inline
  def gist: gist = "gist".asInstanceOf[gist]
  @scala.inline
  def github: github = "github".asInstanceOf[github]
  @scala.inline
  def gitlab: gitlab = "gitlab".asInstanceOf[gitlab]
}

