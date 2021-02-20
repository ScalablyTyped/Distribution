package typings.jsforce.describeResultMod

import typings.jsforce.jsforceBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field extends StObject {
  
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
  implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregatable(value: Boolean): Self = StObject.set(x, "aggregatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutonumber(value: Boolean): Self = StObject.set(x, "autonumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculated(value: Boolean): Self = StObject.set(x, "calculated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedFormula(value: maybe[String]): Self = StObject.set(x, "calculatedFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalculatedFormulaNull: Self = StObject.set(x, "calculatedFormula", null)
    
    @scala.inline
    def setCalculatedFormulaUndefined: Self = StObject.set(x, "calculatedFormula", js.undefined)
    
    @scala.inline
    def setCascadeDelete(value: Boolean): Self = StObject.set(x, "cascadeDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompoundFieldName(value: maybe[String]): Self = StObject.set(x, "compoundFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompoundFieldNameNull: Self = StObject.set(x, "compoundFieldName", null)
    
    @scala.inline
    def setCompoundFieldNameUndefined: Self = StObject.set(x, "compoundFieldName", js.undefined)
    
    @scala.inline
    def setControllerName(value: maybe[String]): Self = StObject.set(x, "controllerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControllerNameNull: Self = StObject.set(x, "controllerName", null)
    
    @scala.inline
    def setControllerNameUndefined: Self = StObject.set(x, "controllerName", js.undefined)
    
    @scala.inline
    def setCreateable(value: Boolean): Self = StObject.set(x, "createable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: maybe[String | Boolean]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueFormula(value: maybe[String]): Self = StObject.set(x, "defaultValueFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueFormulaNull: Self = StObject.set(x, "defaultValueFormula", null)
    
    @scala.inline
    def setDefaultValueFormulaUndefined: Self = StObject.set(x, "defaultValueFormula", js.undefined)
    
    @scala.inline
    def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setDefaultedOnCreate(value: Boolean): Self = StObject.set(x, "defaultedOnCreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependentPicklist(value: Boolean): Self = StObject.set(x, "dependentPicklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedAndHidden(value: Boolean): Self = StObject.set(x, "deprecatedAndHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigits(value: maybe[Double]): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigitsNull: Self = StObject.set(x, "digits", null)
    
    @scala.inline
    def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    @scala.inline
    def setDisplayLocationInDecimal(value: maybe[Boolean]): Self = StObject.set(x, "displayLocationInDecimal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLocationInDecimalNull: Self = StObject.set(x, "displayLocationInDecimal", null)
    
    @scala.inline
    def setDisplayLocationInDecimalUndefined: Self = StObject.set(x, "displayLocationInDecimal", js.undefined)
    
    @scala.inline
    def setEncrypted(value: maybe[`true`]): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedNull: Self = StObject.set(x, "encrypted", null)
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    @scala.inline
    def setExternalId(value: Boolean): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraTypeInfo(value: maybe[ExtraTypeInfo]): Self = StObject.set(x, "extraTypeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraTypeInfoNull: Self = StObject.set(x, "extraTypeInfo", null)
    
    @scala.inline
    def setExtraTypeInfoUndefined: Self = StObject.set(x, "extraTypeInfo", js.undefined)
    
    @scala.inline
    def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredLookupInfo(value: maybe[FilteredLookupInfo]): Self = StObject.set(x, "filteredLookupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredLookupInfoNull: Self = StObject.set(x, "filteredLookupInfo", null)
    
    @scala.inline
    def setFilteredLookupInfoUndefined: Self = StObject.set(x, "filteredLookupInfo", js.undefined)
    
    @scala.inline
    def setFormula(value: maybe[String]): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaNull: Self = StObject.set(x, "formula", null)
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setGroupable(value: Boolean): Self = StObject.set(x, "groupable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighScaleNumber(value: maybe[Boolean]): Self = StObject.set(x, "highScaleNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighScaleNumberNull: Self = StObject.set(x, "highScaleNumber", null)
    
    @scala.inline
    def setHighScaleNumberUndefined: Self = StObject.set(x, "highScaleNumber", js.undefined)
    
    @scala.inline
    def setHtmlFormatted(value: Boolean): Self = StObject.set(x, "htmlFormatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdLookup(value: Boolean): Self = StObject.set(x, "idLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineHelpText(value: maybe[String]): Self = StObject.set(x, "inlineHelpText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineHelpTextNull: Self = StObject.set(x, "inlineHelpText", null)
    
    @scala.inline
    def setInlineHelpTextUndefined: Self = StObject.set(x, "inlineHelpText", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask(value: maybe[String]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskNull: Self = StObject.set(x, "mask", null)
    
    @scala.inline
    def setMaskType(value: maybe[String]): Self = StObject.set(x, "maskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskTypeNull: Self = StObject.set(x, "maskType", null)
    
    @scala.inline
    def setMaskTypeUndefined: Self = StObject.set(x, "maskType", js.undefined)
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameField(value: Boolean): Self = StObject.set(x, "nameField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePointing(value: Boolean): Self = StObject.set(x, "namePointing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNillable(value: Boolean): Self = StObject.set(x, "nillable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionable(value: Boolean): Self = StObject.set(x, "permissionable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicklistValues(value: maybe[js.Array[PicklistEntry]]): Self = StObject.set(x, "picklistValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicklistValuesNull: Self = StObject.set(x, "picklistValues", null)
    
    @scala.inline
    def setPicklistValuesUndefined: Self = StObject.set(x, "picklistValues", js.undefined)
    
    @scala.inline
    def setPicklistValuesVarargs(value: PicklistEntry*): Self = StObject.set(x, "picklistValues", js.Array(value :_*))
    
    @scala.inline
    def setPolymorphicForeignKey(value: Boolean): Self = StObject.set(x, "polymorphicForeignKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecision(value: maybe[Double]): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionNull: Self = StObject.set(x, "precision", null)
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setQueryByDistance(value: Boolean): Self = StObject.set(x, "queryByDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceTargetField(value: maybe[String]): Self = StObject.set(x, "referenceTargetField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceTargetFieldNull: Self = StObject.set(x, "referenceTargetField", null)
    
    @scala.inline
    def setReferenceTargetFieldUndefined: Self = StObject.set(x, "referenceTargetField", js.undefined)
    
    @scala.inline
    def setReferenceTo(value: maybe[js.Array[String]]): Self = StObject.set(x, "referenceTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferenceToNull: Self = StObject.set(x, "referenceTo", null)
    
    @scala.inline
    def setReferenceToUndefined: Self = StObject.set(x, "referenceTo", js.undefined)
    
    @scala.inline
    def setReferenceToVarargs(value: String*): Self = StObject.set(x, "referenceTo", js.Array(value :_*))
    
    @scala.inline
    def setRelationshipName(value: maybe[String]): Self = StObject.set(x, "relationshipName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipNameNull: Self = StObject.set(x, "relationshipName", null)
    
    @scala.inline
    def setRelationshipNameUndefined: Self = StObject.set(x, "relationshipName", js.undefined)
    
    @scala.inline
    def setRelationshipOrder(value: maybe[Double]): Self = StObject.set(x, "relationshipOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationshipOrderNull: Self = StObject.set(x, "relationshipOrder", null)
    
    @scala.inline
    def setRelationshipOrderUndefined: Self = StObject.set(x, "relationshipOrder", js.undefined)
    
    @scala.inline
    def setRestrictedPicklist(value: Boolean): Self = StObject.set(x, "restrictedPicklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchPrefilterable(value: Boolean): Self = StObject.set(x, "searchPrefilterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoapType(value: SOAPType): Self = StObject.set(x, "soapType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateable(value: Boolean): Self = StObject.set(x, "updateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteRequiresMasterRead(value: maybe[Boolean]): Self = StObject.set(x, "writeRequiresMasterRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteRequiresMasterReadNull: Self = StObject.set(x, "writeRequiresMasterRead", null)
    
    @scala.inline
    def setWriteRequiresMasterReadUndefined: Self = StObject.set(x, "writeRequiresMasterRead", js.undefined)
  }
}
