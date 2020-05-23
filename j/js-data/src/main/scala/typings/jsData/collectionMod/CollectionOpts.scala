package typings.jsData.collectionMod

import typings.jsData.componentMod.ComponentOpts
import typings.jsData.jsDataStrings.merge
import typings.jsData.jsDataStrings.replace
import typings.jsData.jsDataStrings.skip
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionOpts extends ComponentOpts {
  /**
    * Whether to call {@link Record#commit} on records that are added to the
    * collection and already exist in the collection.
    *
    * @name Collection#commitOnMerge
    * @type {boolean}
    * @default true
    */
  var commitOnMerge: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether record events should bubble up and be emitted by the collection.
    *
    * @name Collection#emitRecordEvents
    * @type {boolean}
    * @default true
    */
  var emitRecordEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Field to be used as the unique identifier for records in this collection.
    * Defaults to `"id"` unless {@link Collection#mapper} is set, in which case
    * this will default to {@link Mapper#idAttribute}.
    *
    * @name Collection#idAttribute
    * @type {string}
    * @default "id"
    */
  var idAttribute: js.UndefOr[String] = js.undefined
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
  var onConflict: js.UndefOr[merge | replace | skip] = js.undefined
}

object CollectionOpts {
  @scala.inline
  def apply(
    commitOnMerge: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    emitRecordEvents: js.UndefOr[Boolean] = js.undefined,
    idAttribute: String = null,
    onConflict: merge | replace | skip = null
  ): CollectionOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commitOnMerge)) __obj.updateDynamic("commitOnMerge")(commitOnMerge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(emitRecordEvents)) __obj.updateDynamic("emitRecordEvents")(emitRecordEvents.get.asInstanceOf[js.Any])
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (onConflict != null) __obj.updateDynamic("onConflict")(onConflict.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionOpts]
  }
}

