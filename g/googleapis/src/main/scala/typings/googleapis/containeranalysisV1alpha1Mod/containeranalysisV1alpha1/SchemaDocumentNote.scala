package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDocumentNote extends StObject {
  
  /**
    * Compliance with the SPDX specification includes populating the SPDX fields therein with data related to such fields ("SPDX-Metadata")
    */
  var dataLicence: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Provide a reference number that can be used to understand how to parse and interpret the rest of the file
    */
  var spdxVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaDocumentNote {
  
  inline def apply(): SchemaDocumentNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDocumentNote]
  }
  
  extension [Self <: SchemaDocumentNote](x: Self) {
    
    inline def setDataLicence(value: String): Self = StObject.set(x, "dataLicence", value.asInstanceOf[js.Any])
    
    inline def setDataLicenceNull: Self = StObject.set(x, "dataLicence", null)
    
    inline def setDataLicenceUndefined: Self = StObject.set(x, "dataLicence", js.undefined)
    
    inline def setSpdxVersion(value: String): Self = StObject.set(x, "spdxVersion", value.asInstanceOf[js.Any])
    
    inline def setSpdxVersionNull: Self = StObject.set(x, "spdxVersion", null)
    
    inline def setSpdxVersionUndefined: Self = StObject.set(x, "spdxVersion", js.undefined)
  }
}
