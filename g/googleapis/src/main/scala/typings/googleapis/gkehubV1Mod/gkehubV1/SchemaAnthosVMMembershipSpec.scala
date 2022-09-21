package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnthosVMMembershipSpec extends StObject {
  
  /**
    * List of configurations of the Anthos For VM subfeatures that are to be enabled
    */
  var subfeaturesSpec: js.UndefOr[js.Array[SchemaAnthosVMSubFeatureSpec]] = js.undefined
}
object SchemaAnthosVMMembershipSpec {
  
  inline def apply(): SchemaAnthosVMMembershipSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnthosVMMembershipSpec]
  }
  
  extension [Self <: SchemaAnthosVMMembershipSpec](x: Self) {
    
    inline def setSubfeaturesSpec(value: js.Array[SchemaAnthosVMSubFeatureSpec]): Self = StObject.set(x, "subfeaturesSpec", value.asInstanceOf[js.Any])
    
    inline def setSubfeaturesSpecUndefined: Self = StObject.set(x, "subfeaturesSpec", js.undefined)
    
    inline def setSubfeaturesSpecVarargs(value: SchemaAnthosVMSubFeatureSpec*): Self = StObject.set(x, "subfeaturesSpec", js.Array(value*))
  }
}
