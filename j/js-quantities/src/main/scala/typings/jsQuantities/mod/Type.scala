package typings.jsQuantities.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
