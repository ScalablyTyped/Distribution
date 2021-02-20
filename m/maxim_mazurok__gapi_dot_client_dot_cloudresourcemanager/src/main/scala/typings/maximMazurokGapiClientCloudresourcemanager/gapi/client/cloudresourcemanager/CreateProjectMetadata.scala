package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateProjectMetadata extends StObject {
  
  /** Creation time of the project creation workflow. */
  var createTime: js.UndefOr[String] = js.native
  
  /** True if the project can be retrieved using GetProject. No other operations on the project are guaranteed to work until the project creation is complete. */
  var gettable: js.UndefOr[Boolean] = js.native
  
  /** True if the project creation process is complete. */
  var ready: js.UndefOr[Boolean] = js.native
}
object CreateProjectMetadata {
  
  @scala.inline
  def apply(): CreateProjectMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProjectMetadata]
  }
  
  @scala.inline
  implicit class CreateProjectMetadataMutableBuilder[Self <: CreateProjectMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setGettable(value: Boolean): Self = StObject.set(x, "gettable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGettableUndefined: Self = StObject.set(x, "gettable", js.undefined)
    
    @scala.inline
    def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyUndefined: Self = StObject.set(x, "ready", js.undefined)
  }
}
