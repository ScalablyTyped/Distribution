package typings.googleapis.composerV1beta1Mod.composerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The environments in a project and location.
  */
trait SchemaListEnvironmentsResponse extends StObject {
  
  /**
    * The list of environments returned by a ListEnvironmentsRequest.
    */
  var environments: js.UndefOr[js.Array[SchemaEnvironment]] = js.undefined
  
  /**
    * The page token used to query for the next page if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListEnvironmentsResponse {
  
  inline def apply(): SchemaListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEnvironmentsResponse]
  }
  
  extension [Self <: SchemaListEnvironmentsResponse](x: Self) {
    
    inline def setEnvironments(value: js.Array[SchemaEnvironment]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsUndefined: Self = StObject.set(x, "environments", js.undefined)
    
    inline def setEnvironmentsVarargs(value: SchemaEnvironment*): Self = StObject.set(x, "environments", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
