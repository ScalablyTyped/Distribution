package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLabelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Label resource name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Set to `true` in order to use the user's admin credentials. The server will verify the user is an admin for the Label before allowing access.
    */
  var useAdminAccess: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The revision_id of the label that the write request will be applied to. If this is not the latest revision of the label, the request will not be processed and will return a 400 Bad Request error.
    */
  @JSName("writeControl.requiredRevisionId")
  var writeControlDotrequiredRevisionId: js.UndefOr[String] = js.undefined
}
object ParamsResourceLabelsDelete {
  
  inline def apply(): ParamsResourceLabelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLabelsDelete]
  }
  
  extension [Self <: ParamsResourceLabelsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUseAdminAccess(value: Boolean): Self = StObject.set(x, "useAdminAccess", value.asInstanceOf[js.Any])
    
    inline def setUseAdminAccessUndefined: Self = StObject.set(x, "useAdminAccess", js.undefined)
    
    inline def setWriteControlDotrequiredRevisionId(value: String): Self = StObject.set(x, "writeControl.requiredRevisionId", value.asInstanceOf[js.Any])
    
    inline def setWriteControlDotrequiredRevisionIdUndefined: Self = StObject.set(x, "writeControl.requiredRevisionId", js.undefined)
  }
}
