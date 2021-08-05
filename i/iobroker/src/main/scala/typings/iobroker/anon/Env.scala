package typings.iobroker.anon

import typings.node.processMod.global.NodeJS.ProcessVersions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Env extends StObject {
  
  var env: Record[String, String]
  
  var title: String
  
  var versions: ProcessVersions
}
object Env {
  
  inline def apply(env: Record[String, String], title: String, versions: ProcessVersions): Env = {
    val __obj = js.Dynamic.literal(env = env.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Env]
  }
  
  extension [Self <: Env](x: Self) {
    
    inline def setEnv(value: Record[String, String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: ProcessVersions): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
  }
}
