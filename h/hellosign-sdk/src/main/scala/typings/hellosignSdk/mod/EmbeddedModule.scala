package typings.hellosignSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedModule extends StObject {
  
  def getEditUrl(templateId: String): js.Promise[EmbeddedResponse]
  
  def getSignUrl(signatureId: String): js.Promise[EmbeddedResponse]
  
  def postEditUrl(templateId: String, options: EmbeddedRequestOptions): js.Promise[EmbeddedResponse]
}
object EmbeddedModule {
  
  inline def apply(
    getEditUrl: String => js.Promise[EmbeddedResponse],
    getSignUrl: String => js.Promise[EmbeddedResponse],
    postEditUrl: (String, EmbeddedRequestOptions) => js.Promise[EmbeddedResponse]
  ): EmbeddedModule = {
    val __obj = js.Dynamic.literal(getEditUrl = js.Any.fromFunction1(getEditUrl), getSignUrl = js.Any.fromFunction1(getSignUrl), postEditUrl = js.Any.fromFunction2(postEditUrl))
    __obj.asInstanceOf[EmbeddedModule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmbeddedModule] (val x: Self) extends AnyVal {
    
    inline def setGetEditUrl(value: String => js.Promise[EmbeddedResponse]): Self = StObject.set(x, "getEditUrl", js.Any.fromFunction1(value))
    
    inline def setGetSignUrl(value: String => js.Promise[EmbeddedResponse]): Self = StObject.set(x, "getSignUrl", js.Any.fromFunction1(value))
    
    inline def setPostEditUrl(value: (String, EmbeddedRequestOptions) => js.Promise[EmbeddedResponse]): Self = StObject.set(x, "postEditUrl", js.Any.fromFunction2(value))
  }
}
