package typings.loaderDashRunner.loaderDashRunnerMod

import typings.node.Buffer
import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunLoaderOption extends js.Object {
  var context: js.Any
  var loaders: js.Array[_]
  var resource: String
  def readResource(
    filename: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]
  ): Unit
}

object RunLoaderOption {
  @scala.inline
  def apply(
    context: js.Any,
    loaders: js.Array[_],
    readResource: (String, js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]) => Unit,
    resource: String
  ): RunLoaderOption = {
    val __obj = js.Dynamic.literal(context = context, loaders = loaders, readResource = js.Any.fromFunction2(readResource), resource = resource)
  
    __obj.asInstanceOf[RunLoaderOption]
  }
}

