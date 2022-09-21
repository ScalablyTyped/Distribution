package typings.googleapis.genomicsV1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDockerExecutor extends StObject {
  
  /**
    * Required. The command or newline delimited script to run. The command string will be executed within a bash shell. If the command exits with a non-zero exit code, output parameter de-localization will be skipped and the pipeline operation's `error` field will be populated. Maximum command string length is 16384.
    */
  var cmd: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Image name from either Docker Hub or Google Container Registry. Users that run pipelines must have READ access to the image.
    */
  var imageName: js.UndefOr[String | Null] = js.undefined
}
object SchemaDockerExecutor {
  
  inline def apply(): SchemaDockerExecutor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDockerExecutor]
  }
  
  extension [Self <: SchemaDockerExecutor](x: Self) {
    
    inline def setCmd(value: String): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setCmdNull: Self = StObject.set(x, "cmd", null)
    
    inline def setCmdUndefined: Self = StObject.set(x, "cmd", js.undefined)
    
    inline def setImageName(value: String): Self = StObject.set(x, "imageName", value.asInstanceOf[js.Any])
    
    inline def setImageNameNull: Self = StObject.set(x, "imageName", null)
    
    inline def setImageNameUndefined: Self = StObject.set(x, "imageName", js.undefined)
  }
}
