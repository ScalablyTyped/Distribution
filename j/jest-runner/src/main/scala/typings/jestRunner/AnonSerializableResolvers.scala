package typings.jestRunner

import typings.jestRunner.testWorkerMod.SerializableResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSerializableResolvers extends js.Object {
  var serializableResolvers: js.Array[SerializableResolver]
}

object AnonSerializableResolvers {
  @scala.inline
  def apply(serializableResolvers: js.Array[SerializableResolver]): AnonSerializableResolvers = {
    val __obj = js.Dynamic.literal(serializableResolvers = serializableResolvers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSerializableResolvers]
  }
}

