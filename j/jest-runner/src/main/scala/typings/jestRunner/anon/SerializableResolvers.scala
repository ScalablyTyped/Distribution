package typings.jestRunner.anon

import typings.jestRunner.testWorkerMod.SerializableResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializableResolvers extends js.Object {
  var serializableResolvers: js.Array[SerializableResolver] = js.native
}

object SerializableResolvers {
  @scala.inline
  def apply(serializableResolvers: js.Array[SerializableResolver]): SerializableResolvers = {
    val __obj = js.Dynamic.literal(serializableResolvers = serializableResolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableResolvers]
  }
  @scala.inline
  implicit class SerializableResolversOps[Self <: SerializableResolvers] (val x: Self) extends AnyVal {
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
    def setSerializableResolversVarargs(value: SerializableResolver*): Self = this.set("serializableResolvers", js.Array(value :_*))
    @scala.inline
    def setSerializableResolvers(value: js.Array[SerializableResolver]): Self = this.set("serializableResolvers", value.asInstanceOf[js.Any])
  }
  
}

