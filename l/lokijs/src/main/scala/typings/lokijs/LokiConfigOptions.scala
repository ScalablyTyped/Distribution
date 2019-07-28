package typings.lokijs

import typings.lokijs.lokijsStrings.destructured
import typings.lokijs.lokijsStrings.fs
import typings.lokijs.lokijsStrings.localStorage
import typings.lokijs.lokijsStrings.memory
import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LokiConfigOptions extends js.Object {
  var adapter: LokiPersistenceAdapter | Null = js.native
  var autoload: Boolean = js.native
  var autosave: Boolean = js.native
  var autosaveInterval: String | Double = js.native
  var destructureDelimiter: String = js.native
  var persistenceMethod: fs | localStorage | memory | Null = js.native
  var serializationMethod: normal | pretty | destructured | Null = js.native
  var throttledSaves: Boolean = js.native
  def autoloadCallback(err: js.Any): Unit = js.native
  def autosaveCallback(): Unit = js.native
  def autosaveCallback(err: js.Any): Unit = js.native
}

