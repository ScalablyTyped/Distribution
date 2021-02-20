package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaUserData extends StObject {
  
  var key: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object SchemaUserData {
  
  @scala.inline
  def apply(): SchemaUserData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserData]
  }
  
  @scala.inline
  implicit class SchemaUserDataMutableBuilder[Self <: SchemaUserData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
