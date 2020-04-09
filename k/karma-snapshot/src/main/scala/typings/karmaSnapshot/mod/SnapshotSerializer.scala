package typings.karmaSnapshot.mod

import typings.karmaSnapshot.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom serializer
  */
trait SnapshotSerializer extends js.Object {
  def deserialize(content: String): AnonName
  def serialize(name: String, suite: SnapshotSuite): String
}

object SnapshotSerializer {
  @scala.inline
  def apply(deserialize: String => AnonName, serialize: (String, SnapshotSuite) => String): SnapshotSerializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction2(serialize))
  
    __obj.asInstanceOf[SnapshotSerializer]
  }
}

