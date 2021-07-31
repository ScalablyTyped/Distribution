package typings.googleapis.websecurityscannerV1alphaMod.websecurityscannerV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a HTTP Header.
  */
trait SchemaHeader extends StObject {
  
  /**
    * Header name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Header value.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaHeader {
  
  @scala.inline
  def apply(): SchemaHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHeader]
  }
  
  @scala.inline
  implicit class SchemaHeaderMutableBuilder[Self <: SchemaHeader] (val x: Self) extends AnyVal {
    
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
