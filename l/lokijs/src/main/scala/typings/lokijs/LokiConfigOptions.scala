package typings.lokijs

import typings.lokijs.lokijsStrings.destructured
import typings.lokijs.lokijsStrings.fs
import typings.lokijs.lokijsStrings.localStorage
import typings.lokijs.lokijsStrings.memory
import typings.lokijs.lokijsStrings.normal
import typings.lokijs.lokijsStrings.pretty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LokiConfigOptions extends StObject {
  
  var adapter: LokiPersistenceAdapter | Null = js.native
  
  var autoload: Boolean = js.native
  
  def autoloadCallback(err: Any): Unit = js.native
  
  var autosave: Boolean = js.native
  
  def autosaveCallback(): Unit = js.native
  def autosaveCallback(err: Any): Unit = js.native
  
  var autosaveInterval: String | Double = js.native
  
  var destructureDelimiter: String = js.native
  
  var persistenceMethod: fs | localStorage | memory | Null = js.native
  
  var serializationMethod: normal | pretty | destructured | Null = js.native
  
  var throttledSaves: Boolean = js.native
}
