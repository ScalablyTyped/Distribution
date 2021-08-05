package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An `OutputFile` is similar to a FileNode, but it is tailored for output as
  * part of an `ActionResult`. It allows a full file path rather than only a
  * name, and allows the server to include content inline.  `OutputFile` is
  * binary-compatible with `FileNode`.
  */
trait SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile extends StObject {
  
  /**
    * The raw content of the file.  This field may be used by the server to
    * provide the content of a file inline in an ActionResult and avoid
    * requiring that the client make a separate call to
    * [ContentAddressableStorage.GetBlob] to retrieve it.  The client SHOULD
    * NOT assume that it will get raw content with any request, and always be
    * prepared to retrieve it via `digest`.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The digest of the file&#39;s content.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.undefined
  
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The full path of the file relative to the input root, including the
    * filename. The path separator is a forward slash `/`. Since this is a
    * relative path, it MUST NOT begin with a leading forward slash.
    */
  var path: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setIsExecutable(value: Boolean): Self = StObject.set(x, "isExecutable", value.asInstanceOf[js.Any])
    
    inline def setIsExecutableUndefined: Self = StObject.set(x, "isExecutable", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
