package typings
package historyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object historyLibStrings {
  @js.native
  sealed trait POP
    extends historyLib.historyMod.Action
  
  @js.native
  sealed trait PUSH
    extends historyLib.historyMod.Action
  
  @js.native
  sealed trait REPLACE
    extends historyLib.historyMod.Action
  
  @js.native
  sealed trait hashbang
    extends historyLib.createHashHistoryMod.HashType
  
  @js.native
  sealed trait noslash
    extends historyLib.createHashHistoryMod.HashType
  
  @js.native
  sealed trait slash
    extends historyLib.createHashHistoryMod.HashType
  
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

