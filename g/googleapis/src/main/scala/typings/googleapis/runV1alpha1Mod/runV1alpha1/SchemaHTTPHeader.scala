package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPHeader describes a custom header to be used in HTTP probes
  */
trait SchemaHTTPHeader extends StObject {
  
  /**
    * The header field name
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The header field value
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaHTTPHeader {
  
  @scala.inline
  def apply(): SchemaHTTPHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHTTPHeader]
  }
  
  @scala.inline
  implicit class SchemaHTTPHeaderMutableBuilder[Self <: SchemaHTTPHeader] (val x: Self) extends AnyVal {
    
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
