package typings.lokijs.global

import typings.lokijs.CollectionOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Collection class that handles documents of same type
  * @implements LokiEventEmitter
  * @see {@link Loki#addCollection} for normal creation of collections
  */
@JSGlobal("Collection")
@js.native
class Collection[E /* <: js.Object */] protected ()
  extends typings.lokijs.Collection[E] {
  /**
    * @param name - collection name
    * @param [options] - (optional) configuration object
    * @param [options.unique=[]] - array of property names to define unique constraints for
    * @param [options.exact=[]] - array of property names to define exact constraints for
    * @param [options.indices=[]] - array property names to define binary indexes for
    * @param [options.adaptiveBinaryIndices=true] - collection indices will be actively rebuilt rather than lazily
    * @param [options.asyncListeners=false] - whether listeners are invoked asynchronously
    * @param [options.disableChangesApi=true] - set to false to enable Changes API
    * @param [options.disableDeltaChangesApi=true] - set to false to enable Delta Changes API (requires Changes API, forces cloning)
    * @param [options.autoupdate=false] - use Object.observe to update objects automatically
    * @param [options.clone=false] - specify whether inserts and queries clone to/from user
    * @param [options.serializableIndices=true[]] - converts date values on binary indexed properties to epoch time
    * @param [options.cloneMethod='parse-stringify'] - 'parse-stringify', 'jquery-extend-deep', 'shallow', 'shallow-assign'
    * @param options.ttlInterval - time interval for clearing out 'aged' documents; not set by default.
    * @see {@link Loki#addCollection} for normal creation of collections
    */
  def this(name: String) = this()
  def this(name: String, options: Partial[CollectionOptions[E]]) = this()
}

