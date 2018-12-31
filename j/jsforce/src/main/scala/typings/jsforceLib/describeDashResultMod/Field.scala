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

