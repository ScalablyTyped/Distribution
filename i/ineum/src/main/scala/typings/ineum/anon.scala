package typings.ineum

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BackendTraceId extends StObject {
    
    var backendTraceId: js.UndefOr[String] = js.undefined
    
    var componentStack: js.UndefOr[String] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[Error] = js.undefined
    
    var meta: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object BackendTraceId {
    
    @scala.inline
    def apply(): BackendTraceId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackendTraceId]
    }
    
    @scala.inline
    implicit class BackendTraceIdMutableBuilder[Self <: BackendTraceId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendTraceId(value: String): Self = StObject.set(x, "backendTraceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendTraceIdUndefined: Self = StObject.set(x, "backendTraceId", js.undefined)
      
      @scala.inline
      def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentStackUndefined: Self = StObject.set(x, "componentStack", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setMeta(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait ComponentStack extends StObject {
    
    var componentStack: js.UndefOr[String] = js.undefined
    
    var meta: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
  }
  object ComponentStack {
    
    @scala.inline
    def apply(): ComponentStack = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentStack]
    }
    
    @scala.inline
    implicit class ComponentStackMutableBuilder[Self <: ComponentStack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentStackUndefined: Self = StObject.set(x, "componentStack", js.undefined)
      
      @scala.inline
      def setMeta(value: StringDictionary[String | Double | Boolean]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    }
  }
}
