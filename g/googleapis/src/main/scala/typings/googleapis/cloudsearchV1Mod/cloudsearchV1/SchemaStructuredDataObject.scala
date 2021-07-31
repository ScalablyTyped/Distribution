package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structured data object consisting of named properties.
  */
trait SchemaStructuredDataObject extends StObject {
  
  /**
    * The properties for the object. The maximum number of elements is 1000.
    */
  var properties: js.UndefOr[js.Array[SchemaNamedProperty]] = js.undefined
}
object SchemaStructuredDataObject {
  
  @scala.inline
  def apply(): SchemaStructuredDataObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredDataObject]
  }
  
  @scala.inline
  implicit class SchemaStructuredDataObjectMutableBuilder[Self <: SchemaStructuredDataObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Array[SchemaNamedProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setPropertiesVarargs(value: SchemaNamedProperty*): Self = StObject.set(x, "properties", js.Array(value :_*))
  }
}
