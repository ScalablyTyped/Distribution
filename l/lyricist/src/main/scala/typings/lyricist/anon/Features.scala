package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  var excluded_permissions: js.Array[String]
  
  var features: js.Array[Any]
  
  var interactions: Following
  
  var permissions: js.Array[Any]
}
object Features {
  
  inline def apply(
    excluded_permissions: js.Array[String],
    features: js.Array[Any],
    interactions: Following,
    permissions: js.Array[Any]
  ): Features = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setExcluded_permissions(value: js.Array[String]): Self = StObject.set(x, "excluded_permissions", value.asInstanceOf[js.Any])
    
    inline def setExcluded_permissionsVarargs(value: String*): Self = StObject.set(x, "excluded_permissions", js.Array(value*))
    
    inline def setFeatures(value: js.Array[Any]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: Any*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setInteractions(value: Following): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[Any]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: Any*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
