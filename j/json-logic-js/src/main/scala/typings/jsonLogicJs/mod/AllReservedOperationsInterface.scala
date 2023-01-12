package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllReservedOperationsInterface[AddOps /* <: AdditionalOperation */] extends StObject {
  
  @JSName("*")
  var Asterisk: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]
  
  @JSName("==")
  var EqualssignEqualssign: js.Tuple2[Any, Any]
  
  @JSName("===")
  var EqualssignEqualssignEqualssign: js.Tuple2[Any, Any]
  
  @JSName("!")
  var Exclamationmark: Any
  
  @JSName("!=")
  var ExclamationmarkEqualssign: js.Tuple2[Any, Any]
  
  @JSName("!==")
  var ExclamationmarkEqualssignEqualssign: js.Tuple2[Any, Any]
  
  @JSName("!!")
  var ExclamationmarkExclamationmark: Any
  
  @JSName(">")
  var Greaterthansign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
  
  @JSName(">=")
  var GreaterthansignEqualssign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
  
  @JSName("<")
  var Lessthansign: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
  
  @JSName("<=")
  var LessthansignEqualssign: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
  
  @JSName("%")
  var Percentsign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
  
  @JSName("+")
  var Plussign: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]
  
  @JSName("/")
  var Slash: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]
  
  @JSName("-")
  var _dash: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]
  
  var all: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]
  
  var and: js.Array[RulesLogic[AddOps]]
  
  var cat: js.Array[RulesLogic[AddOps]]
  
  var filter: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
  
  var `if`: AnyArrayOfOddLengthMin3
  
  var inArray: js.Tuple2[RulesLogic[AddOps], js.Array[RulesLogic[AddOps]]]
  
  var inString: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
  
  var log: RulesLogic[AddOps]
  
  var map: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]
  
  var max: js.Array[RulesLogic[AddOps]]
  
  var merge: js.Array[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]]
  
  var min: js.Array[RulesLogic[AddOps]]
  
  var missing: RulesLogic[AddOps] | js.Array[Any]
  
  var missing_some: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps] | js.Array[Any]]
  
  var none: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]
  
  var or: js.Array[RulesLogic[AddOps]]
  
  var reduce: js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]]
  
  var some: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]
  
  var substr: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
  
  var `var`: RulesLogic[AddOps] | js.Array[RulesLogic[AddOps]] | (js.Tuple2[RulesLogic[AddOps], Any])
}
object AllReservedOperationsInterface {
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllReservedOperationsInterface[?], AddOps /* <: AdditionalOperation */] (val x: Self & AllReservedOperationsInterface[AddOps]) extends AnyVal {
    
    inline def setAll(value: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAnd(value: js.Array[RulesLogic[AddOps]]): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
    
    inline def setAndVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "and", js.Array(value*))
    
    inline def setAsterisk(value: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): Self = StObject.set(x, "*", value.asInstanceOf[js.Any])
    
    inline def setAsteriskVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "*", js.Array(value*))
    
    inline def setCat(value: js.Array[RulesLogic[AddOps]]): Self = StObject.set(x, "cat", value.asInstanceOf[js.Any])
    
    inline def setCatVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "cat", js.Array(value*))
    
    inline def setEqualssignEqualssign(value: js.Tuple2[Any, Any]): Self = StObject.set(x, "==", value.asInstanceOf[js.Any])
    
    inline def setEqualssignEqualssignEqualssign(value: js.Tuple2[Any, Any]): Self = StObject.set(x, "===", value.asInstanceOf[js.Any])
    
    inline def setExclamationmark(value: Any): Self = StObject.set(x, "!", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarkEqualssign(value: js.Tuple2[Any, Any]): Self = StObject.set(x, "!=", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarkEqualssignEqualssign(value: js.Tuple2[Any, Any]): Self = StObject.set(x, "!==", value.asInstanceOf[js.Any])
    
    inline def setExclamationmarkExclamationmark(value: Any): Self = StObject.set(x, "!!", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setGreaterthansign(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, ">", value.asInstanceOf[js.Any])
    
    inline def setGreaterthansignEqualssign(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, ">=", value.asInstanceOf[js.Any])
    
    inline def setIf(value: AnyArrayOfOddLengthMin3): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: []['length'] extends json-logic-js.json-logic-js.MAXIMUM_ALLOWED_BOUNDARY ? [] : [any, any] extends [] ? [] : [] extends [] ? json-logic-js.json-logic-js.Mapped<[any, any], [any, any], [...[], 1]> : json-logic-js.json-logic-js.Mapped<[any, any], [] | [...[], ...[any, any]], [...[], 1]> */ js.Any)*
    ): Self = StObject.set(x, "if", js.Array(value*))
    
    inline def setInArray(value: js.Tuple2[RulesLogic[AddOps], js.Array[RulesLogic[AddOps]]]): Self = StObject.set(x, "inArray", value.asInstanceOf[js.Any])
    
    inline def setInString(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "inString", value.asInstanceOf[js.Any])
    
    inline def setLessthansign(
      value: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
    ): Self = StObject.set(x, "<", value.asInstanceOf[js.Any])
    
    inline def setLessthansignEqualssign(
      value: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
    ): Self = StObject.set(x, "<=", value.asInstanceOf[js.Any])
    
    inline def setLog(value: RulesLogic[AddOps]): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setMap(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMax(value: js.Array[RulesLogic[AddOps]]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "max", js.Array(value*))
    
    inline def setMerge(value: js.Array[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]]): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeVarargs(value: (js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps])*): Self = StObject.set(x, "merge", js.Array(value*))
    
    inline def setMin(value: js.Array[RulesLogic[AddOps]]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "min", js.Array(value*))
    
    inline def setMissing(value: RulesLogic[AddOps] | js.Array[Any]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    inline def setMissingVarargs(value: Any*): Self = StObject.set(x, "missing", js.Array(value*))
    
    inline def setMissing_some(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps] | js.Array[Any]]): Self = StObject.set(x, "missing_some", value.asInstanceOf[js.Any])
    
    inline def setNone(value: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    inline def setOr(value: js.Array[RulesLogic[AddOps]]): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
    
    inline def setOrVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "or", js.Array(value*))
    
    inline def setPercentsign(value: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "%", value.asInstanceOf[js.Any])
    
    inline def setPlussign(value: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): Self = StObject.set(x, "+", value.asInstanceOf[js.Any])
    
    inline def setPlussignVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "+", js.Array(value*))
    
    inline def setReduce(value: js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "reduce", value.asInstanceOf[js.Any])
    
    inline def setSlash(value: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): Self = StObject.set(x, "/", value.asInstanceOf[js.Any])
    
    inline def setSlashVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "/", js.Array(value*))
    
    inline def setSome(value: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): Self = StObject.set(x, "some", value.asInstanceOf[js.Any])
    
    inline def setSubstr(
      value: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
    ): Self = StObject.set(x, "substr", value.asInstanceOf[js.Any])
    
    inline def setVar(value: RulesLogic[AddOps] | js.Array[RulesLogic[AddOps]] | (js.Tuple2[RulesLogic[AddOps], Any])): Self = StObject.set(x, "var", value.asInstanceOf[js.Any])
    
    inline def setVarVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "var", js.Array(value*))
    
    inline def set_dash(value: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): Self = StObject.set(x, "-", value.asInstanceOf[js.Any])
    
    inline def set_dashVarargs(value: RulesLogic[AddOps]*): Self = StObject.set(x, "-", js.Array(value*))
  }
}
