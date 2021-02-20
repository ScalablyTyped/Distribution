package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a blob of binary content with its digest.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2Blob extends StObject {
  
  /**
    * The contents of the blob.
    */
  var contents: js.UndefOr[String] = js.native
  
  /**
    * The digest of the blob. This should be verified by the receiver.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.native
}
object SchemaGoogleDevtoolsRemoteworkersV1test2Blob {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2Blob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2Blob]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2BlobMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2Blob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setDigest(value: SchemaGoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
  }
}
