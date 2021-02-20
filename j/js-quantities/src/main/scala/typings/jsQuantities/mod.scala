package typings.jsQuantities

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("js-quantities", JSImport.Namespace)
  @js.native
  val ^ : Type = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("js-quantities", JSImport.Namespace)
  @js.native
  class Class protected () extends Qty {
    def this(value: Source) = this()
    def this(value: Double, unit: String) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsQuantities.jsQuantitiesNumbers.`-1`
    - typings.jsQuantities.jsQuantitiesNumbers.`0`
    - typings.jsQuantities.jsQuantitiesNumbers.`1`
  */
  trait ComparisonResult extends StObject
  object ComparisonResult {
    
    @scala.inline
    def `-1`: typings.jsQuantities.jsQuantitiesNumbers.`-1` = -1.asInstanceOf[typings.jsQuantities.jsQuantitiesNumbers.`-1`]
    
    @scala.inline
    def `0`: typings.jsQuantities.jsQuantitiesNumbers.`0` = 0.asInstanceOf[typings.jsQuantities.jsQuantitiesNumbers.`0`]
    
    @scala.inline
    def `1`: typings.jsQuantities.jsQuantitiesNumbers.`1` = 1.asInstanceOf[typings.jsQuantities.jsQuantitiesNumbers.`1`]
  }
  
  @js.native
  trait Converter extends StObject {
    
    def apply(sourceValue: Double): Double = js.native
    def apply(sourceValues: js.Array[Double]): js.Array[Double] = js.native
  }
  
  type Formatter = js.Function2[/* scalar */ Double, /* unit */ String, String]
  
  @js.native
  trait Qty extends StObject {
    
    def add(value: Source): Qty = js.native
    
    val baseScalar: Double = js.native
    
    def compareTo(value: Qty): ComparisonResult = js.native
    
    val denominator: js.Array[String] = js.native
    
    def div(value: Source): Qty = js.native
    
    def eq(value: UnitSource): Boolean = js.native
    
    def format(): String = js.native
    def format(formatter: Formatter): String = js.native
    def format(value: String): String = js.native
    def format(value: String, formatter: Formatter): String = js.native
    
    def gt(value: UnitSource): Boolean = js.native
    
    def gte(value: UnitSource): Boolean = js.native
    
    val initValue: String = js.native
    
    def inverse(): Qty = js.native
    
    def isBase(): Boolean = js.native
    
    def isCompatible(value: UnitSource): Boolean = js.native
    
    def isUnitless(): Boolean = js.native
    
    def kind(): String = js.native
    
    def lt(value: UnitSource): Boolean = js.native
    
    def lte(value: UnitSource): Boolean = js.native
    
    def mul(value: Source): Qty = js.native
    
    val numerator: js.Array[String] = js.native
    
    def same(value: UnitSource): Boolean = js.native
    
    val scalar: Double = js.native
    
    def sub(value: Source): Qty = js.native
    
    def to(value: UnitSource): Qty = js.native
    
    def toBase(): Qty = js.native
    
    def toFloat(): Double = js.native
    
    def toPrec(value: Source): Qty = js.native
    
    def toString(valueOrPrecision: Source): String = js.native
    def toString(value: String, precision: Double): String = js.native
    
    def units(): String = js.native
  }
  
  type Source = UnitSource | Double
  
  @js.native
  trait Type
    extends Instantiable1[/* value */ Source, Qty]
       with Instantiable2[/* value */ Double, /* unit */ String, Qty] {
    
    def apply(value: Double, unit: String): Qty = js.native
    def apply(value: Source): Qty = js.native
    
    val Error: js.Any = js.native
    
    def divSafe(n1: Double, n2: Double): Double = js.native
    
    def formatter(scalar: Double, unit: String): String = js.native
    @JSName("formatter")
    var formatter_Original: Formatter = js.native
    
    def getAliases(unit: String): js.Array[String] = js.native
    
    def getKinds(): js.Array[String] = js.native
    
    def getUnits(): js.Array[String] = js.native
    def getUnits(kind: String): js.Array[String] = js.native
    
    def mulSafe(n1: Double, n2: Double): Double = js.native
    
    def parse(value: String): Qty = js.native
    
    def swiftConverter(sourceUnit: String, targetUnit: String): Converter = js.native
  }
  
  type UnitSource = Qty | String
  
  type _To = Type
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Type = ^
}
