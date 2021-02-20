package typings.iitc

import typings.iitc.iitcNumbers.`0`
import typings.iitc.iitcNumbers.`1`
import typings.iitc.iitcNumbers.`2`
import typings.iitc.iitctypesMod.IITC.PortalData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityInfoMod {
  
  object global {
    
    /**
      * given the entity detail data, returns the team the entity belongs to. Uses TEAM_* enum values.
      */
    @JSGlobal("getTeam")
    @js.native
    def getTeam(details: PortalData): `0` | `1` | `2` = js.native
    
    @JSGlobal("teamStringToId")
    @js.native
    def teamStringToId(teamStr: String): `0` | `1` | `2` = js.native
  }
}
