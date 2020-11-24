package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Exemplars are example points that may be used to annotate aggregated
  * distribution values. They are metadata that gives information about a
  * particular value added to a Distribution bucket, such as a trace ID that
  * was active when a value was added. They may contain further information,
  * such as a example values and timestamps, origin, etc.
  */
@js.native
trait SchemaExemplar extends js.Object {
  
  /**
    * Contextual information about the example value. Examples are:Trace:
    * type.googleapis.com/google.monitoring.v3.SpanContextLiteral string:
    * type.googleapis.com/google.protobuf.StringValueLabels dropped during
    * aggregation:  type.googleapis.com/google.monitoring.v3.DroppedLabelsThere
    * may be only a single attachment of any given message type in a single
    * exemplar, and this is enforced by the system.
    */
  var attachments: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
  
  /**
    * The observation (sampling) time of the above value.
    */
  var timestamp: js.UndefOr[String] = js.native
  
  /**
    * Value of the exemplar point. This value determines to which bucket the
    * exemplar belongs.
    */
  var value: js.UndefOr[Double] = js.native
}
object SchemaExemplar {
  
  @scala.inline
  def apply(): SchemaExemplar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExemplar]
  }
  
  @scala.inline
  implicit class SchemaExemplarOps[Self <: SchemaExemplar] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsVarargs(value: StringDictionary[js.Any]*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[StringDictionary[_]]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
