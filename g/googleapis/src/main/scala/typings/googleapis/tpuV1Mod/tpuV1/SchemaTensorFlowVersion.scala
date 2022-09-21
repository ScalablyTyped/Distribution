package typings.googleapis.tpuV1Mod.tpuV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTensorFlowVersion extends StObject {
  
  /**
    * The resource name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * the tensorflow version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaTensorFlowVersion {
  
  inline def apply(): SchemaTensorFlowVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTensorFlowVersion]
  }
  
  extension [Self <: SchemaTensorFlowVersion](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
