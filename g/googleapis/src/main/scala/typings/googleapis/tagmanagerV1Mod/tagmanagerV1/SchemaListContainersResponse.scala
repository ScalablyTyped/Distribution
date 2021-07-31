package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Containers Response.
  */
trait SchemaListContainersResponse extends StObject {
  
  /**
    * All Containers of a GTM Account.
    */
  var containers: js.UndefOr[js.Array[SchemaContainer]] = js.undefined
}
object SchemaListContainersResponse {
  
  @scala.inline
  def apply(): SchemaListContainersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainersResponse]
  }
  
  @scala.inline
  implicit class SchemaListContainersResponseMutableBuilder[Self <: SchemaListContainersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainers(value: js.Array[SchemaContainer]): Self = StObject.set(x, "containers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainersUndefined: Self = StObject.set(x, "containers", js.undefined)
    
    @scala.inline
    def setContainersVarargs(value: SchemaContainer*): Self = StObject.set(x, "containers", js.Array(value :_*))
  }
}
