package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of properties that uniquely identify a given Docker image.
  */
@js.native
trait SchemaFingerprint extends js.Object {
  
  /**
    * Required. The layer ID of the final layer in the Docker image&#39;s v1
    * representation.
    */
  var v1Name: js.UndefOr[String] = js.native
  
  /**
    * Required. The ordered list of v2 blobs that represent a given image.
    */
  var v2Blob: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Output only. The name of the image&#39;s v2 blobs computed via: [bottom]
    * := v2_blobbottom := sha256(v2_blob[N] + &quot; &quot; + v2_name[N+1])
    * Only the name of the final blob is kept.
    */
  var v2Name: js.UndefOr[String] = js.native
}
object SchemaFingerprint {
  
  @scala.inline
  def apply(): SchemaFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFingerprint]
  }
  
  @scala.inline
  implicit class SchemaFingerprintOps[Self <: SchemaFingerprint] (val x: Self) extends AnyVal {
    
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
    def setV1Name(value: String): Self = this.set("v1Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV1Name: Self = this.set("v1Name", js.undefined)
    
    @scala.inline
    def setV2BlobVarargs(value: String*): Self = this.set("v2Blob", js.Array(value :_*))
    
    @scala.inline
    def setV2Blob(value: js.Array[String]): Self = this.set("v2Blob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV2Blob: Self = this.set("v2Blob", js.undefined)
    
    @scala.inline
    def setV2Name(value: String): Self = this.set("v2Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteV2Name: Self = this.set("v2Name", js.undefined)
  }
}
