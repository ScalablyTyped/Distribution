package typings.ipp.mod

import typings.ipp.anon.Joburi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelReleaseJobRequest extends StObject {
  
  var `operation-attributes-tag`: Joburi = js.native
}
object CancelReleaseJobRequest {
  
  @scala.inline
  def apply(`operation-attributes-tag`: Joburi): CancelReleaseJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelReleaseJobRequest]
  }
  
  @scala.inline
  implicit class CancelReleaseJobRequestMutableBuilder[Self <: CancelReleaseJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setOperation-attributes-tag`(value: Joburi): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
  }
}
