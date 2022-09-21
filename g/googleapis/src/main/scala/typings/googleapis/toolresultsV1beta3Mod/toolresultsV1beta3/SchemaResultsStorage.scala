package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResultsStorage extends StObject {
  
  /**
    * The root directory for test results.
    */
  var resultsStoragePath: js.UndefOr[SchemaFileReference] = js.undefined
  
  /**
    * The path to the Xunit XML file.
    */
  var xunitXmlFile: js.UndefOr[SchemaFileReference] = js.undefined
}
object SchemaResultsStorage {
  
  inline def apply(): SchemaResultsStorage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultsStorage]
  }
  
  extension [Self <: SchemaResultsStorage](x: Self) {
    
    inline def setResultsStoragePath(value: SchemaFileReference): Self = StObject.set(x, "resultsStoragePath", value.asInstanceOf[js.Any])
    
    inline def setResultsStoragePathUndefined: Self = StObject.set(x, "resultsStoragePath", js.undefined)
    
    inline def setXunitXmlFile(value: SchemaFileReference): Self = StObject.set(x, "xunitXmlFile", value.asInstanceOf[js.Any])
    
    inline def setXunitXmlFileUndefined: Self = StObject.set(x, "xunitXmlFile", js.undefined)
  }
}
