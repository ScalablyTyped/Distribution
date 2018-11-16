package typings
package localforageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForage extends LocalForageDbMethods {
  var INDEXEDDB: java.lang.String = js.native
  var LOCALSTORAGE: java.lang.String = js.native
  var WEBSQL: java.lang.String = js.native
  def config(): LocalForageOptions = js.native
  def config(options: java.lang.String): js.Any = js.native
  /**
       * Set and persist localForage options. This must be called before any other calls to localForage are made, but can be called after localForage is loaded.
       * If you set any config values with this method they will persist after driver changes, so you can call config() then setDriver()
       * @param {LocalForageOptions} options?
       */
  def config(options: LocalForageOptions): scala.Boolean = js.native
  /**
       * Create a new instance of localForage to point to a different store.
       * All the configuration options used by config are supported.
       * @param {LocalForageOptions} options
       */
  def createInstance(options: LocalForageOptions): LocalForage = js.native
  def defineDriver(driver: LocalForageDriver): stdLib.Promise[scala.Unit] = js.native
  def defineDriver(driver: LocalForageDriver, callback: js.Function0[scala.Unit]): stdLib.Promise[scala.Unit] = js.native
  def defineDriver(
    driver: LocalForageDriver,
    callback: js.Function0[scala.Unit],
    errorCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): stdLib.Promise[scala.Unit] = js.native
  def driver(): java.lang.String = js.native
  /**
       * Return a particular driver
       * @param {string} driver
       */
  def getDriver(driver: java.lang.String): stdLib.Promise[LocalForageDriver] = js.native
  def getSerializer(): stdLib.Promise[LocalForageSerializer] = js.native
  def getSerializer(callback: js.Function1[/* serializer */ LocalForageSerializer, scala.Unit]): stdLib.Promise[LocalForageSerializer] = js.native
  def ready(): stdLib.Promise[scala.Unit] = js.native
  def ready(callback: js.Function1[/* error */ js.Any, scala.Unit]): stdLib.Promise[scala.Unit] = js.native
  /**
       * Force usage of a particular driver or drivers, if available.
       * @param {string} driver
       */
  def setDriver(driver: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
       * Force usage of a particular driver or drivers, if available.
       * @param {string} driver
       */
  def setDriver(driver: java.lang.String, callback: js.Function0[scala.Unit]): stdLib.Promise[scala.Unit] = js.native
  /**
       * Force usage of a particular driver or drivers, if available.
       * @param {string} driver
       */
  def setDriver(
    driver: java.lang.String,
    callback: js.Function0[scala.Unit],
    errorCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): stdLib.Promise[scala.Unit] = js.native
  /**
       * Force usage of a particular driver or drivers, if available.
       * @param {string} driver
       */
  def setDriver(driver: js.Array[java.lang.String]): stdLib.Promise[scala.Unit] = js.native
  /**
       * Force usage of a particular driver or drivers, if available.
       * @param {string} driver
       */
  def setDriver(driver: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): stdLib.Promise[scala.Unit] = js.native
  /**
       * Force usage of a particular driver or drivers, if available.
       * @param {string} driver
       */
  def setDriver(
    driver: js.Array[java.lang.String],
    callback: js.Function0[scala.Unit],
    errorCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): stdLib.Promise[scala.Unit] = js.native
  def supports(driverName: java.lang.String): scala.Boolean = js.native
}

