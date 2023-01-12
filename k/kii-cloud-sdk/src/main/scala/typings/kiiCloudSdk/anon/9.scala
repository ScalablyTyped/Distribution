package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  def failure(theGroup: KiiGroup, anErrorString: String): Any
  
  def success(theDeletedGroup: KiiGroup): Any
}
object `9` {
  
  inline def apply(failure: (KiiGroup, String) => Any, success: KiiGroup => Any): `9` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `9`] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: (KiiGroup, String) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: KiiGroup => Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
