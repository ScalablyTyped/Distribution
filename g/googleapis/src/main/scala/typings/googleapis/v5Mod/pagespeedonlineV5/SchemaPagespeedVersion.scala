package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPagespeedVersion extends StObject {
  
  /**
    * The major version number of PageSpeed used to generate these results.
    */
  var major: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minor version number of PageSpeed used to generate these results.
    */
  var minor: js.UndefOr[String | Null] = js.undefined
}
object SchemaPagespeedVersion {
  
  inline def apply(): SchemaPagespeedVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPagespeedVersion]
  }
  
  extension [Self <: SchemaPagespeedVersion](x: Self) {
    
    inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorNull: Self = StObject.set(x, "major", null)
    
    inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setMinorNull: Self = StObject.set(x, "minor", null)
    
    inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
  }
}
