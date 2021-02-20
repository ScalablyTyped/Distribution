package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A segment in a structured format.
  */
@js.native
trait SchemaSegment extends StObject {
  
  /**
    * A mapping from the positional location to the value. The key string uses
    * indexes separated by dots to identify Fields, components and
    * sub-components. To be consistent with how the standard refers to
    * different parts of message, we use zero-based indexes for fields and
    * one-based indexes for components and sub-components. A bracket notation
    * is also used to identify different instances of a repeated field.
    * Zero-based indexes are used to refer to each instance. Regex for key:
    * (\d+)(\[\d+\])?(.\d+)?(.\d+)?  Examples of (key, value) pairs:  (0.1,
    * &quot;foo&quot;) denotes First component of Field 0 has the value
    * &quot;foo&quot;.  (1.1.2, &quot;bar&quot;) denotes Second sub-component
    * of the first component of Field 1 has the value &quot;bar&quot;. (1[0].1,
    * &quot;baz&quot;) denotes First component of the first Instance of Field
    * 1, which is repeated, has the value &quot;baz&quot;.
    */
  var fields: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * A string that indicates the type of segment, e.g., EVN, PID.
    */
  var segmentId: js.UndefOr[String] = js.native
  
  /**
    * Set ID for segments that can be in a set. This can be empty if it is
    * missing or it is not applicable.
    */
  var setId: js.UndefOr[String] = js.native
}
object SchemaSegment {
  
  @scala.inline
  def apply(): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSegment]
  }
  
  @scala.inline
  implicit class SchemaSegmentMutableBuilder[Self <: SchemaSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
    
    @scala.inline
    def setSetId(value: String): Self = StObject.set(x, "setId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIdUndefined: Self = StObject.set(x, "setId", js.undefined)
  }
}
