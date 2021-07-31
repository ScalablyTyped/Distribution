package typings.hapiCrumb

import typings.hapiCrumb.hapiCrumbStrings.payload
import typings.hapiCrumb.hapiCrumbStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Key extends StObject {
    
    /**
      * The name of the cookie to store the CSRF crumb into.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * Override for the server's 'restful' setting
      */
    var restful: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies how the crumb will be sent in requests.
      *
      * @default 'payload'
      */
    var source: js.UndefOr[payload | query] = js.undefined
  }
  object Key {
    
    @scala.inline
    def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setRestful(value: Boolean): Self = StObject.set(x, "restful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestfulUndefined: Self = StObject.set(x, "restful", js.undefined)
      
      @scala.inline
      def setSource(value: payload | query): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
}
