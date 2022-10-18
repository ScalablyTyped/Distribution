package typings.matrixAppserviceBridge

import typings.nedb.mod.^
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsBridgeStoreMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/bridge-store", "BridgeStore")
  @js.native
  open class BridgeStore protected () extends StObject {
    def this(db: ^[Any]) = this()
    
    /**
      * Convenience method to convert a document to something.
      * @param func The function which will be called with a single document
      * object. Guaranteed not to be null.
      * @return A `transformFn` function to pass to the standard
      * select/delete/upsert/etc methods.
      */
    def convertTo[T, O](func: js.Function1[/* input */ T, O]): js.Function1[/* doc */ T, O] = js.native
    
    val db: ^[Any] = js.native
    
    /* private */ var dbFind: Any = js.native
    
    /* private */ var dbFindOne: Any = js.native
    
    /* private */ var dbInsert: Any = js.native
    
    /* private */ var dbRemove: Any = js.native
    
    /* private */ var dbUpdate: Any = js.native
    
    /**
      * DELETE multiple documents.
      */
    def delete(query: Query): js.Promise[Double] = js.native
    
    /**
      * INSERT a multiple documents.
      */
    def insert(objects: Any): js.Promise[js.Array[Any]] = js.native
    
    /**
      * INSERT IF NOT EXISTS a single document
      */
    def insertIfNotExists(query: Query, insertObj: Record[String, Any]): js.Promise[Unit] = js.native
    
    /**
      * SELECT a number of documents.
      * @param query
      * @param transformFn
      * @param defer
      */
    def select[T, O](query: Query): js.Promise[js.Array[O]] = js.native
    def select[T, O](query: Query, transformFn: js.Function1[/* input */ T, O]): js.Promise[js.Array[O]] = js.native
    
    /**
      * SELECT a single document.
      */
    def selectOne[T, O](query: Query): js.Promise[O | Null] = js.native
    def selectOne[T, O](query: Query, transformFn: js.Function1[/* input */ T, O]): js.Promise[O | Null] = js.native
    
    /**
      * Set a UNIQUE key constraint on the given field.
      * @param fieldName The field name. Use dot notation for nested objects.
      * @param sparse Allow sparse entries (undefined won't cause a key
      * violation).
      */
    def setUnique(fieldName: String): Unit = js.native
    def setUnique(fieldName: String, sparse: Boolean): Unit = js.native
    
    /**
      * UPDATE a single document. If the document already exists, this will NOT update
      * it.
      */
    def update(query: Query, updateVals: Record[String, Any]): js.Promise[Unit] = js.native
    
    /**
      * UPSERT a single document
      */
    def upsert[T](query: Query, updateVals: T): js.Promise[Unit] = js.native
  }
  
  type Query = Record[String, Any]
}
