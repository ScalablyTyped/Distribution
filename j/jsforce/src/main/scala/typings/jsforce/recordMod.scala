package typings.jsforce

import typings.jsforce.anon.Attributes
import typings.jsforce.connectionMod.Connection
import typings.jsforce.recordResultMod.RecordResult
import typings.jsforce.salesforceIdMod.SalesforceId
import typings.node.streamMod.Stream
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordMod {
  
  @JSImport("jsforce/record", "RecordReference")
  @js.native
  open class RecordReference[T] protected () extends StObject {
    def this(conn: Connection, `type`: String, id: SalesforceId) = this()
    
    def blob(fieldName: String): Stream = js.native
    
    def del(): js.Promise[RecordResult] = js.native
    def del(options: js.Object): js.Promise[RecordResult] = js.native
    def del(options: js.Object, callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
    def del(options: Unit, callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
    
    def delete(): js.Promise[RecordResult] = js.native
    def delete(options: js.Object): js.Promise[RecordResult] = js.native
    def delete(options: js.Object, callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
    def delete(options: Unit, callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
    
    def destroy(): js.Promise[RecordResult] = js.native
    def destroy(options: js.Object): js.Promise[RecordResult] = js.native
    def destroy(options: js.Object, callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
    def destroy(options: Unit, callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]): js.Promise[RecordResult] = js.native
    
    def retrieve(): js.Promise[Record[T]] = js.native
    def retrieve(options: js.Object): js.Promise[Record[T]] = js.native
    def retrieve(options: js.Object, callback: js.Function2[/* err */ js.Error, /* record */ Record[T], Unit]): js.Promise[Record[T]] = js.native
    def retrieve(options: Unit, callback: js.Function2[/* err */ js.Error, /* record */ Record[T], Unit]): js.Promise[Record[T]] = js.native
    
    def update(record: Partial[T]): js.Promise[RecordResult] = js.native
    def update(record: Partial[T], options: js.Object): js.Promise[RecordResult] = js.native
    def update(
      record: Partial[T],
      options: js.Object,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]
    ): js.Promise[RecordResult] = js.native
    def update(
      record: Partial[T],
      options: Unit,
      callback: js.Function2[/* err */ js.Error, /* result */ RecordResult, Unit]
    ): js.Promise[RecordResult] = js.native
  }
  
  type Record[T] = Attributes & T
  
  trait RecordAttributes extends StObject {
    
    var `type`: String
    
    var url: String
  }
  object RecordAttributes {
    
    inline def apply(`type`: String, url: String): RecordAttributes = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordAttributes]
    }
    
    extension [Self <: RecordAttributes](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
