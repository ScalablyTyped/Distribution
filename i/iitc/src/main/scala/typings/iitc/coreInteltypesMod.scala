package typings.iitc

import typings.iitc.anon.Markup
import typings.iitc.iitcStrings.PLAYER
import typings.iitc.iitcStrings.PORTAL
import typings.iitc.iitcStrings.TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreInteltypesMod {
  
  object Intel {
    
    // CHAT
    trait ChatCallback extends StObject {
      
      var result: js.Array[ChatLine]
    }
    object ChatCallback {
      
      inline def apply(result: js.Array[ChatLine]): ChatCallback = {
        val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
        __obj.asInstanceOf[ChatCallback]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ChatCallback] (val x: Self) extends AnyVal {
        
        inline def setResult(value: js.Array[ChatLine]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
        
        inline def setResultVarargs(value: ChatLine*): Self = StObject.set(x, "result", js.Array(value*))
      }
    }
    
    type ChatLine = js.Tuple3[/*guid*/ String, /*time*/ Double, PlextContainer]
    
    type FieldDetails = js.Array[Any]
    
    type LinkDetails = js.Array[Any]
    
    type MarkUpPlayer = js.Tuple2[PLAYER, MarkUpPlayerType]
    
    trait MarkUpPlayerType extends StObject {
      
      var plain: String
      
      var team: String
    }
    object MarkUpPlayerType {
      
      inline def apply(plain: String, team: String): MarkUpPlayerType = {
        val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
        __obj.asInstanceOf[MarkUpPlayerType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MarkUpPlayerType] (val x: Self) extends AnyVal {
        
        inline def setPlain(value: String): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
        
        inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      }
    }
    
    type MarkUpPortal = js.Tuple2[PORTAL, MarkUpPortalType]
    
    trait MarkUpPortalType extends StObject {
      
      var address: String
      
      var latE6: Double
      
      var lngE6: Double
      
      var name: String
      
      var plain: String
      
      var team: String
    }
    object MarkUpPortalType {
      
      inline def apply(address: String, latE6: Double, lngE6: Double, name: String, plain: String, team: String): MarkUpPortalType = {
        val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plain = plain.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
        __obj.asInstanceOf[MarkUpPortalType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MarkUpPortalType] (val x: Self) extends AnyVal {
        
        inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
        
        inline def setLatE6(value: Double): Self = StObject.set(x, "latE6", value.asInstanceOf[js.Any])
        
        inline def setLngE6(value: Double): Self = StObject.set(x, "lngE6", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setPlain(value: String): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
        
        inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
      }
    }
    
    type MarkUpText = js.Tuple2[TEXT, MarkUpTextType]
    
    trait MarkUpTextType extends StObject {
      
      var plain: String
    }
    object MarkUpTextType {
      
      inline def apply(plain: String): MarkUpTextType = {
        val __obj = js.Dynamic.literal(plain = plain.asInstanceOf[js.Any])
        __obj.asInstanceOf[MarkUpTextType]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: MarkUpTextType] (val x: Self) extends AnyVal {
        
        inline def setPlain(value: String): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
      }
    }
    
    // PLAYER
    trait PlayerInfo extends StObject {
      
      var ap: String
      
      var available_invites: Double
      
      var energy: Double
      
      var level: Double
      
      var min_ap_for_current_level: String
      
      var min_ap_for_next_level: String
      
      var nickMatcher: js.RegExp
      
      var nickname: String
      
      var team: String
      
      var verified_level: Double
      
      var xm_capacity: String
    }
    object PlayerInfo {
      
      inline def apply(
        ap: String,
        available_invites: Double,
        energy: Double,
        level: Double,
        min_ap_for_current_level: String,
        min_ap_for_next_level: String,
        nickMatcher: js.RegExp,
        nickname: String,
        team: String,
        verified_level: Double,
        xm_capacity: String
      ): PlayerInfo = {
        val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], available_invites = available_invites.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], min_ap_for_current_level = min_ap_for_current_level.asInstanceOf[js.Any], min_ap_for_next_level = min_ap_for_next_level.asInstanceOf[js.Any], nickMatcher = nickMatcher.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], verified_level = verified_level.asInstanceOf[js.Any], xm_capacity = xm_capacity.asInstanceOf[js.Any])
        __obj.asInstanceOf[PlayerInfo]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PlayerInfo] (val x: Self) extends AnyVal {
        
        inline def setAp(value: String): Self = StObject.set(x, "ap", value.asInstanceOf[js.Any])
        
        inline def setAvailable_invites(value: Double): Self = StObject.set(x, "available_invites", value.asInstanceOf[js.Any])
        
        inline def setEnergy(value: Double): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
        
        inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
        
        inline def setMin_ap_for_current_level(value: String): Self = StObject.set(x, "min_ap_for_current_level", value.asInstanceOf[js.Any])
        
        inline def setMin_ap_for_next_level(value: String): Self = StObject.set(x, "min_ap_for_next_level", value.asInstanceOf[js.Any])
        
        inline def setNickMatcher(value: js.RegExp): Self = StObject.set(x, "nickMatcher", value.asInstanceOf[js.Any])
        
        inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
        
        inline def setTeam(value: String): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
        
        inline def setVerified_level(value: Double): Self = StObject.set(x, "verified_level", value.asInstanceOf[js.Any])
        
        inline def setXm_capacity(value: String): Self = StObject.set(x, "xm_capacity", value.asInstanceOf[js.Any])
      }
    }
    
    trait PlextContainer extends StObject {
      
      var plext: Markup
    }
    object PlextContainer {
      
      inline def apply(plext: Markup): PlextContainer = {
        val __obj = js.Dynamic.literal(plext = plext.asInstanceOf[js.Any])
        __obj.asInstanceOf[PlextContainer]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: PlextContainer] (val x: Self) extends AnyVal {
        
        inline def setPlext(value: Markup): Self = StObject.set(x, "plext", value.asInstanceOf[js.Any])
      }
    }
    
    // ENTITY
    type PortalDetails = js.Array[Any]
  }
}
