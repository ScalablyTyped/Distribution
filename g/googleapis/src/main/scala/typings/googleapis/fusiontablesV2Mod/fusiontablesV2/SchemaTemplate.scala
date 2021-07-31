package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the contents of InfoWindow templates.
  */
trait SchemaTemplate extends StObject {
  
  /**
    * List of columns from which the template is to be automatically
    * constructed. Only one of body or automaticColumns can be specified.
    */
  var automaticColumnNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Body of the template. It contains HTML with {column_name} to insert
    * values from a particular column. The body is sanitized to remove certain
    * tags, e.g., script. Only one of body or automaticColumns can be
    * specified.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of item this is. For a template, this is always
    * fusiontables#template.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Optional name assigned to a template.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier for the table for which the template is defined.
    */
  var tableId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier for the template, unique within the context of a particular
    * table.
    */
  var templateId: js.UndefOr[Double] = js.undefined
}
object SchemaTemplate {
  
  @scala.inline
  def apply(): SchemaTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplate]
  }
  
  @scala.inline
  implicit class SchemaTemplateMutableBuilder[Self <: SchemaTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomaticColumnNames(value: js.Array[String]): Self = StObject.set(x, "automaticColumnNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomaticColumnNamesUndefined: Self = StObject.set(x, "automaticColumnNames", js.undefined)
    
    @scala.inline
    def setAutomaticColumnNamesVarargs(value: String*): Self = StObject.set(x, "automaticColumnNames", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTableId(value: String): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    
    @scala.inline
    def setTemplateId(value: Double): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
