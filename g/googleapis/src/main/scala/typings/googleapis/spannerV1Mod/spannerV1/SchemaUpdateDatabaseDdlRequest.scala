package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enqueues the given DDL statements to be applied, in order but not
  * necessarily all at once, to the database schema at some point (or points)
  * in the future. The server checks that the statements are executable
  * (syntactically valid, name tables that exist, etc.) before enqueueing them,
  * but they may still fail upon later execution (e.g., if a statement from
  * another batch of statements is applied first and it conflicts in some way,
  * or if there is some data-related problem like a `NULL` value in a column to
  * which `NOT NULL` would be added). If a statement fails, all subsequent
  * statements in the batch are automatically cancelled.  Each batch of
  * statements is assigned a name which can be used with the Operations API to
  * monitor progress. See the operation_id field for more details.
  */
@js.native
trait SchemaUpdateDatabaseDdlRequest extends js.Object {
  /**
    * If empty, the new update request is assigned an automatically-generated
    * operation ID. Otherwise, `operation_id` is used to construct the name of
    * the resulting Operation.  Specifying an explicit operation ID simplifies
    * determining whether the statements were executed in the event that the
    * UpdateDatabaseDdl call is replayed, or the return value is otherwise
    * lost: the database and `operation_id` fields can be combined to form the
    * name of the resulting longrunning.Operation:
    * `&lt;database&gt;/operations/&lt;operation_id&gt;`.  `operation_id`
    * should be unique within the database, and must be a valid identifier:
    * `a-z*`. Note that automatically-generated operation IDs always begin with
    * an underscore. If the named operation already exists, UpdateDatabaseDdl
    * returns `ALREADY_EXISTS`.
    */
  var operationId: js.UndefOr[String] = js.native
  /**
    * DDL statements to be applied to the database.
    */
  var statements: js.UndefOr[js.Array[String]] = js.native
}

object SchemaUpdateDatabaseDdlRequest {
  @scala.inline
  def apply(): SchemaUpdateDatabaseDdlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateDatabaseDdlRequest]
  }
  @scala.inline
  implicit class SchemaUpdateDatabaseDdlRequestOps[Self <: SchemaUpdateDatabaseDdlRequest] (val x: Self) extends AnyVal {
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
    def setOperationId(value: String): Self = this.set("operationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationId: Self = this.set("operationId", js.undefined)
    @scala.inline
    def setStatementsVarargs(value: String*): Self = this.set("statements", js.Array(value :_*))
    @scala.inline
    def setStatements(value: js.Array[String]): Self = this.set("statements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatements: Self = this.set("statements", js.undefined)
  }
  
}

