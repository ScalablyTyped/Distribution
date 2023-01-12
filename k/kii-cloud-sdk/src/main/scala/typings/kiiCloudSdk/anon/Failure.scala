package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiACL
import typings.kiiCloudSdk.KiiCloud.KiiACLEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Failure extends StObject {
  
  def failure(theACL: KiiACL, anErrorString: String): Any
  
  def success(theACL: KiiACL, theEntries: js.Array[KiiACLEntry]): Any
}
object Failure {
  
  inline def apply(failure: (KiiACL, String) => Any, success: (KiiACL, js.Array[KiiACLEntry]) => Any): Failure = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[Failure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Failure] (val x: Self) extends AnyVal {
    
    inline def setFailure(value: (KiiACL, String) => Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    inline def setSuccess(value: (KiiACL, js.Array[KiiACLEntry]) => Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
