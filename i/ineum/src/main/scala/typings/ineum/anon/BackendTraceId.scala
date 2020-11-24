package typings.ineum.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackendTraceId extends js.Object {
  
  var backendTraceId: js.UndefOr[String] = js.native
  
  var componentStack: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var error: js.UndefOr[Error] = js.native
  
  var meta: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
}
object BackendTraceId {
  
  @scala.inline
  def apply(): BackendTraceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendTraceId]
  }
  
  @scala.inline
  implicit class BackendTraceIdOps[Self <: BackendTraceId] (val x: Self) extends AnyVal {
    
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
    def setBackendTraceId(value: String): Self = this.set("backendTraceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendTraceId: Self = this.set("backendTraceId", js.undefined)
    
    @scala.inline
    def setComponentStack(value: String): Self = this.set("componentStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentStack: Self = this.set("componentStack", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setMeta(value: StringDictionary[String | Double | Boolean]): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}
