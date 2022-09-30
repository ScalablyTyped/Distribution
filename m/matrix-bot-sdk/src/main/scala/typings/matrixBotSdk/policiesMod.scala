package typings.matrixBotSdk

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policiesMod {
  
  trait Policies extends StObject {
    
    var policies: StringDictionary[Policy]
  }
  object Policies {
    
    inline def apply(policies: StringDictionary[Policy]): Policies = {
      val __obj = js.Dynamic.literal(policies = policies.asInstanceOf[js.Any])
      __obj.asInstanceOf[Policies]
    }
    
    extension [Self <: Policies](x: Self) {
      
      inline def setPolicies(value: StringDictionary[Policy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    }
  }
  
  trait Policy
    extends StObject
       with /* language */ StringDictionary[TranslatedPolicy | String] {
    
    var version: String
  }
  object Policy {
    
    inline def apply(version: String): Policy = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Policy]
    }
    
    extension [Self <: Policy](x: Self) {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait TranslatedPolicy extends StObject {
    
    var name: String
    
    var url: String
  }
  object TranslatedPolicy {
    
    inline def apply(name: String, url: String): TranslatedPolicy = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslatedPolicy]
    }
    
    extension [Self <: TranslatedPolicy](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
