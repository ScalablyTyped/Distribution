package typings.history

import typings.history.createHashHistoryMod.HashType
import typings.history.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object historyStrings {
  @js.native
  sealed trait POP extends Action
  
  @js.native
  sealed trait PUSH extends Action
  
  @js.native
  sealed trait REPLACE extends Action
  
  @js.native
  sealed trait hashbang extends HashType
  
  @js.native
  sealed trait noslash extends HashType
  
  @js.native
  sealed trait slash extends HashType
  
  @scala.inline
  def POP: POP = "POP".asInstanceOf[POP]
  @scala.inline
  def PUSH: PUSH = "PUSH".asInstanceOf[PUSH]
  @scala.inline
  def REPLACE: REPLACE = "REPLACE".asInstanceOf[REPLACE]
  @scala.inline
  def hashbang: hashbang = "hashbang".asInstanceOf[hashbang]
  @scala.inline
  def noslash: noslash = "noslash".asInstanceOf[noslash]
  @scala.inline
  def slash: slash = "slash".asInstanceOf[slash]
}

