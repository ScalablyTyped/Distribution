package typings.hapiJoi.mod

import typings.hapiJoi.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtensionTermManifest extends StObject {
  
  var mapped: From
}
object ExtensionTermManifest {
  
  inline def apply(mapped: From): ExtensionTermManifest = {
    val __obj = js.Dynamic.literal(mapped = mapped.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionTermManifest]
  }
  
  extension [Self <: ExtensionTermManifest](x: Self) {
    
    inline def setMapped(value: From): Self = StObject.set(x, "mapped", value.asInstanceOf[js.Any])
  }
}
