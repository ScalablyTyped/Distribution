package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a &quot;feature instance&quot;.
  */
trait SchemaFeatureInstance extends StObject {
  
  /**
    * The feature that this is an instance of. A calendar resource may have
    * multiple instances of a feature.
    */
  var feature: js.UndefOr[SchemaFeature] = js.undefined
}
object SchemaFeatureInstance {
  
  inline def apply(): SchemaFeatureInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureInstance]
  }
  
  extension [Self <: SchemaFeatureInstance](x: Self) {
    
    inline def setFeature(value: SchemaFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "feature", js.undefined)
  }
}
