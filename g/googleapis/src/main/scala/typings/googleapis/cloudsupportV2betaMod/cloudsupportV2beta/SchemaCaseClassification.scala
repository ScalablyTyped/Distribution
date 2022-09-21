package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCaseClassification extends StObject {
  
  /**
    * The display name of the classification.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID for a classification. Must be specified for case creation. To retrieve valid classification IDs for case creation, use `caseClassifications.search`.
    */
  var id: js.UndefOr[String | Null] = js.undefined
}
object SchemaCaseClassification {
  
  inline def apply(): SchemaCaseClassification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCaseClassification]
  }
  
  extension [Self <: SchemaCaseClassification](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
