package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A List represents the list attributes for a group of paragraphs that all
  * belong to the same list. A paragraph that is part of a list has a reference
  * to the list&#39;s ID in its bullet.
  */
@js.native
trait SchemaList extends js.Object {
  
  /**
    * The properties of the list.
    */
  var listProperties: js.UndefOr[SchemaListProperties] = js.native
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this list.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The suggested insertion ID. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionId: js.UndefOr[String] = js.native
  
  /**
    * The suggested changes to the list properties, keyed by suggestion ID.
    */
  var suggestedListPropertiesChanges: js.UndefOr[StringDictionary[SchemaSuggestedListProperties]] = js.native
}
object SchemaList {
  
  @scala.inline
  def apply(): SchemaList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaList]
  }
  
  @scala.inline
  implicit class SchemaListOps[Self <: SchemaList] (val x: Self) extends AnyVal {
    
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
    def setListProperties(value: SchemaListProperties): Self = this.set("listProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListProperties: Self = this.set("listProperties", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionId(value: String): Self = this.set("suggestedInsertionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedInsertionId: Self = this.set("suggestedInsertionId", js.undefined)
    
    @scala.inline
    def setSuggestedListPropertiesChanges(value: StringDictionary[SchemaSuggestedListProperties]): Self = this.set("suggestedListPropertiesChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedListPropertiesChanges: Self = this.set("suggestedListPropertiesChanges", js.undefined)
  }
}
