package typings.indexArrayBy

import typings.indexArrayBy.mod.ListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Keys extends StObject {
    
    var keys: js.Array[String]
    
    var vals: ListItem | js.Array[ListItem]
  }
  object Keys {
    
    inline def apply(keys: js.Array[String], vals: ListItem | js.Array[ListItem]): Keys = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], vals = vals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Keys]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Keys] (val x: Self) extends AnyVal {
      
      inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setVals(value: ListItem | js.Array[ListItem]): Self = StObject.set(x, "vals", value.asInstanceOf[js.Any])
      
      inline def setValsVarargs(value: ListItem*): Self = StObject.set(x, "vals", js.Array(value*))
    }
  }
}
