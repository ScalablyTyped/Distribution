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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalInfoMod {
  
  object global {
    
    inline def fixPortalImageUrl(url: String): String = js.Dynamic.global.applyDynamic("fixPortalImageUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getAttackApGain(d: PortalDataDetail, fieldCount: Double, linkCount: Double): DeployCount = (js.Dynamic.global.applyDynamic("getAttackApGain")(d.asInstanceOf[js.Any], fieldCount.asInstanceOf[js.Any], linkCount.asInstanceOf[js.Any])).asInstanceOf[DeployCount]
    
    inline def getCurrentPortalEnergy(d: PortalDataDetail): Double = js.Dynamic.global.applyDynamic("getCurrentPortalEnergy")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** additional range boost calculation */
    inline def getLinkAmpRangeBoost(d: PortalDataDetail): Double = js.Dynamic.global.applyDynamic("getLinkAmpRangeBoost")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getMaxOutgoingLinks(d: PortalDataDetail): Double = js.Dynamic.global.applyDynamic("getMaxOutgoingLinks")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getPortalAttackValues(d: PortalDataDetail): Attackfrequency = js.Dynamic.global.applyDynamic("getPortalAttackValues")(d.asInstanceOf[js.Any]).asInstanceOf[Attackfrequency]
    
    /**
      * @deprecated use getTotalPortalEnergy (just renamed)
      */
    inline def getPortalEnergy(d: PortalDataDetail): Double = js.Dynamic.global.applyDynamic("getPortalEnergy")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getPortalHackDetails(d: PortalDataDetail): Burnout = js.Dynamic.global.applyDynamic("getPortalHackDetails")(d.asInstanceOf[js.Any]).asInstanceOf[Burnout]
    
    /**
      * returns a float. Displayed portal level is always rounded down from that value.
      */
    inline def getPortalLevel(d: PortalDataDetail): Double = js.Dynamic.global.applyDynamic("getPortalLevel")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getPortalLinkDefenseBoost(d: PortalDataDetail): Double = js.Dynamic.global.applyDynamic("getPortalLinkDefenseBoost")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getPortalLinksMitigation(linkCount: Double): Double = js.Dynamic.global.applyDynamic("getPortalLinksMitigation")(linkCount.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getPortalMitigationDetails(d: PortalDataDetail, linkCount: Double): Excess = (js.Dynamic.global.applyDynamic("getPortalMitigationDetails")(d.asInstanceOf[js.Any], linkCount.asInstanceOf[js.Any])).asInstanceOf[Excess]
    
    inline def getPortalModsByType(d: PortalDataDetail, `type`: ModType): js.Array[Mod] = (js.Dynamic.global.applyDynamic("getPortalModsByType")(d.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Mod]]
    
    /**
      * formula by the great gals and guys at
      * @link http://decodeingress.me/2012/11/18/ingress-portal-levels-and-link-range/
      */
    inline def getPortalRange(d: PortalDataDetail): Double = js.Dynamic.global.applyDynamic("getPortalRange")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def getPortalShieldMitigation(d: PortalDataDetail): Double = js.Dynamic.global.applyDynamic("getPortalShieldMitigation")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * given a detailed portal structure, return summary portal data, as seen in the map tile data
      */
    inline def getPortalSummaryData(d: PortalDataDetail): Health = js.Dynamic.global.applyDynamic("getPortalSummaryData")(d.asInstanceOf[js.Any]).asInstanceOf[Health]
    
    inline def getTotalPortalEnergy(d: PortalDataDetail): Double = js.Dynamic.global.applyDynamic("getTotalPortalEnergy")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /** This function will return the potential level a player can upgrade it to */
    inline def potentialPortalLevel(d: PortalDataDetail): Double = js.Dynamic.global.applyDynamic("potentialPortalLevel")(d.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
