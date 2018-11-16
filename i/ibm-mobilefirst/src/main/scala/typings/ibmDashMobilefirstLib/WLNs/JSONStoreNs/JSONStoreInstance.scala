package typings
package ibmDashMobilefirstLib.WLNs.JSONStoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.JSONStore.JSONStoreInstance")
@js.native
class JSONStoreInstance () extends js.Object {
  def add(data: js.Any): jqueryLib.JQueryDeferred[_] = js.native
  def add(data: js.Any, options: AddOptions): jqueryLib.JQueryDeferred[_] = js.native
  def advancedFind(query: js.Array[_]): jqueryLib.JQueryDeferred[_] = js.native
  def advancedFind(query: js.Array[_], options: AdvancedFindOptions): jqueryLib.JQueryDeferred[_] = js.native
  def change(data: js.Any): jqueryLib.JQueryDeferred[_] = js.native
  def change(data: js.Any, options: ChangeOptions): jqueryLib.JQueryDeferred[_] = js.native
  def clear(): jqueryLib.JQueryDeferred[_] = js.native
  def clear(options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[_] = js.native
  def count(): jqueryLib.JQueryDeferred[_] = js.native
  def count(query: js.Any): jqueryLib.JQueryDeferred[_] = js.native
  def count(query: js.Any, options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[_] = js.native
  def countAllDirty(): jqueryLib.JQueryDeferred[_] = js.native
  def countAllDirty(options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[_] = js.native
  def enhance(name: java.lang.String, fn: js.Function): scala.Double = js.native
  /**
           * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.remove with {push: false}.
           */
  def erase(doc: js.Any): scala.Unit = js.native
  /**
           * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.remove with {push: false}.
           */
  def erase(doc: js.Any, options: EraseOptions): scala.Unit = js.native
  def find(query: js.Array[js.Object]): jqueryLib.JQueryDeferred[_] = js.native
  def find(query: js.Array[js.Object], options: FindOptions): jqueryLib.JQueryDeferred[_] = js.native
  def find(query: js.Object): jqueryLib.JQueryDeferred[_] = js.native
  def find(query: js.Object, options: FindOptions): jqueryLib.JQueryDeferred[_] = js.native
  def findAll(): jqueryLib.JQueryDeferred[_] = js.native
  def findAll(options: BasicFindOptions): jqueryLib.JQueryDeferred[_] = js.native
  def findById(): jqueryLib.JQueryDeferred[_] = js.native
  def findById(options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[_] = js.native
  def isDirty(doc: js.Any): jqueryLib.JQueryDeferred[scala.Boolean] = js.native
  def isDirty(doc: js.Any, options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[scala.Boolean] = js.native
  /**
           * @deprecated since version 6.2.0.
           */
  def load(): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * @deprecated since version 6.2.0.
           */
  def load(options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[_] = js.native
  def markClean(docs: js.Array[_]): jqueryLib.JQueryDeferred[_] = js.native
  def markClean(docs: js.Array[_], options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * @deprecated since version 6.2.0.
           */
  def push(): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * @deprecated since version 6.2.0.
           */
  def push(options: js.Any): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.push.
           */
  def pushSelected(doc: js.Any): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.push.
           */
  def pushSelected(doc: js.Any, options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * @deprecated since version 5.0.6. It is no longer needed if you use WL.JSONStore.JSONStoreInstance.replace with {push: false}.
           */
  def refresh(doc: js.Any): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * @deprecated since version 5.0.6. It is no longer needed if you use WL.JSONStore.JSONStoreInstance.replace with {push: false}.
           */
  def refresh(doc: js.Any, options: RefreshOptions): jqueryLib.JQueryDeferred[_] = js.native
  def remove(doc: js.Any): jqueryLib.JQueryDeferred[_] = js.native
  def remove(doc: js.Any, options: RemoveOptions): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * Deletes all the documents that are stored inside a collection.
           */
  def removeCollection(): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * Deletes all the documents that are stored inside a collection.
           */
  def removeCollection(options: ibmDashMobilefirstLib.WLNs.Options): jqueryLib.JQueryDeferred[_] = js.native
  def replace(doc: js.Array[js.Object]): jqueryLib.JQueryDeferred[_] = js.native
  def replace(doc: js.Array[js.Object], options: ReplaceOptions): jqueryLib.JQueryDeferred[_] = js.native
  def replace(doc: js.Object): jqueryLib.JQueryDeferred[_] = js.native
  def replace(doc: js.Object, options: ReplaceOptions): jqueryLib.JQueryDeferred[_] = js.native
  /**
           * Writes data to a collection.
           * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.add with {push: false}.
           */
  def store(data: js.Array[js.Object]): scala.Unit = js.native
  /**
           * Writes data to a collection.
           * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.add with {push: false}.
           */
  def store(data: js.Array[js.Object], options: StoreOptions): scala.Unit = js.native
  /**
           * Writes data to a collection.
           * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.add with {push: false}.
           */
  def store(data: js.Object): scala.Unit = js.native
  /**
           * Writes data to a collection.
           * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.add with {push: false}.
           */
  def store(data: js.Object, options: StoreOptions): scala.Unit = js.native
  def toString(limit: scala.Double): jqueryLib.JQueryDeferred[scala.Double] = js.native
  def toString(limit: scala.Double, offset: scala.Double): jqueryLib.JQueryDeferred[scala.Double] = js.native
}

