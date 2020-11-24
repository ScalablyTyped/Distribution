package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The named styles. Paragraphs in the document can inherit their TextStyle
  * and ParagraphStyle from these named styles.
  */
@js.native
trait SchemaNamedStyles extends js.Object {
  
  /**
    * The named styles.  There is an entry for each of the possible named style
    * types.
    */
  var styles: js.UndefOr[js.Array[SchemaNamedStyle]] = js.native
}
object SchemaNamedStyles {
  
  @scala.inline
  def apply(): SchemaNamedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedStyles]
  }
  
  @scala.inline
  implicit class SchemaNamedStylesOps[Self <: SchemaNamedStyles] (val x: Self) extends AnyVal {
    
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
    def setStylesVarargs(value: SchemaNamedStyle*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[SchemaNamedStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
}
