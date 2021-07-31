package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data provided with a pipeline or transform to provide descriptive info.
  */
trait SchemaDisplayData extends StObject {
  
  /**
    * Contains value if the data is of a boolean type.
    */
  var boolValue: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Contains value if the data is of duration type.
    */
  var durationValue: js.UndefOr[String] = js.undefined
  
  /**
    * Contains value if the data is of float type.
    */
  var floatValue: js.UndefOr[Double] = js.undefined
  
  /**
    * Contains value if the data is of int64 type.
    */
  var int64Value: js.UndefOr[String] = js.undefined
  
  /**
    * Contains value if the data is of java class type.
    */
  var javaClassValue: js.UndefOr[String] = js.undefined
  
  /**
    * The key identifying the display data. This is intended to be used as a
    * label for the display data when viewed in a dax monitoring system.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * An optional label to display in a dax UI for the element.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The namespace for the key. This is usually a class name or programming
    * language namespace (i.e. python module) which defines the display data.
    * This allows a dax monitoring system to specially handle the data and
    * perform custom rendering.
    */
  var namespace: js.UndefOr[String] = js.undefined
  
  /**
    * A possible additional shorter value to display. For example a
    * java_class_name_value of com.mypackage.MyDoFn will be stored with MyDoFn
    * as the short_str_value and com.mypackage.MyDoFn as the java_class_name
    * value. short_str_value can be displayed and java_class_name_value will be
    * displayed as a tooltip.
    */
  var shortStrValue: js.UndefOr[String] = js.undefined
  
  /**
    * Contains value if the data is of string type.
    */
  var strValue: js.UndefOr[String] = js.undefined
  
  /**
    * Contains value if the data is of timestamp type.
    */
  var timestampValue: js.UndefOr[String] = js.undefined
  
  /**
    * An optional full URL.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaDisplayData {
  
  @scala.inline
  def apply(): SchemaDisplayData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisplayData]
  }
  
  @scala.inline
  implicit class SchemaDisplayDataMutableBuilder[Self <: SchemaDisplayData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoolValue(value: Boolean): Self = StObject.set(x, "boolValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoolValueUndefined: Self = StObject.set(x, "boolValue", js.undefined)
    
    @scala.inline
    def setDurationValue(value: String): Self = StObject.set(x, "durationValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationValueUndefined: Self = StObject.set(x, "durationValue", js.undefined)
    
    @scala.inline
    def setFloatValue(value: Double): Self = StObject.set(x, "floatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatValueUndefined: Self = StObject.set(x, "floatValue", js.undefined)
    
    @scala.inline
    def setInt64Value(value: String): Self = StObject.set(x, "int64Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt64ValueUndefined: Self = StObject.set(x, "int64Value", js.undefined)
    
    @scala.inline
    def setJavaClassValue(value: String): Self = StObject.set(x, "javaClassValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJavaClassValueUndefined: Self = StObject.set(x, "javaClassValue", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setShortStrValue(value: String): Self = StObject.set(x, "shortStrValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortStrValueUndefined: Self = StObject.set(x, "shortStrValue", js.undefined)
    
    @scala.inline
    def setStrValue(value: String): Self = StObject.set(x, "strValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrValueUndefined: Self = StObject.set(x, "strValue", js.undefined)
    
    @scala.inline
    def setTimestampValue(value: String): Self = StObject.set(x, "timestampValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampValueUndefined: Self = StObject.set(x, "timestampValue", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
