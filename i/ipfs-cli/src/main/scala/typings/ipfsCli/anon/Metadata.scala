package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var cidBase: js.Any
  
  var ctx: js.Any
  
  var ipfsPath: js.Any
  
  var metadata: js.Any
  
  var metadataJson: js.Any
  
  var recursive: js.Any
  
  var timeout: js.Any
}
object Metadata {
  
  @scala.inline
  def apply(
    cidBase: js.Any,
    ctx: js.Any,
    ipfsPath: js.Any,
    metadata: js.Any,
    metadataJson: js.Any,
    recursive: js.Any,
    timeout: js.Any
  ): Metadata = {
    val __obj = js.Dynamic.literal(cidBase = cidBase.asInstanceOf[js.Any], ctx = ctx.asInstanceOf[js.Any], ipfsPath = ipfsPath.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], metadataJson = metadataJson.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidBase(value: js.Any): Self = StObject.set(x, "cidBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpfsPath(value: js.Any): Self = StObject.set(x, "ipfsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: js.Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataJson(value: js.Any): Self = StObject.set(x, "metadataJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursive(value: js.Any): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
  }
}
