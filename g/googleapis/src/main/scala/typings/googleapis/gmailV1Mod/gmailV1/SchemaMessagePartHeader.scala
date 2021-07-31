package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMessagePartHeader extends StObject {
  
  /**
    * The name of the header before the : separator. For example, To.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The value of the header after the : separator. For example,
    * someuser@example.com.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaMessagePartHeader {
  
  @scala.inline
  def apply(): SchemaMessagePartHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMessagePartHeader]
  }
  
  @scala.inline
  implicit class SchemaMessagePartHeaderMutableBuilder[Self <: SchemaMessagePartHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
