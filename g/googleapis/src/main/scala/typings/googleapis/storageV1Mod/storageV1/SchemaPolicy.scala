package typings.googleapis.storageV1Mod.storageV1

import typings.googleapis.anon.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bucket/object IAM policy.
  */
@js.native
trait SchemaPolicy extends js.Object {
  
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
  implicit class SchemaPolicyOps[Self <: SchemaPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBindingsVarargs(value: Condition*): Self = this.set("bindings", js.Array(value :_*))
    
    @scala.inline
    def setBindings(value: js.Array[Condition]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
  }
}
