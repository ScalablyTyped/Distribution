package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Parameter.
  */
trait SchemaParameter extends StObject {
  
  /**
    * The named key that uniquely identifies a parameter. Required for
    * top-level parameters, as well as map values. Ignored for list values.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * This list parameter&#39;s parameters (keys will be ignored).
    */
  var list: js.UndefOr[js.Array[SchemaParameter]] = js.undefined
  
  /**
    * This map parameter&#39;s parameters (must have keys; keys must be
    * unique).
    */
  var map: js.UndefOr[js.Array[SchemaParameter]] = js.undefined
  
  /**
    * The parameter type. Valid values are:  - boolean: The value represents a
    * boolean, represented as &#39;true&#39; or &#39;false&#39;  - integer: The
    * value represents a 64-bit signed integer value, in base 10  - list: A
    * list of parameters should be specified  - map: A map of parameters should
    * be specified  - template: The value represents any text; this can include
    * variable references (even variable references that might return
    * non-string types)
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * A parameter&#39;s value (may contain variable references such as
    * &quot;{{myVariable}}&quot;) as appropriate to the specified type.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaParameter {
  
  inline def apply(): SchemaParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParameter]
  }
  
  extension [Self <: SchemaParameter](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setList(value: js.Array[SchemaParameter]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListUndefined: Self = StObject.set(x, "list", js.undefined)
    
    inline def setListVarargs(value: SchemaParameter*): Self = StObject.set(x, "list", js.Array(value :_*))
    
    inline def setMap(value: js.Array[SchemaParameter]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setMapVarargs(value: SchemaParameter*): Self = StObject.set(x, "map", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
