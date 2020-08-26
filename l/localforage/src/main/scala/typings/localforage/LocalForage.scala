package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForage
  extends LocalForageDbMethodsCore
     with LocalForageDbMethodsOptional {
  var INDEXEDDB: String = js.native
  var LOCALSTORAGE: String = js.native
  var WEBSQL: String = js.native
  def config(): LocalForageOptions = js.native
  def config(options: String): js.Any = js.native
  /**
    * Set and persist localForage options. This must be called before any other calls to localForage are made, but can be called after localForage is loaded.
    * If you set any config values with this method they will persist after driver changes, so you can call config() then setDriver()
    * @param {LocalForageOptions} options?
    */
  def config(options: LocalForageOptions): Boolean = js.native
  /**
    * Create a new instance of localForage to point to a different store.
    * All the configuration options used by config are supported.
    * @param {LocalForageOptions} options
    */
  def createInstance(options: LocalForageOptions): LocalForage = js.native
  def defineDriver(driver: LocalForageDriver): js.Promise[Unit] = js.native
  def defineDriver(
    driver: LocalForageDriver,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  def defineDriver(driver: LocalForageDriver, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def defineDriver(
    driver: LocalForageDriver,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  def driver(): String = js.native
  /**
    * Return a particular driver
    * @param {string} driver
    */
  def getDriver(driver: String): js.Promise[LocalForageDriver] = js.native
  def getSerializer(): js.Promise[LocalForageSerializer] = js.native
  def getSerializer(callback: js.Function1[/* serializer */ LocalForageSerializer, Unit]): js.Promise[LocalForageSerializer] = js.native
  def ready(): js.Promise[Unit] = js.native
  def ready(callback: js.Function1[/* error */ js.Any, Unit]): js.Promise[Unit] = js.native
  /**
    * Force usage of a particular driver or drivers, if available.
    * @param {string} driver
    */
  def setDriver(driver: String): js.Promise[Unit] = js.native
  def setDriver(
    driver: String,
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  def setDriver(driver: String, callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def setDriver(
    driver: String,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  def setDriver(driver: js.Array[String]): js.Promise[Unit] = js.native
  def setDriver(
    driver: js.Array[String],
    callback: js.UndefOr[scala.Nothing],
    errorCallback: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  def setDriver(driver: js.Array[String], callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def setDriver(
    driver: js.Array[String],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* error */ js.Any, Unit]
  ): js.Promise[Unit] = js.native
  def supports(driverName: String): Boolean = js.native
}

