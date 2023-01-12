package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgQRCodeBarcode
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Gets or sets the Application Indicator assigned to identify the specification concerned by AIM International.
    * The value is respected only when the Fnc1Mode is set to Industry. Its value may take the form of any single Latin alphabetic character from the set {a - z, A - Z} or a two-digit number.
    */
  var applicationIndicator: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the brush to use to fill the backing of the barcode.
    */
  var backingBrush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the brush to use for the outline of the backing.
    */
  var backingOutline: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the stroke thickness of the backing outline.
    */
  var backingStrokeThickness: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the brush to use to fill the background of the bars.
    */
  var barBrush: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets a value which specifies how the grid fills within the barcode control dimensions.
    *
    * Valid values:
    * "fillSpace" FillSpace mode ensures that the barcode grid fills the control dimensions.
    * "ensureEqualSize" EnsureEqualSize mode ensures that every grid column/row has the same pixels number width/height. The sum of all columns/rows pixels may be less than the width/height of the control.
    */
  var barsFillMode: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the data value.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Occurs when the data has changed.
    * Function takes first argument evt and second argument ui.
    * Use ui.owner to obtain reference to the barcode widget.
    * Use ui.newData to obtain the new data.
    */
  var dataChanged: js.UndefOr[DataChangedEvent] = js.undefined
  
  /**
    * Gets or sets a value indicating whether to show the ECI header.
    *
    * Valid values:
    * "hide" Hide the header.
    * "show" Show the header.
    */
  var eciHeaderDisplayMode: js.UndefOr[String] = js.undefined
  
  /**
    * Each Extended Channel Interpretation (ECI) is designated by a six-digit assignment number: 000000 - 999999.
    * The default value depends on the loaded encodings. The default is ECI 000003 (representing ISO/IEC 8859-1) if the ISO/IEC 8859-1 character set is loaded. Otherwise the default value is 000026 (representing UTF-8).
    */
  var eciNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the encoding mode for compaction of the QR Code symbol data. The default value is undefined if the Shift_JIS encoding is loaded. Otherwise the default value is byte.
    *
    * Valid values:
    * "undefined" When Undefined encoding mode is set, the QR code barcode internally switches between modes as necessary in order to achieve the most efficient conversion of data into a binary string.
    * "numeric" Numeric mode encodes data from decimal digit set (0-9). Normally 3 data characters are represented by 10 bits.
    * "alphanumeric" Alphanumeric mode encodes data from a set of 45 characters (digits 0-9, upper case letters A-Z, nine other characters: space, $ % * + _ . / : ). Normally two input characters are represented by 11 bits.
    * "byte" In Byte mode the data is encoded at 8 bits per character. The character set of the Byte encoding mode is byte data (by default it is ISO/IEC 8859-1 character set).
    * "kanji" The Kanji mode efficiently encodes Kanji characters in accordance with the Shift JIS system based on JIS X 0208. Each two-byte character value is compacted to a 13-bit binary codeword.
    */
  var encodingMode: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the error correction level of the QR Code symbol.
    *
    * Valid values:
    * "low" Low error correction level allows recovery of 7% of the symbol codewords.
    * "medium" Medium error correction level allows recovery of 15% of the symbol codewords.
    * "quartil" Quartil error correction level allows recovery of 25% of the symbol codewords.
    * "high" High error correction level allows recovery of 30% of the symbol codewords.
    */
  var errorCorrectionLevel: js.UndefOr[String] = js.undefined
  
  /**
    * Occurs when an error has happened.
    * Function takes first argument evt and second argument ui.
    * Use ui.owner to obtain reference to the barcode widget.
    * Use ui.errorMessage to get or set the error message that is to be shown.
    */
  var errorMessageDisplaying: js.UndefOr[ErrorMessageDisplayingEvent] = js.undefined
  
  /**
    * Gets or sets the message text displayed when some error occurs.
    */
  var errorMessageText: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the FNC1 mode indicator which identifies symbols encoding messages formatted according to specific predefined industry or application specifications.
    *
    * Valid values:
    * "none" Do not use any Fnc1 symbols, i.e. the data is not identified according to specific predefined industry or application specifications.
    * "gs1" Uses Fnc1 symbol in the first position of the character in Code 128 symbols and designates data formatted in accordance with the GS1 General Specification.
    * "industry" Uses Fnc1 symbol in the second position of the character in Code 128 symbols and designates data formatted in accordance with a specific industry application previously agreed with AIM Inc.
    */
  var fnc1Mode: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the font of the text displayed by the control.
    */
  var font: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the brush to use for the label font.
    */
  var fontBrush: js.UndefOr[String] = js.undefined
  
  /**
    * The height of the barcode. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var height: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets or sets the scaling value used to affect the pixel density of the control.
    * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
    * to appear blurry.
    */
  var pixelScalingRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  
  /**
    * Gets or sets the size version of the QR Code symbol.
    *
    * Valid values:
    * "undefined" If set, the QR code barcode sets internally the smallest version that will accommodate the data.
    * "version1" Version1 defines size of 21x21 modules for the symbol.
    * "version2" Version2 defines size of 25x25 modules for the symbol.
    * "version3" Version3 defines size of 29x29 modules for the symbol.
    * "version4" Version4 defines size of 33x33 modules for the symbol.
    * "version5" Version5 defines size of 37x37 modules for the symbol.
    * "version6" Version6 defines size of 41x41 modules for the symbol.
    * "version7" Version7 defines size of 45x45 modules for the symbol.
    * "version8" Version8 defines size of 49x49 modules for the symbol.
    * "version9" Version9 defines size of 53x53 modules for the symbol.
    * "version10" Version10 defines size of 57x57 modules for the symbol.
    * "version11" Version11 defines size of 61x61 modules for the symbol.
    * "version12" Version12 defines size of 65x65 modules for the symbol.
    * "version13" Version13 defines size of 69x69 modules for the symbol.
    * "version14" Version14 defines size of 73x73 modules for the symbol.
    * "version15" Version15 defines size of 77x77 modules for the symbol.
    * "version16" Version16 defines size of 81x81 modules for the symbol.
    * "version17" Version17 defines size of 85x85 modules for the symbol.
    * "version18" Version18 defines size of 89x89 modules for the symbol.
    * "version19" Version19 defines size of 93x93 modules for the symbol.
    * "version20" Version20 defines size of 97x97 modules for the symbol.
    * "version21" Version21 defines size of 101x101 modules for the symbol.
    * "version22" Version22 defines size of 105x105 modules for the symbol.
    * "version23" Version23 defines size of 109x109 modules for the symbol.
    * "version24" Version24 defines size of 113x113 modules for the symbol.
    * "version25" Version25 defines size of 117x117 modules for the symbol.
    * "version26" Version26 defines size of 121x121 modules for the symbol.
    * "version27" Version27 defines size of 125x125 modules for the symbol.
    * "version28" Version28 defines size of 129x129 modules for the symbol.
    * "version29" Version29 defines size of 133x133 modules for the symbol.
    * "version30" Version30 defines size of 137x137 modules for the symbol.
    * "version31" Version31 defines size of 141x141 modules for the symbol.
    * "version32" Version32 defines size of 145x145 modules for the symbol.
    * "version33" Version33 defines size of 149x149 modules for the symbol.
    * "version34" Version34 defines size of 153x153 modules for the symbol.
    * "version35" Version35 defines size of 157x157 modules for the symbol.
    * "version36" Version36 defines size of 161x161 modules for the symbol.
    * "version37" Version37 defines size of 165x165 modules for the symbol.
    * "version38" Version38 defines size of 169x169 modules for the symbol.
    * "version39" Version39 defines size of 173x173 modules for the symbol.
    * "version40" Version40 defines size of 177x177 modules for the symbol.
    */
  var sizeVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the stretch.
    *
    * Valid values:
    * "none"
    * "fill"
    * "uniform"
    * "uniformToFill"
    */
  var stretch: js.UndefOr[String] = js.undefined
  
  /**
    * The width of the barcode. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.undefined
  
  /**
    * Gets or sets the width (XDimension) to height (YDimension) ratio. It accepts only positive values. This property does not apply for the QR barcode.
    */
  var widthToHeightRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets or sets the X-dimension (narrow element width) for a symbol in mm. It accepts values from 0.01 to 100.
    */
  var xDimension: js.UndefOr[Double] = js.undefined
}
object IgQRCodeBarcode {
  
  inline def apply(): IgQRCodeBarcode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgQRCodeBarcode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IgQRCodeBarcode] (val x: Self) extends AnyVal {
    
    inline def setApplicationIndicator(value: String): Self = StObject.set(x, "applicationIndicator", value.asInstanceOf[js.Any])
    
    inline def setApplicationIndicatorUndefined: Self = StObject.set(x, "applicationIndicator", js.undefined)
    
    inline def setBackingBrush(value: String): Self = StObject.set(x, "backingBrush", value.asInstanceOf[js.Any])
    
    inline def setBackingBrushUndefined: Self = StObject.set(x, "backingBrush", js.undefined)
    
    inline def setBackingOutline(value: String): Self = StObject.set(x, "backingOutline", value.asInstanceOf[js.Any])
    
    inline def setBackingOutlineUndefined: Self = StObject.set(x, "backingOutline", js.undefined)
    
    inline def setBackingStrokeThickness(value: Double): Self = StObject.set(x, "backingStrokeThickness", value.asInstanceOf[js.Any])
    
    inline def setBackingStrokeThicknessUndefined: Self = StObject.set(x, "backingStrokeThickness", js.undefined)
    
    inline def setBarBrush(value: String): Self = StObject.set(x, "barBrush", value.asInstanceOf[js.Any])
    
    inline def setBarBrushUndefined: Self = StObject.set(x, "barBrush", js.undefined)
    
    inline def setBarsFillMode(value: String): Self = StObject.set(x, "barsFillMode", value.asInstanceOf[js.Any])
    
    inline def setBarsFillModeUndefined: Self = StObject.set(x, "barsFillMode", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataChanged(value: (/* event */ Event, /* ui */ DataChangedEventUIParam) => Unit): Self = StObject.set(x, "dataChanged", js.Any.fromFunction2(value))
    
    inline def setDataChangedUndefined: Self = StObject.set(x, "dataChanged", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setEciHeaderDisplayMode(value: String): Self = StObject.set(x, "eciHeaderDisplayMode", value.asInstanceOf[js.Any])
    
    inline def setEciHeaderDisplayModeUndefined: Self = StObject.set(x, "eciHeaderDisplayMode", js.undefined)
    
    inline def setEciNumber(value: Double): Self = StObject.set(x, "eciNumber", value.asInstanceOf[js.Any])
    
    inline def setEciNumberUndefined: Self = StObject.set(x, "eciNumber", js.undefined)
    
    inline def setEncodingMode(value: String): Self = StObject.set(x, "encodingMode", value.asInstanceOf[js.Any])
    
    inline def setEncodingModeUndefined: Self = StObject.set(x, "encodingMode", js.undefined)
    
    inline def setErrorCorrectionLevel(value: String): Self = StObject.set(x, "errorCorrectionLevel", value.asInstanceOf[js.Any])
    
    inline def setErrorCorrectionLevelUndefined: Self = StObject.set(x, "errorCorrectionLevel", js.undefined)
    
    inline def setErrorMessageDisplaying(value: (/* event */ Event, /* ui */ ErrorMessageDisplayingEventUIParam) => Unit): Self = StObject.set(x, "errorMessageDisplaying", js.Any.fromFunction2(value))
    
    inline def setErrorMessageDisplayingUndefined: Self = StObject.set(x, "errorMessageDisplaying", js.undefined)
    
    inline def setErrorMessageText(value: String): Self = StObject.set(x, "errorMessageText", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageTextUndefined: Self = StObject.set(x, "errorMessageText", js.undefined)
    
    inline def setFnc1Mode(value: String): Self = StObject.set(x, "fnc1Mode", value.asInstanceOf[js.Any])
    
    inline def setFnc1ModeUndefined: Self = StObject.set(x, "fnc1Mode", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontBrush(value: String): Self = StObject.set(x, "fontBrush", value.asInstanceOf[js.Any])
    
    inline def setFontBrushUndefined: Self = StObject.set(x, "fontBrush", js.undefined)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLocale(value: Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    inline def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    inline def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    inline def setSizeVersion(value: String): Self = StObject.set(x, "sizeVersion", value.asInstanceOf[js.Any])
    
    inline def setSizeVersionUndefined: Self = StObject.set(x, "sizeVersion", js.undefined)
    
    inline def setStretch(value: String): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
    
    inline def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    
    inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthToHeightRatio(value: Double): Self = StObject.set(x, "widthToHeightRatio", value.asInstanceOf[js.Any])
    
    inline def setWidthToHeightRatioUndefined: Self = StObject.set(x, "widthToHeightRatio", js.undefined)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXDimension(value: Double): Self = StObject.set(x, "xDimension", value.asInstanceOf[js.Any])
    
    inline def setXDimensionUndefined: Self = StObject.set(x, "xDimension", js.undefined)
  }
}
