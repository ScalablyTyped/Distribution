package typings.luminoDatagrid.typesTextrendererMod

import typings.luminoDatagrid.typesCellrendererMod.CellRenderer
import typings.luminoDatagrid.typesCellrendererMod.CellRenderer.CellConfig
import typings.luminoDatagrid.typesCellrendererMod.CellRenderer.ConfigFunc
import typings.luminoDatagrid.typesCellrendererMod.CellRenderer.ConfigOption
import typings.luminoDatagrid.typesGraphicscontextMod.GraphicsContext
import typings.luminoDatagrid.typesTextrendererMod.TextRenderer.ElideDirection
import typings.luminoDatagrid.typesTextrendererMod.TextRenderer.HorizontalAlignment
import typings.luminoDatagrid.typesTextrendererMod.TextRenderer.IOptions
import typings.luminoDatagrid.typesTextrendererMod.TextRenderer.VerticalAlignment
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer")
@js.native
/**
  * Construct a new text renderer.
  *
  * @param options - The options for initializing the renderer.
  */
open class TextRenderer () extends CellRenderer {
  def this(options: IOptions) = this()
  
  /**
    * The CSS color for the cell background.
    */
  val backgroundColor: ConfigOption[String] = js.native
  
  /**
    * Draw the background for the cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    */
  def drawBackground(gc: GraphicsContext, config: CellConfig): Unit = js.native
  
  /**
    * Draw the text for the cell.
    *
    * @param gc - The graphics context to use for drawing.
    *
    * @param config - The configuration data for the cell.
    */
  def drawText(gc: GraphicsContext, config: CellConfig): Unit = js.native
  
  /**
    * Which side to draw the ellipsis.
    */
  val elideDirection: ConfigOption[ElideDirection] = js.native
  
  /**
    * The CSS shorthand font for drawing the text.
    */
  val font: ConfigOption[String] = js.native
  
  /**
    * The format function for the cell value.
    */
  def format(config: CellConfig): String = js.native
  
  /**
    * The horizontal alignment for the cell text.
    */
  val horizontalAlignment: ConfigOption[HorizontalAlignment] = js.native
  
  /**
    * The CSS color for drawing the text.
    */
  val textColor: ConfigOption[String] = js.native
  
  /**
    * The vertical alignment for the cell text.
    */
  val verticalAlignment: ConfigOption[VerticalAlignment] = js.native
  
  /**
    * Boolean flag for applying text wrapping.
    */
  val wrapText: ConfigOption[Boolean] = js.native
}
object TextRenderer {
  
  @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The namespace for the `formatDate` function statics.
    */
  object formatDate {
    
    /**
      * Create a date format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new date format function.
      *
      * #### Notes
      * This formatter uses `Date.toDateString()` to format the values.
      *
      * If a value is not a `Date` object, `new Date(value)` is used to
      * coerce the value to a date.
      *
      * The `formatIntlDateTime()` formatter is more flexible, but slower.
      */
    inline def apply(): FormatFunc = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FormatFunc]
    inline def apply(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatDate.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer.formatDate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for creating a date format function.
      */
    trait IOptions extends StObject {
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatDate.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatDate.IOptions]
      }
      
      extension [Self <: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatDate.IOptions](x: Self) {
        
        inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
  }
  
  /**
    * The namespace for the `formatExponential` function statics.
    */
  object formatExponential {
    
    /**
      * Create a scientific notation format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new scientific notation format function.
      *
      * #### Notes
      * This formatter uses the builtin `Number()` and `toExponential()`
      * to coerce values.
      *
      * The `formatIntlNumber()` formatter is more flexible, but slower.
      */
    inline def apply(): FormatFunc = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FormatFunc]
    inline def apply(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatExponential.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer.formatExponential")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for creating an exponential format function.
      */
    trait IOptions extends StObject {
      
      /**
        * The number of digits to include after the decimal point.
        *
        * The default is determined by the user agent.
        */
      var digits: js.UndefOr[Double] = js.undefined
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatExponential.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatExponential.IOptions]
      }
      
      extension [Self <: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatExponential.IOptions](x: Self) {
        
        inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
        
        inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
        
        inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
  }
  
  /**
    * The namespace for the `formatFixed` function statics.
    */
  object formatFixed {
    
    /**
      * Create a fixed decimal format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new fixed decimal format function.
      *
      * #### Notes
      * This formatter uses the builtin `Number()` and `toFixed()` to
      * coerce values.
      *
      * The `formatIntlNumber()` formatter is more flexible, but slower.
      */
    inline def apply(): FormatFunc = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FormatFunc]
    inline def apply(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatFixed.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer.formatFixed")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for creating a fixed format function.
      */
    trait IOptions extends StObject {
      
      /**
        * The number of digits to include after the decimal point.
        *
        * The default is determined by the user agent.
        */
      var digits: js.UndefOr[Double] = js.undefined
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatFixed.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatFixed.IOptions]
      }
      
      extension [Self <: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatFixed.IOptions](x: Self) {
        
        inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
        
        inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
        
        inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
  }
  
  /**
    * The namespace for the `formatGeneric` function statics.
    */
  object formatGeneric {
    
    /**
      * Create a generic text format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new generic text format function.
      *
      * #### Notes
      * This formatter uses the builtin `String()` to coerce any value
      * to a string.
      */
    inline def apply(): FormatFunc = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FormatFunc]
    inline def apply(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatGeneric.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer.formatGeneric")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for creating a generic format function.
      */
    trait IOptions extends StObject {
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatGeneric.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatGeneric.IOptions]
      }
      
      extension [Self <: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatGeneric.IOptions](x: Self) {
        
        inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
  }
  
  /**
    * The namespace for the `formatISODateTime` function statics.
    */
  object formatISODateTime {
    
    /**
      * Create an ISO datetime format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new ISO datetime format function.
      *
      * #### Notes
      * This formatter uses `Date.toISOString()` to format the values.
      *
      * If a value is not a `Date` object, `new Date(value)` is used to
      * coerce the value to a date.
      *
      * The `formatIntlDateTime()` formatter is more flexible, but slower.
      */
    inline def apply(): FormatFunc = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FormatFunc]
    inline def apply(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatISODateTime.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer.formatISODateTime")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for creating an ISO datetime format function.
      */
    trait IOptions extends StObject {
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatISODateTime.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatISODateTime.IOptions]
      }
      
      extension [Self <: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatISODateTime.IOptions](x: Self) {
        
        inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
  }
  
  /**
    * The namespace for the `formatIntlDateTime` function statics.
    */
  object formatIntlDateTime {
    
    /**
      * Create an international datetime format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new international datetime format function.
      *
      * #### Notes
      * This formatter uses the builtin `Intl.DateTimeFormat` object to
      * coerce values.
      *
      * This is the most flexible (but slowest) datetime formatter.
      */
    inline def apply(): FormatFunc = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FormatFunc]
    inline def apply(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatIntlDateTime.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer.formatIntlDateTime")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for creating an intl datetime format function.
      */
    trait IOptions extends StObject {
      
      /**
        * The locales to pass to the `Intl.DateTimeFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var locales: js.UndefOr[String | js.Array[String]] = js.undefined
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.undefined
      
      /**
        * The options to pass to the `Intl.DateTimeFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var options: js.UndefOr[DateTimeFormatOptions] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatIntlDateTime.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatIntlDateTime.IOptions]
      }
      
      extension [Self <: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatIntlDateTime.IOptions](x: Self) {
        
        inline def setLocales(value: String | js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
        
        inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
        
        inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
        
        inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
        
        inline def setOptions(value: DateTimeFormatOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      }
    }
  }
  
  /**
    * The namespace for the `formatIntlNumber` function statics.
    */
  object formatIntlNumber {
    
    /**
      * Create an international number format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new international number format function.
      *
      * #### Notes
      * This formatter uses the builtin `Intl.NumberFormat` object to
      * coerce values.
      *
      * This is the most flexible (but slowest) number formatter.
      */
    inline def apply(): FormatFunc = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FormatFunc]
    inline def apply(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatIntlNumber.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer.formatIntlNumber")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for creating an intl number format function.
      */
    trait IOptions extends StObject {
      
      /**
        * The locales to pass to the `Intl.NumberFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var locales: js.UndefOr[String | js.Array[String]] = js.undefined
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.undefined
      
      /**
        * The options to pass to the `Intl.NumberFormat` constructor.
        *
        * The default is determined by the user agent.
        */
      var options: js.UndefOr[NumberFormatOptions] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatIntlNumber.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatIntlNumber.IOptions]
      }
      
      extension [Self <: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatIntlNumber.IOptions](x: Self) {
        
        inline def setLocales(value: String | js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
        
        inline def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
        
        inline def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value*))
        
        inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
        
        inline def setOptions(value: NumberFormatOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      }
    }
  }
  
  /**
    * The namespace for the `formatPrecision` function statics.
    */
  object formatPrecision {
    
    /**
      * Create a significant figure format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new significant figure format function.
      *
      * #### Notes
      * This formatter uses the builtin `Number()` and `toPrecision()`
      * to coerce values.
      *
      * The `formatIntlNumber()` formatter is more flexible, but slower.
      */
    inline def apply(): FormatFunc = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FormatFunc]
    inline def apply(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatPrecision.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer.formatPrecision")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for creating a precision format function.
      */
    trait IOptions extends StObject {
      
      /**
        * The number of significant figures to include in the value.
        *
        * The default is determined by the user agent.
        */
      var digits: js.UndefOr[Double] = js.undefined
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatPrecision.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatPrecision.IOptions]
      }
      
      extension [Self <: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatPrecision.IOptions](x: Self) {
        
        inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
        
        inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
        
        inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
  }
  
  /**
    * The namespace for the `formatTime` function statics.
    */
  object formatTime {
    
    /**
      * Create a time format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new time format function.
      *
      * #### Notes
      * This formatter uses `Date.toTimeString()` to format the values.
      *
      * If a value is not a `Date` object, `new Date(value)` is used to
      * coerce the value to a date.
      *
      * The `formatIntlDateTime()` formatter is more flexible, but slower.
      */
    inline def apply(): FormatFunc = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FormatFunc]
    inline def apply(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatTime.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer.formatTime")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for creating a time format function.
      */
    trait IOptions extends StObject {
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatTime.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatTime.IOptions]
      }
      
      extension [Self <: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatTime.IOptions](x: Self) {
        
        inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
  }
  
  /**
    * The namespace for the `formatUTCDateTime` function statics.
    */
  object formatUTCDateTime {
    
    /**
      * Create a UTC datetime format function.
      *
      * @param options - The options for creating the format function.
      *
      * @returns A new UTC datetime format function.
      *
      * #### Notes
      * This formatter uses `Date.toUTCString()` to format the values.
      *
      * If a value is not a `Date` object, `new Date(value)` is used to
      * coerce the value to a date.
      *
      * The `formatIntlDateTime()` formatter is more flexible, but slower.
      */
    inline def apply(): FormatFunc = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[FormatFunc]
    inline def apply(options: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatUTCDateTime.IOptions): FormatFunc = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[FormatFunc]
    
    @JSImport("@lumino/datagrid/types/textrenderer", "TextRenderer.formatUTCDateTime")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The options for creating a UTC datetime format function.
      */
    trait IOptions extends StObject {
      
      /**
        * The text to use for a `null` or `undefined` data value.
        *
        * The default is `''`.
        */
      var missing: js.UndefOr[String] = js.undefined
    }
    object IOptions {
      
      inline def apply(): typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatUTCDateTime.IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatUTCDateTime.IOptions]
      }
      
      extension [Self <: typings.luminoDatagrid.typesTextrendererMod.TextRenderer.formatUTCDateTime.IOptions](x: Self) {
        
        inline def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
        
        inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      }
    }
  }
  
  /**
    * Measure the height of a font.
    *
    * @param font - The CSS font string of interest.
    *
    * @returns The height of the font bounding box.
    *
    * #### Notes
    * This function uses a temporary DOM node to measure the text box
    * height for the specified font. The first call for a given font
    * will incur a DOM reflow, but the return value is cached, so any
    * subsequent call for the same font will return the cached value.
    */
  inline def measureFontHeight(font: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("measureFontHeight")(font.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /**
    * A type alias for the supported ellipsis sides.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.luminoDatagrid.luminoDatagridStrings.left
    - typings.luminoDatagrid.luminoDatagridStrings.right
  */
  trait ElideDirection extends StObject
  object ElideDirection {
    
    inline def left: typings.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.left]
    
    inline def right: typings.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.right]
  }
  
  /**
    * A type alias for a format function.
    */
  type FormatFunc = ConfigFunc[String]
  
  /**
    * A type alias for the supported horizontal alignment modes.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.luminoDatagrid.luminoDatagridStrings.left
    - typings.luminoDatagrid.luminoDatagridStrings.center
    - typings.luminoDatagrid.luminoDatagridStrings.right
  */
  trait HorizontalAlignment extends StObject
  object HorizontalAlignment {
    
    inline def center: typings.luminoDatagrid.luminoDatagridStrings.center = "center".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.center]
    
    inline def left: typings.luminoDatagrid.luminoDatagridStrings.left = "left".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.left]
    
    inline def right: typings.luminoDatagrid.luminoDatagridStrings.right = "right".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.right]
  }
  
  /**
    * An options object for initializing a text renderer.
    */
  trait IOptions extends StObject {
    
    /**
      * The background color for the cells.
      *
      * The default is `''`.
      */
    var backgroundColor: js.UndefOr[ConfigOption[String]] = js.undefined
    
    /**
      * The ellipsis direction for the cell text.
      *
      * The default is `'right'`.
      */
    var elideDirection: js.UndefOr[ConfigOption[ElideDirection]] = js.undefined
    
    /**
      * The font for drawing the cell text.
      *
      * The default is `'12px sans-serif'`.
      */
    var font: js.UndefOr[ConfigOption[String]] = js.undefined
    
    /**
      * The format function for the renderer.
      *
      * The default is `TextRenderer.formatGeneric()`.
      */
    var format: js.UndefOr[FormatFunc] = js.undefined
    
    /**
      * The horizontal alignment for the cell text.
      *
      * The default is `'left'`.
      */
    var horizontalAlignment: js.UndefOr[ConfigOption[HorizontalAlignment]] = js.undefined
    
    /**
      * The color for the drawing the cell text.
      *
      * The default `'#000000'`.
      */
    var textColor: js.UndefOr[ConfigOption[String]] = js.undefined
    
    /**
      * The vertical alignment for the cell text.
      *
      * The default is `'center'`.
      */
    var verticalAlignment: js.UndefOr[ConfigOption[VerticalAlignment]] = js.undefined
    
    /**
      * Whether or not to apply text wrapping.
      *
      * The default is `'false'`.
      */
    var wrapText: js.UndefOr[ConfigOption[Boolean]] = js.undefined
  }
  object IOptions {
    
    inline def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    extension [Self <: IOptions](x: Self) {
      
      inline def setBackgroundColor(value: ConfigOption[String]): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorFunction1(value: /* config */ CellConfig => String): Self = StObject.set(x, "backgroundColor", js.Any.fromFunction1(value))
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setElideDirection(value: ConfigOption[ElideDirection]): Self = StObject.set(x, "elideDirection", value.asInstanceOf[js.Any])
      
      inline def setElideDirectionFunction1(value: /* config */ CellConfig => ElideDirection): Self = StObject.set(x, "elideDirection", js.Any.fromFunction1(value))
      
      inline def setElideDirectionUndefined: Self = StObject.set(x, "elideDirection", js.undefined)
      
      inline def setFont(value: ConfigOption[String]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontFunction1(value: /* config */ CellConfig => String): Self = StObject.set(x, "font", js.Any.fromFunction1(value))
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFormat(value: /* config */ CellConfig => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHorizontalAlignment(value: ConfigOption[HorizontalAlignment]): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignmentFunction1(value: /* config */ CellConfig => HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", js.Any.fromFunction1(value))
      
      inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      inline def setTextColor(value: ConfigOption[String]): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextColorFunction1(value: /* config */ CellConfig => String): Self = StObject.set(x, "textColor", js.Any.fromFunction1(value))
      
      inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      inline def setVerticalAlignment(value: ConfigOption[VerticalAlignment]): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignmentFunction1(value: /* config */ CellConfig => VerticalAlignment): Self = StObject.set(x, "verticalAlignment", js.Any.fromFunction1(value))
      
      inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      inline def setWrapText(value: ConfigOption[Boolean]): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
      
      inline def setWrapTextFunction1(value: /* config */ CellConfig => Boolean): Self = StObject.set(x, "wrapText", js.Any.fromFunction1(value))
      
      inline def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
    }
  }
  
  /**
    * A type alias for the supported vertical alignment modes.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.luminoDatagrid.luminoDatagridStrings.top
    - typings.luminoDatagrid.luminoDatagridStrings.center
    - typings.luminoDatagrid.luminoDatagridStrings.bottom
  */
  trait VerticalAlignment extends StObject
  object VerticalAlignment {
    
    inline def bottom: typings.luminoDatagrid.luminoDatagridStrings.bottom = "bottom".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.bottom]
    
    inline def center: typings.luminoDatagrid.luminoDatagridStrings.center = "center".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.center]
    
    inline def top: typings.luminoDatagrid.luminoDatagridStrings.top = "top".asInstanceOf[typings.luminoDatagrid.luminoDatagridStrings.top]
  }
}
