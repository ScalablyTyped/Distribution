package typings.json8Patch

import typings.json8Patch.json8PatchBooleans.`false`
import typings.json8Patch.json8PatchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var reversible: `true`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(reversible = true)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setReversible(value: `true`): Self = StObject.set(x, "reversible", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reversible extends StObject {
    
    var reversible: `false`
  }
  object Reversible {
    
    inline def apply(): Reversible = {
      val __obj = js.Dynamic.literal(reversible = false)
      __obj.asInstanceOf[Reversible]
    }
    
    extension [Self <: Reversible](x: Self) {
      
      inline def setReversible(value: `false`): Self = StObject.set(x, "reversible", value.asInstanceOf[js.Any])
    }
  }
}
