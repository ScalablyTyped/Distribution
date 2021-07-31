package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiBucket
import typings.kiiCloudSdk.KiiCloud.KiiQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  def failure(bucket: KiiBucket, errorString: String): js.Any
  
  def success(bucket: KiiBucket, query: KiiQuery, count: Double): js.Any
}
object `6` {
  
  @scala.inline
  def apply(failure: (KiiBucket, String) => js.Any, success: (KiiBucket, KiiQuery, Double) => js.Any): `6` = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction2(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiBucket, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSuccess(value: (KiiBucket, KiiQuery, Double) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
