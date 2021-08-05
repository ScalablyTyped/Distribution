package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A location/region designation for language.
  */
trait SchemaLocale extends StObject {
  
  /**
    * The id for this locale. Example: &quot;en_US&quot;.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * A human-friendly name for this language/locale. Example:
    * &quot;English&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A human-friendly string representing the region for this locale. Example:
    * &quot;United States&quot;. Not present for every locale.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Tags for this dimension. Example: &quot;default&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaLocale {
  
  inline def apply(): SchemaLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocale]
  }
  
  extension [Self <: SchemaLocale](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
