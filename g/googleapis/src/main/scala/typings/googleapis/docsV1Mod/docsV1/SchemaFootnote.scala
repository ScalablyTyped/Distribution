package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A document footnote.
  */
trait SchemaFootnote extends StObject {
  
  /**
    * The contents of the footnote.  The indexes for a footnote&#39;s content
    * begin at zero.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.undefined
  
  /**
    * The ID of the footnote.
    */
  var footnoteId: js.UndefOr[String] = js.undefined
}
object SchemaFootnote {
  
  @scala.inline
  def apply(): SchemaFootnote = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFootnote]
  }
  
  @scala.inline
  implicit class SchemaFootnoteMutableBuilder[Self <: SchemaFootnote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Array[SchemaStructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: SchemaStructuralElement*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setFootnoteId(value: String): Self = StObject.set(x, "footnoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnoteIdUndefined: Self = StObject.set(x, "footnoteId", js.undefined)
  }
}
