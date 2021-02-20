package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance clone context.
  */
@js.native
trait SchemaCloneContext extends StObject {
  
  /**
    * Binary log coordinates, if specified, identify the position up to which
    * the source instance should be cloned. If not specified, the source
    * instance is cloned up to the most recent binary log coordinates.
    */
  var binLogCoordinates: js.UndefOr[SchemaBinLogCoordinates] = js.native
  
  /**
    * Name of the Cloud SQL instance to be created as a clone.
    */
  var destinationInstanceName: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#cloneContext.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Reserved for future use.
    */
  var pitrTimestampMs: js.UndefOr[String] = js.native
}
object SchemaCloneContext {
  
  @scala.inline
  def apply(): SchemaCloneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloneContext]
  }
  
  @scala.inline
  implicit class SchemaCloneContextMutableBuilder[Self <: SchemaCloneContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinLogCoordinates(value: SchemaBinLogCoordinates): Self = StObject.set(x, "binLogCoordinates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinLogCoordinatesUndefined: Self = StObject.set(x, "binLogCoordinates", js.undefined)
    
    @scala.inline
    def setDestinationInstanceName(value: String): Self = StObject.set(x, "destinationInstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationInstanceNameUndefined: Self = StObject.set(x, "destinationInstanceName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPitrTimestampMs(value: String): Self = StObject.set(x, "pitrTimestampMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitrTimestampMsUndefined: Self = StObject.set(x, "pitrTimestampMs", js.undefined)
  }
}
