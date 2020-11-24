package typings.jsonRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type DynamicFactCallback[T] = js.Function2[
    /* params */ typings.std.Record[java.lang.String, js.Any], 
    /* almanac */ typings.jsonRulesEngine.mod.Almanac, 
    T
  ]
  
  type EventHandler = js.Function3[
    /* event */ typings.jsonRulesEngine.mod.Event, 
    /* almanac */ typings.jsonRulesEngine.mod.Almanac, 
    /* ruleResult */ typings.jsonRulesEngine.mod.RuleResult, 
    scala.Unit
  ]
  
  type OperatorEvaluator[A, B] = js.Function2[/* factValue */ A, /* compareToValue */ B, scala.Boolean]
}
