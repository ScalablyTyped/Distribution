package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSchemasGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the schema to get. Format is `projects/{project\}/schemas/{schema\}`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The set of fields to return in the response. If not set, returns a Schema with all fields filled out. Set to `BASIC` to omit the `definition`.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSchemasGet {
  
  inline def apply(): ParamsResourceProjectsSchemasGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSchemasGet]
  }
  
  extension [Self <: ParamsResourceProjectsSchemasGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
