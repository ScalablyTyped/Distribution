package typings.jsonLogicJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-logic-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def apply(logic: RulesLogic): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(logic.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def apply(logic: RulesLogic, data: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(logic.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - java.lang.String
    - scala.Double
    - typings.jsonLogicJs.anon.Var
    - typings.jsonLogicJs.anon.Missing
    - typings.jsonLogicJs.anon.Missingsome
    - typings.jsonLogicJs.anon.If
    - typings.jsonLogicJs.anon._empty
    - typings.jsonLogicJs.anon.`0`
    - typings.jsonLogicJs.anon.`1`
    - typings.jsonLogicJs.anon.`2`
    - typings.jsonLogicJs.anon.Any
    - typings.jsonLogicJs.anon.`3`
    - typings.jsonLogicJs.anon.Or
    - typings.jsonLogicJs.anon.And
    - typings.jsonLogicJs.anon.`4`
    - typings.jsonLogicJs.anon.`5`
    - typings.jsonLogicJs.anon.`6`
    - typings.jsonLogicJs.anon.`7`
    - typings.jsonLogicJs.anon.Max
    - typings.jsonLogicJs.anon.Min
    - typings.jsonLogicJs.anon.`8`
    - typings.jsonLogicJs.anon.`9`
    - typings.jsonLogicJs.anon.`10`
    - typings.jsonLogicJs.anon.`11`
    - typings.jsonLogicJs.anon.`12`
    - typings.jsonLogicJs.anon.Map
    - typings.jsonLogicJs.anon.Filter
    - typings.jsonLogicJs.anon.Reduce
    - typings.jsonLogicJs.anon.All
    - typings.jsonLogicJs.anon.None
    - typings.jsonLogicJs.anon.Some
    - typings.jsonLogicJs.anon.Merge
    - typings.jsonLogicJs.anon.In
    - typings.jsonLogicJs.anon.`13`
    - typings.jsonLogicJs.anon.Cat
    - typings.jsonLogicJs.anon.Substr
    - typings.jsonLogicJs.anon.Log
  */
  type RulesLogic = _RulesLogic | Boolean | String | Double
  
  trait _RulesLogic extends StObject
  object _RulesLogic {
    
    @scala.inline
    def `0`(EqualssignEqualssignEqualssign: js.Tuple2[js.Any, js.Any]): typings.jsonLogicJs.anon.`0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("===")(EqualssignEqualssignEqualssign.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`0`]
    }
    
    @scala.inline
    def `1`(ExclamationmarkEqualssign: js.Tuple2[js.Any, js.Any]): typings.jsonLogicJs.anon.`1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("!=")(ExclamationmarkEqualssign.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`1`]
    }
    
    @scala.inline
    def `10`(
      Asterisk: (js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]) | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object)
    ): typings.jsonLogicJs.anon.`10` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("*")(Asterisk.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`10`]
    }
    
    @scala.inline
    def `11`(
      Slash: (js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]) | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object)
    ): typings.jsonLogicJs.anon.`11` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`11`]
    }
    
    @scala.inline
    def `12`(
      Percentsign: js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.`12` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("%")(Percentsign.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`12`]
    }
    
    @scala.inline
    def `13`(
      in: js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.`13` = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`13`]
    }
    
    @scala.inline
    def `2`(ExclamationmarkEqualssignEqualssign: js.Tuple2[js.Any, js.Any]): typings.jsonLogicJs.anon.`2` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("!==")(ExclamationmarkEqualssignEqualssign.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`2`]
    }
    
    @scala.inline
    def `3`(ExclamationmarkExclamationmark: js.Any): typings.jsonLogicJs.anon.`3` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("!!")(ExclamationmarkExclamationmark.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`3`]
    }
    
    @scala.inline
    def `4`(
      Greaterthansign: js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.`4` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(">")(Greaterthansign.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`4`]
    }
    
    @scala.inline
    def `5`(
      GreaterthansignEqualssign: js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.`5` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic(">=")(GreaterthansignEqualssign.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`5`]
    }
    
    @scala.inline
    def `6`(
      Lessthansign: (js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]) | (js.Tuple3[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ])
    ): typings.jsonLogicJs.anon.`6` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("<")(Lessthansign.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`6`]
    }
    
    @scala.inline
    def `7`(
      LessthansignEqualssign: (js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]) | (js.Tuple3[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ])
    ): typings.jsonLogicJs.anon.`7` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("<=")(LessthansignEqualssign.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`7`]
    }
    
    @scala.inline
    def `8`(
      Plussign: (js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]) | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object)
    ): typings.jsonLogicJs.anon.`8` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("+")(Plussign.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`8`]
    }
    
    @scala.inline
    def `9`(
      _dash: (js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]) | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object)
    ): typings.jsonLogicJs.anon.`9` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("-")(_dash.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.`9`]
    }
    
    @scala.inline
    def All(
      all: js.Tuple2[
          (js.Array[
            /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
          ]) | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object), 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.All = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.All]
    }
    
    @scala.inline
    def And(
      and: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.And = {
      val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.And]
    }
    
    @scala.inline
    def Any(Exclamationmark: js.Any): typings.jsonLogicJs.anon.Any = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("!")(Exclamationmark.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Any]
    }
    
    @scala.inline
    def Cat(
      cat: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.Cat = {
      val __obj = js.Dynamic.literal(cat = cat.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Cat]
    }
    
    @scala.inline
    def Filter(
      filter: js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.Filter = {
      val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Filter]
    }
    
    @scala.inline
    def If(`if`: Array[js.Any]): typings.jsonLogicJs.anon.If = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.If]
    }
    
    @scala.inline
    def In(
      in: js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          js.Array[
            /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
          ]
        ]
    ): typings.jsonLogicJs.anon.In = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.In]
    }
    
    @scala.inline
    def Log(
      log: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
    ): typings.jsonLogicJs.anon.Log = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Log]
    }
    
    @scala.inline
    def Map(
      map: js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.Map = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Map]
    }
    
    @scala.inline
    def Max(
      max: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Max]
    }
    
    @scala.inline
    def Merge(
      merge: js.Array[
          (js.Array[
            /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
          ]) | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object)
        ]
    ): typings.jsonLogicJs.anon.Merge = {
      val __obj = js.Dynamic.literal(merge = merge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Merge]
    }
    
    @scala.inline
    def Min(
      min: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.Min = {
      val __obj = js.Dynamic.literal(min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Min]
    }
    
    @scala.inline
    def Missing(
      missing: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | js.Array[js.Any]
    ): typings.jsonLogicJs.anon.Missing = {
      val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Missing]
    }
    
    @scala.inline
    def Missingsome(
      missing_some: js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | js.Array[js.Any]
        ]
    ): typings.jsonLogicJs.anon.Missingsome = {
      val __obj = js.Dynamic.literal(missing_some = missing_some.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Missingsome]
    }
    
    @scala.inline
    def None(
      none: js.Tuple2[
          (js.Array[
            /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
          ]) | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object), 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.None = {
      val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.None]
    }
    
    @scala.inline
    def Or(
      or: js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.Or = {
      val __obj = js.Dynamic.literal(or = or.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Or]
    }
    
    @scala.inline
    def Reduce(
      reduce: js.Tuple3[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.Reduce = {
      val __obj = js.Dynamic.literal(reduce = reduce.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Reduce]
    }
    
    @scala.inline
    def Some(
      some: js.Tuple2[
          (js.Array[
            /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
          ]) | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object), 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]
    ): typings.jsonLogicJs.anon.Some = {
      val __obj = js.Dynamic.literal(some = some.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Some]
    }
    
    @scala.inline
    def Substr(
      substr: (js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]) | (js.Tuple3[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ])
    ): typings.jsonLogicJs.anon.Substr = {
      val __obj = js.Dynamic.literal(substr = substr.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Substr]
    }
    
    @scala.inline
    def Var(
      `var`: (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object) | (js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object
        ]) | (js.Tuple2[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias json-logic-js.json-logic-js.RulesLogic */ js.Object, 
          js.Any
        ])
    ): typings.jsonLogicJs.anon.Var = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("var")(`var`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon.Var]
    }
    
    @scala.inline
    def _empty(EqualssignEqualssign: js.Tuple2[js.Any, js.Any]): typings.jsonLogicJs.anon._empty = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("==")(EqualssignEqualssign.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonLogicJs.anon._empty]
    }
  }
}
