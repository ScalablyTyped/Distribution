package typings.jsforce

import typings.jsforce.salesforceIdMod.SalesforceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object salesforceObjectOptionsMod {
  
  @js.native
  trait SObjectOptions extends StObject {
    
    var ExtId__c: js.UndefOr[String] = js.native
    
    var Id: js.UndefOr[SalesforceId] = js.native
    
    var Name: js.UndefOr[String] = js.native
  }
  object SObjectOptions {
    
    @scala.inline
    def apply(): SObjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SObjectOptions]
    }
    
    @scala.inline
    implicit class SObjectOptionsMutableBuilder[Self <: SObjectOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtId__c(value: String): Self = StObject.set(x, "ExtId__c", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtId__cUndefined: Self = StObject.set(x, "ExtId__c", js.undefined)
      
      @scala.inline
      def setId(value: SalesforceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    }
  }
}
