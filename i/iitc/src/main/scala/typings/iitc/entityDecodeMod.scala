package typings.iitc

import typings.iitc.iitctypesMod.IITC.PortalData
import typings.iitc.iitctypesMod.IITC.PortalDataCore
import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityDecodeMod {
  
  object global {
    
    /**
      * decode the on-network array entity format into an object format closer to that used before
      * makes much more sense as an object, means that existing code didn't need to change, and it's what the
      * stock intel site does internally too (the array format is only on the network)
      */
    @JSGlobal("DecodeArray")
    @js.native
    class DecodeArray_ () extends StObject {
      
      def portalDetail(data: js.Array[js.Any]): js.UndefOr[PortalDataDetail] = js.native
      
      def portalSummary(data: js.Array[js.Any]): js.UndefOr[PortalData | PortalDataCore] = js.native
    }
    
    // private but exposed:
    // function parseMod(arr: null | any[]): IITC.Mod | null;
    // function parseResonator(arr: null | any[]): IITC.Resonator | null;
    // function parseArtifactBrief(arr: null | any[]): { fragment: any, target: any };
    // function parseArtifactDetail(arr: null | any[]): IITC.ArtifactDetail | null;
    @JSGlobal("decodeArray")
    @js.native
    def decodeArray: DecodeArray_ = js.native
    inline def decodeArray_=(x: DecodeArray_): Unit = js.Dynamic.global.updateDynamic("decodeArray")(x.asInstanceOf[js.Any])
  }
}
