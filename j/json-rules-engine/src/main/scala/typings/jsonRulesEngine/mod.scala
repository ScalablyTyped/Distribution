package typings.jsonRulesEngine

import typings.jsonRulesEngine.jsonRulesEngineStrings.failure
import typings.jsonRulesEngine.jsonRulesEngineStrings.success
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-rules-engine", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(rules: js.Array[RuleProperties]): Engine = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(rules.asInstanceOf[js.Any]).asInstanceOf[Engine]
  inline def default(rules: js.Array[RuleProperties], options: EngineOptions): Engine = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(rules.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Engine]
  
  @JSImport("json-rules-engine", "Almanac")
  @js.native
  open class Almanac () extends StObject {
    
    def addRuntimeFact(factId: String, value: Any): Unit = js.native
    
    def factValue[T](factId: String): js.Promise[T] = js.native
    def factValue[T](factId: String, params: Unit, path: String): js.Promise[T] = js.native
    def factValue[T](factId: String, params: Record[String, Any]): js.Promise[T] = js.native
    def factValue[T](factId: String, params: Record[String, Any], path: String): js.Promise[T] = js.native
  }
  
  @JSImport("json-rules-engine", "Engine")
  @js.native
  open class Engine () extends StObject {
    def this(rules: js.Array[RuleProperties]) = this()
    def this(rules: js.Array[RuleProperties], options: EngineOptions) = this()
    def this(rules: Unit, options: EngineOptions) = this()
    
    def addFact[T](fact: Fact[T]): this.type = js.native
    def addFact[T](id: String, valueCallback: T): this.type = js.native
    def addFact[T](id: String, valueCallback: T, options: FactOptions): this.type = js.native
    def addFact[T](id: String, valueCallback: DynamicFactCallback[T]): this.type = js.native
    def addFact[T](id: String, valueCallback: DynamicFactCallback[T], options: FactOptions): this.type = js.native
    
    def addOperator(operator: Operator[Any, Any]): Map[String, Operator[Any, Any]] = js.native
    def addOperator[A, B](operatorName: String, callback: OperatorEvaluator[A, B]): Map[String, Operator[Any, Any]] = js.native
    
    def addRule(rule: RuleProperties): this.type = js.native
    
    def getFact[T](factId: String): Fact[T] = js.native
    
    def on(eventName: String, handler: EventHandler): this.type = js.native
    @JSName("on")
    def on_failure(eventName: failure, handler: EventHandler): this.type = js.native
    @JSName("on")
    def on_success(eventName: success, handler: EventHandler): this.type = js.native
    
    def removeFact(factOrId: String): Boolean = js.native
    def removeFact(factOrId: Fact[Any]): Boolean = js.native
    
    def removeOperator(operator: String): Boolean = js.native
    def removeOperator(operator: Operator[Any, Any]): Boolean = js.native
    
    def removeRule(ruleOrName: String): Boolean = js.native
    def removeRule(ruleOrName: Rule): Boolean = js.native
    
    def run(): js.Promise[EngineResult] = js.native
    def run(facts: Record[String, Any]): js.Promise[EngineResult] = js.native
    
    def stop(): this.type = js.native
    
    def updateRule(rule: Rule): Unit = js.native
  }
  
  @JSImport("json-rules-engine", "Fact")
  @js.native
  open class Fact[T] protected () extends StObject {
    def this(id: String, value: T) = this()
    def this(id: String, value: DynamicFactCallback[T]) = this()
    def this(id: String, value: T, options: FactOptions) = this()
    def this(id: String, value: DynamicFactCallback[T], options: FactOptions) = this()
    
    var calculationMethod: js.UndefOr[DynamicFactCallback[T]] = js.native
    
    var id: String = js.native
    
    var options: FactOptions = js.native
    
    var priority: Double = js.native
    
    var value: js.UndefOr[T] = js.native
  }
  
  @JSImport("json-rules-engine", "Operator")
  @js.native
  open class Operator[A, B] protected () extends StObject {
    def this(name: String, evaluator: OperatorEvaluator[A, B]) = this()
    def this(
      name: String,
      evaluator: OperatorEvaluator[A, B],
      validator: js.Function1[/* factValue */ A, Boolean]
    ) = this()
    
    var name: String = js.native
  }
  
  @JSImport("json-rules-engine", "Rule")
  @js.native
  open class Rule protected ()
    extends StObject
       with RuleProperties {
    def this(ruleProps: String) = this()
    def this(ruleProps: RuleProperties) = this()
    
    /* CompleteClass */
    var conditions: TopLevelCondition = js.native
    
    /* CompleteClass */
    var event: Event = js.native
    
    @JSName("name")
    var name_Rule: String = js.native
    
    @JSName("priority")
    var priority_Rule: Double = js.native
    
    def setConditions(conditions: TopLevelCondition): this.type = js.native
    
    def setEvent(event: Event): this.type = js.native
    
    def setPriority(priority: Double): this.type = js.native
    
    def toJSON(): String = js.native
    def toJSON[T /* <: Boolean */](stringify: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? string : json-rules-engine.json-rules-engine.RuleSerializable */ js.Any = js.native
  }
  
  trait AllConditions
    extends StObject
       with TopLevelCondition {
    
    var all: js.Array[NestedCondition]
  }
  object AllConditions {
    
    inline def apply(all: js.Array[NestedCondition]): AllConditions = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllConditions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllConditions] (val x: Self) extends AnyVal {
      
      inline def setAll(value: js.Array[NestedCondition]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllVarargs(value: NestedCondition*): Self = StObject.set(x, "all", js.Array(value*))
    }
  }
  
  trait AnyConditions
    extends StObject
       with TopLevelCondition {
    
    var any: js.Array[NestedCondition]
  }
  object AnyConditions {
    
    inline def apply(any: js.Array[NestedCondition]): AnyConditions = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnyConditions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnyConditions] (val x: Self) extends AnyVal {
      
      inline def setAny(value: js.Array[NestedCondition]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      inline def setAnyVarargs(value: NestedCondition*): Self = StObject.set(x, "any", js.Array(value*))
    }
  }
  
  trait ConditionProperties
    extends StObject
       with NestedCondition {
    
    var fact: String
    
    var operator: String
    
    var params: js.UndefOr[Record[String, Any]] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var value: typings.jsonRulesEngine.anon.Fact | Any
  }
  object ConditionProperties {
    
    inline def apply(fact: String, operator: String, value: typings.jsonRulesEngine.anon.Fact | Any): ConditionProperties = {
      val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConditionProperties] (val x: Self) extends AnyVal {
      
      inline def setFact(value: String): Self = StObject.set(x, "fact", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setValue(value: typings.jsonRulesEngine.anon.Fact | Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type DynamicFactCallback[T] = js.Function2[/* params */ Record[String, Any], /* almanac */ Almanac, T]
  
  trait EngineOptions extends StObject {
    
    var allowUndefinedFacts: js.UndefOr[Boolean] = js.undefined
    
    var pathResolver: js.UndefOr[PathResolver] = js.undefined
  }
  object EngineOptions {
    
    inline def apply(): EngineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EngineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EngineOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowUndefinedFacts(value: Boolean): Self = StObject.set(x, "allowUndefinedFacts", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefinedFactsUndefined: Self = StObject.set(x, "allowUndefinedFacts", js.undefined)
      
      inline def setPathResolver(value: (/* value */ js.Object, /* path */ String) => Any): Self = StObject.set(x, "pathResolver", js.Any.fromFunction2(value))
      
      inline def setPathResolverUndefined: Self = StObject.set(x, "pathResolver", js.undefined)
    }
  }
  
  trait EngineResult extends StObject {
    
    var almanac: Almanac
    
    var events: js.Array[Event]
    
    var failureEvents: js.Array[Event]
    
    var failureResults: js.Array[RuleResult]
    
    var results: js.Array[RuleResult]
  }
  object EngineResult {
    
    inline def apply(
      almanac: Almanac,
      events: js.Array[Event],
      failureEvents: js.Array[Event],
      failureResults: js.Array[RuleResult],
      results: js.Array[RuleResult]
    ): EngineResult = {
      val __obj = js.Dynamic.literal(almanac = almanac.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], failureEvents = failureEvents.asInstanceOf[js.Any], failureResults = failureResults.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngineResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EngineResult] (val x: Self) extends AnyVal {
      
      inline def setAlmanac(value: Almanac): Self = StObject.set(x, "almanac", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
      
      inline def setFailureEvents(value: js.Array[Event]): Self = StObject.set(x, "failureEvents", value.asInstanceOf[js.Any])
      
      inline def setFailureEventsVarargs(value: Event*): Self = StObject.set(x, "failureEvents", js.Array(value*))
      
      inline def setFailureResults(value: js.Array[RuleResult]): Self = StObject.set(x, "failureResults", value.asInstanceOf[js.Any])
      
      inline def setFailureResultsVarargs(value: RuleResult*): Self = StObject.set(x, "failureResults", js.Array(value*))
      
      inline def setResults(value: js.Array[RuleResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsVarargs(value: RuleResult*): Self = StObject.set(x, "results", js.Array(value*))
    }
  }
  
  trait Event extends StObject {
    
    var params: js.UndefOr[Record[String, Any]] = js.undefined
    
    var `type`: String
  }
  object Event {
    
    inline def apply(`type`: String): Event = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type EventHandler = js.Function3[/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult, Unit]
  
  trait FactOptions extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object FactOptions {
    
    inline def apply(): FactOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FactOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FactOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonRulesEngine.mod.ConditionProperties
    - typings.jsonRulesEngine.mod.TopLevelCondition
  */
  trait NestedCondition extends StObject
  object NestedCondition {
    
    inline def AllConditions(all: js.Array[NestedCondition]): typings.jsonRulesEngine.mod.AllConditions = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRulesEngine.mod.AllConditions]
    }
    
    inline def AnyConditions(any: js.Array[NestedCondition]): typings.jsonRulesEngine.mod.AnyConditions = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRulesEngine.mod.AnyConditions]
    }
    
    inline def ConditionProperties(fact: String, operator: String, value: typings.jsonRulesEngine.anon.Fact | Any): typings.jsonRulesEngine.mod.ConditionProperties = {
      val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRulesEngine.mod.ConditionProperties]
    }
  }
  
  type OperatorEvaluator[A, B] = js.Function2[/* factValue */ A, /* compareToValue */ B, Boolean]
  
  type PathResolver = js.Function2[/* value */ js.Object, /* path */ String, Any]
  
  trait RuleProperties extends StObject {
    
    var conditions: TopLevelCondition
    
    var event: Event
    
    var name: js.UndefOr[String] = js.undefined
    
    var onFailure: js.UndefOr[EventHandler] = js.undefined
    
    var onSuccess: js.UndefOr[EventHandler] = js.undefined
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object RuleProperties {
    
    inline def apply(conditions: TopLevelCondition, event: Event): RuleProperties = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleProperties] (val x: Self) extends AnyVal {
      
      inline def setConditions(value: TopLevelCondition): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnFailure(value: (/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult) => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction3(value))
      
      inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
      
      inline def setOnSuccess(value: (/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  trait RuleResult extends StObject {
    
    var conditions: TopLevelCondition
    
    var event: js.UndefOr[Event] = js.undefined
    
    var name: String
    
    var priority: js.UndefOr[Double] = js.undefined
    
    var result: Any
  }
  object RuleResult {
    
    inline def apply(conditions: TopLevelCondition, name: String, result: Any): RuleResult = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleResult] (val x: Self) extends AnyVal {
      
      inline def setConditions(value: TopLevelCondition): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.Required<json-rules-engine.json-rules-engine.RuleProperties>, 'conditions' | 'event' | 'name' | 'priority'> */
  trait RuleSerializable extends StObject {
    
    var conditions: TopLevelCondition
    
    var event: Event
    
    var name: String
    
    var priority: Double
  }
  object RuleSerializable {
    
    inline def apply(conditions: TopLevelCondition, event: Event, name: String, priority: Double): RuleSerializable = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleSerializable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleSerializable] (val x: Self) extends AnyVal {
      
      inline def setConditions(value: TopLevelCondition): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonRulesEngine.mod.AllConditions
    - typings.jsonRulesEngine.mod.AnyConditions
  */
  trait TopLevelCondition
    extends StObject
       with NestedCondition
  object TopLevelCondition {
    
    inline def AllConditions(all: js.Array[NestedCondition]): typings.jsonRulesEngine.mod.AllConditions = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRulesEngine.mod.AllConditions]
    }
    
    inline def AnyConditions(any: js.Array[NestedCondition]): typings.jsonRulesEngine.mod.AnyConditions = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRulesEngine.mod.AnyConditions]
    }
  }
}
