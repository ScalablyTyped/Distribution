package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information for connecting over HTTP(s).
  */
trait SchemaAddressable extends StObject {
  
  var hostname: js.UndefOr[String] = js.undefined
}
object SchemaAddressable {
  
  inline def apply(): SchemaAddressable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddressable]
  }
  
  extension [Self <: SchemaAddressable](x: Self) {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
  }
}
