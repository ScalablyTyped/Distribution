package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFileLocation extends StObject {
  
  /**
    * For jars that are contained inside .war files, this filepath can indicate the path to war file combined with the path to jar file.
    */
  var filePath: js.UndefOr[String | Null] = js.undefined
}
object SchemaFileLocation {
  
  inline def apply(): SchemaFileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileLocation]
  }
  
  extension [Self <: SchemaFileLocation](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
  }
}
