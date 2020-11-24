package typings.ibmMobilefirst.WL.JSONStore

import typings.ibmMobilefirst.WL.Options
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONStoreInstance extends js.Object {
  
  def add(data: js.Any): JQueryDeferred[_] = js.native
  def add(data: js.Any, options: AddOptions): JQueryDeferred[_] = js.native
  
  def advancedFind(query: js.Array[_]): JQueryDeferred[_] = js.native
  def advancedFind(query: js.Array[_], options: AdvancedFindOptions): JQueryDeferred[_] = js.native
  
  def change(data: js.Any): JQueryDeferred[_] = js.native
  def change(data: js.Any, options: ChangeOptions): JQueryDeferred[_] = js.native
  
  def clear(): JQueryDeferred[_] = js.native
  def clear(options: Options): JQueryDeferred[_] = js.native
  
  def count(): JQueryDeferred[_] = js.native
  def count(query: js.UndefOr[scala.Nothing], options: Options): JQueryDeferred[_] = js.native
  def count(query: js.Any): JQueryDeferred[_] = js.native
  def count(query: js.Any, options: Options): JQueryDeferred[_] = js.native
  
  def countAllDirty(): JQueryDeferred[_] = js.native
  def countAllDirty(options: Options): JQueryDeferred[_] = js.native
  
  def enhance(name: String, fn: js.Function): Double = js.native
  
  /**
    * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.remove with {push: false}.
    */
  def erase(doc: js.Any): Unit = js.native
  def erase(doc: js.Any, options: EraseOptions): Unit = js.native
  
  def find(query: js.Array[js.Object]): JQueryDeferred[_] = js.native
  def find(query: js.Array[js.Object], options: FindOptions): JQueryDeferred[_] = js.native
  def find(query: js.Object): JQueryDeferred[_] = js.native
  def find(query: js.Object, options: FindOptions): JQueryDeferred[_] = js.native
  
  def findAll(): JQueryDeferred[_] = js.native
  def findAll(options: BasicFindOptions): JQueryDeferred[_] = js.native
  
  def findById(): JQueryDeferred[_] = js.native
  def findById(options: Options): JQueryDeferred[_] = js.native
  
  def isDirty(doc: js.Any): JQueryDeferred[Boolean] = js.native
  def isDirty(doc: js.Any, options: Options): JQueryDeferred[Boolean] = js.native
  
  /**
    * @deprecated since version 6.2.0.
    */
  def load(): JQueryDeferred[_] = js.native
  def load(options: Options): JQueryDeferred[_] = js.native
  
  def markClean(docs: js.Array[_]): JQueryDeferred[_] = js.native
  def markClean(docs: js.Array[_], options: Options): JQueryDeferred[_] = js.native
  
  /**
    * @deprecated since version 6.2.0.
    */
  def push(): JQueryDeferred[_] = js.native
  def push(options: js.Any): JQueryDeferred[_] = js.native
  
  /**
    * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.push.
    */
  def pushSelected(doc: js.Any): JQueryDeferred[_] = js.native
  def pushSelected(doc: js.Any, options: Options): JQueryDeferred[_] = js.native
  
  /**
    * @deprecated since version 5.0.6. It is no longer needed if you use WL.JSONStore.JSONStoreInstance.replace with {push: false}.
    */
  def refresh(doc: js.Any): JQueryDeferred[_] = js.native
  def refresh(doc: js.Any, options: RefreshOptions): JQueryDeferred[_] = js.native
  
  def remove(doc: js.Any): JQueryDeferred[_] = js.native
  def remove(doc: js.Any, options: RemoveOptions): JQueryDeferred[_] = js.native
  
  /**
    * Deletes all the documents that are stored inside a collection.
    */
  def removeCollection(): JQueryDeferred[_] = js.native
  def removeCollection(options: Options): JQueryDeferred[_] = js.native
  
  def replace(doc: js.Array[js.Object]): JQueryDeferred[_] = js.native
  def replace(doc: js.Array[js.Object], options: ReplaceOptions): JQueryDeferred[_] = js.native
  def replace(doc: js.Object): JQueryDeferred[_] = js.native
  def replace(doc: js.Object, options: ReplaceOptions): JQueryDeferred[_] = js.native
  
  def store(data: js.Array[js.Object]): Unit = js.native
  def store(data: js.Array[js.Object], options: StoreOptions): Unit = js.native
  /**
    * Writes data to a collection.
    * @deprecated since version 5.0.6, it is no longer needed if you use WL.JSONStore.JSONStoreInstance.add with {push: false}.
    */
  def store(data: js.Object): Unit = js.native
  def store(data: js.Object, options: StoreOptions): Unit = js.native
  
  def toString(limit: js.UndefOr[scala.Nothing], offset: Double): JQueryDeferred[Double] = js.native
  def toString(limit: Double): JQueryDeferred[Double] = js.native
  def toString(limit: Double, offset: Double): JQueryDeferred[Double] = js.native
}
