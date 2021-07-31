package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `DirectoryNode` represents a child of a Directory which is itself a
  * `Directory` and its associated metadata.
  */
trait SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode extends StObject {
  
  /**
    * The digest of the Directory object represented. See Digest for
    * information about how to take the digest of a proto message.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.undefined
  
  /**
    * The name of the directory.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNodeMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
