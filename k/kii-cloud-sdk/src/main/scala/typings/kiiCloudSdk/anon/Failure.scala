package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiACL
import typings.kiiCloudSdk.KiiCloud.KiiACLEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Failure extends StObject {
  
  def failure(theACL: KiiACL, anErrorString: String): js.Any = js.native
  
  def success(theACL: KiiACL, theEntries: js.Array[KiiACLEntry]): js.Any = js.native
}
object Failure {
  
  @scala.inline
  def apply(failure: (KiiACL, String) => js.Any, success: (KiiACL, js.Array[KiiACLEntry]) => js.Any): Failure = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction2(success))
    __obj.asInstanceOf[Failure]
  }
  
  @scala.inline
  implicit class FailureMutableBuilder[Self <: Failure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiACL, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: (KiiACL, js.Array[KiiACLEntry]) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction2(value))
  }
}
