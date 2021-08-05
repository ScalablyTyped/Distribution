package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Accelerator Type resource. (== resource_for beta.acceleratorTypes ==)
  * (== resource_for v1.acceleratorTypes ==)
  */
trait SchemaAcceleratorType extends StObject {
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The deprecation status associated with this accelerator
    * type.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.undefined
  
  /**
    * [Output Only] An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The type of the resource. Always compute#acceleratorType
    * for accelerator types.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Maximum accelerator cards allowed per instance.
    */
  var maximumCardsPerInstance: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined fully-qualified URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The name of the zone where the accelerator type resides,
    * such as us-central1-a. You must specify this field as part of the HTTP
    * request URL. It is not settable as a field in the request body.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaAcceleratorType {
  
  inline def apply(): SchemaAcceleratorType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAcceleratorType]
  }
  
  extension [Self <: SchemaAcceleratorType](x: Self) {
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDeprecated(value: SchemaDeprecationStatus): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setMaximumCardsPerInstance(value: Double): Self = StObject.set(x, "maximumCardsPerInstance", value.asInstanceOf[js.Any])
    
    inline def setMaximumCardsPerInstanceUndefined: Self = StObject.set(x, "maximumCardsPerInstance", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
