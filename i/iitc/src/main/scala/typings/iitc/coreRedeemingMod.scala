package typings.iitc

import typings.jquery.JQuery.jqXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreRedeemingMod {
  
  object global {
    
    inline def formatPasscodeLong(data: ResultData): Unit = js.Dynamic.global.applyDynamic("formatPasscodeLong")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def formatPasscodeShort(data: ResultData): Unit = js.Dynamic.global.applyDynamic("formatPasscodeShort")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def handleRedeemResponse(data: ResultData, textStatus: Any, jqXHR: jqXHR[Any]): Unit = (js.Dynamic.global.applyDynamic("handleRedeemResponse")(data.asInstanceOf[js.Any], textStatus.asInstanceOf[js.Any], jqXHR.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setupRedeem(): Unit = js.Dynamic.global.applyDynamic("setupRedeem")().asInstanceOf[Unit]
    
    trait ResultData extends StObject {
      
      var ap: String
      
      var inventory: Any
      
      var other: js.Array[String]
      
      var xm: String
    }
    object ResultData {
      
      inline def apply(ap: String, inventory: Any, other: js.Array[String], xm: String): ResultData = {
        val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], xm = xm.asInstanceOf[js.Any])
        __obj.asInstanceOf[ResultData]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ResultData] (val x: Self) extends AnyVal {
        
        inline def setAp(value: String): Self = StObject.set(x, "ap", value.asInstanceOf[js.Any])
        
        inline def setInventory(value: Any): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
        
        inline def setOther(value: js.Array[String]): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
        
        inline def setOtherVarargs(value: String*): Self = StObject.set(x, "other", js.Array(value*))
        
        inline def setXm(value: String): Self = StObject.set(x, "xm", value.asInstanceOf[js.Any])
      }
    }
  }
}
