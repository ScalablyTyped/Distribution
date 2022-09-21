package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMemcacheParameters extends StObject {
  
  /**
    * Output only. The unique ID associated with this set of parameters. Users can use this id to determine if the parameters associated with the instance differ from the parameters associated with the nodes. A discrepancy between parameter ids can inform users that they may need to take action to apply parameters on nodes.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User defined set of parameters to use in the memcached process.
    */
  var params: js.UndefOr[StringDictionary[String] | Null] = js.undefined
}
object SchemaMemcacheParameters {
  
  inline def apply(): SchemaMemcacheParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemcacheParameters]
  }
  
  extension [Self <: SchemaMemcacheParameters](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsNull: Self = StObject.set(x, "params", null)
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
