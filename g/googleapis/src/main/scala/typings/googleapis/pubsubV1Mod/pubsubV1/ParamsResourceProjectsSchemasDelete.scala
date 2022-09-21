package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSchemasDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the schema to delete. Format is `projects/{project\}/schemas/{schema\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSchemasDelete {
  
  inline def apply(): ParamsResourceProjectsSchemasDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSchemasDelete]
  }
  
  extension [Self <: ParamsResourceProjectsSchemasDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
