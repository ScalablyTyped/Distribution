package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForageDbMethodsCore extends js.Object {
  def clear(): js.Promise[Unit] = js.native
  def clear(callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def getItem[T](key: String): js.Promise[T] = js.native
  def getItem[T](key: String, callback: js.Function2[/* err */ js.Any, /* value */ T, Unit]): js.Promise[T] = js.native
  def iterate[T, U](iteratee: js.Function3[/* value */ T, /* key */ String, /* iterationNumber */ Double, U]): js.Promise[U] = js.native
  def iterate[T, U](
    iteratee: js.Function3[/* value */ T, /* key */ String, /* iterationNumber */ Double, U],
    callback: js.Function2[/* err */ js.Any, /* result */ U, Unit]
  ): js.Promise[U] = js.native
  def key(keyIndex: Double): js.Promise[String] = js.native
  def key(keyIndex: Double, callback: js.Function2[/* err */ js.Any, /* key */ String, Unit]): js.Promise[String] = js.native
  def keys(): js.Promise[js.Array[String]] = js.native
  def keys(callback: js.Function2[/* err */ js.Any, /* keys */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
  def length(): js.Promise[Double] = js.native
  def length(callback: js.Function2[/* err */ js.Any, /* numberOfKeys */ Double, Unit]): js.Promise[Double] = js.native
  def removeItem(key: String): js.Promise[Unit] = js.native
  def removeItem(key: String, callback: js.Function1[/* err */ js.Any, Unit]): js.Promise[Unit] = js.native
  def setItem[T](key: String, value: T): js.Promise[T] = js.native
  def setItem[T](key: String, value: T, callback: js.Function2[/* err */ js.Any, /* value */ T, Unit]): js.Promise[T] = js.native
}

