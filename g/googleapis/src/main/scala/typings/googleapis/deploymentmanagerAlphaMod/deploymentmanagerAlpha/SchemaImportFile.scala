package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportFile extends StObject {
  
  /**
    * The contents of the file.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the file.
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaImportFile {
  
  inline def apply(): SchemaImportFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportFile]
  }
  
  extension [Self <: SchemaImportFile](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
