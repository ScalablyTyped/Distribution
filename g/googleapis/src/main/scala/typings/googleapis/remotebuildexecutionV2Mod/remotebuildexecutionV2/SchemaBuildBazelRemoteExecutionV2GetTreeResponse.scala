package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A response message for ContentAddressableStorage.GetTree.
  */
trait SchemaBuildBazelRemoteExecutionV2GetTreeResponse extends StObject {
  
  /**
    * The directories descended from the requested root.
    */
  var directories: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Directory]] = js.undefined
  
  /**
    * If present, signifies that there are more results which the client can
    * retrieve by passing this as the page_token in a subsequent request. If
    * empty, signifies that this is the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2GetTreeResponse {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2GetTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2GetTreeResponse]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2GetTreeResponse](x: Self) {
    
    inline def setDirectories(value: js.Array[SchemaBuildBazelRemoteExecutionV2Directory]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setDirectoriesVarargs(value: SchemaBuildBazelRemoteExecutionV2Directory*): Self = StObject.set(x, "directories", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
