package typings.jsonLogicJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _RulesLogic[AddOps /* <: AdditionalOperation */] extends StObject
object _RulesLogic {
  
  inline def JsonLogicAll[AddOps /* <: AdditionalOperation */](all: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicAll[AddOps] = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicAll[AddOps]]
  }
  
  inline def JsonLogicAnd[AddOps /* <: AdditionalOperation */](and: js.Array[RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicAnd[AddOps] = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicAnd[AddOps]]
  }
  
  inline def JsonLogicCat[AddOps /* <: AdditionalOperation */](cat: js.Array[RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicCat[AddOps] = {
    val __obj = js.Dynamic.literal(cat = cat.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicCat[AddOps]]
  }
  
  inline def JsonLogicDifference[AddOps /* <: AdditionalOperation */](_dash: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): typings.jsonLogicJs.mod.JsonLogicDifference[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("-")(_dash.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicDifference[AddOps]]
  }
  
  inline def JsonLogicDoubleNegation(ExclamationmarkExclamationmark: Any): typings.jsonLogicJs.mod.JsonLogicDoubleNegation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!!")(ExclamationmarkExclamationmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicDoubleNegation]
  }
  
  inline def JsonLogicEqual(EqualssignEqualssign: js.Tuple2[Any, Any]): typings.jsonLogicJs.mod.JsonLogicEqual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("==")(EqualssignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicEqual]
  }
  
  inline def JsonLogicFilter[AddOps /* <: AdditionalOperation */](filter: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicFilter[AddOps] = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicFilter[AddOps]]
  }
  
  inline def JsonLogicGreaterThan[AddOps /* <: AdditionalOperation */](Greaterthansign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicGreaterThan[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(">")(Greaterthansign.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicGreaterThan[AddOps]]
  }
  
  inline def JsonLogicGreaterThanOrEqual[AddOps /* <: AdditionalOperation */](GreaterthansignEqualssign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicGreaterThanOrEqual[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(">=")(GreaterthansignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicGreaterThanOrEqual[AddOps]]
  }
  
  inline def JsonLogicIf(`if`: AnyArrayOfOddLengthMin3): typings.jsonLogicJs.mod.JsonLogicIf = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicIf]
  }
  
  inline def JsonLogicInArray[AddOps /* <: AdditionalOperation */](inArray: js.Tuple2[RulesLogic[AddOps], js.Array[RulesLogic[AddOps]]]): typings.jsonLogicJs.mod.JsonLogicInArray[AddOps] = {
    val __obj = js.Dynamic.literal(inArray = inArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicInArray[AddOps]]
  }
  
  inline def JsonLogicInString[AddOps /* <: AdditionalOperation */](inString: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicInString[AddOps] = {
    val __obj = js.Dynamic.literal(inString = inString.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicInString[AddOps]]
  }
  
  inline def JsonLogicLessThan[AddOps /* <: AdditionalOperation */](
    Lessthansign: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
  ): typings.jsonLogicJs.mod.JsonLogicLessThan[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("<")(Lessthansign.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicLessThan[AddOps]]
  }
  
  inline def JsonLogicLessThanOrEqual[AddOps /* <: AdditionalOperation */](
    LessthansignEqualssign: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
  ): typings.jsonLogicJs.mod.JsonLogicLessThanOrEqual[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("<=")(LessthansignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicLessThanOrEqual[AddOps]]
  }
  
  inline def JsonLogicLog[AddOps /* <: AdditionalOperation */](log: RulesLogic[AddOps]): typings.jsonLogicJs.mod.JsonLogicLog[AddOps] = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicLog[AddOps]]
  }
  
  inline def JsonLogicMap[AddOps /* <: AdditionalOperation */](map: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicMap[AddOps] = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicMap[AddOps]]
  }
  
  inline def JsonLogicMax[AddOps /* <: AdditionalOperation */](max: js.Array[RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicMax[AddOps] = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicMax[AddOps]]
  }
  
  inline def JsonLogicMerge[AddOps /* <: AdditionalOperation */](merge: js.Array[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicMerge[AddOps] = {
    val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicMerge[AddOps]]
  }
  
  inline def JsonLogicMin[AddOps /* <: AdditionalOperation */](min: js.Array[RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicMin[AddOps] = {
    val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicMin[AddOps]]
  }
  
  inline def JsonLogicMissing[AddOps /* <: AdditionalOperation */](missing: RulesLogic[AddOps] | js.Array[Any]): typings.jsonLogicJs.mod.JsonLogicMissing[AddOps] = {
    val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicMissing[AddOps]]
  }
  
  inline def JsonLogicMissingSome[AddOps /* <: AdditionalOperation */](missing_some: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps] | js.Array[Any]]): typings.jsonLogicJs.mod.JsonLogicMissingSome[AddOps] = {
    val __obj = js.Dynamic.literal(missing_some = missing_some.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicMissingSome[AddOps]]
  }
  
  inline def JsonLogicNegation(Exclamationmark: Any): typings.jsonLogicJs.mod.JsonLogicNegation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicNegation]
  }
  
  inline def JsonLogicNone[AddOps /* <: AdditionalOperation */](none: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicNone[AddOps] = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicNone[AddOps]]
  }
  
  inline def JsonLogicNotEqual(ExclamationmarkEqualssign: js.Tuple2[Any, Any]): typings.jsonLogicJs.mod.JsonLogicNotEqual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!=")(ExclamationmarkEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicNotEqual]
  }
  
  inline def JsonLogicOr[AddOps /* <: AdditionalOperation */](or: js.Array[RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicOr[AddOps] = {
    val __obj = js.Dynamic.literal(or = or.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicOr[AddOps]]
  }
  
  inline def JsonLogicProduct[AddOps /* <: AdditionalOperation */](Asterisk: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): typings.jsonLogicJs.mod.JsonLogicProduct[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("*")(Asterisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicProduct[AddOps]]
  }
  
  inline def JsonLogicQuotient[AddOps /* <: AdditionalOperation */](Slash: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): typings.jsonLogicJs.mod.JsonLogicQuotient[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicQuotient[AddOps]]
  }
  
  inline def JsonLogicReduce[AddOps /* <: AdditionalOperation */](reduce: js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicReduce[AddOps] = {
    val __obj = js.Dynamic.literal(reduce = reduce.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicReduce[AddOps]]
  }
  
  inline def JsonLogicRemainder[AddOps /* <: AdditionalOperation */](Percentsign: js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicRemainder[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("%")(Percentsign.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicRemainder[AddOps]]
  }
  
  inline def JsonLogicSome[AddOps /* <: AdditionalOperation */](some: js.Tuple2[js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps], RulesLogic[AddOps]]): typings.jsonLogicJs.mod.JsonLogicSome[AddOps] = {
    val __obj = js.Dynamic.literal(some = some.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicSome[AddOps]]
  }
  
  inline def JsonLogicStrictEqual(EqualssignEqualssignEqualssign: js.Tuple2[Any, Any]): typings.jsonLogicJs.mod.JsonLogicStrictEqual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("===")(EqualssignEqualssignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicStrictEqual]
  }
  
  inline def JsonLogicStrictNotEqual(ExclamationmarkEqualssignEqualssign: js.Tuple2[Any, Any]): typings.jsonLogicJs.mod.JsonLogicStrictNotEqual = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!==")(ExclamationmarkEqualssignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicStrictNotEqual]
  }
  
  inline def JsonLogicSubstr[AddOps /* <: AdditionalOperation */](
    substr: (js.Tuple2[RulesLogic[AddOps], RulesLogic[AddOps]]) | (js.Tuple3[RulesLogic[AddOps], RulesLogic[AddOps], RulesLogic[AddOps]])
  ): typings.jsonLogicJs.mod.JsonLogicSubstr[AddOps] = {
    val __obj = js.Dynamic.literal(substr = substr.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicSubstr[AddOps]]
  }
  
  inline def JsonLogicSum[AddOps /* <: AdditionalOperation */](Plussign: js.Array[RulesLogic[AddOps]] | RulesLogic[AddOps]): typings.jsonLogicJs.mod.JsonLogicSum[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("+")(Plussign.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicSum[AddOps]]
  }
  
  inline def JsonLogicVar[AddOps /* <: AdditionalOperation */](`var`: RulesLogic[AddOps] | js.Array[RulesLogic[AddOps]] | (js.Tuple2[RulesLogic[AddOps], Any])): typings.jsonLogicJs.mod.JsonLogicVar[AddOps] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.jsonLogicJs.mod.JsonLogicVar[AddOps]]
  }
}
