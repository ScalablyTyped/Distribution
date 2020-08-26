package typings.loaderRunner.mod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunLoaderOption extends js.Object {
  var context: js.Any = js.native
  var loaders: js.Array[_] = js.native
  var resource: String = js.native
  def readResource(
    filename: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]
  ): Unit = js.native
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
  @scala.inline
  implicit class RunLoaderOptionOps[Self <: RunLoaderOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadersVarargs(value: js.Any*): Self = this.set("loaders", js.Array(value :_*))
    @scala.inline
    def setLoaders(value: js.Array[_]): Self = this.set("loaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadResource(
      value: (String, js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer | Null, Unit]) => Unit
    ): Self = this.set("readResource", js.Any.fromFunction2(value))
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
  
}

