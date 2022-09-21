package typings.happyguestmxWebUtilities.mod

import typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
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
  
  extension [Self <: ParamsHandler_](x: Self) {
    
    inline def setRequestHandler(value: APIGatewayProxyEvent => js.Promise[APIGatewayProxyResult]): Self = StObject.set(x, "requestHandler", js.Any.fromFunction1(value))
  }
}
