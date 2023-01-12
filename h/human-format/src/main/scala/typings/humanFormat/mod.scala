package typings.humanFormat

import org.scalablytyped.runtime.StringDictionary
import typings.humanFormat.humanFormatStrings.SI
import typings.humanFormat.humanFormatStrings.auto
import typings.humanFormat.humanFormatStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Converts a number to/from a human readable string
    */
  inline def apply(value: Double): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Double, opts: FormatOptions): String = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("human-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("human-format", "Scale")
  @js.native
  open class Scale protected () extends StObject {
    def this(options: ScaleMap) = this()
    
    def findPrefix(value: Double): ScaleOptions = js.native
    
    def parse(str: String): ParseResult = js.native
    def parse(str: String, strict: Boolean): ParseResult = js.native
  }
  object Scale {
    
    @JSImport("human-format", "Scale")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def create(options: js.Array[String], base: Double, initExp: Double): Scale = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any], base.asInstanceOf[js.Any], initExp.asInstanceOf[js.Any])).asInstanceOf[Scale]
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
    
    @JSImport("human-format", "parse")
    @js.native
    val ^ : js.Any = js.native
    
    inline def raw(value: String): ParseResult = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(value.asInstanceOf[js.Any]).asInstanceOf[ParseResult]
    inline def raw(value: String, opts: FormatOptions): ParseResult = (^.asInstanceOf[js.Dynamic].applyDynamic("raw")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ParseResult]
  }
  
  inline def raw(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def raw(value: Double, opts: FormatOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("raw")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait FormatOptions extends StObject {
    
    var decimals: js.UndefOr[Double] = js.undefined
    
    var maxDecimals: js.UndefOr[Double | auto] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[SI | binary | Scale] = js.undefined
    
    var separator: js.UndefOr[String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var unit: js.UndefOr[String] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
      
      inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
      
      inline def setMaxDecimals(value: Double | auto): Self = StObject.set(x, "maxDecimals", value.asInstanceOf[js.Any])
      
      inline def setMaxDecimalsUndefined: Self = StObject.set(x, "maxDecimals", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setScale(value: SI | binary | Scale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    }
  }
  
  /**
    * Parsing result
    */
  trait ParseResult
    extends StObject
       with ScaleOptions {
    
    var unit: String
    
    var value: Double
  }
  object ParseResult {
    
    inline def apply(factor: Double, prefix: String, unit: String, value: Double): ParseResult = {
      val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseResult] (val x: Self) extends AnyVal {
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Scale map for defining prefixes and their corresponding factors
    */
  type ScaleMap = StringDictionary[Double]
  
  /**
    * Scale options
    */
  trait ScaleOptions extends StObject {
    
    var factor: Double
    
    var prefix: String
  }
  object ScaleOptions {
    
    inline def apply(factor: Double, prefix: String): ScaleOptions = {
      val __obj = js.Dynamic.literal(factor = factor.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScaleOptions] (val x: Self) extends AnyVal {
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
}
