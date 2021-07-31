package typings.jupyterlabCoreutils

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod {
  
  object Time {
    
    @JSImport("@jupyterlab/coreutils/lib/time", "Time")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convert a timestring to a date format.
      *
      * @param value - The date timestring or date object.
      *
      * @param format - The format string.
      *
      * @returns A formatted date.
      */
    @scala.inline
    def format(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def format(value: String, timeFormat: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def format(value: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def format(value: Date, timeFormat: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any], timeFormat.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Convert a timestring to a human readable string (e.g. 'two minutes ago').
      *
      * @param value - The date timestring or date object.
      *
      * @returns A formatted date.
      */
    @scala.inline
    def formatHuman(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatHuman")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def formatHuman(value: Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatHuman")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
