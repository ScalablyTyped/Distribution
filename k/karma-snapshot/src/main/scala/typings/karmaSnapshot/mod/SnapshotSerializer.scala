package typings.karmaSnapshot.mod

import typings.karmaSnapshot.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom serializer
  */
@js.native
trait SnapshotSerializer extends js.Object {
  def deserialize(content: String): Name = js.native
  def serialize(name: String, suite: SnapshotSuite): String = js.native
}

object SnapshotSerializer {
  @scala.inline
  def apply(deserialize: String => Name, serialize: (String, SnapshotSuite) => String): SnapshotSerializer = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[SnapshotSerializer]
  }
  @scala.inline
  implicit class SnapshotSerializerOps[Self <: SnapshotSerializer] (val x: Self) extends AnyVal {
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
    def setDeserialize(value: String => Name): Self = this.set("deserialize", js.Any.fromFunction1(value))
    @scala.inline
    def setSerialize(value: (String, SnapshotSuite) => String): Self = this.set("serialize", js.Any.fromFunction2(value))
  }
  
}

