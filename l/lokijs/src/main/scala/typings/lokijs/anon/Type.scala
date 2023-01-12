package typings.lokijs.anon

import typings.lokijs.lokijsStrings.find
import typings.lokijs.lokijsStrings.where
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: find | where
  
  var uid: js.UndefOr[String | Double] = js.undefined
  
  var `val`: Any
}
object Type {
  
  inline def apply(`type`: find | where, `val`: Any): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setType(value: find | where): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUid(value: String | Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setVal(value: Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
