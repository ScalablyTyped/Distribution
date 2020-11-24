package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A document footnote.
  */
@js.native
trait SchemaFootnote extends js.Object {
  
  /**
    * The contents of the footnote.  The indexes for a footnote&#39;s content
    * begin at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
  
  /**
    * The ID of the footnote.
    */
  var footnoteId: js.UndefOr[String] = js.native
}
object SchemaFootnote {
  
  @scala.inline
  def apply(): SchemaFootnote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFootnote]
  }
  
  @scala.inline
  implicit class SchemaFootnoteOps[Self <: SchemaFootnote] (val x: Self) extends AnyVal {
    
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
    def setContentVarargs(value: SchemaStructuralElement*): Self = this.set("content", js.Array(value :_*))
    
    @scala.inline
    def setContent(value: js.Array[SchemaStructuralElement]): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFootnoteId(value: String): Self = this.set("footnoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFootnoteId: Self = this.set("footnoteId", js.undefined)
  }
}
