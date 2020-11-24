package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gdata
  */
@js.native
trait SchemaGdataCompositeMedia extends js.Object {
  
  /**
    * gdata
    */
  var blobRef: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var blobstore2Info: js.UndefOr[SchemaGdataBlobstore2Info] = js.native
  
  /**
    * gdata
    */
  var cosmoBinaryReference: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var crc32cHash: js.UndefOr[Double] = js.native
  
  /**
    * gdata
    */
  var `inline`: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var length: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var md5Hash: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var objectId: js.UndefOr[SchemaGdataObjectId] = js.native
  
  /**
    * gdata
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var referenceType: js.UndefOr[String] = js.native
  
  /**
    * gdata
    */
  var sha1Hash: js.UndefOr[String] = js.native
}
object SchemaGdataCompositeMedia {
  
  @scala.inline
  def apply(): SchemaGdataCompositeMedia = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGdataCompositeMedia]
  }
  
  @scala.inline
  implicit class SchemaGdataCompositeMediaOps[Self <: SchemaGdataCompositeMedia] (val x: Self) extends AnyVal {
    
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
    def setBlobRef(value: String): Self = this.set("blobRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobRef: Self = this.set("blobRef", js.undefined)
    
    @scala.inline
    def setBlobstore2Info(value: SchemaGdataBlobstore2Info): Self = this.set("blobstore2Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlobstore2Info: Self = this.set("blobstore2Info", js.undefined)
    
    @scala.inline
    def setCosmoBinaryReference(value: String): Self = this.set("cosmoBinaryReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCosmoBinaryReference: Self = this.set("cosmoBinaryReference", js.undefined)
    
    @scala.inline
    def setCrc32cHash(value: Double): Self = this.set("crc32cHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrc32cHash: Self = this.set("crc32cHash", js.undefined)
    
    @scala.inline
    def setInline(value: String): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setMd5Hash(value: String): Self = this.set("md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Hash: Self = this.set("md5Hash", js.undefined)
    
    @scala.inline
    def setObjectId(value: SchemaGdataObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setReferenceType(value: String): Self = this.set("referenceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceType: Self = this.set("referenceType", js.undefined)
    
    @scala.inline
    def setSha1Hash(value: String): Self = this.set("sha1Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSha1Hash: Self = this.set("sha1Hash", js.undefined)
  }
}
