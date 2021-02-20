package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for ReimageNode.
  */
@js.native
trait SchemaReimageNodeRequest extends StObject {
  
  /**
    * The version for reimage to create.
    */
  var tensorflowVersion: js.UndefOr[String] = js.native
}
object SchemaReimageNodeRequest {
  
  @scala.inline
  def apply(): SchemaReimageNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReimageNodeRequest]
  }
  
  @scala.inline
  implicit class SchemaReimageNodeRequestMutableBuilder[Self <: SchemaReimageNodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTensorflowVersion(value: String): Self = StObject.set(x, "tensorflowVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTensorflowVersionUndefined: Self = StObject.set(x, "tensorflowVersion", js.undefined)
  }
}
