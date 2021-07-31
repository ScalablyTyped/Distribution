package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Files that make up the template contents of a template type.
  */
trait SchemaTemplateContents extends StObject {
  
  /**
    * Import files referenced by the main template.
    */
  var imports: js.UndefOr[js.Array[SchemaImportFile]] = js.undefined
  
  /**
    * Which interpreter (python or jinja) should be used during expansion.
    */
  var interpreter: js.UndefOr[String] = js.undefined
  
  /**
    * The filename of the mainTemplate
    */
  var mainTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * The contents of the template schema.
    */
  var schema: js.UndefOr[String] = js.undefined
  
  /**
    * The contents of the main template file.
    */
  var template: js.UndefOr[String] = js.undefined
}
object SchemaTemplateContents {
  
  @scala.inline
  def apply(): SchemaTemplateContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplateContents]
  }
  
  @scala.inline
  implicit class SchemaTemplateContentsMutableBuilder[Self <: SchemaTemplateContents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImports(value: js.Array[SchemaImportFile]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    @scala.inline
    def setImportsVarargs(value: SchemaImportFile*): Self = StObject.set(x, "imports", js.Array(value :_*))
    
    @scala.inline
    def setInterpreter(value: String): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    @scala.inline
    def setMainTemplate(value: String): Self = StObject.set(x, "mainTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainTemplateUndefined: Self = StObject.set(x, "mainTemplate", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
