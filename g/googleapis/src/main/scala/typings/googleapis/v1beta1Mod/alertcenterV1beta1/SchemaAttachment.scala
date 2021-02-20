package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Attachment with application-specific information about an alert.
  */
@js.native
trait SchemaAttachment extends StObject {
  
  /**
    * A CSV file attachment.
    */
  var csv: js.UndefOr[SchemaCsv] = js.native
}
object SchemaAttachment {
  
  @scala.inline
  def apply(): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachment]
  }
  
  @scala.inline
  implicit class SchemaAttachmentMutableBuilder[Self <: SchemaAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsv(value: SchemaCsv): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
  }
}
