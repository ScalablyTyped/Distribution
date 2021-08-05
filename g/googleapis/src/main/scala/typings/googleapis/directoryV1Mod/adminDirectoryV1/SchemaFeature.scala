package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Feature object in Directory API.
  */
trait SchemaFeature extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the feature.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaFeature {
  
  inline def apply(): SchemaFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeature]
  }
  
  extension [Self <: SchemaFeature](x: Self) {
    
    inline def setEtags(value: String): Self = StObject.set(x, "etags", value.asInstanceOf[js.Any])
    
    inline def setEtagsUndefined: Self = StObject.set(x, "etags", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
