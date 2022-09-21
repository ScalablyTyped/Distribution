package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppBundle extends StObject {
  
  /**
    * .aab file representing the app bundle under test.
    */
  var bundleLocation: js.UndefOr[SchemaFileReference] = js.undefined
}
object SchemaAppBundle {
  
  inline def apply(): SchemaAppBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppBundle]
  }
  
  extension [Self <: SchemaAppBundle](x: Self) {
    
    inline def setBundleLocation(value: SchemaFileReference): Self = StObject.set(x, "bundleLocation", value.asInstanceOf[js.Any])
    
    inline def setBundleLocationUndefined: Self = StObject.set(x, "bundleLocation", js.undefined)
  }
}
