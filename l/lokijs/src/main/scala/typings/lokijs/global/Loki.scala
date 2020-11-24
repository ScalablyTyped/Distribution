package typings.lokijs.global

import typings.lokijs.anon.PartialLokiConstructorOpt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Loki: The main database class
  * @implements LokiEventEmitter
  */
@JSGlobal("Loki")
@js.native
class Loki protected ()
  extends typings.lokijs.Loki {
  /**
    * @param filename - name of the file to be saved to
    * @param options - (Optional) config options object
    * @param options.env - override environment detection as 'NODEJS', 'BROWSER', 'CORDOVA'
    * @param [options.verbose=false] - enable console output
    * @param [options.autosave=false] - enables autosave
    * @param [options.autosaveInterval=5000] - time interval (in milliseconds) between saves (if dirty)
    * @param [options.autoload=false] - enables autoload on loki instantiation
    * @param options.autoloadCallback - user callback called after database load
    * @param options.adapter - an instance of a loki persistence adapter
    * @param [options.serializationMethod='normal'] - ['normal', 'pretty', 'destructured']
    * @param options.destructureDelimiter - string delimiter used for destructured serialization
    * @param [options.throttledSaves=true] - debounces multiple calls to to saveDatabase reducing number of disk I/O operations
    and guaranteeing proper serialization of the calls.
    */
  def this(filename: String) = this()
  def this(filename: String, options: PartialLokiConstructorOpt) = this()
}
