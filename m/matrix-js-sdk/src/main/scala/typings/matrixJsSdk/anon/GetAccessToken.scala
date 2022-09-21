package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessToken extends StObject {
  
  def getAccessToken(): js.Promise[String]
}
object GetAccessToken {
  
  inline def apply(getAccessToken: () => js.Promise[String]): GetAccessToken = {
    val __obj = js.Dynamic.literal(getAccessToken = js.Any.fromFunction0(getAccessToken))
    __obj.asInstanceOf[GetAccessToken]
  }
  
  extension [Self <: GetAccessToken](x: Self) {
    
    inline def setGetAccessToken(value: () => js.Promise[String]): Self = StObject.set(x, "getAccessToken", js.Any.fromFunction0(value))
  }
}
