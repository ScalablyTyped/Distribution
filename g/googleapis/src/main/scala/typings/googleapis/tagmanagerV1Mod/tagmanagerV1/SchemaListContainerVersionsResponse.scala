package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List container versions response.
  */
@js.native
trait SchemaListContainerVersionsResponse extends StObject {
  
  /**
    * All versions of a GTM Container.
    */
  var containerVersion: js.UndefOr[js.Array[SchemaContainerVersion]] = js.native
  
  /**
    * All container version headers of a GTM Container.
    */
  var containerVersionHeader: js.UndefOr[js.Array[SchemaContainerVersionHeader]] = js.native
}
object SchemaListContainerVersionsResponse {
  
  @scala.inline
  def apply(): SchemaListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainerVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListContainerVersionsResponseMutableBuilder[Self <: SchemaListContainerVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerVersion(value: js.Array[SchemaContainerVersion]): Self = StObject.set(x, "containerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionHeader(value: js.Array[SchemaContainerVersionHeader]): Self = StObject.set(x, "containerVersionHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerVersionHeaderUndefined: Self = StObject.set(x, "containerVersionHeader", js.undefined)
    
    @scala.inline
    def setContainerVersionHeaderVarargs(value: SchemaContainerVersionHeader*): Self = StObject.set(x, "containerVersionHeader", js.Array(value :_*))
    
    @scala.inline
    def setContainerVersionUndefined: Self = StObject.set(x, "containerVersion", js.undefined)
    
    @scala.inline
    def setContainerVersionVarargs(value: SchemaContainerVersion*): Self = StObject.set(x, "containerVersion", js.Array(value :_*))
  }
}
