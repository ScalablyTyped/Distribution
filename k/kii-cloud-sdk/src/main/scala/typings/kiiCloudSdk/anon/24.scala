package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiServerCodeEntry
import typings.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24`[T] extends StObject {
  
  def failure(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult, anErrorString: String): js.Any
  
  def success(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult): js.Any
}
object `24` {
  
  @scala.inline
  def apply[T](
    failure: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => js.Any,
    success: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => js.Any
  ): `24`[T] = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction3(success))
    __obj.asInstanceOf[`24`[T]]
  }
  
  @scala.inline
  implicit class `24MutableBuilder`[Self <: `24`[?], T] (val x: Self & `24`[T]) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSuccess(value: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
  }
}
