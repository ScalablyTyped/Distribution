package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceInfo extends StObject {
  
  /**
    * All files used during config generation.
    */
  var sourceFiles: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
}
object SchemaSourceInfo {
  
  inline def apply(): SchemaSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceInfo]
  }
  
  extension [Self <: SchemaSourceInfo](x: Self) {
    
    inline def setSourceFiles(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "sourceFiles", value.asInstanceOf[js.Any])
    
    inline def setSourceFilesNull: Self = StObject.set(x, "sourceFiles", null)
    
    inline def setSourceFilesUndefined: Self = StObject.set(x, "sourceFiles", js.undefined)
    
    inline def setSourceFilesVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "sourceFiles", js.Array(value*))
  }
}
