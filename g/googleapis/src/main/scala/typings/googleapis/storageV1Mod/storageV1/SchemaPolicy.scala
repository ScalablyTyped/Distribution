package typings.googleapis.storageV1Mod.storageV1

import typings.googleapis.anon.Condition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bucket/object IAM policy.
  */
@js.native
trait SchemaPolicy extends StObject {
  
  /**
    * An association between a role, which comes with a set of permissions, and
    * members who may assume that role.
    */
  var bindings: js.UndefOr[js.Array[Condition]] = js.native
  
  /**
    * HTTP 1.1  Entity tag for the policy.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * The kind of item this is. For policies, this is always storage#policy.
    * This field is ignored on input.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The ID of the resource to which this policy belongs. Will be of the form
    * projects/_/buckets/bucket for buckets, and
    * projects/_/buckets/bucket/objects/object for objects. A specific
    * generation may be specified by appending #generationNumber to the end of
    * the object name, e.g. projects/_/buckets/my-bucket/objects/data.txt#17.
    * The current generation can be denoted with #0. This field is ignored on
    * input.
    */
  var resourceId: js.UndefOr[String] = js.native
}
object SchemaPolicy {
  
  @scala.inline
  def apply(): SchemaPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicy]
  }
  
  @scala.inline
  implicit class SchemaPolicyMutableBuilder[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindings(value: js.Array[Condition]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: Condition*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
  }
}
