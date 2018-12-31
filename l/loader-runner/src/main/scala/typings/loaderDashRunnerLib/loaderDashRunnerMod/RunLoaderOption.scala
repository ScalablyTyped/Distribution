package typings
package loaderDashRunnerLib.loaderDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunLoaderOption extends js.Object {
  var context: js.Any
  var loaders: js.Array[_]
  var resource: java.lang.String
  def readResource(
    filename: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* data */ nodeLib.Buffer | scala.Null, 
      scala.Unit
    ]
  ): scala.Unit
}

