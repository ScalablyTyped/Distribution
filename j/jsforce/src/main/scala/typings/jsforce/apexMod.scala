package typings.jsforce

import typings.jsforce.connectionMod.Callback
import typings.jsforce.connectionMod.Connection
import typings.jsforce.connectionMod.RestApiOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/apex", JSImport.Namespace)
@js.native
object apexMod extends js.Object {
  @js.native
  class Apex protected () extends js.Object {
    def this(conn: Connection) = this()
    def del[T](path: String): js.Promise[T] = js.native
    def del[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
    def del[T](path: String, options: RestApiOptions): js.Promise[T] = js.native
    def del[T](path: String, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    def delete[T](path: String): js.Promise[T] = js.native
    def delete[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
    def delete[T](path: String, options: RestApiOptions): js.Promise[T] = js.native
    def delete[T](path: String, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    def get[T](path: String): js.Promise[T] = js.native
    def get[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
    def get[T](path: String, options: RestApiOptions): js.Promise[T] = js.native
    def get[T](path: String, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    def patch[T](path: String): js.Promise[T] = js.native
    def patch[T](path: String, body: js.Object): js.Promise[T] = js.native
    def patch[T](path: String, body: js.Object, callback: Callback[T]): js.Promise[T] = js.native
    def patch[T](path: String, body: js.Object, options: RestApiOptions): js.Promise[T] = js.native
    def patch[T](path: String, body: js.Object, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    def patch[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
    def post[T](path: String): js.Promise[T] = js.native
    def post[T](path: String, body: js.Object): js.Promise[T] = js.native
    def post[T](path: String, body: js.Object, callback: Callback[T]): js.Promise[T] = js.native
    def post[T](path: String, body: js.Object, options: RestApiOptions): js.Promise[T] = js.native
    def post[T](path: String, body: js.Object, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    def post[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
    def put[T](path: String): js.Promise[T] = js.native
    def put[T](path: String, body: js.Object): js.Promise[T] = js.native
    def put[T](path: String, body: js.Object, callback: Callback[T]): js.Promise[T] = js.native
    def put[T](path: String, body: js.Object, options: RestApiOptions): js.Promise[T] = js.native
    def put[T](path: String, body: js.Object, options: RestApiOptions, callback: Callback[T]): js.Promise[T] = js.native
    def put[T](path: String, callback: Callback[T]): js.Promise[T] = js.native
  }
  
}

