package typings.intlUnofficialDurationUnitFormat

import typings.intlUnofficialDurationUnitFormat.anon.CUSTOM
import typings.intlUnofficialDurationUnitFormat.anon.DAY
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("intl-unofficial-duration-unit-format", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DurationUnitFormat {
    def this(locales: String) = this()
    def this(locales: js.Array[String]) = this()
    def this(locales: String, options: DurationUnitFormatOptions) = this()
    def this(locales: js.Array[String], options: DurationUnitFormatOptions) = this()
    def this(locales: Unit, options: DurationUnitFormatOptions) = this()
    
    /* CompleteClass */
    override def format(value: Double): String = js.native
    
    /* CompleteClass */
    override def formatToParts(value: Double): js.Array[DurationUnitFormatPart] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("intl-unofficial-duration-unit-format", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("intl-unofficial-duration-unit-format", "default.styles")
    @js.native
    def styles: CUSTOM = js.native
    inline def styles_=(x: CUSTOM): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("styles")(x.asInstanceOf[js.Any])
    
    @JSImport("intl-unofficial-duration-unit-format", "default.units")
    @js.native
    def units: DAY = js.native
    inline def units_=(x: DAY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("units")(x.asInstanceOf[js.Any])
  }
  
  trait DurationUnitFormat extends StObject {
    
    def format(value: Double): String
    
    def formatToParts(value: Double): js.Array[DurationUnitFormatPart]
  }
  object DurationUnitFormat {
    
    inline def apply(format: Double => String, formatToParts: Double => js.Array[DurationUnitFormatPart]): DurationUnitFormat = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), formatToParts = js.Any.fromFunction1(formatToParts))
      __obj.asInstanceOf[DurationUnitFormat]
    }
    
    extension [Self <: DurationUnitFormat](x: Self) {
      
      inline def setFormat(value: Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatToParts(value: Double => js.Array[DurationUnitFormatPart]): Self = StObject.set(x, "formatToParts", js.Any.fromFunction1(value))
    }
  }
  
  trait DurationUnitFormatOptions extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var formatDuration: js.UndefOr[String] = js.undefined
    
    var formatUnits: js.UndefOr[Record[DurationUnitFormatUnit, String]] = js.undefined
    
    var round: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[DurationUnitFormatStyle] = js.undefined
  }
  object DurationUnitFormatOptions {
    
    inline def apply(): DurationUnitFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DurationUnitFormatOptions]
    }
    
    extension [Self <: DurationUnitFormatOptions](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatDuration(value: String): Self = StObject.set(x, "formatDuration", value.asInstanceOf[js.Any])
      
      inline def setFormatDurationUndefined: Self = StObject.set(x, "formatDuration", js.undefined)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormatUnits(value: Record[DurationUnitFormatUnit, String]): Self = StObject.set(x, "formatUnits", value.asInstanceOf[js.Any])
      
      inline def setFormatUnitsUndefined: Self = StObject.set(x, "formatUnits", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setStyle(value: DurationUnitFormatStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait DurationUnitFormatPart extends StObject {
    
    var `type`: DurationUnitFormatPartType
    
    var value: String
  }
  object DurationUnitFormatPart {
    
    inline def apply(`type`: DurationUnitFormatPartType, value: String): DurationUnitFormatPart = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DurationUnitFormatPart]
    }
    
    extension [Self <: DurationUnitFormatPart](x: Self) {
      
      inline def setType(value: DurationUnitFormatPartType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.intlUnofficialDurationUnitFormat.mod.DurationUnitFormatUnit
    - typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.literal
    - typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.group
    - typings.intlUnofficialDurationUnitFormat.intlUnofficialDurationUnitFormatStrings.unit
  */
  type DurationUnitFormatPartType = _DurationUnitFormatPartType | DurationUnitFormatUnit
  
  type DurationUnitFormatStyle = /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DurationUnitFormat.styles * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DurationUnitFormat.styles * / any] */ js.Any
  
  type DurationUnitFormatUnit = /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DurationUnitFormat.units * / any[keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DurationUnitFormat.units * / any] */ js.Any
  
  trait _DurationUnitFormatPartType extends StObject
}
