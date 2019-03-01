package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiThingFields
  extends /**
  * custom fields.
  */
/* name */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * firmware version given by thing vendor.
    */
  var _firmwareVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
    * lot identifier given by thing vendor.
    */
  var _lot: js.UndefOr[java.lang.String] = js.undefined
  /**
    * arbitrary number field.
    */
  var _numberField1: js.UndefOr[scala.Double] = js.undefined
  /**
    * arbitrary number field.
    */
  var _numberField2: js.UndefOr[scala.Double] = js.undefined
  /**
    * arbitrary number field.
    */
  var _numberField3: js.UndefOr[scala.Double] = js.undefined
  /**
    * arbitrary number field.
    */
  var _numberField4: js.UndefOr[scala.Double] = js.undefined
  /**
    * arbitrary number field.
    */
  var _numberField5: js.UndefOr[scala.Double] = js.undefined
  /**
    * thing password given by thing vendor.
    */
  var _password: java.lang.String
  /**
    * product name given by thing vendor.
    */
  var _productName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * arbitrary string field.
    */
  var _stringField1: js.UndefOr[java.lang.String] = js.undefined
  /**
    * arbitrary string field.
    */
  var _stringField2: js.UndefOr[java.lang.String] = js.undefined
  /**
    * arbitrary string field.
    */
  var _stringField3: js.UndefOr[java.lang.String] = js.undefined
  /**
    * arbitrary string field.
    */
  var _stringField4: js.UndefOr[java.lang.String] = js.undefined
  /**
    * arbitrary string field.
    */
  var _stringField5: js.UndefOr[java.lang.String] = js.undefined
  /**
    * thing type given by thing vendor.
    */
  var _thingType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * vendor identifier given by thing vendor.
    */
  var _vendor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * thing identifier given by thing vendor.
    */
  var _vendorThingID: java.lang.String
}

object KiiThingFields {
  @scala.inline
  def apply(
    _password: java.lang.String,
    _vendorThingID: java.lang.String,
    StringDictionary: /**
    * custom fields.
    */
  /* name */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    _firmwareVersion: java.lang.String = null,
    _lot: java.lang.String = null,
    _numberField1: scala.Int | scala.Double = null,
    _numberField2: scala.Int | scala.Double = null,
    _numberField3: scala.Int | scala.Double = null,
    _numberField4: scala.Int | scala.Double = null,
    _numberField5: scala.Int | scala.Double = null,
    _productName: java.lang.String = null,
    _stringField1: java.lang.String = null,
    _stringField2: java.lang.String = null,
    _stringField3: java.lang.String = null,
    _stringField4: java.lang.String = null,
    _stringField5: java.lang.String = null,
    _thingType: java.lang.String = null,
    _vendor: java.lang.String = null
  ): KiiThingFields = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_password")(_password)
    __obj.updateDynamic("_vendorThingID")(_vendorThingID)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (_firmwareVersion != null) __obj.updateDynamic("_firmwareVersion")(_firmwareVersion)
    if (_lot != null) __obj.updateDynamic("_lot")(_lot)
    if (_numberField1 != null) __obj.updateDynamic("_numberField1")(_numberField1.asInstanceOf[js.Any])
    if (_numberField2 != null) __obj.updateDynamic("_numberField2")(_numberField2.asInstanceOf[js.Any])
    if (_numberField3 != null) __obj.updateDynamic("_numberField3")(_numberField3.asInstanceOf[js.Any])
    if (_numberField4 != null) __obj.updateDynamic("_numberField4")(_numberField4.asInstanceOf[js.Any])
    if (_numberField5 != null) __obj.updateDynamic("_numberField5")(_numberField5.asInstanceOf[js.Any])
    if (_productName != null) __obj.updateDynamic("_productName")(_productName)
    if (_stringField1 != null) __obj.updateDynamic("_stringField1")(_stringField1)
    if (_stringField2 != null) __obj.updateDynamic("_stringField2")(_stringField2)
    if (_stringField3 != null) __obj.updateDynamic("_stringField3")(_stringField3)
    if (_stringField4 != null) __obj.updateDynamic("_stringField4")(_stringField4)
    if (_stringField5 != null) __obj.updateDynamic("_stringField5")(_stringField5)
    if (_thingType != null) __obj.updateDynamic("_thingType")(_thingType)
    if (_vendor != null) __obj.updateDynamic("_vendor")(_vendor)
    __obj.asInstanceOf[KiiThingFields]
  }
}

