package typings.luminoPolling

import typings.luminoPolling.mod.IPoll._Phase
import typings.luminoPolling.pollMod.Poll.Standby
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object luminoPollingStrings {
  
  @scala.inline
  def constructed: constructed = "constructed".asInstanceOf[constructed]
  
  @scala.inline
  def disposed: disposed = "disposed".asInstanceOf[disposed]
  
  @scala.inline
  def invoked: invoked = "invoked".asInstanceOf[invoked]
  
  @scala.inline
  def leading: leading = "leading".asInstanceOf[leading]
  
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @scala.inline
  def reconnected: reconnected = "reconnected".asInstanceOf[reconnected]
  
  @scala.inline
  def refreshed: refreshed = "refreshed".asInstanceOf[refreshed]
  
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @scala.inline
  def resolved: resolved = "resolved".asInstanceOf[resolved]
  
  @scala.inline
  def standby: standby = "standby".asInstanceOf[standby]
  
  @scala.inline
  def started: started = "started".asInstanceOf[started]
  
  @scala.inline
  def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @scala.inline
  def trailing: trailing = "trailing".asInstanceOf[trailing]
  
  @scala.inline
  def `when-hidden`: `when-hidden` = "when-hidden".asInstanceOf[`when-hidden`]
  
  @js.native
  sealed trait constructed
    extends _Phase[js.Any]
  
  @js.native
  sealed trait disposed
    extends _Phase[js.Any]
  
  @js.native
  sealed trait invoked extends js.Object
  
  @js.native
  sealed trait leading extends js.Object
  
  @js.native
  sealed trait never extends Standby
  
  @js.native
  sealed trait reconnected
    extends _Phase[js.Any]
  
  @js.native
  sealed trait refreshed
    extends _Phase[js.Any]
  
  @js.native
  sealed trait rejected
    extends _Phase[js.Any]
  
  @js.native
  sealed trait resolved
    extends _Phase[js.Any]
  
  @js.native
  sealed trait standby
    extends _Phase[js.Any]
  
  @js.native
  sealed trait started
    extends _Phase[js.Any]
  
  @js.native
  sealed trait stopped
    extends _Phase[js.Any]
  
  @js.native
  sealed trait trailing extends js.Object
  
  @js.native
  sealed trait `when-hidden` extends Standby
}
