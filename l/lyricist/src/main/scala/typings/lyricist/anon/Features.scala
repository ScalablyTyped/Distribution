package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  var excluded_permissions: js.Array[String]
  
  var features: js.Array[js.Any]
  
  var interactions: FollowingBoolean
  
  var permissions: js.Array[js.Any]
}
object Features {
  
  @scala.inline
  def apply(
    excluded_permissions: js.Array[String],
    features: js.Array[js.Any],
    interactions: FollowingBoolean,
    permissions: js.Array[js.Any]
  ): Features = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  @scala.inline
  implicit class FeaturesMutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcluded_permissions(value: js.Array[String]): Self = StObject.set(x, "excluded_permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcluded_permissionsVarargs(value: String*): Self = StObject.set(x, "excluded_permissions", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[js.Any]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesVarargs(value: js.Any*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setInteractions(value: FollowingBoolean): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: js.Array[js.Any]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsVarargs(value: js.Any*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
