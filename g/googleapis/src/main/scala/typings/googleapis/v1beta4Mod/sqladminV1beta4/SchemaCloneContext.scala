package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance clone context.
  */
trait SchemaCloneContext extends StObject {
  
  /**
    * Binary log coordinates, if specified, identify the position up to which
    * the source instance should be cloned. If not specified, the source
    * instance is cloned up to the most recent binary log coordinates.
    */
  var binLogCoordinates: js.UndefOr[SchemaBinLogCoordinates] = js.undefined
  
  /**
    * Name of the Cloud SQL instance to be created as a clone.
    */
  var destinationInstanceName: js.UndefOr[String] = js.undefined
  
  /**
    * This is always sql#cloneContext.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for future use.
    */
  var pitrTimestampMs: js.UndefOr[String] = js.undefined
}
object SchemaCloneContext {
  
  inline def apply(): SchemaCloneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloneContext]
  }
  
  extension [Self <: SchemaCloneContext](x: Self) {
    
    inline def setBinLogCoordinates(value: SchemaBinLogCoordinates): Self = StObject.set(x, "binLogCoordinates", value.asInstanceOf[js.Any])
    
    inline def setBinLogCoordinatesUndefined: Self = StObject.set(x, "binLogCoordinates", js.undefined)
    
    inline def setDestinationInstanceName(value: String): Self = StObject.set(x, "destinationInstanceName", value.asInstanceOf[js.Any])
    
    inline def setDestinationInstanceNameUndefined: Self = StObject.set(x, "destinationInstanceName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPitrTimestampMs(value: String): Self = StObject.set(x, "pitrTimestampMs", value.asInstanceOf[js.Any])
    
    inline def setPitrTimestampMsUndefined: Self = StObject.set(x, "pitrTimestampMs", js.undefined)
  }
}
