package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
@js.native
trait SchemaGdataObjectId extends js.Object {
  
  /**
    * gdata
    */
  var bucketName: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var generation: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var objectName: js.UndefOr[String] = js.native
}
object SchemaGdataObjectId {
  
  @scala.inline
  def apply(): SchemaGdataObjectId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataObjectId]
  }
  
  @scala.inline
  implicit class SchemaGdataObjectIdOps[Self <: SchemaGdataObjectId] (val x: Self) extends AnyVal {
    
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
    def setBucketName(value: String): Self = this.set("bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketName: Self = this.set("bucketName", js.undefined)
    
    @scala.inline
    def setGeneration(value: String): Self = this.set("generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneration: Self = this.set("generation", js.undefined)
    
    @scala.inline
    def setObjectName(value: String): Self = this.set("objectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectName: Self = this.set("objectName", js.undefined)
  }
}
