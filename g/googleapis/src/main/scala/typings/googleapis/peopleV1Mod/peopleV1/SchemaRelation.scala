package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s relation to another person.
  */
@js.native
trait SchemaRelation extends js.Object {
  
  /**
    * The type of the relation translated and formatted in the viewer&#39;s
    * account locale or the locale specified in the Accept-Language HTTP
    * header.
    */
  var formattedType: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the relation.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The name of the other person this relation refers to.
    */
  var person: js.UndefOr[String] = js.native
  
  /**
    * The person&#39;s relation to the other person. The type can be custom or
    * one of these predefined values:  * `spouse` * `child` * `mother` *
    * `father` * `parent` * `brother` * `sister` * `friend` * `relative` *
    * `domesticPartner` * `manager` * `assistant` * `referredBy` * `partner`
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaRelation {
  
  @scala.inline
  def apply(): SchemaRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelation]
  }
  
  @scala.inline
  implicit class SchemaRelationOps[Self <: SchemaRelation] (val x: Self) extends AnyVal {
    
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
    def setFormattedType(value: String): Self = this.set("formattedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedType: Self = this.set("formattedType", js.undefined)
    
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setPerson(value: String): Self = this.set("person", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerson: Self = this.set("person", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
