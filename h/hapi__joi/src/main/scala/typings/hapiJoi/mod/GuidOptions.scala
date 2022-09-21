package typings.hapiJoi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GuidOptions extends StObject {
  
  var version: js.Array[GuidVersions] | GuidVersions
}
object GuidOptions {
  
  inline def apply(version: js.Array[GuidVersions] | GuidVersions): GuidOptions = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GuidOptions]
  }
  
  extension [Self <: GuidOptions](x: Self) {
    
    inline def setVersion(value: js.Array[GuidVersions] | GuidVersions): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionVarargs(value: GuidVersions*): Self = StObject.set(x, "version", js.Array(value*))
  }
}
