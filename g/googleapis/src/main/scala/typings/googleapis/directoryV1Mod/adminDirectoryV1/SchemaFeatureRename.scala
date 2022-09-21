package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFeatureRename extends StObject {
  
  /**
    * New name of the feature.
    */
  var newName: js.UndefOr[String | Null] = js.undefined
}
object SchemaFeatureRename {
  
  inline def apply(): SchemaFeatureRename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureRename]
  }
  
  extension [Self <: SchemaFeatureRename](x: Self) {
    
    inline def setNewName(value: String): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    inline def setNewNameNull: Self = StObject.set(x, "newName", null)
    
    inline def setNewNameUndefined: Self = StObject.set(x, "newName", js.undefined)
  }
}
