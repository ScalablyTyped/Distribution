package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Inserts data into the spreadsheet starting at the specified coordinate.
  */
@js.native
trait SchemaPasteDataRequest extends StObject {
  
  /**
    * The coordinate at which the data should start being inserted.
    */
  var coordinate: js.UndefOr[SchemaGridCoordinate] = js.native
  
  /**
    * The data to insert.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * The delimiter in the data.
    */
  var delimiter: js.UndefOr[String] = js.native
  
  /**
    * True if the data is HTML.
    */
  var html: js.UndefOr[Boolean] = js.native
  
  /**
    * How the data should be pasted.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaPasteDataRequest {
  
  @scala.inline
  def apply(): SchemaPasteDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPasteDataRequest]
  }
  
  @scala.inline
  implicit class SchemaPasteDataRequestMutableBuilder[Self <: SchemaPasteDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoordinate(value: SchemaGridCoordinate): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
