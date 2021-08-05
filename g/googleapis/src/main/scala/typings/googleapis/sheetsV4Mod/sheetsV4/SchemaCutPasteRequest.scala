package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Moves data from the source to the destination.
  */
trait SchemaCutPasteRequest extends StObject {
  
  /**
    * The top-left coordinate where the data should be pasted.
    */
  var destination: js.UndefOr[SchemaGridCoordinate] = js.undefined
  
  /**
    * What kind of data to paste.  All the source data will be cut, regardless
    * of what is pasted.
    */
  var pasteType: js.UndefOr[String] = js.undefined
  
  /**
    * The source data to cut.
    */
  var source: js.UndefOr[SchemaGridRange] = js.undefined
}
object SchemaCutPasteRequest {
  
  inline def apply(): SchemaCutPasteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCutPasteRequest]
  }
  
  extension [Self <: SchemaCutPasteRequest](x: Self) {
    
    inline def setDestination(value: SchemaGridCoordinate): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setPasteType(value: String): Self = StObject.set(x, "pasteType", value.asInstanceOf[js.Any])
    
    inline def setPasteTypeUndefined: Self = StObject.set(x, "pasteType", js.undefined)
    
    inline def setSource(value: SchemaGridRange): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
