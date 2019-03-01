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

object RunLoaderOption {
  @scala.inline
  def apply(
    context: js.Any,
    loaders: js.Array[_],
    readResource: js.Function2[
      java.lang.String, 
      js.Function2[
        /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
        /* data */ nodeLib.Buffer | scala.Null, 
        scala.Unit
      ], 
      scala.Unit
    ],
    resource: java.lang.String
  ): RunLoaderOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("loaders")(loaders)
    __obj.updateDynamic("readResource")(readResource)
    __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[RunLoaderOption]
  }
}

