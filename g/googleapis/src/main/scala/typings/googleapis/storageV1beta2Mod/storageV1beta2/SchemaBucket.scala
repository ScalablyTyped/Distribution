package typings.googleapis.storageV1beta2Mod.storageV1beta2

import typings.googleapis.anon.Entity
import typings.googleapis.anon.LogBucket
import typings.googleapis.anon.MainPageSuffix
import typings.googleapis.anon.MaxAgeSeconds
import typings.googleapis.anon.`11`
import typings.googleapis.anon.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bucket.
  */
trait SchemaBucket extends StObject {
  
  /**
    * Access controls on the bucket.
    */
  var acl: js.UndefOr[js.Array[SchemaBucketAccessControl]] = js.undefined
  
  /**
    * The bucket&#39;s Cross-Origin Resource Sharing (CORS) configuration.
    */
  var cors: js.UndefOr[js.Array[MaxAgeSeconds]] = js.undefined
  
  /**
    * Default access controls to apply to new objects when no ACL is provided.
    */
  var defaultObjectAcl: js.UndefOr[js.Array[SchemaObjectAccessControl]] = js.undefined
  
  /**
    * HTTP 1.1 Entity tag for the bucket.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the bucket.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The kind of item this is. For buckets, this is always storage#bucket.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The bucket&#39;s lifecycle configuration. See object lifecycle management
    * for more information.
    */
  var lifecycle: js.UndefOr[`11`] = js.undefined
  
  /**
    * The location of the bucket. Object data for objects in the bucket resides
    * in physical storage within this region. Typical values are US and EU.
    * Defaults to US. See the developer&#39;s guide for the authoritative list.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The bucket&#39;s logging configuration, which defines the destination
    * bucket and optional name prefix for the current bucket&#39;s logs.
    */
  var logging: js.UndefOr[LogBucket] = js.undefined
  
  /**
    * The metadata generation of this bucket.
    */
  var metageneration: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the bucket.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The owner of the bucket. This is always the project team&#39;s owner
    * group.
    */
  var owner: js.UndefOr[Entity] = js.undefined
  
  /**
    * The URI of this bucket.
    */
  var selfLink: js.UndefOr[String] = js.undefined
  
  /**
    * The bucket&#39;s storage class. This defines how objects in the bucket
    * are stored and determines the SLA and the cost of storage. Typical values
    * are STANDARD and DURABLE_REDUCED_AVAILABILITY. Defaults to STANDARD. See
    * the developer&#39;s guide for the authoritative list.
    */
  var storageClass: js.UndefOr[String] = js.undefined
  
  /**
    * Creation time of the bucket in RFC 3339 format.
    */
  var timeCreated: js.UndefOr[String] = js.undefined
  
  /**
    * The bucket&#39;s versioning configuration.
    */
  var versioning: js.UndefOr[`9`] = js.undefined
  
  /**
    * The bucket&#39;s website configuration.
    */
  var website: js.UndefOr[MainPageSuffix] = js.undefined
}
object SchemaBucket {
  
  @scala.inline
  def apply(): SchemaBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBucket]
  }
  
  @scala.inline
  implicit class SchemaBucketMutableBuilder[Self <: SchemaBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcl(value: js.Array[SchemaBucketAccessControl]): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
    
    @scala.inline
    def setAclVarargs(value: SchemaBucketAccessControl*): Self = StObject.set(x, "acl", js.Array(value :_*))
    
    @scala.inline
    def setCors(value: js.Array[MaxAgeSeconds]): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
    
    @scala.inline
    def setCorsVarargs(value: MaxAgeSeconds*): Self = StObject.set(x, "cors", js.Array(value :_*))
    
    @scala.inline
    def setDefaultObjectAcl(value: js.Array[SchemaObjectAccessControl]): Self = StObject.set(x, "defaultObjectAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultObjectAclUndefined: Self = StObject.set(x, "defaultObjectAcl", js.undefined)
    
    @scala.inline
    def setDefaultObjectAclVarargs(value: SchemaObjectAccessControl*): Self = StObject.set(x, "defaultObjectAcl", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLifecycle(value: `11`): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLogging(value: LogBucket): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setMetageneration(value: String): Self = StObject.set(x, "metageneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetagenerationUndefined: Self = StObject.set(x, "metageneration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: Entity): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    @scala.inline
    def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClassUndefined: Self = StObject.set(x, "storageClass", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: String): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
    
    @scala.inline
    def setVersioning(value: `9`): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    
    @scala.inline
    def setWebsite(value: MainPageSuffix): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
  }
}
