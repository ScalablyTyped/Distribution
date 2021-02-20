package typings.iitc

import typings.iitc.anon.Attackfrequency
import typings.iitc.anon.Burnout
import typings.iitc.anon.DeployCount
import typings.iitc.anon.Excess
import typings.iitc.anon.Health
import typings.iitc.iitctypesMod.IITC.Mod
import typings.iitc.iitctypesMod.IITC.ModType
import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalInfoMod {
  
  object global {
    
    @JSGlobal("fixPortalImageUrl")
    @js.native
    def fixPortalImageUrl(url: String): String = js.native
    
    @JSGlobal("getAttackApGain")
    @js.native
    def getAttackApGain(d: PortalDataDetail, fieldCount: Double, linkCount: Double): DeployCount = js.native
    
    @JSGlobal("getCurrentPortalEnergy")
    @js.native
    def getCurrentPortalEnergy(d: PortalDataDetail): Double = js.native
    
    /** additional range boost calculation */
    @JSGlobal("getLinkAmpRangeBoost")
    @js.native
    def getLinkAmpRangeBoost(d: PortalDataDetail): Double = js.native
    
    @JSGlobal("getMaxOutgoingLinks")
    @js.native
    def getMaxOutgoingLinks(d: PortalDataDetail): Double = js.native
    
    @JSGlobal("getPortalAttackValues")
    @js.native
    def getPortalAttackValues(d: PortalDataDetail): Attackfrequency = js.native
    
    /**
      * @deprecated use getTotalPortalEnergy (just renamed)
      */
    @JSGlobal("getPortalEnergy")
    @js.native
    def getPortalEnergy(d: PortalDataDetail): Double = js.native
    
    @JSGlobal("getPortalHackDetails")
    @js.native
    def getPortalHackDetails(d: PortalDataDetail): Burnout = js.native
    
    /**
      * returns a float. Displayed portal level is always rounded down from that value.
      */
    @JSGlobal("getPortalLevel")
    @js.native
    def getPortalLevel(d: PortalDataDetail): Double = js.native
    
    @JSGlobal("getPortalLinkDefenseBoost")
    @js.native
    def getPortalLinkDefenseBoost(d: PortalDataDetail): Double = js.native
    
    @JSGlobal("getPortalLinksMitigation")
    @js.native
    def getPortalLinksMitigation(linkCount: Double): Double = js.native
    
    @JSGlobal("getPortalMitigationDetails")
    @js.native
    def getPortalMitigationDetails(d: PortalDataDetail, linkCount: Double): Excess = js.native
    
    @JSGlobal("getPortalModsByType")
    @js.native
    def getPortalModsByType(d: PortalDataDetail, `type`: ModType): js.Array[Mod] = js.native
    
    /**
      * formula by the great gals and guys at
      * @link http://decodeingress.me/2012/11/18/ingress-portal-levels-and-link-range/
      */
    @JSGlobal("getPortalRange")
    @js.native
    def getPortalRange(d: PortalDataDetail): Double = js.native
    
    @JSGlobal("getPortalShieldMitigation")
    @js.native
    def getPortalShieldMitigation(d: PortalDataDetail): Double = js.native
    
    /**
      * given a detailed portal structure, return summary portal data, as seen in the map tile data
      */
    @JSGlobal("getPortalSummaryData")
    @js.native
    def getPortalSummaryData(d: PortalDataDetail): Health = js.native
    
    @JSGlobal("getTotalPortalEnergy")
    @js.native
    def getTotalPortalEnergy(d: PortalDataDetail): Double = js.native
    
    /** This function will return the potential level a player can upgrade it to */
    @JSGlobal("potentialPortalLevel")
    @js.native
    def potentialPortalLevel(d: PortalDataDetail): Double = js.native
  }
}
