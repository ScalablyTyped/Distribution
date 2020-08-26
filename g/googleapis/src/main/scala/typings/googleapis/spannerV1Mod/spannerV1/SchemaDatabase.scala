package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cloud Spanner database.
  */
@js.native
trait SchemaDatabase extends js.Object {
  /**
    * Required. The name of the database. Values are of the form
    * `projects/&lt;project&gt;/instances/&lt;instance&gt;/databases/&lt;database&gt;`,
    * where `&lt;database&gt;` is as specified in the `CREATE DATABASE`
    * statement. This name can be passed to other API methods to identify the
    * database.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The current database state.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaDatabase {
  @scala.inline
  def apply(): SchemaDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabase]
  }
  @scala.inline
  implicit class SchemaDatabaseOps[Self <: SchemaDatabase] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

