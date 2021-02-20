package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Moves data from the source to the destination.
  */
@js.native
trait SchemaCutPasteRequest extends StObject {
  
  /**
    * The top-left coordinate where the data should be pasted.
    */
  var destination: js.UndefOr[SchemaGridCoordinate] = js.native
  
  /**
    * What kind of data to paste.  All the source data will be cut, regardless
    * of what is pasted.
    */
  var pasteType: js.UndefOr[String] = js.native
  
  /**
    * The source data to cut.
    */
  var source: js.UndefOr[SchemaGridRange] = js.native
}
object SchemaCutPasteRequest {
  
  @scala.inline
  def apply(): SchemaCutPasteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCutPasteRequest]
  }
  
  @scala.inline
  implicit class SchemaCutPasteRequestMutableBuilder[Self <: SchemaCutPasteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: SchemaGridCoordinate): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    @scala.inline
    def setPasteType(value: String): Self = StObject.set(x, "pasteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasteTypeUndefined: Self = StObject.set(x, "pasteType", js.undefined)
    
    @scala.inline
    def setSource(value: SchemaGridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
