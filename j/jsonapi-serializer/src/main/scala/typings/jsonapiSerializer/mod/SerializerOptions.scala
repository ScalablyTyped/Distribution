package typings.jsonapiSerializer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializerOptions extends js.Object {
  
  var attributes: js.UndefOr[js.Array[String]] = js.native
  
  var dataLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.native
  
  var dataMeta: js.UndefOr[js.Function0[Unit] | js.Object] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var ignoreRelationshipData: js.UndefOr[Boolean] = js.native
  
  var included: js.UndefOr[Boolean] = js.native
  
  var keyForAttribute: js.UndefOr[String | KeyForAttribute] = js.native
  
  var meta: js.UndefOr[js.Object] = js.native
  
  var nullIfMissing: js.UndefOr[Boolean] = js.native
  
  var pluralizeType: js.UndefOr[Boolean] = js.native
  
  var ref: js.UndefOr[js.Function0[Unit] | Boolean | String] = js.native
  
  var relationshipLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.native
  
  var relationshipMeta: js.UndefOr[js.Object] = js.native
  
  var topLevelLinks: js.UndefOr[StringDictionary[String | LinkFunction]] = js.native
  
  var transform: js.UndefOr[Transform] = js.native
  
  var typeForAttribute: js.UndefOr[TypeForAttribute] = js.native
}
object SerializerOptions {
  
  @scala.inline
  def apply(): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializerOptions]
  }
  
  @scala.inline
  implicit class SerializerOptionsOps[Self <: SerializerOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setDataLinks(value: StringDictionary[String | LinkFunction]): Self = this.set("dataLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLinks: Self = this.set("dataLinks", js.undefined)
    
    @scala.inline
    def setDataMetaFunction0(value: () => Unit): Self = this.set("dataMeta", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDataMeta(value: js.Function0[Unit] | js.Object): Self = this.set("dataMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataMeta: Self = this.set("dataMeta", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIgnoreRelationshipData(value: Boolean): Self = this.set("ignoreRelationshipData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreRelationshipData: Self = this.set("ignoreRelationshipData", js.undefined)
    
    @scala.inline
    def setIncluded(value: Boolean): Self = this.set("included", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncluded: Self = this.set("included", js.undefined)
    
    @scala.inline
    def setKeyForAttributeFunction1(value: /* attribute */ String => String): Self = this.set("keyForAttribute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyForAttribute(value: String | KeyForAttribute): Self = this.set("keyForAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyForAttribute: Self = this.set("keyForAttribute", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Object): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setNullIfMissing(value: Boolean): Self = this.set("nullIfMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullIfMissing: Self = this.set("nullIfMissing", js.undefined)
    
    @scala.inline
    def setPluralizeType(value: Boolean): Self = this.set("pluralizeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePluralizeType: Self = this.set("pluralizeType", js.undefined)
    
    @scala.inline
    def setRefFunction0(value: () => Unit): Self = this.set("ref", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRef(value: js.Function0[Unit] | Boolean | String): Self = this.set("ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    
    @scala.inline
    def setRelationshipLinks(value: StringDictionary[String | LinkFunction]): Self = this.set("relationshipLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipLinks: Self = this.set("relationshipLinks", js.undefined)
    
    @scala.inline
    def setRelationshipMeta(value: js.Object): Self = this.set("relationshipMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipMeta: Self = this.set("relationshipMeta", js.undefined)
    
    @scala.inline
    def setTopLevelLinks(value: StringDictionary[String | LinkFunction]): Self = this.set("topLevelLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopLevelLinks: Self = this.set("topLevelLinks", js.undefined)
    
    @scala.inline
    def setTransform(value: /* record */ js.Any => js.Any): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    
    @scala.inline
    def setTypeForAttribute(value: (/* attribute */ String, /* object */ js.UndefOr[js.Any]) => js.Any): Self = this.set("typeForAttribute", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTypeForAttribute: Self = this.set("typeForAttribute", js.undefined)
  }
}
