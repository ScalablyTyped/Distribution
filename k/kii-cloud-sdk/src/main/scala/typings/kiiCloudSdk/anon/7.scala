package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  def failure(bucketToDelete: KiiBucket, anErrorString: String): js.Any
  
  def success(deletedBucket: KiiBucket): js.Any
}
object `7` {
  
  @scala.inline
  def apply(failure: (KiiBucket, String) => js.Any, success: KiiBucket => js.Any): `7` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit class `7MutableBuilder`[Self <: `7`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiBucket, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: KiiBucket => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
