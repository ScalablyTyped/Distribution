package typings.googleapis.storageV1Mod.storageV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceObjectsCopy extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Name of the bucket in which to store the new object. Overrides the
    * provided object metadata's bucket value, if any.For information about how
    * to URL encode object names to be path safe, see Encoding URI Path Parts.
    */
  var destinationBucket: js.UndefOr[String] = js.native
  
  /**
    * Name of the new object. Required when the object metadata is not
    * otherwise provided. Overrides the object metadata's name value, if any.
    */
  var destinationObject: js.UndefOr[String] = js.native
  
  /**
    * Apply a predefined set of access controls to the destination object.
    */
  var destinationPredefinedAcl: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the destination object's
    * current generation matches the given value. Setting to 0 makes the
    * operation succeed only if there are no live versions of the object.
    */
  var ifGenerationMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the destination object's
    * current generation does not match the given value. If no live object
    * exists, the precondition fails. Setting to 0 makes the operation succeed
    * only if there is a live version of the object.
    */
  var ifGenerationNotMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the destination object's
    * current metageneration matches the given value.
    */
  var ifMetagenerationMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the destination object's
    * current metageneration does not match the given value.
    */
  var ifMetagenerationNotMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the source object's current
    * generation matches the given value.
    */
  var ifSourceGenerationMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the source object's current
    * generation does not match the given value.
    */
  var ifSourceGenerationNotMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the source object's current
    * metageneration matches the given value.
    */
  var ifSourceMetagenerationMatch: js.UndefOr[String] = js.native
  
  /**
    * Makes the operation conditional on whether the source object's current
    * metageneration does not match the given value.
    */
  var ifSourceMetagenerationNotMatch: js.UndefOr[String] = js.native
  
  /**
    * Set of properties to return. Defaults to noAcl, unless the object
    * resource specifies the acl property, when it defaults to full.
    */
  var projection: js.UndefOr[String] = js.native
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaObject] = js.native
  
  /**
    * Name of the bucket in which to find the source object.
    */
  var sourceBucket: js.UndefOr[String] = js.native
  
  /**
    * If present, selects a specific revision of the source object (as opposed
    * to the latest version, the default).
    */
  var sourceGeneration: js.UndefOr[String] = js.native
  
  /**
    * Name of the source object. For information about how to URL encode object
    * names to be path safe, see Encoding URI Path Parts.
    */
  var sourceObject: js.UndefOr[String] = js.native
  
  /**
    * The project to be billed for this request. Required for Requester Pays
    * buckets.
    */
  var userProject: js.UndefOr[String] = js.native
}
object ParamsResourceObjectsCopy {
  
  @scala.inline
  def apply(): ParamsResourceObjectsCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceObjectsCopy]
  }
  
  @scala.inline
  implicit class ParamsResourceObjectsCopyOps[Self <: ParamsResourceObjectsCopy] (val x: Self) extends AnyVal {
    
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setDestinationBucket(value: String): Self = this.set("destinationBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationBucket: Self = this.set("destinationBucket", js.undefined)
    
    @scala.inline
    def setDestinationObject(value: String): Self = this.set("destinationObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationObject: Self = this.set("destinationObject", js.undefined)
    
    @scala.inline
    def setDestinationPredefinedAcl(value: String): Self = this.set("destinationPredefinedAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPredefinedAcl: Self = this.set("destinationPredefinedAcl", js.undefined)
    
    @scala.inline
    def setIfGenerationMatch(value: String): Self = this.set("ifGenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfGenerationMatch: Self = this.set("ifGenerationMatch", js.undefined)
    
    @scala.inline
    def setIfGenerationNotMatch(value: String): Self = this.set("ifGenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfGenerationNotMatch: Self = this.set("ifGenerationNotMatch", js.undefined)
    
    @scala.inline
    def setIfMetagenerationMatch(value: String): Self = this.set("ifMetagenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfMetagenerationMatch: Self = this.set("ifMetagenerationMatch", js.undefined)
    
    @scala.inline
    def setIfMetagenerationNotMatch(value: String): Self = this.set("ifMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfMetagenerationNotMatch: Self = this.set("ifMetagenerationNotMatch", js.undefined)
    
    @scala.inline
    def setIfSourceGenerationMatch(value: String): Self = this.set("ifSourceGenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfSourceGenerationMatch: Self = this.set("ifSourceGenerationMatch", js.undefined)
    
    @scala.inline
    def setIfSourceGenerationNotMatch(value: String): Self = this.set("ifSourceGenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfSourceGenerationNotMatch: Self = this.set("ifSourceGenerationNotMatch", js.undefined)
    
    @scala.inline
    def setIfSourceMetagenerationMatch(value: String): Self = this.set("ifSourceMetagenerationMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfSourceMetagenerationMatch: Self = this.set("ifSourceMetagenerationMatch", js.undefined)
    
    @scala.inline
    def setIfSourceMetagenerationNotMatch(value: String): Self = this.set("ifSourceMetagenerationNotMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfSourceMetagenerationNotMatch: Self = this.set("ifSourceMetagenerationNotMatch", js.undefined)
    
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaObject): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
    
    @scala.inline
    def setSourceBucket(value: String): Self = this.set("sourceBucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceBucket: Self = this.set("sourceBucket", js.undefined)
    
    @scala.inline
    def setSourceGeneration(value: String): Self = this.set("sourceGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceGeneration: Self = this.set("sourceGeneration", js.undefined)
    
    @scala.inline
    def setSourceObject(value: String): Self = this.set("sourceObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceObject: Self = this.set("sourceObject", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
  }
}
