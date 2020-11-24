package typings.jsforce.describeResultMod

import typings.jsforce.jsforceBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field extends js.Object {
  
  var aggregatable: Boolean = js.native
  
  var autonumber: Boolean = js.native
  
  var byteLength: Double = js.native
  
  var calculated: Boolean = js.native
  
  var calculatedFormula: js.UndefOr[maybe[String]] = js.native
  
  var cascadeDelete: Boolean = js.native
  
  var caseSensitive: Boolean = js.native
  
  var compoundFieldName: js.UndefOr[maybe[String]] = js.native
  
  var controllerName: js.UndefOr[maybe[String]] = js.native
  
  var createable: Boolean = js.native
  
  var custom: Boolean = js.native
  
  var defaultValue: js.UndefOr[maybe[String | Boolean]] = js.native
  
  var defaultValueFormula: js.UndefOr[maybe[String]] = js.native
  
  var defaultedOnCreate: Boolean = js.native
  
  var dependentPicklist: Boolean = js.native
  
  var deprecatedAndHidden: Boolean = js.native
  
  var digits: js.UndefOr[maybe[Double]] = js.native
  
  var displayLocationInDecimal: js.UndefOr[maybe[Boolean]] = js.native
  
  var encrypted: js.UndefOr[maybe[`true`]] = js.native
  
  var externalId: Boolean = js.native
  
  var extraTypeInfo: js.UndefOr[maybe[ExtraTypeInfo]] = js.native
  
  var filterable: Boolean = js.native
  
  var filteredLookupInfo: js.UndefOr[maybe[FilteredLookupInfo]] = js.native
  
  var formula: js.UndefOr[maybe[String]] = js.native
  
  var groupable: Boolean = js.native
  
  var highScaleNumber: js.UndefOr[maybe[Boolean]] = js.native
  
  var htmlFormatted: Boolean = js.native
  
  var idLookup: Boolean = js.native
  
  var inlineHelpText: js.UndefOr[maybe[String]] = js.native
  
  var label: String = js.native
  
  var length: Double = js.native
  
  var mask: js.UndefOr[maybe[String]] = js.native
  
  var maskType: js.UndefOr[maybe[String]] = js.native
  
  var name: String = js.native
  
  var nameField: Boolean = js.native
  
  var namePointing: Boolean = js.native
  
  var nillable: Boolean = js.native
  
  var permissionable: Boolean = js.native
  
  var picklistValues: js.UndefOr[maybe[js.Array[PicklistEntry]]] = js.native
  
  var polymorphicForeignKey: Boolean = js.native
  
  var precision: js.UndefOr[maybe[Double]] = js.native
  
  var queryByDistance: Boolean = js.native
  
  var referenceTargetField: js.UndefOr[maybe[String]] = js.native
  
  var referenceTo: js.UndefOr[maybe[js.Array[String]]] = js.native
  
  var relationshipName: js.UndefOr[maybe[String]] = js.native
  
  var relationshipOrder: js.UndefOr[maybe[Double]] = js.native
  
  var restrictedPicklist: Boolean = js.native
  
  var scale: Double = js.native
  
  var searchPrefilterable: Boolean = js.native
  
  var soapType: SOAPType = js.native
  
  var sortable: Boolean = js.native
  
  var `type`: FieldType = js.native
  
  var unique: Boolean = js.native
  
  var updateable: Boolean = js.native
  
  var writeRequiresMasterRead: js.UndefOr[maybe[Boolean]] = js.native
}
object Field {
  
  @scala.inline
  def apply(
    aggregatable: Boolean,
    autonumber: Boolean,
    byteLength: Double,
    calculated: Boolean,
    cascadeDelete: Boolean,
    caseSensitive: Boolean,
    createable: Boolean,
    custom: Boolean,
    defaultedOnCreate: Boolean,
    dependentPicklist: Boolean,
    deprecatedAndHidden: Boolean,
    externalId: Boolean,
    filterable: Boolean,
    groupable: Boolean,
    htmlFormatted: Boolean,
    idLookup: Boolean,
    label: String,
    length: Double,
    name: String,
    nameField: Boolean,
    namePointing: Boolean,
    nillable: Boolean,
    permissionable: Boolean,
    polymorphicForeignKey: Boolean,
    queryByDistance: Boolean,
    restrictedPicklist: Boolean,
    scale: Double,
    searchPrefilterable: Boolean,
    soapType: SOAPType,
    sortable: Boolean,
    `type`: FieldType,
    unique: Boolean,
    updateable: Boolean
  ): Field = {
    val __obj = js.Dynamic.literal(aggregatable = aggregatable.asInstanceOf[js.Any], autonumber = autonumber.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], calculated = calculated.asInstanceOf[js.Any], cascadeDelete = cascadeDelete.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], createable = createable.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], defaultedOnCreate = defaultedOnCreate.asInstanceOf[js.Any], dependentPicklist = dependentPicklist.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], groupable = groupable.asInstanceOf[js.Any], htmlFormatted = htmlFormatted.asInstanceOf[js.Any], idLookup = idLookup.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameField = nameField.asInstanceOf[js.Any], namePointing = namePointing.asInstanceOf[js.Any], nillable = nillable.asInstanceOf[js.Any], permissionable = permissionable.asInstanceOf[js.Any], polymorphicForeignKey = polymorphicForeignKey.asInstanceOf[js.Any], queryByDistance = queryByDistance.asInstanceOf[js.Any], restrictedPicklist = restrictedPicklist.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], searchPrefilterable = searchPrefilterable.asInstanceOf[js.Any], soapType = soapType.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], updateable = updateable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    
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
    def setAggregatable(value: Boolean): Self = this.set("aggregatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutonumber(value: Boolean): Self = this.set("autonumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteLength(value: Double): Self = this.set("byteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculated(value: Boolean): Self = this.set("calculated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCascadeDelete(value: Boolean): Self = this.set("cascadeDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateable(value: Boolean): Self = this.set("createable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: Boolean): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultedOnCreate(value: Boolean): Self = this.set("defaultedOnCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentPicklist(value: Boolean): Self = this.set("dependentPicklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedAndHidden(value: Boolean): Self = this.set("deprecatedAndHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalId(value: Boolean): Self = this.set("externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterable(value: Boolean): Self = this.set("filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupable(value: Boolean): Self = this.set("groupable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlFormatted(value: Boolean): Self = this.set("htmlFormatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdLookup(value: Boolean): Self = this.set("idLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameField(value: Boolean): Self = this.set("nameField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePointing(value: Boolean): Self = this.set("namePointing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNillable(value: Boolean): Self = this.set("nillable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionable(value: Boolean): Self = this.set("permissionable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolymorphicForeignKey(value: Boolean): Self = this.set("polymorphicForeignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryByDistance(value: Boolean): Self = this.set("queryByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictedPicklist(value: Boolean): Self = this.set("restrictedPicklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPrefilterable(value: Boolean): Self = this.set("searchPrefilterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoapType(value: SOAPType): Self = this.set("soapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortable(value: Boolean): Self = this.set("sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FieldType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateable(value: Boolean): Self = this.set("updateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedFormula(value: maybe[String]): Self = this.set("calculatedFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculatedFormula: Self = this.set("calculatedFormula", js.undefined)
    
    @scala.inline
    def setCalculatedFormulaNull: Self = this.set("calculatedFormula", null)
    
    @scala.inline
    def setCompoundFieldName(value: maybe[String]): Self = this.set("compoundFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompoundFieldName: Self = this.set("compoundFieldName", js.undefined)
    
    @scala.inline
    def setCompoundFieldNameNull: Self = this.set("compoundFieldName", null)
    
    @scala.inline
    def setControllerName(value: maybe[String]): Self = this.set("controllerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteControllerName: Self = this.set("controllerName", js.undefined)
    
    @scala.inline
    def setControllerNameNull: Self = this.set("controllerName", null)
    
    @scala.inline
    def setDefaultValue(value: maybe[String | Boolean]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultValueNull: Self = this.set("defaultValue", null)
    
    @scala.inline
    def setDefaultValueFormula(value: maybe[String]): Self = this.set("defaultValueFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValueFormula: Self = this.set("defaultValueFormula", js.undefined)
    
    @scala.inline
    def setDefaultValueFormulaNull: Self = this.set("defaultValueFormula", null)
    
    @scala.inline
    def setDigits(value: maybe[Double]): Self = this.set("digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigits: Self = this.set("digits", js.undefined)
    
    @scala.inline
    def setDigitsNull: Self = this.set("digits", null)
    
    @scala.inline
    def setDisplayLocationInDecimal(value: maybe[Boolean]): Self = this.set("displayLocationInDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayLocationInDecimal: Self = this.set("displayLocationInDecimal", js.undefined)
    
    @scala.inline
    def setDisplayLocationInDecimalNull: Self = this.set("displayLocationInDecimal", null)
    
    @scala.inline
    def setEncrypted(value: maybe[`true`]): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("encrypted", js.undefined)
    
    @scala.inline
    def setEncryptedNull: Self = this.set("encrypted", null)
    
    @scala.inline
    def setExtraTypeInfo(value: maybe[ExtraTypeInfo]): Self = this.set("extraTypeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraTypeInfo: Self = this.set("extraTypeInfo", js.undefined)
    
    @scala.inline
    def setExtraTypeInfoNull: Self = this.set("extraTypeInfo", null)
    
    @scala.inline
    def setFilteredLookupInfo(value: maybe[FilteredLookupInfo]): Self = this.set("filteredLookupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilteredLookupInfo: Self = this.set("filteredLookupInfo", js.undefined)
    
    @scala.inline
    def setFilteredLookupInfoNull: Self = this.set("filteredLookupInfo", null)
    
    @scala.inline
    def setFormula(value: maybe[String]): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setFormulaNull: Self = this.set("formula", null)
    
    @scala.inline
    def setHighScaleNumber(value: maybe[Boolean]): Self = this.set("highScaleNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighScaleNumber: Self = this.set("highScaleNumber", js.undefined)
    
    @scala.inline
    def setHighScaleNumberNull: Self = this.set("highScaleNumber", null)
    
    @scala.inline
    def setInlineHelpText(value: maybe[String]): Self = this.set("inlineHelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineHelpText: Self = this.set("inlineHelpText", js.undefined)
    
    @scala.inline
    def setInlineHelpTextNull: Self = this.set("inlineHelpText", null)
    
    @scala.inline
    def setMask(value: maybe[String]): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMaskNull: Self = this.set("mask", null)
    
    @scala.inline
    def setMaskType(value: maybe[String]): Self = this.set("maskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskType: Self = this.set("maskType", js.undefined)
    
    @scala.inline
    def setMaskTypeNull: Self = this.set("maskType", null)
    
    @scala.inline
    def setPicklistValuesVarargs(value: PicklistEntry*): Self = this.set("picklistValues", js.Array(value :_*))
    
    @scala.inline
    def setPicklistValues(value: maybe[js.Array[PicklistEntry]]): Self = this.set("picklistValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePicklistValues: Self = this.set("picklistValues", js.undefined)
    
    @scala.inline
    def setPicklistValuesNull: Self = this.set("picklistValues", null)
    
    @scala.inline
    def setPrecision(value: maybe[Double]): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setPrecisionNull: Self = this.set("precision", null)
    
    @scala.inline
    def setReferenceTargetField(value: maybe[String]): Self = this.set("referenceTargetField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceTargetField: Self = this.set("referenceTargetField", js.undefined)
    
    @scala.inline
    def setReferenceTargetFieldNull: Self = this.set("referenceTargetField", null)
    
    @scala.inline
    def setReferenceToVarargs(value: String*): Self = this.set("referenceTo", js.Array(value :_*))
    
    @scala.inline
    def setReferenceTo(value: maybe[js.Array[String]]): Self = this.set("referenceTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceTo: Self = this.set("referenceTo", js.undefined)
    
    @scala.inline
    def setReferenceToNull: Self = this.set("referenceTo", null)
    
    @scala.inline
    def setRelationshipName(value: maybe[String]): Self = this.set("relationshipName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipName: Self = this.set("relationshipName", js.undefined)
    
    @scala.inline
    def setRelationshipNameNull: Self = this.set("relationshipName", null)
    
    @scala.inline
    def setRelationshipOrder(value: maybe[Double]): Self = this.set("relationshipOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelationshipOrder: Self = this.set("relationshipOrder", js.undefined)
    
    @scala.inline
    def setRelationshipOrderNull: Self = this.set("relationshipOrder", null)
    
    @scala.inline
    def setWriteRequiresMasterRead(value: maybe[Boolean]): Self = this.set("writeRequiresMasterRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteRequiresMasterRead: Self = this.set("writeRequiresMasterRead", js.undefined)
    
    @scala.inline
    def setWriteRequiresMasterReadNull: Self = this.set("writeRequiresMasterRead", null)
  }
}
