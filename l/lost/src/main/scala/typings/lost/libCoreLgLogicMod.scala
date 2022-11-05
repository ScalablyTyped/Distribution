package typings.lost

import typings.postcss.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreLgLogicMod {
  
  @JSImport("lost/lib/core/lg-logic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calcValue(fraction: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("calcValue")(fraction.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def calcValue(fraction: String, gutter: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcValue")(fraction.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def calcValue(fraction: String, gutter: String, rounder: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcValue")(fraction.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], rounder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def calcValue(fraction: String, gutter: String, rounder: String, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcValue")(fraction.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], rounder.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def calcValue(fraction: String, gutter: String, rounder: Unit, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcValue")(fraction.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], rounder.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def calcValue(fraction: String, gutter: Unit, rounder: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcValue")(fraction.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], rounder.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def calcValue(fraction: String, gutter: Unit, rounder: String, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcValue")(fraction.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], rounder.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def calcValue(fraction: String, gutter: Unit, rounder: Unit, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("calcValue")(fraction.asInstanceOf[js.Any], gutter.asInstanceOf[js.Any], rounder.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseLostProperty[T /* <: Node */, P /* <: /* keyof T */ String */](
    nodes: js.Array[T],
    propertyName: P,
    defaultPropertyValue: /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any
  ): /* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parseLostProperty")(nodes.asInstanceOf[js.Any], propertyName.asInstanceOf[js.Any], defaultPropertyValue.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T[P] */ js.Any]
  
  inline def validateUnit(value: Any, validUnits: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("validateUnit")(value.asInstanceOf[js.Any], validUnits.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
