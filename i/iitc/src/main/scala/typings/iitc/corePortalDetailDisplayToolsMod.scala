package typings.iitc

import typings.iitc.coreIitctypesMod.IITC.PortalDataDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object corePortalDetailDisplayToolsMod {
  
  object global {
    
    /**
      * calculate AP gain from destroying portal and then capturing it by deploying resonators
      */
    inline def getAttackApGainText(d: PortalDataDetail, fieldCount: Double, linkCount: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("getAttackApGainText")(d.asInstanceOf[js.Any], fieldCount.asInstanceOf[js.Any], linkCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    inline def getEnergyText(d: PortalDataDetail): js.Array[String] = js.Dynamic.global.applyDynamic("getEnergyText")(d.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getHackDetailsText(d: PortalDataDetail): js.Array[String] = js.Dynamic.global.applyDynamic("getHackDetailsText")(d.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    inline def getMitigationText(d: PortalDataDetail, linkCount: Double): js.Array[String] = (js.Dynamic.global.applyDynamic("getMitigationText")(d.asInstanceOf[js.Any], linkCount.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
    
    /**
      * given portal details, returns html code to display mod details.
      */
    inline def getModDetails(d: PortalDataDetail): String = js.Dynamic.global.applyDynamic("getModDetails")(d.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * returns displayable text+link about portal range
      */
    inline def getRangeText(d: PortalDataDetail): js.Array[String] = js.Dynamic.global.applyDynamic("getRangeText")(d.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /**
      * octant=slot: 0=E, 1=NE, 2=N, 3=NW, 4=W, 5=SW, 6=S, SE=7
      * resos in the display should be ordered like this:
      *   N    NE         Since the view is displayed in rows, they
      *   NW    E          need to be ordered like this: N NE NW E W SE SW S
      *   W    SE         i.e. 2 1 3 0 4 7 5 6
      *   SW    S
      * note: as of 2014-05-23 update, this is not true for portals with empty slots!
      */
    inline def getResonatorDetails(d: PortalDataDetail): String = js.Dynamic.global.applyDynamic("getResonatorDetails")(d.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * helper function that renders the HTML for a given resonator. Does
      * not work with raw details-hash. Needs digested infos instead:
      * slot: which slot this resonator occupies. Starts with 0 (east) and
      * rotates clockwise. So, last one is 7 (southeast).
      */
    inline def renderResonatorDetails(slot: Double, level: Double, nrg: String, nick: String): js.Array[String] = (js.Dynamic.global.applyDynamic("renderResonatorDetails")(slot.asInstanceOf[js.Any], level.asInstanceOf[js.Any], nrg.asInstanceOf[js.Any], nick.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
}
