package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List Environments Response.
  */
trait SchemaListEnvironmentsResponse extends StObject {
  
  /**
    * All Environments of a GTM Container.
    */
  var environments: js.UndefOr[js.Array[SchemaEnvironment]] = js.undefined
}
object SchemaListEnvironmentsResponse {
  
  @scala.inline
  def apply(): SchemaListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEnvironmentsResponse]
  }
  
  @scala.inline
  implicit class SchemaListEnvironmentsResponseMutableBuilder[Self <: SchemaListEnvironmentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironments(value: js.Array[SchemaEnvironment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    @scala.inline
    def setEnvironmentsVarargs(value: SchemaEnvironment*): Self = StObject.set(x, "environments", js.Array(value :_*))
  }
}
