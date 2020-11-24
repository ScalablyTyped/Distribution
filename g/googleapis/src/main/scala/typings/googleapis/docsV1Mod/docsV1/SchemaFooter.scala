package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A document footer.
  */
@js.native
trait SchemaFooter extends js.Object {
  
  /**
    * The contents of the footer.  The indexes for a footer&#39;s content begin
    * at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
  
  /**
    * The ID of the footer.
    */
  var footerId: js.UndefOr[String] = js.native
}
object SchemaFooter {
  
  @scala.inline
  def apply(): SchemaFooter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFooter]
  }
  
  @scala.inline
  implicit class SchemaFooterOps[Self <: SchemaFooter] (val x: Self) extends AnyVal {
    
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
    def setFooterId(value: String): Self = this.set("footerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooterId: Self = this.set("footerId", js.undefined)
  }
}
