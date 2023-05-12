package typings.lintStaged

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type Commands = js.Array[String] | String
  
  type Config = ConfigFn | (StringDictionary[Commands | ConfigFn])
  
  type ConfigFn = js.Function1[/* filenames */ js.Array[String], Commands | js.Promise[Commands]]
}
