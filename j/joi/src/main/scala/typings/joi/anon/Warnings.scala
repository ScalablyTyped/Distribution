package typings.joi.anon

import typings.joi.joiBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warnings extends StObject {
  
  var warnings: `true`
}
object Warnings {
  
  inline def apply(): Warnings = {
    val __obj = js.Dynamic.literal(warnings = true)
    __obj.asInstanceOf[Warnings]
  }
  
  extension [Self <: Warnings](x: Self) {
    
    inline def setWarnings(value: `true`): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
  }
}
