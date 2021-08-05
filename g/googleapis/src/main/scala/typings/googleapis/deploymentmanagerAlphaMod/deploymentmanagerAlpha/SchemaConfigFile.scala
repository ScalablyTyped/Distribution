package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigFile extends StObject {
  
  /**
    * The contents of the file.
    */
  var content: js.UndefOr[String] = js.undefined
}
object SchemaConfigFile {
  
  inline def apply(): SchemaConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigFile]
  }
  
  extension [Self <: SchemaConfigFile](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
