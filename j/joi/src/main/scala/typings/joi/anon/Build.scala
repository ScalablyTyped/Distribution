package typings.joi.anon

import typings.joi.mod.ExtensionBoundSchema
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  var build: js.UndefOr[
    js.Function2[/* obj */ ExtensionBoundSchema, /* desc */ Record[String, Any], Any]
  ] = js.undefined
}
object Build {
  
  inline def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  
  extension [Self <: Build](x: Self) {
    
    inline def setBuild(value: (/* obj */ ExtensionBoundSchema, /* desc */ Record[String, Any]) => Any): Self = StObject.set(x, "build", js.Any.fromFunction2(value))
    
    inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
  }
}
