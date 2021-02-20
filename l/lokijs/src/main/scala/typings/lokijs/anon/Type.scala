package typings.lokijs.anon

import typings.lokijs.lokijsStrings.find
import typings.lokijs.lokijsStrings.where
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  var `type`: find | where = js.native
  
  var uid: js.UndefOr[String | Double] = js.native
  
  var `val`: js.Any = js.native
}
object Type {
  
  @scala.inline
  def apply(`type`: find | where, `val`: js.Any): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: find | where): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String | Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    @scala.inline
    def setVal(value: js.Any): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
  }
}
