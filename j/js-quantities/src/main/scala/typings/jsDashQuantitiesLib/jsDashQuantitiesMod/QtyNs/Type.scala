package typings
package jsDashQuantitiesLib.jsDashQuantitiesMod.QtyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type
  extends org.scalablytyped.runtime.Instantiable1[/* value */ Source, jsDashQuantitiesLib.jsDashQuantitiesMod.Qty]
     with org.scalablytyped.runtime.Instantiable2[
      /* value */ scala.Double, 
      /* unit */ java.lang.String, 
      jsDashQuantitiesLib.jsDashQuantitiesMod.Qty
    ] {
  val Error: js.Any = js.native
  @JSName("formatter")
  var formatter_Original: Formatter = js.native
  def apply(value: Source): jsDashQuantitiesLib.jsDashQuantitiesMod.Qty = js.native
  def apply(value: scala.Double, unit: java.lang.String): jsDashQuantitiesLib.jsDashQuantitiesMod.Qty = js.native
  def divSafe(n1: scala.Double, n2: scala.Double): scala.Double = js.native
  def formatter(scalar: scala.Double, unit: java.lang.String): java.lang.String = js.native
  def getAliases(unit: java.lang.String): js.Array[java.lang.String] = js.native
  def getKinds(): js.Array[java.lang.String] = js.native
  def getUnits(): js.Array[java.lang.String] = js.native
  def getUnits(kind: java.lang.String): js.Array[java.lang.String] = js.native
  def mulSafe(n1: scala.Double, n2: scala.Double): scala.Double = js.native
  def parse(value: java.lang.String): jsDashQuantitiesLib.jsDashQuantitiesMod.Qty = js.native
  def swiftConverter(sourceUnit: java.lang.String, targetUnit: java.lang.String): Converter = js.native
}

