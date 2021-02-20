package typings.ineum

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BackendTraceId extends StObject {
    
    var backendTraceId: js.UndefOr[String] = js.native
    
    var componentStack: js.UndefOr[String] = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var error: js.UndefOr[Error] = js.native
    
    var meta: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
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
  
  @js.native
  trait ComponentStack extends StObject {
    
    var componentStack: js.UndefOr[String] = js.native
    
    var meta: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.native
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
