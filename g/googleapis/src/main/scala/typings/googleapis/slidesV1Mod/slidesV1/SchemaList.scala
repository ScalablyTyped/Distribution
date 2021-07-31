package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A List describes the look and feel of bullets belonging to paragraphs
  * associated with a list. A paragraph that is part of a list has an implicit
  * reference to that list&#39;s ID.
  */
trait SchemaList extends StObject {
  
  /**
    * The ID of the list.
    */
  var listId: js.UndefOr[String] = js.undefined
  
  /**
    * A map of nesting levels to the properties of bullets at the associated
    * level. A list has at most nine levels of nesting, so the possible values
    * for the keys of this map are 0 through 8, inclusive.
    */
  var nestingLevel: js.UndefOr[StringDictionary[SchemaNestingLevel]] = js.undefined
}
object SchemaList {
  
  @scala.inline
  def apply(): SchemaList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaList]
  }
  
  @scala.inline
  implicit class SchemaListMutableBuilder[Self <: SchemaList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "listId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListIdUndefined: Self = StObject.set(x, "listId", js.undefined)
    
    @scala.inline
    def setNestingLevel(value: StringDictionary[SchemaNestingLevel]): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
  }
}
