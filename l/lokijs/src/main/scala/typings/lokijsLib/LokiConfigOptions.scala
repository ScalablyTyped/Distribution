package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LokiConfigOptions extends js.Object {
  var adapter: LokiPersistenceAdapter | scala.Null = js.native
  var autoload: scala.Boolean = js.native
  var autosave: scala.Boolean = js.native
  var autosaveInterval: java.lang.String | scala.Double = js.native
  var destructureDelimiter: java.lang.String = js.native
  var persistenceMethod: lokijsLib.lokijsLibStrings.fs | lokijsLib.lokijsLibStrings.localStorage | lokijsLib.lokijsLibStrings.memory | scala.Null = js.native
  var serializationMethod: lokijsLib.lokijsLibStrings.normal | lokijsLib.lokijsLibStrings.pretty | lokijsLib.lokijsLibStrings.destructured | scala.Null = js.native
  var throttledSaves: scala.Boolean = js.native
  def autoloadCallback(err: js.Any): scala.Unit = js.native
  def autosaveCallback(): scala.Unit = js.native
  def autosaveCallback(err: js.Any): scala.Unit = js.native
}

