package typings.koaCsrf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DisableQuery extends StObject {
    
    var disableQuery: js.UndefOr[Boolean] = js.undefined
    
    var excludedMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    var invalidSessionSecretMessage: js.UndefOr[String] = js.undefined
    
    var invalidSessionSecretStatusCode: js.UndefOr[Double] = js.undefined
    
    var invalidTokenMessage: js.UndefOr[String] = js.undefined
    
    var invalidTokenStatusCode: js.UndefOr[Double] = js.undefined
  }
  object DisableQuery {
    
    @scala.inline
    def apply(): DisableQuery = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisableQuery]
    }
    
    @scala.inline
    implicit class DisableQueryMutableBuilder[Self <: DisableQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableQuery(value: Boolean): Self = StObject.set(x, "disableQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableQueryUndefined: Self = StObject.set(x, "disableQuery", js.undefined)
      
      @scala.inline
      def setExcludedMethods(value: js.Array[String]): Self = StObject.set(x, "excludedMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedMethodsUndefined: Self = StObject.set(x, "excludedMethods", js.undefined)
      
      @scala.inline
      def setExcludedMethodsVarargs(value: String*): Self = StObject.set(x, "excludedMethods", js.Array(value :_*))
      
      @scala.inline
      def setInvalidSessionSecretMessage(value: String): Self = StObject.set(x, "invalidSessionSecretMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidSessionSecretMessageUndefined: Self = StObject.set(x, "invalidSessionSecretMessage", js.undefined)
      
      @scala.inline
      def setInvalidSessionSecretStatusCode(value: Double): Self = StObject.set(x, "invalidSessionSecretStatusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidSessionSecretStatusCodeUndefined: Self = StObject.set(x, "invalidSessionSecretStatusCode", js.undefined)
      
      @scala.inline
      def setInvalidTokenMessage(value: String): Self = StObject.set(x, "invalidTokenMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidTokenMessageUndefined: Self = StObject.set(x, "invalidTokenMessage", js.undefined)
      
      @scala.inline
      def setInvalidTokenStatusCode(value: Double): Self = StObject.set(x, "invalidTokenStatusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidTokenStatusCodeUndefined: Self = StObject.set(x, "invalidTokenStatusCode", js.undefined)
    }
  }
}
