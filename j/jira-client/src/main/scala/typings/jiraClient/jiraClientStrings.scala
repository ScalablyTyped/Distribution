package typings.jiraClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object jiraClientStrings {
  @js.native
  sealed trait active extends js.Object
  
  @js.native
  sealed trait closed extends js.Object
  
  @js.native
  sealed trait `false` extends js.Object
  
  @js.native
  sealed trait future extends js.Object
  
  @js.native
  sealed trait `true` extends js.Object
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def `false`: `false` = "false".asInstanceOf[`false`]
  @scala.inline
  def future: future = "future".asInstanceOf[future]
  @scala.inline
  def `true`: `true` = "true".asInstanceOf[`true`]
}

