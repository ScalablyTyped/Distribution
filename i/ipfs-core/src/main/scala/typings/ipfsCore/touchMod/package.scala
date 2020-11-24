package typings.ipfsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object touchMod {
  
  type CID = typings.cids.mod.^
  
  type Hrtime = js.Tuple2[scala.Double, scala.Double]
  
  type UnixTime = typings.std.Date | (js.Tuple2[scala.Double, scala.Double]) | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_format-mtime.MTime */ js.Any)
}
