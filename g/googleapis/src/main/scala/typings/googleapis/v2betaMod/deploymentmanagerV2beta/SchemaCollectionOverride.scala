package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CollectionOverride allows resource handling overrides for specific
  * resources within a BaseType
  */
trait SchemaCollectionOverride extends StObject {
  
  /**
    * The collection that identifies this resource within its service.
    */
  var collection: js.UndefOr[String] = js.undefined
  
  /**
    * The options to apply to this resource-level override
    */
  var options: js.UndefOr[SchemaOptions] = js.undefined
}
object SchemaCollectionOverride {
  
  @scala.inline
  def apply(): SchemaCollectionOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectionOverride]
  }
  
  @scala.inline
  implicit class SchemaCollectionOverrideMutableBuilder[Self <: SchemaCollectionOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    @scala.inline
    def setOptions(value: SchemaOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
