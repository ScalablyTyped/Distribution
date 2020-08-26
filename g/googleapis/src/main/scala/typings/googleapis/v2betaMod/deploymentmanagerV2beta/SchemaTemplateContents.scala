package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Files that make up the template contents of a template type.
  */
@js.native
trait SchemaTemplateContents extends js.Object {
  /**
    * Import files referenced by the main template.
    */
  var imports: js.UndefOr[js.Array[SchemaImportFile]] = js.native
  /**
    * Which interpreter (python or jinja) should be used during expansion.
    */
  var interpreter: js.UndefOr[String] = js.native
  /**
    * The filename of the mainTemplate
    */
  var mainTemplate: js.UndefOr[String] = js.native
  /**
    * The contents of the template schema.
    */
  var schema: js.UndefOr[String] = js.native
  /**
    * The contents of the main template file.
    */
  var template: js.UndefOr[String] = js.native
}

object SchemaTemplateContents {
  @scala.inline
  def apply(): SchemaTemplateContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTemplateContents]
  }
  @scala.inline
  implicit class SchemaTemplateContentsOps[Self <: SchemaTemplateContents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImportsVarargs(value: SchemaImportFile*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[SchemaImportFile]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    @scala.inline
    def setInterpreter(value: String): Self = this.set("interpreter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpreter: Self = this.set("interpreter", js.undefined)
    @scala.inline
    def setMainTemplate(value: String): Self = this.set("mainTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainTemplate: Self = this.set("mainTemplate", js.undefined)
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

