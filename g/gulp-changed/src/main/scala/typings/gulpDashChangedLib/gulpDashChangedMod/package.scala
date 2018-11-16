package typings
package gulpDashChangedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gulpDashChangedMod {
  type IComparator = js.Function4[
    /* stream */ nodeLib.streamMod.Transform, 
    /* callback */ js.Function, 
    /* sourceFile */ vinylLib.vinylMod.File, 
    /* destPath */ java.lang.String, 
    scala.Unit
  ]
  type IDestination = js.Function1[/* file */ java.lang.String | nodeLib.Buffer, java.lang.String]
}
