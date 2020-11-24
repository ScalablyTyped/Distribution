package typings.kiiCloudSdk.anon

import typings.kiiCloudSdk.KiiCloud.KiiServerCodeEntry
import typings.kiiCloudSdk.KiiCloud.KiiServerCodeExecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `24`[T] extends js.Object {
  
  def failure(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult, anErrorString: String): js.Any = js.native
  
  def success(entry: KiiServerCodeEntry, argument: T, execResult: KiiServerCodeExecResult): js.Any = js.native
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
  implicit class `24Ops`[Self <: `24`[_], T] (val x: Self with `24`[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFailure(value: (KiiServerCodeEntry, T, KiiServerCodeExecResult, String) => js.Any): Self = this.set("failure", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSuccess(value: (KiiServerCodeEntry, T, KiiServerCodeExecResult) => js.Any): Self = this.set("success", js.Any.fromFunction3(value))
  }
}
