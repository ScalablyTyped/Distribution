package typings.jsonRulesEngine

import typings.jsonRulesEngine.jsonRulesEngineStrings.failure
import typings.jsonRulesEngine.jsonRulesEngineStrings.success
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-rules-engine", JSImport.Default)
  @js.native
  def default(rules: js.Array[RuleProperties]): Engine = js.native
  @JSImport("json-rules-engine", JSImport.Default)
  @js.native
  def default(rules: js.Array[RuleProperties], options: EngineOptions): Engine = js.native
  
  @JSImport("json-rules-engine", "Almanac")
  @js.native
  class Almanac () extends StObject {
    
    def addRuntimeFact(factId: String, value: js.Any): Unit = js.native
    
    def factValue[T](factId: String): js.Promise[T] = js.native
    def factValue[T](factId: String, params: js.UndefOr[scala.Nothing], path: String): js.Promise[T] = js.native
    def factValue[T](factId: String, params: Record[String, _]): js.Promise[T] = js.native
    def factValue[T](factId: String, params: Record[String, _], path: String): js.Promise[T] = js.native
  }
  
  @JSImport("json-rules-engine", "Engine")
  @js.native
  class Engine () extends StObject {
    def this(rules: js.Array[RuleProperties]) = this()
    def this(rules: js.UndefOr[scala.Nothing], options: EngineOptions) = this()
    def this(rules: js.Array[RuleProperties], options: EngineOptions) = this()
    
    def addFact[T](fact: Fact[T]): this.type = js.native
    def addFact[T](id: String, valueCallback: T): this.type = js.native
    def addFact[T](id: String, valueCallback: T, options: FactOptions): this.type = js.native
    def addFact[T](id: String, valueCallback: DynamicFactCallback[T]): this.type = js.native
    def addFact[T](id: String, valueCallback: DynamicFactCallback[T], options: FactOptions): this.type = js.native
    
    def addOperator(operator: Operator[_, _]): Map[String, Operator[_, _]] = js.native
    def addOperator[A, B](operatorName: String, callback: OperatorEvaluator[A, B]): Map[String, Operator[_, _]] = js.native
    
    def addRule(rule: RuleProperties): this.type = js.native
    
    def getFact[T](factId: String): Fact[T] = js.native
    
    def on(eventName: String, handler: EventHandler): this.type = js.native
    @JSName("on")
    def on_failure(eventName: failure, handler: EventHandler): this.type = js.native
    @JSName("on")
    def on_success(eventName: success, handler: EventHandler): this.type = js.native
    
    def removeFact(factOrId: String): Boolean = js.native
    def removeFact(factOrId: Fact[_]): Boolean = js.native
    
    def removeOperator(operator: String): Boolean = js.native
    def removeOperator(operator: Operator[_, _]): Boolean = js.native
    
    def removeRule(rule: Rule): Boolean = js.native
    
    def run(): js.Promise[EngineResult] = js.native
    def run(facts: Record[String, _]): js.Promise[EngineResult] = js.native
    
    def stop(): this.type = js.native
  }
  
  @JSImport("json-rules-engine", "Fact")
  @js.native
  class Fact[T] protected () extends StObject {
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
  class Operator[A, B] protected () extends StObject {
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
  class Rule protected () extends RuleProperties {
    def this(ruleProps: String) = this()
    def this(ruleProps: RuleProperties) = this()
    
    @JSName("name")
    var name_Rule: String = js.native
    
    @JSName("priority")
    var priority_Rule: Double = js.native
    
    def setConditions(conditions: TopLevelCondition): this.type = js.native
    
    def setEvent(event: Event): this.type = js.native
    
    def setPriority(priority: Double): this.type = js.native
    
    def toJSON(): String = js.native
    def toJSON[T /* <: Boolean */](stringify: T): RuleSerializable | String = js.native
  }
  
  @js.native
  trait AllConditions extends TopLevelCondition {
    
    var all: js.Array[NestedCondition] = js.native
  }
  object AllConditions {
    
    @scala.inline
    def apply(all: js.Array[NestedCondition]): AllConditions = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllConditions]
    }
    
    @scala.inline
    implicit class AllConditionsMutableBuilder[Self <: AllConditions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: js.Array[NestedCondition]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllVarargs(value: NestedCondition*): Self = StObject.set(x, "all", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AnyConditions extends TopLevelCondition {
    
    var any: js.Array[NestedCondition] = js.native
  }
  object AnyConditions {
    
    @scala.inline
    def apply(any: js.Array[NestedCondition]): AnyConditions = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnyConditions]
    }
    
    @scala.inline
    implicit class AnyConditionsMutableBuilder[Self <: AnyConditions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAny(value: js.Array[NestedCondition]): Self = StObject.set(x, "any", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyVarargs(value: NestedCondition*): Self = StObject.set(x, "any", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ConditionProperties extends NestedCondition {
    
    var fact: String = js.native
    
    var operator: String = js.native
    
    var params: js.UndefOr[Record[String, _]] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var priority: js.UndefOr[Double] = js.native
    
    var value: typings.jsonRulesEngine.anon.Fact | js.Any = js.native
  }
  object ConditionProperties {
    
    @scala.inline
    def apply(fact: String, operator: String, value: typings.jsonRulesEngine.anon.Fact | js.Any): ConditionProperties = {
      val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionProperties]
    }
    
    @scala.inline
    implicit class ConditionPropertiesMutableBuilder[Self <: ConditionProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFact(value: String): Self = StObject.set(x, "fact", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: Record[String, _]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setValue(value: typings.jsonRulesEngine.anon.Fact | js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type DynamicFactCallback[T] = js.Function2[/* params */ Record[String, js.Any], /* almanac */ Almanac, T]
  
  @js.native
  trait EngineOptions extends StObject {
    
    var allowUndefinedFacts: Boolean = js.native
  }
  object EngineOptions {
    
    @scala.inline
    def apply(allowUndefinedFacts: Boolean): EngineOptions = {
      val __obj = js.Dynamic.literal(allowUndefinedFacts = allowUndefinedFacts.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngineOptions]
    }
    
    @scala.inline
    implicit class EngineOptionsMutableBuilder[Self <: EngineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowUndefinedFacts(value: Boolean): Self = StObject.set(x, "allowUndefinedFacts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EngineResult extends StObject {
    
    var almanac: Almanac = js.native
    
    var events: js.Array[Event] = js.native
  }
  object EngineResult {
    
    @scala.inline
    def apply(almanac: Almanac, events: js.Array[Event]): EngineResult = {
      val __obj = js.Dynamic.literal(almanac = almanac.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
      __obj.asInstanceOf[EngineResult]
    }
    
    @scala.inline
    implicit class EngineResultMutableBuilder[Self <: EngineResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlmanac(value: Almanac): Self = StObject.set(x, "almanac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Event extends StObject {
    
    var params: js.UndefOr[Record[String, _]] = js.native
    
    var `type`: String = js.native
  }
  object Event {
    
    @scala.inline
    def apply(`type`: String): Event = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: Record[String, _]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type EventHandler = js.Function3[/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult, Unit]
  
  @js.native
  trait FactOptions extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.native
    
    var priority: js.UndefOr[Double] = js.native
  }
  object FactOptions {
    
    @scala.inline
    def apply(): FactOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FactOptions]
    }
    
    @scala.inline
    implicit class FactOptionsMutableBuilder[Self <: FactOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonRulesEngine.mod.ConditionProperties
    - typings.jsonRulesEngine.mod.TopLevelCondition
  */
  trait NestedCondition extends StObject
  object NestedCondition {
    
    @scala.inline
    def AllConditions(all: js.Array[NestedCondition]): typings.jsonRulesEngine.mod.AllConditions = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRulesEngine.mod.AllConditions]
    }
    
    @scala.inline
    def AnyConditions(any: js.Array[NestedCondition]): typings.jsonRulesEngine.mod.AnyConditions = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRulesEngine.mod.AnyConditions]
    }
    
    @scala.inline
    def ConditionProperties(fact: String, operator: String, value: typings.jsonRulesEngine.anon.Fact | js.Any): typings.jsonRulesEngine.mod.ConditionProperties = {
      val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRulesEngine.mod.ConditionProperties]
    }
  }
  
  type OperatorEvaluator[A, B] = js.Function2[/* factValue */ A, /* compareToValue */ B, Boolean]
  
  @js.native
  trait RuleProperties extends StObject {
    
    var conditions: TopLevelCondition = js.native
    
    var event: Event = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onFailure: js.UndefOr[EventHandler] = js.native
    
    var onSuccess: js.UndefOr[EventHandler] = js.native
    
    var priority: js.UndefOr[Double] = js.native
  }
  object RuleProperties {
    
    @scala.inline
    def apply(conditions: TopLevelCondition, event: Event): RuleProperties = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleProperties]
    }
    
    @scala.inline
    implicit class RulePropertiesMutableBuilder[Self <: RuleProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditions(value: TopLevelCondition): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnFailure(value: (/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult) => Unit): Self = StObject.set(x, "onFailure", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
      
      @scala.inline
      def setOnSuccess(value: (/* event */ Event, /* almanac */ Almanac, /* ruleResult */ RuleResult) => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  @js.native
  trait RuleResult extends StObject {
    
    var conditions: TopLevelCondition = js.native
    
    var event: js.UndefOr[Event] = js.native
    
    var name: String = js.native
    
    var priority: js.UndefOr[Double] = js.native
    
    var result: js.Any = js.native
  }
  object RuleResult {
    
    @scala.inline
    def apply(conditions: TopLevelCondition, name: String, result: js.Any): RuleResult = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleResult]
    }
    
    @scala.inline
    implicit class RuleResultMutableBuilder[Self <: RuleResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditions(value: TopLevelCondition): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setResult(value: js.Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<std.Required<json-rules-engine.json-rules-engine.RuleProperties>, 'conditions' | 'event' | 'name' | 'priority'> */
  @js.native
  trait RuleSerializable extends StObject {
    
    var conditions: TopLevelCondition = js.native
    
    var event: Event = js.native
    
    var name: String = js.native
    
    var priority: Double = js.native
  }
  object RuleSerializable {
    
    @scala.inline
    def apply(conditions: TopLevelCondition, event: Event, name: String, priority: Double): RuleSerializable = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleSerializable]
    }
    
    @scala.inline
    implicit class RuleSerializableMutableBuilder[Self <: RuleSerializable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConditions(value: TopLevelCondition): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jsonRulesEngine.mod.AllConditions
    - typings.jsonRulesEngine.mod.AnyConditions
  */
  trait TopLevelCondition extends NestedCondition
  object TopLevelCondition {
    
    @scala.inline
    def AllConditions(all: js.Array[NestedCondition]): typings.jsonRulesEngine.mod.AllConditions = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRulesEngine.mod.AllConditions]
    }
    
    @scala.inline
    def AnyConditions(any: js.Array[NestedCondition]): typings.jsonRulesEngine.mod.AnyConditions = {
      val __obj = js.Dynamic.literal(any = any.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jsonRulesEngine.mod.AnyConditions]
    }
  }
}
