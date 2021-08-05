package typings.history

import typings.history.createHashHistoryMod.HashType
import typings.history.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object historyStrings {
  
  @js.native
  sealed trait POP
    extends StObject
       with Action
  inline def POP: POP = "POP".asInstanceOf[POP]
  
  @js.native
  sealed trait PUSH
    extends StObject
       with Action
  inline def PUSH: PUSH = "PUSH".asInstanceOf[PUSH]
  
  @js.native
  sealed trait REPLACE
    extends StObject
       with Action
  inline def REPLACE: REPLACE = "REPLACE".asInstanceOf[REPLACE]
  
  @js.native
  sealed trait hashbang
    extends StObject
       with HashType
  inline def hashbang: hashbang = "hashbang".asInstanceOf[hashbang]
  
  @js.native
  sealed trait noslash
    extends StObject
       with HashType
  inline def noslash: noslash = "noslash".asInstanceOf[noslash]
  
  @js.native
  sealed trait slash
    extends StObject
       with HashType
  inline def slash: slash = "slash".asInstanceOf[slash]
}
