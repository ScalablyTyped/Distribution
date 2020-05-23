package typings.lokijs.anon

import typings.lokijs.LokiPersistenceAdapter
import typings.lokijs.lokijsStrings.BROWSER
import typings.lokijs.lokijsStrings.CORDOVA
import typings.lokijs.lokijsStrings.NA
import typings.lokijs.lokijsStrings.NATIVESCRIPT
import typings.lokijs.lokijsStrings.NODEJS
import typings.lokijs.lokijsStrings.destructured
import typings.lokijs.lokijsStrings.fs
import typings.lokijs.lokijsStrings.localStorage
import typings.lokijs.lokijsStrings.memory
import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.LokiConstructorOptions> & lokijs.LokiConfigOptions & std.Partial<lokijs.ThrottledSaveDrainOptions> */
@js.native
trait PartialLokiConstructorOptAdapter extends js.Object {
  var adapter: LokiPersistenceAdapter | Null = js.native
  var autoload: Boolean = js.native
  var autosave: Boolean = js.native
  var autosaveInterval: String | Double = js.native
  var destructureDelimiter: String = js.native
  var env: js.UndefOr[NATIVESCRIPT | NODEJS | CORDOVA | BROWSER | NA] = js.native
  var persistenceMethod: fs | localStorage | memory | Null = js.native
  var recursiveWait: js.UndefOr[Boolean] = js.native
  var recursiveWaitLimit: js.UndefOr[Boolean] = js.native
  var recursiveWaitLimitDuration: js.UndefOr[Double] = js.native
  var serializationMethod: normal | pretty | destructured | Null = js.native
  var started: js.UndefOr[Double] = js.native
  var throttledSaves: Boolean = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  def autoloadCallback(err: js.Any): Unit = js.native
  def autosaveCallback(): Unit = js.native
  def autosaveCallback(err: js.Any): Unit = js.native
}

