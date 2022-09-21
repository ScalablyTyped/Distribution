package typings.handsontable.anon

import typings.handsontable.filtersFiltersMod.ConditionName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: ConditionName
}
object Key {
  
  inline def apply(key: ConditionName): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: ConditionName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
