package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a &quot;feature instance&quot;.
  */
@js.native
trait SchemaFeatureInstance extends StObject {
  
  /**
    * The feature that this is an instance of. A calendar resource may have
    * multiple instances of a feature.
    */
  var feature: js.UndefOr[SchemaFeature] = js.native
}
object SchemaFeatureInstance {
  
  @scala.inline
  def apply(): SchemaFeatureInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureInstance]
  }
  
  @scala.inline
  implicit class SchemaFeatureInstanceMutableBuilder[Self <: SchemaFeatureInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeature(value: SchemaFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
  }
}
