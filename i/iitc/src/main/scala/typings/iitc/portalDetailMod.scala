package typings.iitc

import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import typings.jquery.JQuery.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalDetailMod {
  
  object global {
    
    @JSGlobal("PortalDetail")
    @js.native
    class PortalDetail_ () extends StObject {
      
      /** Get portal detail from cache */
      def get(guid: String): js.UndefOr[PortalDataDetail] = js.native
      
      /** Get portal detail from cache */
      def isFresh(guid: String): js.UndefOr[Boolean] = js.native
      
      /**
        * Request Portal details from server
        * NB: you shouldn't use it.
        */
      def request(guid: String): Promise[js.Any, js.Any, js.Any] = js.native
      
      def setup(): Unit = js.native
    }
    
    @JSGlobal("portalDetail")
    @js.native
    def portalDetail: PortalDetail_ = js.native
    inline def portalDetail_=(x: PortalDetail_): Unit = js.Dynamic.global.updateDynamic("portalDetail")(x.asInstanceOf[js.Any])
  }
}
