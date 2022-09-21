package typings.mangopay2NodejsSdk

import typings.mangopay2NodejsSdk.typesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object countryAuthorizationMod {
  
  object countryAuthorization {
    
    trait AuthorizationData extends StObject {
      
      var BlockBankAccountCreation: Boolean
      
      var BlockPayout: Any
      
      var BlockUserCreation: Boolean
    }
    object AuthorizationData {
      
      inline def apply(BlockBankAccountCreation: Boolean, BlockPayout: Any, BlockUserCreation: Boolean): AuthorizationData = {
        val __obj = js.Dynamic.literal(BlockBankAccountCreation = BlockBankAccountCreation.asInstanceOf[js.Any], BlockPayout = BlockPayout.asInstanceOf[js.Any], BlockUserCreation = BlockUserCreation.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuthorizationData]
      }
      
      extension [Self <: AuthorizationData](x: Self) {
        
        inline def setBlockBankAccountCreation(value: Boolean): Self = StObject.set(x, "BlockBankAccountCreation", value.asInstanceOf[js.Any])
        
        inline def setBlockPayout(value: Any): Self = StObject.set(x, "BlockPayout", value.asInstanceOf[js.Any])
        
        inline def setBlockUserCreation(value: Boolean): Self = StObject.set(x, "BlockUserCreation", value.asInstanceOf[js.Any])
      }
    }
    
    trait CountryAuthorizationData extends StObject {
      
      var Authorization: AuthorizationData
      
      var CountryCode: CountryISO
      
      var CountryName: String
      
      var LastUpdate: Double
    }
    object CountryAuthorizationData {
      
      inline def apply(Authorization: AuthorizationData, CountryCode: CountryISO, CountryName: String, LastUpdate: Double): CountryAuthorizationData = {
        val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], CountryName = CountryName.asInstanceOf[js.Any], LastUpdate = LastUpdate.asInstanceOf[js.Any])
        __obj.asInstanceOf[CountryAuthorizationData]
      }
      
      extension [Self <: CountryAuthorizationData](x: Self) {
        
        inline def setAuthorization(value: AuthorizationData): Self = StObject.set(x, "Authorization", value.asInstanceOf[js.Any])
        
        inline def setCountryCode(value: CountryISO): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
        
        inline def setCountryName(value: String): Self = StObject.set(x, "CountryName", value.asInstanceOf[js.Any])
        
        inline def setLastUpdate(value: Double): Self = StObject.set(x, "LastUpdate", value.asInstanceOf[js.Any])
      }
    }
  }
}
