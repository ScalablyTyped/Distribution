package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A specification of a set of documents to listen to.
  */
@js.native
trait SchemaTarget extends js.Object {
  /**
    * A target specified by a set of document names.
    */
  var documents: js.UndefOr[SchemaDocumentsTarget] = js.native
  /**
    * If the target should be removed once it is current and consistent.
    */
  var once: js.UndefOr[Boolean] = js.native
  /**
    * A target specified by a query.
    */
  var query: js.UndefOr[SchemaQueryTarget] = js.native
  /**
    * Start listening after a specific `read_time`.  The client must know the
    * state of matching documents at this time.
    */
  var readTime: js.UndefOr[String] = js.native
  /**
    * A resume token from a prior TargetChange for an identical target.  Using
    * a resume token with a different target is unsupported and may fail.
    */
  var resumeToken: js.UndefOr[String] = js.native
  /**
    * A client provided target ID.  If not set, the server will assign an ID
    * for the target.  Used for resuming a target without changing IDs. The IDs
    * can either be client-assigned or be server-assigned in a previous stream.
    * All targets with client provided IDs must be added before adding a target
    * that needs a server-assigned id.
    */
  var targetId: js.UndefOr[Double] = js.native
}

object SchemaTarget {
  @scala.inline
  def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  @scala.inline
  implicit class SchemaTargetOps[Self <: SchemaTarget] (val x: Self) extends AnyVal {
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
    def setDocuments(value: SchemaDocumentsTarget): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocuments: Self = this.set("documents", js.undefined)
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    @scala.inline
    def setQuery(value: SchemaQueryTarget): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    @scala.inline
    def setResumeToken(value: String): Self = this.set("resumeToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResumeToken: Self = this.set("resumeToken", js.undefined)
    @scala.inline
    def setTargetId(value: Double): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
  
}

