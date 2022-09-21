package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrafeasV1FileLocation extends StObject {
  
  /**
    * For jars that are contained inside .war files, this filepath can indicate the path to war file combined with the path to jar file.
    */
  var filePath: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrafeasV1FileLocation {
  
  inline def apply(): SchemaGrafeasV1FileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrafeasV1FileLocation]
  }
  
  extension [Self <: SchemaGrafeasV1FileLocation](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathNull: Self = StObject.set(x, "filePath", null)
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
  }
}
