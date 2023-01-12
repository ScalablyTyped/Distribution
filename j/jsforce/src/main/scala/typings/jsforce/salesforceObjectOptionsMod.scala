package typings.jsforce

import typings.jsforce.salesforceIdMod.SalesforceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object salesforceObjectOptionsMod {
  
  trait SObjectOptions extends StObject {
    
    var ExtId__c: js.UndefOr[String] = js.undefined
    
    var Id: js.UndefOr[SalesforceId] = js.undefined
    
    var Name: js.UndefOr[String] = js.undefined
  }
  object SObjectOptions {
    
    inline def apply(): SObjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SObjectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SObjectOptions] (val x: Self) extends AnyVal {
      
      inline def setExtId__c(value: String): Self = StObject.set(x, "ExtId__c", value.asInstanceOf[js.Any])
      
      inline def setExtId__cUndefined: Self = StObject.set(x, "ExtId__c", js.undefined)
      
      inline def setId(value: SalesforceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    }
  }
}
