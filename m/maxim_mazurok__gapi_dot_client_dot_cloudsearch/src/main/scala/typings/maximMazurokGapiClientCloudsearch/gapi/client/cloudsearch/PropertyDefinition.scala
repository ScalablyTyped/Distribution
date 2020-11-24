package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyDefinition extends js.Object {
  
  var booleanPropertyOptions: js.UndefOr[BooleanPropertyOptions] = js.native
  
  var datePropertyOptions: js.UndefOr[DatePropertyOptions] = js.native
  
  /** Options that determine how the property is displayed in the Cloud Search results page if it is specified to be displayed in the object's display options . */
  var displayOptions: js.UndefOr[PropertyDisplayOptions] = js.native
  
  var doublePropertyOptions: js.UndefOr[DoublePropertyOptions] = js.native
  
  var enumPropertyOptions: js.UndefOr[EnumPropertyOptions] = js.native
  
  var htmlPropertyOptions: js.UndefOr[HtmlPropertyOptions] = js.native
  
  var integerPropertyOptions: js.UndefOr[IntegerPropertyOptions] = js.native
  
  /**
    * Indicates that the property can be used for generating facets. Cannot be true for properties whose type is object. IsReturnable must be true to set this option. Only supported for
    * Boolean, Enum, and Text properties.
    */
  var isFacetable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that multiple values are allowed for the property. For example, a document only has one description but can have multiple comments. Cannot be true for properties whose
    * type is a boolean. If set to false, properties that contain more than one value cause the indexing request for that item to be rejected.
    */
  var isRepeatable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that the property identifies data that should be returned in search results via the Query API. If set to *true*, indicates that Query API users can use matching property
    * fields in results. However, storing fields requires more space allocation and uses more bandwidth for search queries, which impacts performance over large datasets. Set to *true*
    * here only if the field is needed for search results. Cannot be true for properties whose type is an object.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that the property can be used for sorting. Cannot be true for properties that are repeatable. Cannot be true for properties whose type is object or user identifier.
    * IsReturnable must be true to set this option. Only supported for Boolean, Date, Double, Integer, and Timestamp properties.
    */
  var isSortable: js.UndefOr[Boolean] = js.native
  
  /** Indicates that the property can be used for generating query suggestions. */
  var isSuggestable: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates that users can perform wildcard search for this property. Only supported for Text properties. IsReturnable must be true to set this option. In a given datasource maximum
    * of 5 properties can be marked as is_wildcard_searchable.
    */
  var isWildcardSearchable: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the property. Item indexing requests sent to the Indexing API should set the property name equal to this value. For example, if name is *subject_line*, then indexing
    * requests for document items with subject fields should set the name for that field equal to *subject_line*. Use the name as the identifier for the object property. Once registered
    * as a property for an object, you cannot re-use this name for another property within that object. The name must start with a letter and can only contain letters (A-Z, a-z) or
    * numbers (0-9). The maximum length is 256 characters.
    */
  var name: js.UndefOr[String] = js.native
  
  var objectPropertyOptions: js.UndefOr[ObjectPropertyOptions] = js.native
  
  var textPropertyOptions: js.UndefOr[TextPropertyOptions] = js.native
  
  var timestampPropertyOptions: js.UndefOr[TimestampPropertyOptions] = js.native
}
object PropertyDefinition {
  
  @scala.inline
  def apply(): PropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyDefinition]
  }
  
  @scala.inline
  implicit class PropertyDefinitionOps[Self <: PropertyDefinition] (val x: Self) extends AnyVal {
    
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
    def setBooleanPropertyOptions(value: BooleanPropertyOptions): Self = this.set("booleanPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBooleanPropertyOptions: Self = this.set("booleanPropertyOptions", js.undefined)
    
    @scala.inline
    def setDatePropertyOptions(value: DatePropertyOptions): Self = this.set("datePropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatePropertyOptions: Self = this.set("datePropertyOptions", js.undefined)
    
    @scala.inline
    def setDisplayOptions(value: PropertyDisplayOptions): Self = this.set("displayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayOptions: Self = this.set("displayOptions", js.undefined)
    
    @scala.inline
    def setDoublePropertyOptions(value: DoublePropertyOptions): Self = this.set("doublePropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoublePropertyOptions: Self = this.set("doublePropertyOptions", js.undefined)
    
    @scala.inline
    def setEnumPropertyOptions(value: EnumPropertyOptions): Self = this.set("enumPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnumPropertyOptions: Self = this.set("enumPropertyOptions", js.undefined)
    
    @scala.inline
    def setHtmlPropertyOptions(value: HtmlPropertyOptions): Self = this.set("htmlPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlPropertyOptions: Self = this.set("htmlPropertyOptions", js.undefined)
    
    @scala.inline
    def setIntegerPropertyOptions(value: IntegerPropertyOptions): Self = this.set("integerPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerPropertyOptions: Self = this.set("integerPropertyOptions", js.undefined)
    
    @scala.inline
    def setIsFacetable(value: Boolean): Self = this.set("isFacetable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFacetable: Self = this.set("isFacetable", js.undefined)
    
    @scala.inline
    def setIsRepeatable(value: Boolean): Self = this.set("isRepeatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRepeatable: Self = this.set("isRepeatable", js.undefined)
    
    @scala.inline
    def setIsReturnable(value: Boolean): Self = this.set("isReturnable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReturnable: Self = this.set("isReturnable", js.undefined)
    
    @scala.inline
    def setIsSortable(value: Boolean): Self = this.set("isSortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSortable: Self = this.set("isSortable", js.undefined)
    
    @scala.inline
    def setIsSuggestable(value: Boolean): Self = this.set("isSuggestable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSuggestable: Self = this.set("isSuggestable", js.undefined)
    
    @scala.inline
    def setIsWildcardSearchable(value: Boolean): Self = this.set("isWildcardSearchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsWildcardSearchable: Self = this.set("isWildcardSearchable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setObjectPropertyOptions(value: ObjectPropertyOptions): Self = this.set("objectPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectPropertyOptions: Self = this.set("objectPropertyOptions", js.undefined)
    
    @scala.inline
    def setTextPropertyOptions(value: TextPropertyOptions): Self = this.set("textPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextPropertyOptions: Self = this.set("textPropertyOptions", js.undefined)
    
    @scala.inline
    def setTimestampPropertyOptions(value: TimestampPropertyOptions): Self = this.set("timestampPropertyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampPropertyOptions: Self = this.set("timestampPropertyOptions", js.undefined)
  }
}
