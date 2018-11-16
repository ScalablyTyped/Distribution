package typings
package jsforceLib.apiApexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/api/apex", "Apex")
@js.native
class Apex protected () extends js.Object {
  def this(conn: jsforceLib.connectionMod.Connection) = this()
  def del[T](path: java.lang.String): stdLib.Promise[T] = js.native
  def del[T](path: java.lang.String, callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
  def del[T](path: java.lang.String, options: jsforceLib.connectionMod.RestApiOptions): stdLib.Promise[T] = js.native
  def del[T](
    path: java.lang.String,
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[T]
  ): stdLib.Promise[T] = js.native
  def delete[T](path: java.lang.String): stdLib.Promise[T] = js.native
  def delete[T](path: java.lang.String, callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
  def delete[T](path: java.lang.String, options: jsforceLib.connectionMod.RestApiOptions): stdLib.Promise[T] = js.native
  def delete[T](
    path: java.lang.String,
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[T]
  ): stdLib.Promise[T] = js.native
  def get[T](path: java.lang.String): stdLib.Promise[T] = js.native
  def get[T](path: java.lang.String, callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
  def get[T](path: java.lang.String, options: jsforceLib.connectionMod.RestApiOptions): stdLib.Promise[T] = js.native
  def get[T](
    path: java.lang.String,
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[T]
  ): stdLib.Promise[T] = js.native
  def patch[T](path: java.lang.String): stdLib.Promise[T] = js.native
  def patch[T](path: java.lang.String, body: js.Object): stdLib.Promise[T] = js.native
  def patch[T](path: java.lang.String, body: js.Object, callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
  def patch[T](path: java.lang.String, body: js.Object, options: jsforceLib.connectionMod.RestApiOptions): stdLib.Promise[T] = js.native
  def patch[T](
    path: java.lang.String,
    body: js.Object,
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[T]
  ): stdLib.Promise[T] = js.native
  def patch[T](path: java.lang.String, callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
  def post[T](path: java.lang.String): stdLib.Promise[T] = js.native
  def post[T](path: java.lang.String, body: js.Object): stdLib.Promise[T] = js.native
  def post[T](path: java.lang.String, body: js.Object, callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
  def post[T](path: java.lang.String, body: js.Object, options: jsforceLib.connectionMod.RestApiOptions): stdLib.Promise[T] = js.native
  def post[T](
    path: java.lang.String,
    body: js.Object,
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[T]
  ): stdLib.Promise[T] = js.native
  def post[T](path: java.lang.String, callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
  def put[T](path: java.lang.String): stdLib.Promise[T] = js.native
  def put[T](path: java.lang.String, body: js.Object): stdLib.Promise[T] = js.native
  def put[T](path: java.lang.String, body: js.Object, callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
  def put[T](path: java.lang.String, body: js.Object, options: jsforceLib.connectionMod.RestApiOptions): stdLib.Promise[T] = js.native
  def put[T](
    path: java.lang.String,
    body: js.Object,
    options: jsforceLib.connectionMod.RestApiOptions,
    callback: jsforceLib.connectionMod.Callback[T]
  ): stdLib.Promise[T] = js.native
  def put[T](path: java.lang.String, callback: jsforceLib.connectionMod.Callback[T]): stdLib.Promise[T] = js.native
}

