package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metadata for a file. Similar to the equivalent message in the Remote
  * Execution API.
  */
trait SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata extends StObject {
  
  /**
    * If the file is small enough, its contents may also or alternatively be
    * listed here.
    */
  var contents: js.UndefOr[String] = js.undefined
  
  /**
    * A pointer to the contents of the file. The method by which a client
    * retrieves the contents from a CAS system is not defined here.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.undefined
  
  /**
    * Properties of the file
    */
  var isExecutable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The path of this file. If this message is part of the
    * CommandOutputs.outputs fields, the path is relative to the execution root
    * and must correspond to an entry in CommandTask.outputs.files. If this
    * message is part of a Directory message, then the path is relative to the
    * root of that directory. All paths MUST be delimited by forward slashes.
    */
  var path: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadataMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
    
    @scala.inline
    def setDigest(value: SchemaGoogleDevtoolsRemoteworkersV1test2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setIsExecutable(value: Boolean): Self = StObject.set(x, "isExecutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExecutableUndefined: Self = StObject.set(x, "isExecutable", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
