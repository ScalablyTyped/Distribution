package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a platform type that can be targeted by ads.
  */
trait SchemaPlatformType extends StObject {
  
  /**
    * ID of this platform type.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#platformType&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this platform type.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaPlatformType {
  
  inline def apply(): SchemaPlatformType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlatformType]
  }
  
  extension [Self <: SchemaPlatformType](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
