package typings.matrixBotSdk

import typings.matrixBotSdk.identityClientMod.IdentityClient
import typings.matrixBotSdk.intentMod.Intent
import typings.matrixBotSdk.matrixClientMod.MatrixClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextsMod {
  
  trait FunctionCallContext
    extends StObject
       with IMetricContext {
    
    /**
      * The function name being called
      */
    var functionName: String
  }
  object FunctionCallContext {
    
    inline def apply(functionName: String, uniqueId: String): FunctionCallContext = {
      val __obj = js.Dynamic.literal(functionName = functionName.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FunctionCallContext]
    }
    
    extension [Self <: FunctionCallContext](x: Self) {
      
      inline def setFunctionName(value: String): Self = StObject.set(x, "functionName", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMetricContext extends StObject {
    
    /**
      * Unique identifier for the context object. Used to differentiate
      * contexts over a start/end event.
      */
    var uniqueId: String
  }
  object IMetricContext {
    
    inline def apply(uniqueId: String): IMetricContext = {
      val __obj = js.Dynamic.literal(uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMetricContext]
    }
    
    extension [Self <: IMetricContext](x: Self) {
      
      inline def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentityClientCallContext
    extends StObject
       with FunctionCallContext {
    
    var client: IdentityClient
  }
  object IdentityClientCallContext {
    
    inline def apply(client: IdentityClient, functionName: String, uniqueId: String): IdentityClientCallContext = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityClientCallContext]
    }
    
    extension [Self <: IdentityClientCallContext](x: Self) {
      
      inline def setClient(value: IdentityClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntentCallContext
    extends StObject
       with MatrixClientCallContext {
    
    /**
      * The intent that is raising the metric.
      */
    var intent: Intent
  }
  object IntentCallContext {
    
    inline def apply(client: MatrixClient, functionName: String, intent: Intent, uniqueId: String): IntentCallContext = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], intent = intent.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntentCallContext]
    }
    
    extension [Self <: IntentCallContext](x: Self) {
      
      inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    }
  }
  
  trait MatrixClientCallContext
    extends StObject
       with FunctionCallContext {
    
    /**
      * The client that raised the metric.
      */
    var client: MatrixClient
  }
  object MatrixClientCallContext {
    
    inline def apply(client: MatrixClient, functionName: String, uniqueId: String): MatrixClientCallContext = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatrixClientCallContext]
    }
    
    extension [Self <: MatrixClientCallContext](x: Self) {
      
      inline def setClient(value: MatrixClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
