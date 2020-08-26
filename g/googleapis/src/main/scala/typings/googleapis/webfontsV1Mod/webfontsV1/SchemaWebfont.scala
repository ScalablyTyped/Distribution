package typings.googleapis.webfontsV1Mod.webfontsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaWebfont extends js.Object {
  /**
    * The category of the font.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * The name of the font.
    */
  var family: js.UndefOr[String] = js.native
  /**
    * The font files (with all supported scripts) for each one of the available
    * variants, as a key : value map.
    */
  var files: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * This kind represents a webfont object in the webfonts service.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The date (format &quot;yyyy-MM-dd&quot;) the font was modified for the
    * last time.
    */
  var lastModified: js.UndefOr[String] = js.native
  /**
    * The scripts supported by the font.
    */
  var subsets: js.UndefOr[js.Array[String]] = js.native
  /**
    * The available variants for the font.
    */
  var variants: js.UndefOr[js.Array[String]] = js.native
  /**
    * The font version.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaWebfont {
  @scala.inline
  def apply(): SchemaWebfont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebfont]
  }
  @scala.inline
  implicit class SchemaWebfontOps[Self <: SchemaWebfont] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setFiles(value: StringDictionary[String]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    @scala.inline
    def setSubsetsVarargs(value: String*): Self = this.set("subsets", js.Array(value :_*))
    @scala.inline
    def setSubsets(value: js.Array[String]): Self = this.set("subsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubsets: Self = this.set("subsets", js.undefined)
    @scala.inline
    def setVariantsVarargs(value: String*): Self = this.set("variants", js.Array(value :_*))
    @scala.inline
    def setVariants(value: js.Array[String]): Self = this.set("variants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

