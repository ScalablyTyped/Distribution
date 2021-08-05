package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Source information used to create a Service Config
  */
trait SchemaSourceInfo extends StObject {
  
  /**
    * All files used during config generation.
    */
  var sourceFiles: js.UndefOr[js.Array[StringDictionary[js.Any]]] = js.undefined
}
object SchemaSourceInfo {
  
  inline def apply(): SchemaSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceInfo]
  }
  
  extension [Self <: SchemaSourceInfo](x: Self) {
    
    inline def setSourceFiles(value: js.Array[StringDictionary[js.Any]]): Self = StObject.set(x, "sourceFiles", value.asInstanceOf[js.Any])
    
    inline def setSourceFilesUndefined: Self = StObject.set(x, "sourceFiles", js.undefined)
    
    inline def setSourceFilesVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "sourceFiles", js.Array(value :_*))
  }
}
