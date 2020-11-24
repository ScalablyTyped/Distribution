package typings.launchpad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BrowserFunction = js.Function2[
    /* url */ java.lang.String, 
    /* callback */ js.Function2[/* err */ js.Any, /* instance */ typings.launchpad.mod.Instance, scala.Unit], 
    scala.Unit
  ]
}
