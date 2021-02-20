package typings.history

import typings.history.createHashHistoryMod.HashType
import typings.history.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object historyStrings {
  
  @js.native
  sealed trait POP extends Action
  @scala.inline
  def POP: POP = "POP".asInstanceOf[POP]
  
  @js.native
  sealed trait PUSH extends Action
  @scala.inline
  def PUSH: PUSH = "PUSH".asInstanceOf[PUSH]
  
  @js.native
  sealed trait REPLACE extends Action
  @scala.inline
  def REPLACE: REPLACE = "REPLACE".asInstanceOf[REPLACE]
  
  @js.native
  sealed trait hashbang extends HashType
  @scala.inline
  def hashbang: hashbang = "hashbang".asInstanceOf[hashbang]
  
  @js.native
  sealed trait noslash extends HashType
  @scala.inline
  def noslash: noslash = "noslash".asInstanceOf[noslash]
  
  @js.native
  sealed trait slash extends HashType
  @scala.inline
  def slash: slash = "slash".asInstanceOf[slash]
}
