package typings.googleapis.deploymentmanagerV2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTemplateContents extends StObject {
  
  /**
    * Import files referenced by the main template.
    */
  var imports: js.UndefOr[js.Array[SchemaImportFile]] = js.undefined
  
  /**
    * Which interpreter (python or jinja) should be used during expansion.
    */
  var interpreter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The filename of the mainTemplate
    */
  var mainTemplate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The contents of the template schema.
    */
  var schema: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The contents of the main template file.
    */
  var template: js.UndefOr[String | Null] = js.undefined
}
object SchemaTemplateContents {
  
  inline def apply(): SchemaTemplateContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplateContents]
  }
  
  extension [Self <: SchemaTemplateContents](x: Self) {
    
    inline def setImports(value: js.Array[SchemaImportFile]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: SchemaImportFile*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setInterpreter(value: String): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterNull: Self = StObject.set(x, "interpreter", null)
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setMainTemplate(value: String): Self = StObject.set(x, "mainTemplate", value.asInstanceOf[js.Any])
    
    inline def setMainTemplateNull: Self = StObject.set(x, "mainTemplate", null)
    
    inline def setMainTemplateUndefined: Self = StObject.set(x, "mainTemplate", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaNull: Self = StObject.set(x, "schema", null)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
