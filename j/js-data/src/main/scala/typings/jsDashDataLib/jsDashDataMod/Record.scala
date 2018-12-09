package typings
package jsDashDataLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "Record")
@js.native
class Record () extends Component {
  def this(props: js.Any) = this()
  def this(props: js.Any, opts: js.Any) = this()
  def _get(prop: java.lang.String): js.Any = js.native
  def _mapper(): Mapper = js.native
  def _set(prop: js.Any): scala.Unit = js.native
  def _set(prop: js.Any, value: js.Any): scala.Unit = js.native
  def _unset(prop: js.Any): scala.Unit = js.native
  def afterLoadRelations(): scala.Unit = js.native
  def afterSave(): scala.Unit = js.native
  def beforeLoadRelations(): scala.Unit = js.native
  def beforeSave(): scala.Unit = js.native
  def changeHistory(): js.Array[_] = js.native
  def changes(): Diff = js.native
  def changes(opts: js.Any): Diff = js.native
  def commit(): this.type = js.native
  def create(): js.Promise[Record] = js.native
  def create(opts: js.Any): js.Promise[Record] = js.native
  def destroy(): js.Promise[_] = js.native
  def destroy(opts: js.Any): js.Promise[_] = js.native
  def get(key: java.lang.String): js.Any = js.native
  def hasChanges(): scala.Boolean = js.native
  def hasChanges(opts: js.Any): scala.Boolean = js.native
  def isNew(): scala.Boolean = js.native
  def loadRelations(relations: js.Any): js.Promise[this.type] = js.native
  def loadRelations(relations: js.Any, opts: js.Any): js.Promise[this.type] = js.native
  def previous(key: js.Any): js.Any = js.native
  def revert(): this.type = js.native
  def revert(opts: js.Any): this.type = js.native
  def save(): js.Promise[this.type] = js.native
  def save(opts: js.Any): js.Promise[this.type] = js.native
  def set(key: java.lang.String): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any, opts: js.Any): scala.Unit = js.native
  def toJSON(): js.Any = js.native
  def toJSON(opts: js.Any): js.Any = js.native
  def unset(key: java.lang.String): scala.Unit = js.native
  def unset(key: java.lang.String, opts: js.Any): scala.Unit = js.native
  def validate(): js.Any = js.native
  def validate(opts: js.Any): js.Any = js.native
}

@JSImport("js-data", "Record")
@js.native
object Record extends js.Object {
  var mapper: jsDashDataLib.jsDashDataMod.Mapper = js.native
}

