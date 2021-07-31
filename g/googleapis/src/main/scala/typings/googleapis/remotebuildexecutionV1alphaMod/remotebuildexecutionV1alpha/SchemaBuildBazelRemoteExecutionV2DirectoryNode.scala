package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `DirectoryNode` represents a child of a Directory which is itself a
  * `Directory` and its associated metadata.
  */
trait SchemaBuildBazelRemoteExecutionV2DirectoryNode extends StObject {
  
  /**
    * The digest of the Directory object represented. See Digest for
    * information about how to take the digest of a proto message.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /**
    * The name of the directory.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2DirectoryNode {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2DirectoryNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2DirectoryNode]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2DirectoryNodeMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2DirectoryNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
