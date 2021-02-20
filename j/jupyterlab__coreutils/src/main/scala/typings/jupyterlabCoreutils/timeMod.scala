package typings.jupyterlabCoreutils

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod {
  
  object Time {
    
    /**
      * Convert a timestring to a date format.
      *
      * @param value - The date timestring or date object.
      *
      * @param format - The format string.
      *
      * @returns A formatted date.
      */
    @JSImport("@jupyterlab/coreutils/lib/time", "Time.format")
    @js.native
    def format(value: String): String = js.native
    @JSImport("@jupyterlab/coreutils/lib/time", "Time.format")
    @js.native
    def format(value: String, timeFormat: String): String = js.native
    @JSImport("@jupyterlab/coreutils/lib/time", "Time.format")
    @js.native
    def format(value: Date): String = js.native
    @JSImport("@jupyterlab/coreutils/lib/time", "Time.format")
    @js.native
    def format(value: Date, timeFormat: String): String = js.native
    
    /**
      * Convert a timestring to a human readable string (e.g. 'two minutes ago').
      *
      * @param value - The date timestring or date object.
      *
      * @returns A formatted date.
      */
    @JSImport("@jupyterlab/coreutils/lib/time", "Time.formatHuman")
    @js.native
    def formatHuman(value: String): String = js.native
    @JSImport("@jupyterlab/coreutils/lib/time", "Time.formatHuman")
    @js.native
    def formatHuman(value: Date): String = js.native
  }
}
