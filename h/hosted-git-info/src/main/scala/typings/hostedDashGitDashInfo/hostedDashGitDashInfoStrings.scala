package typings.hostedDashGitDashInfo

import typings.hostedDashGitDashInfo.hostedDashGitDashInfoMod.hosts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object hostedDashGitDashInfoStrings {
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

