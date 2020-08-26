package typings.logkitty

import typings.logkitty.logkittyStrings.DEBUG
import typings.logkitty.logkittyStrings.ERROR
import typings.logkitty.logkittyStrings.FATAL
import typings.logkitty.logkittyStrings.INFO
import typings.logkitty.logkittyStrings.SILENT
import typings.logkitty.logkittyStrings.UNKNOWN
import typings.logkitty.logkittyStrings.VERBOSE
import typings.logkitty.logkittyStrings.WARN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logkitty/build/android/constants", JSImport.Namespace)
@js.native
object constantsMod extends js.Object {
  /* keyof logkitty.anon.DEBUG */ /* Rewritten from type alias, can be one of: 
    - typings.logkitty.logkittyStrings.UNKNOWN
    - typings.logkitty.logkittyStrings.VERBOSE
    - typings.logkitty.logkittyStrings.DEBUG
    - typings.logkitty.logkittyStrings.INFO
    - typings.logkitty.logkittyStrings.WARN
    - typings.logkitty.logkittyStrings.ERROR
    - typings.logkitty.logkittyStrings.FATAL
    - typings.logkitty.logkittyStrings.SILENT
  */
  trait PriorityNames extends js.Object
  
  @js.native
  object Priority extends js.Object {
    var DEBUG: Double = js.native
    var ERROR: Double = js.native
    var FATAL: Double = js.native
    var INFO: Double = js.native
    var SILENT: Double = js.native
    var UNKNOWN: Double = js.native
    var VERBOSE: Double = js.native
    var WARN: Double = js.native
    def fromLetter(letter: String): Double = js.native
    @JSName("fromName")
    def fromName_DEBUG(name: DEBUG): Double = js.native
    @JSName("fromName")
    def fromName_ERROR(name: ERROR): Double = js.native
    @JSName("fromName")
    def fromName_FATAL(name: FATAL): Double = js.native
    @JSName("fromName")
    def fromName_INFO(name: INFO): Double = js.native
    @JSName("fromName")
    def fromName_SILENT(name: SILENT): Double = js.native
    @JSName("fromName")
    def fromName_UNKNOWN(name: UNKNOWN): Double = js.native
    @JSName("fromName")
    def fromName_VERBOSE(name: VERBOSE): Double = js.native
    @JSName("fromName")
    def fromName_WARN(name: WARN): Double = js.native
    def toLetter(code: Double): String = js.native
    def toName(code: Double): UNKNOWN | VERBOSE | DEBUG | INFO | WARN | ERROR | FATAL | SILENT = js.native
  }
  
}

