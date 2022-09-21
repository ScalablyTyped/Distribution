package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2FileNode extends StObject {
  
  /**
    * The digest of the file's content.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the file.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  var nodeProperties: js.UndefOr[SchemaBuildBazelRemoteExecutionV2NodeProperties] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2FileNode {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2FileNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2FileNode]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2FileNode](x: Self) {
    
    inline def setDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    inline def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    inline def setIsExecutable(value: Boolean): Self = StObject.set(x, "isExecutable", value.asInstanceOf[js.Any])
    
    inline def setIsExecutableNull: Self = StObject.set(x, "isExecutable", null)
    
    inline def setIsExecutableUndefined: Self = StObject.set(x, "isExecutable", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNodeProperties(value: SchemaBuildBazelRemoteExecutionV2NodeProperties): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    inline def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
  }
}
