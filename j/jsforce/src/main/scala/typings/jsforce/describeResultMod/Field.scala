package typings.jsforce.describeResultMod

import typings.jsforce.jsforceBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var aggregatable: Boolean
  var autonumber: Boolean
  var byteLength: Double
  var calculated: Boolean
  var calculatedFormula: js.UndefOr[maybe[String]] = js.undefined
  var cascadeDelete: Boolean
  var caseSensitive: Boolean
  var compoundFieldName: js.UndefOr[maybe[String]] = js.undefined
  var controllerName: js.UndefOr[maybe[String]] = js.undefined
  var createable: Boolean
  var custom: Boolean
  var defaultValue: js.UndefOr[maybe[String | Boolean]] = js.undefined
  var defaultValueFormula: js.UndefOr[maybe[String]] = js.undefined
  var defaultedOnCreate: Boolean
  var dependentPicklist: Boolean
  var deprecatedAndHidden: Boolean
  var digits: js.UndefOr[maybe[Double]] = js.undefined
  var displayLocationInDecimal: js.UndefOr[maybe[Boolean]] = js.undefined
  var encrypted: js.UndefOr[maybe[`true`]] = js.undefined
  var externalId: Boolean
  var extraTypeInfo: js.UndefOr[maybe[ExtraTypeInfo]] = js.undefined
  var filterable: Boolean
  var filteredLookupInfo: js.UndefOr[maybe[FilteredLookupInfo]] = js.undefined
  var formula: js.UndefOr[maybe[String]] = js.undefined
  var groupable: Boolean
  var highScaleNumber: js.UndefOr[maybe[Boolean]] = js.undefined
  var htmlFormatted: Boolean
  var idLookup: Boolean
  var inlineHelpText: js.UndefOr[maybe[String]] = js.undefined
  var label: String
  var length: Double
  var mask: js.UndefOr[maybe[String]] = js.undefined
  var maskType: js.UndefOr[maybe[String]] = js.undefined
  var name: String
  var nameField: Boolean
  var namePointing: Boolean
  var nillable: Boolean
  var permissionable: Boolean
  var picklistValues: js.UndefOr[maybe[js.Array[PicklistEntry]]] = js.undefined
  var polymorphicForeignKey: Boolean
  var precision: js.UndefOr[maybe[Double]] = js.undefined
  var queryByDistance: Boolean
  var referenceTargetField: js.UndefOr[maybe[String]] = js.undefined
  var referenceTo: js.UndefOr[maybe[js.Array[String]]] = js.undefined
  var relationshipName: js.UndefOr[maybe[String]] = js.undefined
  var relationshipOrder: js.UndefOr[maybe[Double]] = js.undefined
  var restrictedPicklist: Boolean
  var scale: Double
  var searchPrefilterable: Boolean
  var soapType: SOAPType
  var sortable: Boolean
  var `type`: FieldType
  var unique: Boolean
  var updateable: Boolean
  var writeRequiresMasterRead: js.UndefOr[maybe[Boolean]] = js.undefined
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
    updateable: Boolean,
    calculatedFormula: maybe[String] = null,
    compoundFieldName: maybe[String] = null,
    controllerName: maybe[String] = null,
    defaultValue: maybe[String | Boolean] = null,
    defaultValueFormula: maybe[String] = null,
    digits: Int | Double = null,
    displayLocationInDecimal: js.UndefOr[Boolean] = js.undefined,
    encrypted: maybe[`true`] = null,
    extraTypeInfo: maybe[ExtraTypeInfo] = null,
    filteredLookupInfo: maybe[FilteredLookupInfo] = null,
    formula: maybe[String] = null,
    highScaleNumber: js.UndefOr[Boolean] = js.undefined,
    inlineHelpText: maybe[String] = null,
    mask: maybe[String] = null,
    maskType: maybe[String] = null,
    picklistValues: maybe[js.Array[PicklistEntry]] = null,
    precision: Int | Double = null,
    referenceTargetField: maybe[String] = null,
    referenceTo: maybe[js.Array[String]] = null,
    relationshipName: maybe[String] = null,
    relationshipOrder: Int | Double = null,
    writeRequiresMasterRead: js.UndefOr[Boolean] = js.undefined
  ): Field = {
    val __obj = js.Dynamic.literal(aggregatable = aggregatable.asInstanceOf[js.Any], autonumber = autonumber.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], calculated = calculated.asInstanceOf[js.Any], cascadeDelete = cascadeDelete.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], createable = createable.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], defaultedOnCreate = defaultedOnCreate.asInstanceOf[js.Any], dependentPicklist = dependentPicklist.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], externalId = externalId.asInstanceOf[js.Any], filterable = filterable.asInstanceOf[js.Any], groupable = groupable.asInstanceOf[js.Any], htmlFormatted = htmlFormatted.asInstanceOf[js.Any], idLookup = idLookup.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameField = nameField.asInstanceOf[js.Any], namePointing = namePointing.asInstanceOf[js.Any], nillable = nillable.asInstanceOf[js.Any], permissionable = permissionable.asInstanceOf[js.Any], polymorphicForeignKey = polymorphicForeignKey.asInstanceOf[js.Any], queryByDistance = queryByDistance.asInstanceOf[js.Any], restrictedPicklist = restrictedPicklist.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], searchPrefilterable = searchPrefilterable.asInstanceOf[js.Any], soapType = soapType.asInstanceOf[js.Any], sortable = sortable.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any], updateable = updateable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (calculatedFormula != null) __obj.updateDynamic("calculatedFormula")(calculatedFormula.asInstanceOf[js.Any])
    if (compoundFieldName != null) __obj.updateDynamic("compoundFieldName")(compoundFieldName.asInstanceOf[js.Any])
    if (controllerName != null) __obj.updateDynamic("controllerName")(controllerName.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (defaultValueFormula != null) __obj.updateDynamic("defaultValueFormula")(defaultValueFormula.asInstanceOf[js.Any])
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (!js.isUndefined(displayLocationInDecimal)) __obj.updateDynamic("displayLocationInDecimal")(displayLocationInDecimal.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (extraTypeInfo != null) __obj.updateDynamic("extraTypeInfo")(extraTypeInfo.asInstanceOf[js.Any])
    if (filteredLookupInfo != null) __obj.updateDynamic("filteredLookupInfo")(filteredLookupInfo.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (!js.isUndefined(highScaleNumber)) __obj.updateDynamic("highScaleNumber")(highScaleNumber.asInstanceOf[js.Any])
    if (inlineHelpText != null) __obj.updateDynamic("inlineHelpText")(inlineHelpText.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskType != null) __obj.updateDynamic("maskType")(maskType.asInstanceOf[js.Any])
    if (picklistValues != null) __obj.updateDynamic("picklistValues")(picklistValues.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (referenceTargetField != null) __obj.updateDynamic("referenceTargetField")(referenceTargetField.asInstanceOf[js.Any])
    if (referenceTo != null) __obj.updateDynamic("referenceTo")(referenceTo.asInstanceOf[js.Any])
    if (relationshipName != null) __obj.updateDynamic("relationshipName")(relationshipName.asInstanceOf[js.Any])
    if (relationshipOrder != null) __obj.updateDynamic("relationshipOrder")(relationshipOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(writeRequiresMasterRead)) __obj.updateDynamic("writeRequiresMasterRead")(writeRequiresMasterRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

