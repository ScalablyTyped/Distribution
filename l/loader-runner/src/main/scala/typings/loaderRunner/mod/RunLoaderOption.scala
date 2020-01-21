package typings.loaderRunner.mod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], loaders = loaders.asInstanceOf[js.Any], readResource = js.Any.fromFunction2(readResource), resource = resource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RunLoaderOption]
  }
}

