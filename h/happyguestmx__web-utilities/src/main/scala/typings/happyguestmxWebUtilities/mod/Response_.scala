package typings.happyguestmxWebUtilities.mod

import typings.awsLambda.triggerApiGatewayProxyMod.APIGatewayProxyResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Response_ extends StObject {
  
  def badRequest(body: js.Object): APIGatewayProxyResult
  
  def failure(body: js.Object): APIGatewayProxyResult
  
  def notFound(body: js.Object): APIGatewayProxyResult
  
  def success(body: js.Object): APIGatewayProxyResult
}
object Response_ {
  
  inline def apply(
    badRequest: js.Object => APIGatewayProxyResult,
    failure: js.Object => APIGatewayProxyResult,
    notFound: js.Object => APIGatewayProxyResult,
    success: js.Object => APIGatewayProxyResult
  ): Response_ = {
    val __obj = js.Dynamic.literal(badRequest = js.Any.fromFunction1(badRequest), failure = js.Any.fromFunction1(failure), notFound = js.Any.fromFunction1(notFound), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[Response_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Response_] (val x: Self) extends AnyVal {
    
    inline def setBadRequest(value: js.Object => APIGatewayProxyResult): Self = StObject.set(x, "badRequest", js.Any.fromFunction1(value))
    
    inline def setFailure(value: js.Object => APIGatewayProxyResult): Self = StObject.set(x, "failure", js.Any.fromFunction1(value))
    
    inline def setNotFound(value: js.Object => APIGatewayProxyResult): Self = StObject.set(x, "notFound", js.Any.fromFunction1(value))
    
    inline def setSuccess(value: js.Object => APIGatewayProxyResult): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
