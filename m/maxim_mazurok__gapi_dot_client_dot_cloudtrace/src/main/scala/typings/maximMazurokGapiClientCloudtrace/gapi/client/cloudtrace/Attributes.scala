package typings.maximMazurokGapiClientCloudtrace.gapi.client.cloudtrace

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  /**
    * The set of attributes. Each attribute's key can be up to 128 bytes long. The value can be a string up to 256 bytes, a signed 64-bit integer, or the Boolean values `true` and
    * `false`. For example: "/instance_id": { "string_value": { "value": "my-instance" } } "/http/request_bytes": { "int_value": 300 } "abc.com/myattribute": { "bool_value": false }
    */
  var attributeMap: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.cloudtrace.gapi.client.cloudtrace.AttributeValue}
    */ typings.maximMazurokGapiClientCloudtrace.maximMazurokGapiClientCloudtraceStrings.Attributes & TopLevel[js.Any]
  ] = js.undefined
  
  /**
    * The number of attributes that were discarded. Attributes can be discarded because their keys are too long or because there are too many attributes. If this value is 0 then all
    * attributes are valid.
    */
  var droppedAttributesCount: js.UndefOr[Double] = js.undefined
}
object Attributes {
  
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeMap(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.cloudtrace.gapi.client.cloudtrace.AttributeValue}
      */ typings.maximMazurokGapiClientCloudtrace.maximMazurokGapiClientCloudtraceStrings.Attributes & TopLevel[js.Any]
    ): Self = StObject.set(x, "attributeMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeMapUndefined: Self = StObject.set(x, "attributeMap", js.undefined)
    
    @scala.inline
    def setDroppedAttributesCount(value: Double): Self = StObject.set(x, "droppedAttributesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppedAttributesCountUndefined: Self = StObject.set(x, "droppedAttributesCount", js.undefined)
  }
}
