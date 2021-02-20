package typings.ipp.mod

import typings.ipp.anon.Attributesnaturallanguage
import typings.ipp.anon.Jobstate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendDocumentResponse extends StObject {
  
  var id: Double = js.native
  
  var `job-attributes-tag`: Jobstate = js.native
  
  var `operation-attributes-tag`: Attributesnaturallanguage = js.native
  
  var statusCode: StatusCode = js.native
  
  var `unsupported-attributes`: js.UndefOr[js.Array[String]] = js.native
  
  var version: IPPVersion = js.native
}
object SendDocumentResponse {
  
  @scala.inline
  def apply(
    id: Double,
    `job-attributes-tag`: Jobstate,
    `operation-attributes-tag`: Attributesnaturallanguage,
    statusCode: StatusCode,
    version: IPPVersion
  ): SendDocumentResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("job-attributes-tag")(`job-attributes-tag`.asInstanceOf[js.Any])
    __obj.updateDynamic("operation-attributes-tag")(`operation-attributes-tag`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendDocumentResponse]
  }
  
  @scala.inline
  implicit class SendDocumentResponseMutableBuilder[Self <: SendDocumentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setJob-attributes-tag`(value: Jobstate): Self = StObject.set(x, "job-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setOperation-attributes-tag`(value: Attributesnaturallanguage): Self = StObject.set(x, "operation-attributes-tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnsupported-attributes`(value: js.Array[String]): Self = StObject.set(x, "unsupported-attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUnsupported-attributesUndefined`: Self = StObject.set(x, "unsupported-attributes", js.undefined)
    
    @scala.inline
    def `setUnsupported-attributesVarargs`(value: String*): Self = StObject.set(x, "unsupported-attributes", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: IPPVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
