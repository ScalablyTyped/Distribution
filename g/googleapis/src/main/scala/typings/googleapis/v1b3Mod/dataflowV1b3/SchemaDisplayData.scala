package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data provided with a pipeline or transform to provide descriptive info.
  */
@js.native
trait SchemaDisplayData extends js.Object {
  /**
    * Contains value if the data is of a boolean type.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * Contains value if the data is of duration type.
    */
  var durationValue: js.UndefOr[String] = js.native
  /**
    * Contains value if the data is of float type.
    */
  var floatValue: js.UndefOr[Double] = js.native
  /**
    * Contains value if the data is of int64 type.
    */
  var int64Value: js.UndefOr[String] = js.native
  /**
    * Contains value if the data is of java class type.
    */
  var javaClassValue: js.UndefOr[String] = js.native
  /**
    * The key identifying the display data. This is intended to be used as a
    * label for the display data when viewed in a dax monitoring system.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * An optional label to display in a dax UI for the element.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * The namespace for the key. This is usually a class name or programming
    * language namespace (i.e. python module) which defines the display data.
    * This allows a dax monitoring system to specially handle the data and
    * perform custom rendering.
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * A possible additional shorter value to display. For example a
    * java_class_name_value of com.mypackage.MyDoFn will be stored with MyDoFn
    * as the short_str_value and com.mypackage.MyDoFn as the java_class_name
    * value. short_str_value can be displayed and java_class_name_value will be
    * displayed as a tooltip.
    */
  var shortStrValue: js.UndefOr[String] = js.native
  /**
    * Contains value if the data is of string type.
    */
  var strValue: js.UndefOr[String] = js.native
  /**
    * Contains value if the data is of timestamp type.
    */
  var timestampValue: js.UndefOr[String] = js.native
  /**
    * An optional full URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaDisplayData {
  @scala.inline
  def apply(
    boolValue: js.UndefOr[Boolean] = js.undefined,
    durationValue: String = null,
    floatValue: Int | Double = null,
    int64Value: String = null,
    javaClassValue: String = null,
    key: String = null,
    label: String = null,
    namespace: String = null,
    shortStrValue: String = null,
    strValue: String = null,
    timestampValue: String = null,
    url: String = null
  ): SchemaDisplayData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(boolValue)) __obj.updateDynamic("boolValue")(boolValue.asInstanceOf[js.Any])
    if (durationValue != null) __obj.updateDynamic("durationValue")(durationValue.asInstanceOf[js.Any])
    if (floatValue != null) __obj.updateDynamic("floatValue")(floatValue.asInstanceOf[js.Any])
    if (int64Value != null) __obj.updateDynamic("int64Value")(int64Value.asInstanceOf[js.Any])
    if (javaClassValue != null) __obj.updateDynamic("javaClassValue")(javaClassValue.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (shortStrValue != null) __obj.updateDynamic("shortStrValue")(shortStrValue.asInstanceOf[js.Any])
    if (strValue != null) __obj.updateDynamic("strValue")(strValue.asInstanceOf[js.Any])
    if (timestampValue != null) __obj.updateDynamic("timestampValue")(timestampValue.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDisplayData]
  }
}

