package typings
package jsforceLib.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var aggregatable: scala.Boolean
  var autonumber: scala.Boolean
  var byteLength: scala.Double
  var calculated: scala.Boolean
  var calculatedFormula: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var cascadeDelete: scala.Boolean
  var caseSensitive: scala.Boolean
  var compoundFieldName: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var controllerName: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var createable: scala.Boolean
  var custom: scala.Boolean
  var defaultValue: js.UndefOr[maybe[java.lang.String | scala.Boolean]] = js.undefined
  var defaultValueFormula: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var defaultedOnCreate: scala.Boolean
  var dependentPicklist: scala.Boolean
  var deprecatedAndHidden: scala.Boolean
  var digits: js.UndefOr[maybe[scala.Double]] = js.undefined
  var displayLocationInDecimal: js.UndefOr[maybe[scala.Boolean]] = js.undefined
  var encrypted: js.UndefOr[maybe[jsforceLib.jsforceLibNumbers.`true`]] = js.undefined
  var externalId: scala.Boolean
  var extraTypeInfo: js.UndefOr[maybe[ExtraTypeInfo]] = js.undefined
  var filterable: scala.Boolean
  var filteredLookupInfo: js.UndefOr[maybe[FilteredLookupInfo]] = js.undefined
  var formula: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var groupable: scala.Boolean
  var highScaleNumber: js.UndefOr[maybe[scala.Boolean]] = js.undefined
  var htmlFormatted: scala.Boolean
  var idLookup: scala.Boolean
  var inlineHelpText: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var label: java.lang.String
  var length: scala.Double
  var mask: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var maskType: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var name: java.lang.String
  var nameField: scala.Boolean
  var namePointing: scala.Boolean
  var nillable: scala.Boolean
  var permissionable: scala.Boolean
  var picklistValues: js.UndefOr[maybe[js.Array[PicklistEntry]]] = js.undefined
  var polymorphicForeignKey: scala.Boolean
  var precision: js.UndefOr[maybe[scala.Double]] = js.undefined
  var queryByDistance: scala.Boolean
  var referenceTargetField: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var referenceTo: js.UndefOr[maybe[js.Array[java.lang.String]]] = js.undefined
  var relationshipName: js.UndefOr[maybe[java.lang.String]] = js.undefined
  var relationshipOrder: js.UndefOr[maybe[scala.Double]] = js.undefined
  var restrictedPicklist: scala.Boolean
  var scale: scala.Double
  var searchPrefilterable: scala.Boolean
  var soapType: SOAPType
  var sortable: scala.Boolean
  var `type`: FieldType
  var unique: scala.Boolean
  var updateable: scala.Boolean
  var writeRequiresMasterRead: js.UndefOr[maybe[scala.Boolean]] = js.undefined
}

object Field {
  @scala.inline
  def apply(
    aggregatable: scala.Boolean,
    autonumber: scala.Boolean,
    byteLength: scala.Double,
    calculated: scala.Boolean,
    cascadeDelete: scala.Boolean,
    caseSensitive: scala.Boolean,
    createable: scala.Boolean,
    custom: scala.Boolean,
    defaultedOnCreate: scala.Boolean,
    dependentPicklist: scala.Boolean,
    deprecatedAndHidden: scala.Boolean,
    externalId: scala.Boolean,
    filterable: scala.Boolean,
    groupable: scala.Boolean,
    htmlFormatted: scala.Boolean,
    idLookup: scala.Boolean,
    label: java.lang.String,
    length: scala.Double,
    name: java.lang.String,
    nameField: scala.Boolean,
    namePointing: scala.Boolean,
    nillable: scala.Boolean,
    permissionable: scala.Boolean,
    polymorphicForeignKey: scala.Boolean,
    queryByDistance: scala.Boolean,
    restrictedPicklist: scala.Boolean,
    scale: scala.Double,
    searchPrefilterable: scala.Boolean,
    soapType: SOAPType,
    sortable: scala.Boolean,
    `type`: FieldType,
    unique: scala.Boolean,
    updateable: scala.Boolean,
    calculatedFormula: maybe[java.lang.String] = null,
    compoundFieldName: maybe[java.lang.String] = null,
    controllerName: maybe[java.lang.String] = null,
    defaultValue: maybe[java.lang.String | scala.Boolean] = null,
    defaultValueFormula: maybe[java.lang.String] = null,
    digits: maybe[scala.Double] = null,
    displayLocationInDecimal: maybe[scala.Boolean] = null,
    encrypted: maybe[jsforceLib.jsforceLibNumbers.`true`] = null,
    extraTypeInfo: maybe[ExtraTypeInfo] = null,
    filteredLookupInfo: maybe[FilteredLookupInfo] = null,
    formula: maybe[java.lang.String] = null,
    highScaleNumber: maybe[scala.Boolean] = null,
    inlineHelpText: maybe[java.lang.String] = null,
    mask: maybe[java.lang.String] = null,
    maskType: maybe[java.lang.String] = null,
    picklistValues: maybe[js.Array[PicklistEntry]] = null,
    precision: maybe[scala.Double] = null,
    referenceTargetField: maybe[java.lang.String] = null,
    referenceTo: maybe[js.Array[java.lang.String]] = null,
    relationshipName: maybe[java.lang.String] = null,
    relationshipOrder: maybe[scala.Double] = null,
    writeRequiresMasterRead: maybe[scala.Boolean] = null
  ): Field = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("aggregatable")(aggregatable)
    __obj.updateDynamic("autonumber")(autonumber)
    __obj.updateDynamic("byteLength")(byteLength)
    __obj.updateDynamic("calculated")(calculated)
    __obj.updateDynamic("cascadeDelete")(cascadeDelete)
    __obj.updateDynamic("caseSensitive")(caseSensitive)
    __obj.updateDynamic("createable")(createable)
    __obj.updateDynamic("custom")(custom)
    __obj.updateDynamic("defaultedOnCreate")(defaultedOnCreate)
    __obj.updateDynamic("dependentPicklist")(dependentPicklist)
    __obj.updateDynamic("deprecatedAndHidden")(deprecatedAndHidden)
    __obj.updateDynamic("externalId")(externalId)
    __obj.updateDynamic("filterable")(filterable)
    __obj.updateDynamic("groupable")(groupable)
    __obj.updateDynamic("htmlFormatted")(htmlFormatted)
    __obj.updateDynamic("idLookup")(idLookup)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nameField")(nameField)
    __obj.updateDynamic("namePointing")(namePointing)
    __obj.updateDynamic("nillable")(nillable)
    __obj.updateDynamic("permissionable")(permissionable)
    __obj.updateDynamic("polymorphicForeignKey")(polymorphicForeignKey)
    __obj.updateDynamic("queryByDistance")(queryByDistance)
    __obj.updateDynamic("restrictedPicklist")(restrictedPicklist)
    __obj.updateDynamic("scale")(scale)
    __obj.updateDynamic("searchPrefilterable")(searchPrefilterable)
    __obj.updateDynamic("soapType")(soapType)
    __obj.updateDynamic("sortable")(sortable)
    __obj.updateDynamic("unique")(unique)
    __obj.updateDynamic("updateable")(updateable)
    if (calculatedFormula != null) __obj.updateDynamic("calculatedFormula")(calculatedFormula.asInstanceOf[js.Any])
    if (compoundFieldName != null) __obj.updateDynamic("compoundFieldName")(compoundFieldName.asInstanceOf[js.Any])
    if (controllerName != null) __obj.updateDynamic("controllerName")(controllerName.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (defaultValueFormula != null) __obj.updateDynamic("defaultValueFormula")(defaultValueFormula.asInstanceOf[js.Any])
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (displayLocationInDecimal != null) __obj.updateDynamic("displayLocationInDecimal")(displayLocationInDecimal.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (extraTypeInfo != null) __obj.updateDynamic("extraTypeInfo")(extraTypeInfo.asInstanceOf[js.Any])
    if (filteredLookupInfo != null) __obj.updateDynamic("filteredLookupInfo")(filteredLookupInfo.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (highScaleNumber != null) __obj.updateDynamic("highScaleNumber")(highScaleNumber.asInstanceOf[js.Any])
    if (inlineHelpText != null) __obj.updateDynamic("inlineHelpText")(inlineHelpText.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maskType != null) __obj.updateDynamic("maskType")(maskType.asInstanceOf[js.Any])
    if (picklistValues != null) __obj.updateDynamic("picklistValues")(picklistValues.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (referenceTargetField != null) __obj.updateDynamic("referenceTargetField")(referenceTargetField.asInstanceOf[js.Any])
    if (referenceTo != null) __obj.updateDynamic("referenceTo")(referenceTo.asInstanceOf[js.Any])
    if (relationshipName != null) __obj.updateDynamic("relationshipName")(relationshipName.asInstanceOf[js.Any])
    if (relationshipOrder != null) __obj.updateDynamic("relationshipOrder")(relationshipOrder.asInstanceOf[js.Any])
    if (writeRequiresMasterRead != null) __obj.updateDynamic("writeRequiresMasterRead")(writeRequiresMasterRead.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

