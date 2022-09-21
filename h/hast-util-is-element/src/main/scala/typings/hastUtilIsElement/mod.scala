package typings.hastUtilIsElement

import typings.hastUtilIsElement.hastUtilIsElementBooleans.`false`
import typings.unist.mod.Data
import typings.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-is-element", "convertElement")
  @js.native
  val convertElement: (js.Function1[
    /* test */ (/* import warning: importer.ImportType#apply Failed type conversion: hast.hast.Element['tagName'] */ js.Any) | TestFunctionPredicate[typings.hast.mod.Element], 
    AssertPredicate[typings.hast.mod.Element]
  ]) & (js.Function1[/* test */ js.UndefOr[Test], AssertAnything]) = js.native
  
  @JSImport("hast-util-is-element", "isElement")
  @js.native
  val isElement: js.Function0[`false`] & (js.Function5[
    /* node */ Any, 
    /* test */ js.UndefOr[PredicateTest[typings.hast.mod.Element]], 
    /* index */ js.UndefOr[Double], 
    /* parent */ js.UndefOr[typings.unist.mod.Parent[typings.unist.mod.Node[Data], Data]], 
    /* context */ js.UndefOr[Any], 
    /* is hast.hast.Element */ Boolean
  ]) & (js.Function5[
    /* node */ Any, 
    /* test */ Test, 
    /* index */ js.UndefOr[Double], 
    /* parent */ js.UndefOr[typings.unist.mod.Parent[typings.unist.mod.Node[Data], Data]], 
    /* context */ js.UndefOr[Any], 
    Boolean
  ]) = js.native
  
  type AssertAnything = js.Function3[
    /* node */ js.UndefOr[Any], 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    Boolean
  ]
  
  type AssertPredicate[Y /* <: typings.hast.mod.Element */] = js.Function3[
    /* node */ js.UndefOr[Any], 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    /* is Y */ Boolean
  ]
  
  type Element = typings.hast.mod.Element
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
  
  type PredicateTest[T /* <: typings.hast.mod.Element */] = js.UndefOr[
    Null | (/* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any) | TestFunctionPredicate[T] | (js.Array[
      (/* import warning: importer.ImportType#apply Failed type conversion: T['tagName'] */ js.Any) | TestFunctionPredicate[T]
    ])
  ]
  
  type TagName = String
  
  type Test = js.UndefOr[
    Null | TagName | TestFunctionAnything | (js.Array[TagName | TestFunctionAnything])
  ]
  
  type TestFunctionAnything = js.Function3[
    /* element */ Element, 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    Boolean | Unit
  ]
  
  type TestFunctionPredicate[X /* <: typings.hast.mod.Element */] = js.Function3[
    /* element */ Element, 
    /* index */ js.UndefOr[Double | Null], 
    /* parent */ js.UndefOr[Parent | Null], 
    /* is X */ Boolean
  ]
}
