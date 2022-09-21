package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildNote extends StObject {
  
  /**
    * Required. Immutable. Version of the builder which produced this build.
    */
  var builderVersion: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuildNote {
  
  inline def apply(): SchemaBuildNote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildNote]
  }
  
  extension [Self <: SchemaBuildNote](x: Self) {
    
    inline def setBuilderVersion(value: String): Self = StObject.set(x, "builderVersion", value.asInstanceOf[js.Any])
    
    inline def setBuilderVersionNull: Self = StObject.set(x, "builderVersion", null)
    
    inline def setBuilderVersionUndefined: Self = StObject.set(x, "builderVersion", js.undefined)
  }
}
