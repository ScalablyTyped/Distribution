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
  def apply(): SchemaDisplayData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisplayData]
  }
  @scala.inline
  implicit class SchemaDisplayDataOps[Self <: SchemaDisplayData] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    @scala.inline
    def setDurationValue(value: String): Self = this.set("durationValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationValue: Self = this.set("durationValue", js.undefined)
    @scala.inline
    def setFloatValue(value: Double): Self = this.set("floatValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloatValue: Self = this.set("floatValue", js.undefined)
    @scala.inline
    def setInt64Value(value: String): Self = this.set("int64Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInt64Value: Self = this.set("int64Value", js.undefined)
    @scala.inline
    def setJavaClassValue(value: String): Self = this.set("javaClassValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJavaClassValue: Self = this.set("javaClassValue", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setShortStrValue(value: String): Self = this.set("shortStrValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortStrValue: Self = this.set("shortStrValue", js.undefined)
    @scala.inline
    def setStrValue(value: String): Self = this.set("strValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrValue: Self = this.set("strValue", js.undefined)
    @scala.inline
    def setTimestampValue(value: String): Self = this.set("timestampValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestampValue: Self = this.set("timestampValue", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

