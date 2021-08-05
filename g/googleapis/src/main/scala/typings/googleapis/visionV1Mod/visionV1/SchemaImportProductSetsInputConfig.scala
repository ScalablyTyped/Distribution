package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The input content for the `ImportProductSets` method.
  */
trait SchemaImportProductSetsInputConfig extends StObject {
  
  /**
    * The Google Cloud Storage location for a csv file which preserves a list
    * of ImportProductSetRequests in each line.
    */
  var gcsSource: js.UndefOr[SchemaImportProductSetsGcsSource] = js.undefined
}
object SchemaImportProductSetsInputConfig {
  
  inline def apply(): SchemaImportProductSetsInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportProductSetsInputConfig]
  }
  
  extension [Self <: SchemaImportProductSetsInputConfig](x: Self) {
    
    inline def setGcsSource(value: SchemaImportProductSetsGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
