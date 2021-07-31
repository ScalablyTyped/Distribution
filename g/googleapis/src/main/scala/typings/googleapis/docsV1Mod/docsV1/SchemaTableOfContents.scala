package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A StructuralElement representing a table of contents.
  */
trait SchemaTableOfContents extends StObject {
  
  /**
    * The content of the table of contents.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.undefined
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The suggested insertion IDs. A TableOfContents may have multiple
    * insertion IDs if it is a nested suggested change. If empty, then this is
    * not a suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaTableOfContents {
  
  @scala.inline
  def apply(): SchemaTableOfContents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableOfContents]
  }
  
  @scala.inline
  implicit class SchemaTableOfContentsMutableBuilder[Self <: SchemaTableOfContents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Array[SchemaStructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: SchemaStructuralElement*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
  }
}
