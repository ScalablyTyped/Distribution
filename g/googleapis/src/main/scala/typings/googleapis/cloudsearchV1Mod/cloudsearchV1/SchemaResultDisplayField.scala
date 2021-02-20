package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Display Fields for Search Results
  */
@js.native
trait SchemaResultDisplayField extends StObject {
  
  /**
    * The display label for the property.
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * The operator name of the property.
    */
  var operatorName: js.UndefOr[String] = js.native
  
  /**
    * The name value pair for the property.
    */
  var property: js.UndefOr[SchemaNamedProperty] = js.native
}
object SchemaResultDisplayField {
  
  @scala.inline
  def apply(): SchemaResultDisplayField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultDisplayField]
  }
  
  @scala.inline
  implicit class SchemaResultDisplayFieldMutableBuilder[Self <: SchemaResultDisplayField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOperatorName(value: String): Self = StObject.set(x, "operatorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorNameUndefined: Self = StObject.set(x, "operatorName", js.undefined)
    
    @scala.inline
    def setProperty(value: SchemaNamedProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
  }
}
