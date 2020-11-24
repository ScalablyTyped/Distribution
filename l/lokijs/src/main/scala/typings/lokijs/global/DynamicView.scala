package typings.lokijs.global

import typings.lokijs.anon.PartialDynamicViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DynamicView class is a versatile 'live' view class which can have filters and sorts applied.
  *    Collection.addDynamicView(name) instantiates this DynamicView object and notifies it
  *    whenever documents are add/updated/removed so it can remain up-to-date. (chainable)
  *
  * @example
  * var mydv = mycollection.addDynamicView('test');  // default is non-persistent
  * mydv.applyFind({ 'doors' : 4 });
  * mydv.applyWhere(function(obj) { return obj.name === 'Toyota'; });
  * var results = mydv.data();
  *
  * @implements LokiEventEmitter
  */
@JSGlobal("DynamicView")
@js.native
class DynamicView[E /* <: js.Object */] protected ()
  extends typings.lokijs.DynamicView[E] {
  /**
    * @param collection - A reference to the collection to work against
    * @param name - The name of this dynamic view
    * @param [options] - (Optional) Pass in object with 'persistent' and/or 'sortPriority' options.
    * @param [options.persistent=false] - indicates if view is to main internal results array in 'resultdata'
    * @param [options.sortPriority='passive'] - 'passive' (sorts performed on call to data) or 'active' (after updates)
    * @param [options.minRebuildInterval] - minimum rebuild interval (need clarification to docs here)
    * @see {@link Collection#addDynamicView} to construct instances of DynamicView
    */
  def this(collection: typings.lokijs.Collection[E], name: String) = this()
  def this(collection: typings.lokijs.Collection[E], name: String, options: PartialDynamicViewOptions) = this()
}
