package typings.humanFormat

import typings.humanFormat.mod.FormatOptions
import typings.humanFormat.mod.ParseResult
import typings.humanFormat.mod.ScaleMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object humanFormat {
    
    /**
      * Converts a number to/from a human readable string
      */
    inline def apply(value: Double): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def apply(value: Double, opts: FormatOptions): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("humanFormat")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("humanFormat.Scale")
    @js.native
    open class Scale protected ()
      extends typings.humanFormat.mod.Scale {
      def this(options: ScaleMap) = this()
    }
    object Scale {
      
      @JSGlobal("humanFormat.Scale")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def create(options: js.Array[String], base: Double, initExp: Double): typings.humanFormat.mod.Scale = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], base.asInstanceOf[js.Any], initExp.asInstanceOf[js.Any])).asInstanceOf[typings.humanFormat.mod.Scale]
    }
    
    /**
      * Format the given numeric value into human-readable format
      */
    inline def bytes(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def bytes(value: Double, opts: FormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bytes")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
    
    object parse {
      
      /**
        * Parse the given human-readable string into numeric value
        */
      inline def apply(value: String): Double = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Double]
      inline def apply(value: String, opts: FormatOptions): Double = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
      
      @JSGlobal("humanFormat.parse")
      @js.native
      val ^ : js.Any = js.native
      
      inline def raw(value: String): ParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(value.asInstanceOf[js.Any]).asInstanceOf[ParseResult]
      inline def raw(value: String, opts: FormatOptions): ParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("raw")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParseResult]
    }
    
    inline def raw(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def raw(value: Double, opts: FormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("raw")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
