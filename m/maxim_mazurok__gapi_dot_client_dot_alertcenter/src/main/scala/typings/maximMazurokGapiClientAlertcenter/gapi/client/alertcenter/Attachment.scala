package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  /** A CSV file attachment. */
  var csv: js.UndefOr[Csv] = js.undefined
}
object Attachment {
  
  @scala.inline
  def apply(): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCsv(value: Csv): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
  }
}
