package typings.iitc

import typings.jquery.JQuery.jqXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redeemingMod {
  
  object global {
    
    @JSGlobal("formatPasscodeLong")
    @js.native
    def formatPasscodeLong(data: ResultData): Unit = js.native
    
    @JSGlobal("formatPasscodeShort")
    @js.native
    def formatPasscodeShort(data: ResultData): Unit = js.native
    
    @JSGlobal("handleRedeemResponse")
    @js.native
    def handleRedeemResponse(data: ResultData, textStatus: js.Any, jqXHR: jqXHR[_]): Unit = js.native
    
    @JSGlobal("setupRedeem")
    @js.native
    def setupRedeem(): Unit = js.native
    
    /** These are HTTP status codes returned by the redemption API. */
    object REDEEM_STATUSES
    
    @js.native
    trait ResultData extends StObject {
      
      var ap: String = js.native
      
      var inventory: js.Any = js.native
      
      var other: js.Array[String] = js.native
      
      var xm: String = js.native
    }
    object ResultData {
      
      @scala.inline
      def apply(ap: String, inventory: js.Any, other: js.Array[String], xm: String): ResultData = {
        val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], xm = xm.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResultData]
      }
      
      @scala.inline
      implicit class ResultDataMutableBuilder[Self <: ResultData] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAp(value: String): Self = StObject.set(x, "ap", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInventory(value: js.Any): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOther(value: js.Array[String]): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOtherVarargs(value: String*): Self = StObject.set(x, "other", js.Array(value :_*))
        
        @scala.inline
        def setXm(value: String): Self = StObject.set(x, "xm", value.asInstanceOf[js.Any])
      }
    }
  }
}
