package typings.issueParser

import typings.issueParser.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueParserStrings {
  
  @js.native
  sealed trait bitbucket
    extends StObject
       with Options
  @scala.inline
  def bitbucket: bitbucket = "bitbucket".asInstanceOf[bitbucket]
  
  @js.native
  sealed trait github
    extends StObject
       with Options
  @scala.inline
  def github: github = "github".asInstanceOf[github]
  
  @js.native
  sealed trait gitlab
    extends StObject
       with Options
  @scala.inline
  def gitlab: gitlab = "gitlab".asInstanceOf[gitlab]
  
  @js.native
  sealed trait waffle
    extends StObject
       with Options
  @scala.inline
  def waffle: waffle = "waffle".asInstanceOf[waffle]
}
