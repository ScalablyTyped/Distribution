package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecation status for a public resource.
  */
trait SchemaDeprecationStatus extends StObject {
  
  /**
    * An optional RFC3339 timestamp on or after which the state of this
    * resource is intended to change to DELETED. This is only informational and
    * the status will not change unless the client explicitly changes it.
    */
  var deleted: js.UndefOr[String] = js.undefined
  
  /**
    * An optional RFC3339 timestamp on or after which the state of this
    * resource is intended to change to DEPRECATED. This is only informational
    * and the status will not change unless the client explicitly changes it.
    */
  var deprecated: js.UndefOr[String] = js.undefined
  
  /**
    * An optional RFC3339 timestamp on or after which the state of this
    * resource is intended to change to OBSOLETE. This is only informational
    * and the status will not change unless the client explicitly changes it.
    */
  var obsolete: js.UndefOr[String] = js.undefined
  
  /**
    * The URL of the suggested replacement for a deprecated resource. The
    * suggested replacement resource must be the same kind of resource as the
    * deprecated resource.
    */
  var replacement: js.UndefOr[String] = js.undefined
  
  /**
    * The deprecation state of this resource. This can be ACTIVE, DEPRECATED,
    * OBSOLETE, or DELETED. Operations which communicate the end of life date
    * for an image, can use ACTIVE. Operations which create a new resource
    * using a DEPRECATED resource will return successfully, but with a warning
    * indicating the deprecated resource and recommending its replacement.
    * Operations which use OBSOLETE or DELETED resources will be rejected and
    * result in an error.
    */
  var state: js.UndefOr[String] = js.undefined
}
object SchemaDeprecationStatus {
  
  @scala.inline
  def apply(): SchemaDeprecationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeprecationStatus]
  }
  
  @scala.inline
  implicit class SchemaDeprecationStatusMutableBuilder[Self <: SchemaDeprecationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleted(value: String): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setDeprecated(value: String): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    @scala.inline
    def setObsolete(value: String): Self = StObject.set(x, "obsolete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObsoleteUndefined: Self = StObject.set(x, "obsolete", js.undefined)
    
    @scala.inline
    def setReplacement(value: String): Self = StObject.set(x, "replacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementUndefined: Self = StObject.set(x, "replacement", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
