package typings.jupyterlabCoreutils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTimeMod {
  
  object Time {
    
    @JSImport("@jupyterlab/coreutils/lib/time", "Time")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Convenient helper to convert a timestring to a date format.
      *
      * @param value - The date timestring or date object.
      *
      * @returns A formatted date.
      */
    inline def format(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def format(value: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Convert a timestring to a human readable string (e.g. 'two minutes ago').
      *
      * @param value - The date timestring or date object.
      *
      * @returns A formatted date.
      */
    inline def formatHuman(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatHuman")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def formatHuman(value: js.Date): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatHuman")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}
