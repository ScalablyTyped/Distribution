package typings.happyguestmxWebUtilities.mod

import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyEvent
import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsHandler_ extends StObject {
  
  def requestHandler(event: APIGatewayProxyEvent): js.Promise[APIGatewayProxyResult]
}
object ParamsHandler_ {
  
  inline def apply(requestHandler: APIGatewayProxyEvent => js.Promise[APIGatewayProxyResult]): ParamsHandler_ = {
    val __obj = js.Dynamic.literal(requestHandler = js.Any.fromFunction1(requestHandler))
    __obj.asInstanceOf[ParamsHandler_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParamsHandler_] (val x: Self) extends AnyVal {
    
    inline def setRequestHandler(value: APIGatewayProxyEvent => js.Promise[APIGatewayProxyResult]): Self = StObject.set(x, "requestHandler", js.Any.fromFunction1(value))
  }
}
