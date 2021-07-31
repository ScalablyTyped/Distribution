package typings.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceSpecPinnedType Pins this service to a specific revision name. The
  * revision must be owned by the configuration provided.  Deprecated and not
  * supported by Cloud Run.
  */
trait SchemaServiceSpecPinnedType extends StObject {
  
  /**
    * The configuration for this service.
    */
  var configuration: js.UndefOr[SchemaConfigurationSpec] = js.undefined
  
  /**
    * The revision name to pin this service to until changed to a different
    * service type.
    */
  var revisionName: js.UndefOr[String] = js.undefined
}
object SchemaServiceSpecPinnedType {
  
  @scala.inline
  def apply(): SchemaServiceSpecPinnedType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpecPinnedType]
  }
  
  @scala.inline
  implicit class SchemaServiceSpecPinnedTypeMutableBuilder[Self <: SchemaServiceSpecPinnedType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: SchemaConfigurationSpec): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    @scala.inline
    def setRevisionName(value: String): Self = StObject.set(x, "revisionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionNameUndefined: Self = StObject.set(x, "revisionName", js.undefined)
  }
}
