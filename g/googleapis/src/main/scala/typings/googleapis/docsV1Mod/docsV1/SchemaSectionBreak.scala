package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A StructuralElement representing a section break. A section is a range of
  * content which has the same SectionStyle. A section break represents the
  * start of a new section, and the section style applies to the section after
  * the section break.  The document body always begins with a section break.
  */
trait SchemaSectionBreak extends StObject {
  
  /**
    * The style of the section after this section break.
    */
  var sectionStyle: js.UndefOr[SchemaSectionStyle] = js.undefined
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The suggested insertion IDs. A SectionBreak may have multiple insertion
    * IDs if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaSectionBreak {
  
  inline def apply(): SchemaSectionBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSectionBreak]
  }
  
  extension [Self <: SchemaSectionBreak](x: Self) {
    
    inline def setSectionStyle(value: SchemaSectionStyle): Self = StObject.set(x, "sectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSectionStyleUndefined: Self = StObject.set(x, "sectionStyle", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
  }
}
