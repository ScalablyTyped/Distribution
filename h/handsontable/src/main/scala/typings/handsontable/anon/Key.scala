package typings.handsontable.anon

import typings.handsontable.pluginsFiltersFiltersMod.ConditionName
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    inline def setKey(value: ConditionName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
