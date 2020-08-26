package typings.jsData.collectionMod

import typings.jsData.componentMod.ComponentOpts
import typings.jsData.jsDataStrings.merge
import typings.jsData.jsDataStrings.replace
import typings.jsData.jsDataStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionOpts extends ComponentOpts {
  /**
    * Whether to call {@link Record#commit} on records that are added to the
    * collection and already exist in the collection.
    *
    * @name Collection#commitOnMerge
    * @type {boolean}
    * @default true
    */
  var commitOnMerge: js.UndefOr[Boolean] = js.native
  /**
    * Whether record events should bubble up and be emitted by the collection.
    *
    * @name Collection#emitRecordEvents
    * @type {boolean}
    * @default true
    */
  var emitRecordEvents: js.UndefOr[Boolean] = js.native
  /**
    * Field to be used as the unique identifier for records in this collection.
    * Defaults to `"id"` unless {@link Collection#mapper} is set, in which case
    * this will default to {@link Mapper#idAttribute}.
    *
    * @name Collection#idAttribute
    * @type {string}
    * @default "id"
    */
  var idAttribute: js.UndefOr[String] = js.native
  /**
    * What to do when inserting a record into this Collection that shares a
    * primary key with a record already in this Collection.
    *
    * Possible values:
    * merge
    * replace
    * skip
    *
    * Merge:
    *
    * Recursively shallow copy properties from the new record onto the existing
    * record.
    *
    * Replace:
    *
    * Shallow copy top-level properties from the new record onto the existing
    * record. Any top-level own properties of the existing record that are _not_
    * on the new record will be removed.
    *
    * Skip:
    *
    * Ignore new record, keep existing record.
    *
    * @default "merge"
    */
  var onConflict: js.UndefOr[merge | replace | skip] = js.native
}

object CollectionOpts {
  @scala.inline
  def apply(): CollectionOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionOpts]
  }
  @scala.inline
  implicit class CollectionOptsOps[Self <: CollectionOpts] (val x: Self) extends AnyVal {
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
    def setCommitOnMerge(value: Boolean): Self = this.set("commitOnMerge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitOnMerge: Self = this.set("commitOnMerge", js.undefined)
    @scala.inline
    def setEmitRecordEvents(value: Boolean): Self = this.set("emitRecordEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmitRecordEvents: Self = this.set("emitRecordEvents", js.undefined)
    @scala.inline
    def setIdAttribute(value: String): Self = this.set("idAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdAttribute: Self = this.set("idAttribute", js.undefined)
    @scala.inline
    def setOnConflict(value: merge | replace | skip): Self = this.set("onConflict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnConflict: Self = this.set("onConflict", js.undefined)
  }
  
}

