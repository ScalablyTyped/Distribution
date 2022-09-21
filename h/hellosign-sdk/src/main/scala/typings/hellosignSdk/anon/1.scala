package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var can_insert_everywhere: js.UndefOr[Boolean] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setCan_insert_everywhere(value: Boolean): Self = StObject.set(x, "can_insert_everywhere", value.asInstanceOf[js.Any])
    
    inline def setCan_insert_everywhereUndefined: Self = StObject.set(x, "can_insert_everywhere", js.undefined)
  }
}
