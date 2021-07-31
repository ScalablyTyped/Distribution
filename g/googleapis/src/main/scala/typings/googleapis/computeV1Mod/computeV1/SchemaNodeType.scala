package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Node Type resource.
  */
trait SchemaNodeType extends StObject {
  
  /**
    * [Output Only] The CPU platform used by this node type.
    */
  var cpuPlatform: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The deprecation status associated with this node type.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.undefined
  
  /**
    * [Output Only] An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The number of virtual CPUs that are available to the node
    * type.
    */
  var guestCpus: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The type of the resource. Always compute#nodeType for node
    * types.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Local SSD available to the node type, defined in GB.
    */
  var localSsdGb: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] The amount of physical memory available to the node type,
    * defined in MB.
    */
  var memoryMb: js.UndefOr[Double] = js.undefined
  
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * [Output Only] The name of the zone where the node type resides, such as
    * us-central1-a.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaNodeType {
  
  @scala.inline
  def apply(): SchemaNodeType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeType]
  }
  
  @scala.inline
  implicit class SchemaNodeTypeMutableBuilder[Self <: SchemaNodeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpuPlatform(value: String): Self = StObject.set(x, "cpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpuPlatformUndefined: Self = StObject.set(x, "cpuPlatform", js.undefined)
    
    @scala.inline
    def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    @scala.inline
    def setDeprecated(value: SchemaDeprecationStatus): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGuestCpus(value: Double): Self = StObject.set(x, "guestCpus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuestCpusUndefined: Self = StObject.set(x, "guestCpus", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLocalSsdGb(value: Double): Self = StObject.set(x, "localSsdGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSsdGbUndefined: Self = StObject.set(x, "localSsdGb", js.undefined)
    
    @scala.inline
    def setMemoryMb(value: Double): Self = StObject.set(x, "memoryMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemoryMbUndefined: Self = StObject.set(x, "memoryMb", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
