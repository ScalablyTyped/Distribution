package typings.happyguestmxWebUtilities.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Common_ extends StObject {
  
  var base64Regex: String
  
  def cleanFields(item: js.Object): js.Promise[js.Object]
  
  def cleanedObject(obj: js.Object): js.Promise[js.Object]
  
  var emailRegex: String
  
  def getCleanedString(string: String): String
  
  def isBase64(string: String): Boolean
  
  def isEmpty(value: js.Object): Boolean
  
  def isURL(string: String): Boolean
  
  def notUndefined(value: Any): Boolean
  
  var urlReGex: String
  
  var uuidRegex: String
}
object Common_ {
  
  inline def apply(
    base64Regex: String,
    cleanFields: js.Object => js.Promise[js.Object],
    cleanedObject: js.Object => js.Promise[js.Object],
    emailRegex: String,
    getCleanedString: String => String,
    isBase64: String => Boolean,
    isEmpty: js.Object => Boolean,
    isURL: String => Boolean,
    notUndefined: Any => Boolean,
    urlReGex: String,
    uuidRegex: String
  ): Common_ = {
    val __obj = js.Dynamic.literal(base64Regex = base64Regex.asInstanceOf[js.Any], cleanFields = js.Any.fromFunction1(cleanFields), cleanedObject = js.Any.fromFunction1(cleanedObject), emailRegex = emailRegex.asInstanceOf[js.Any], getCleanedString = js.Any.fromFunction1(getCleanedString), isBase64 = js.Any.fromFunction1(isBase64), isEmpty = js.Any.fromFunction1(isEmpty), isURL = js.Any.fromFunction1(isURL), notUndefined = js.Any.fromFunction1(notUndefined), urlReGex = urlReGex.asInstanceOf[js.Any], uuidRegex = uuidRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Common_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Common_] (val x: Self) extends AnyVal {
    
    inline def setBase64Regex(value: String): Self = StObject.set(x, "base64Regex", value.asInstanceOf[js.Any])
    
    inline def setCleanFields(value: js.Object => js.Promise[js.Object]): Self = StObject.set(x, "cleanFields", js.Any.fromFunction1(value))
    
    inline def setCleanedObject(value: js.Object => js.Promise[js.Object]): Self = StObject.set(x, "cleanedObject", js.Any.fromFunction1(value))
    
    inline def setEmailRegex(value: String): Self = StObject.set(x, "emailRegex", value.asInstanceOf[js.Any])
    
    inline def setGetCleanedString(value: String => String): Self = StObject.set(x, "getCleanedString", js.Any.fromFunction1(value))
    
    inline def setIsBase64(value: String => Boolean): Self = StObject.set(x, "isBase64", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: js.Object => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
    
    inline def setIsURL(value: String => Boolean): Self = StObject.set(x, "isURL", js.Any.fromFunction1(value))
    
    inline def setNotUndefined(value: Any => Boolean): Self = StObject.set(x, "notUndefined", js.Any.fromFunction1(value))
    
    inline def setUrlReGex(value: String): Self = StObject.set(x, "urlReGex", value.asInstanceOf[js.Any])
    
    inline def setUuidRegex(value: String): Self = StObject.set(x, "uuidRegex", value.asInstanceOf[js.Any])
  }
}
