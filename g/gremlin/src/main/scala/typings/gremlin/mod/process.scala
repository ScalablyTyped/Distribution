package typings.gremlin.mod

import typings.gremlin.mod.driver.RemoteConnection
import typings.gremlin.mod.structure.Graph
import typings.std.AsyncIterableIterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object process {
  
  trait AnonymousTraversalSource[S /* <: GraphTraversalSource[GraphTraversal] */] extends StObject {
    
    def withGraph(graph: Graph): S
    
    def withRemote(remoteConnection: RemoteConnection): S
  }
  object AnonymousTraversalSource {
    
    inline def apply[S /* <: GraphTraversalSource[GraphTraversal] */](withGraph: Graph => S, withRemote: RemoteConnection => S): AnonymousTraversalSource[S] = {
      val __obj = js.Dynamic.literal(withGraph = js.Any.fromFunction1(withGraph), withRemote = js.Any.fromFunction1(withRemote))
      __obj.asInstanceOf[AnonymousTraversalSource[S]]
    }
    
    extension [Self <: AnonymousTraversalSource[?], S /* <: GraphTraversalSource[GraphTraversal] */](x: Self & AnonymousTraversalSource[S]) {
      
      inline def setWithGraph(value: Graph => S): Self = StObject.set(x, "withGraph", js.Any.fromFunction1(value))
      
      inline def setWithRemote(value: RemoteConnection => S): Self = StObject.set(x, "withRemote", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Bytecode extends StObject {
    
    def addSource(name: String): Bytecode = js.native
    def addSource(name: String, values: js.Array[Any]): Bytecode = js.native
    
    def addStep(name: String): Bytecode = js.native
    def addStep(name: String, values: js.Array[Any]): Bytecode = js.native
  }
  
  trait EnumValue extends StObject
  
  @js.native
  trait GraphTraversal
    extends StObject
       with Traversal {
    
    def V(args: Any*): this.type = js.native
    
    def addE(args: Any*): this.type = js.native
    
    def addV(args: Any*): this.type = js.native
    
    def aggregate(args: Any*): this.type = js.native
    
    def and(args: Any*): this.type = js.native
    
    def as(args: Any*): this.type = js.native
    
    def barrier(args: Any*): this.type = js.native
    
    def both(args: Any*): this.type = js.native
    
    def bothE(args: Any*): this.type = js.native
    
    def bothV(args: Any*): this.type = js.native
    
    def branch(args: Any*): this.type = js.native
    
    def by(args: Any*): this.type = js.native
    
    def call(args: Any*): this.type = js.native
    
    def cap(args: Any*): this.type = js.native
    
    def choose(args: Any*): this.type = js.native
    
    def coalesce(args: Any*): this.type = js.native
    
    def coin(args: Any*): this.type = js.native
    
    def connectedComponent(args: Any*): this.type = js.native
    
    def constant(args: Any*): this.type = js.native
    
    def count(args: Any*): this.type = js.native
    
    def cyclicPath(args: Any*): this.type = js.native
    
    def dedup(args: Any*): this.type = js.native
    
    def drop(args: Any*): this.type = js.native
    
    def element(args: Any*): this.type = js.native
    
    def elementMap(args: Any*): this.type = js.native
    
    def emit(args: Any*): this.type = js.native
    
    def fail(args: Any*): this.type = js.native
    
    def filter(args: Any*): this.type = js.native
    
    def flatMap(args: Any*): this.type = js.native
    
    def fold(args: Any*): this.type = js.native
    
    def from_(args: Any*): this.type = js.native
    
    def group(args: Any*): this.type = js.native
    
    def groupCount(args: Any*): this.type = js.native
    
    def has(args: Any*): this.type = js.native
    
    def hasId(args: Any*): this.type = js.native
    
    def hasKey(args: Any*): this.type = js.native
    
    def hasLabel(args: Any*): this.type = js.native
    
    def hasNot(args: Any*): this.type = js.native
    
    def hasValue(args: Any*): this.type = js.native
    
    def id(args: Any*): this.type = js.native
    
    def identity(args: Any*): this.type = js.native
    
    def inE(args: Any*): this.type = js.native
    
    def inV(args: Any*): this.type = js.native
    
    def in_(args: Any*): this.type = js.native
    
    def index(args: Any*): this.type = js.native
    
    def inject(args: Any*): this.type = js.native
    
    def is(args: Any*): this.type = js.native
    
    def key(args: Any*): this.type = js.native
    
    def label(args: Any*): this.type = js.native
    
    def limit(args: Any*): this.type = js.native
    
    def local(args: Any*): this.type = js.native
    
    def loops(args: Any*): this.type = js.native
    
    def map(args: Any*): this.type = js.native
    
    def `match`(args: Any*): this.type = js.native
    
    def math(args: Any*): this.type = js.native
    
    def max(args: Any*): this.type = js.native
    
    def mean(args: Any*): this.type = js.native
    
    def mergeE(args: Any*): this.type = js.native
    
    def mergeV(args: Any*): this.type = js.native
    
    def min(args: Any*): this.type = js.native
    
    def none(args: Any*): this.type = js.native
    
    def not(args: Any*): this.type = js.native
    
    def option(args: Any*): this.type = js.native
    
    def optional(args: Any*): this.type = js.native
    
    def or(args: Any*): this.type = js.native
    
    def order(args: Any*): this.type = js.native
    
    def otherV(args: Any*): this.type = js.native
    
    def out(args: Any*): this.type = js.native
    
    def outE(args: Any*): this.type = js.native
    
    def outV(args: Any*): this.type = js.native
    
    def pageRank(args: Any*): this.type = js.native
    
    def path(args: Any*): this.type = js.native
    
    def peerPressure(args: Any*): this.type = js.native
    
    def profile(args: Any*): this.type = js.native
    
    def program(args: Any*): this.type = js.native
    
    def project(args: Any*): this.type = js.native
    
    def properties(args: Any*): this.type = js.native
    
    def property(args: Any*): this.type = js.native
    
    def propertyMap(args: Any*): this.type = js.native
    
    def range(args: Any*): this.type = js.native
    
    def read(args: Any*): this.type = js.native
    
    def repeat(args: Any*): this.type = js.native
    
    def sack(args: Any*): this.type = js.native
    
    def sample(args: Any*): this.type = js.native
    
    def select(args: Any*): this.type = js.native
    
    def shortestPath(args: Any*): this.type = js.native
    
    def sideEffect(args: Any*): this.type = js.native
    
    def simplePath(args: Any*): this.type = js.native
    
    def skip(args: Any*): this.type = js.native
    
    def store(args: Any*): this.type = js.native
    
    def subgraph(args: Any*): this.type = js.native
    
    def sum(args: Any*): this.type = js.native
    
    def tail(args: Any*): this.type = js.native
    
    def timeLimit(args: Any*): this.type = js.native
    
    def times(args: Any*): this.type = js.native
    
    def to(args: Any*): this.type = js.native
    
    def toE(args: Any*): this.type = js.native
    
    def toV(args: Any*): this.type = js.native
    
    def tree(args: Any*): this.type = js.native
    
    def unfold(args: Any*): this.type = js.native
    
    def union(args: Any*): this.type = js.native
    
    def until(args: Any*): this.type = js.native
    
    def value(args: Any*): this.type = js.native
    
    def valueMap(args: Any*): this.type = js.native
    
    def values(args: Any*): this.type = js.native
    
    def where(args: Any*): this.type = js.native
    
    def with_(args: Any*): this.type = js.native
    
    def write(args: Any*): this.type = js.native
  }
  
  trait GraphTraversalSource[T /* <: GraphTraversal */] extends StObject {
    
    def E(args: Any*): T
    
    def V(args: Any*): T
    
    def addE(args: Any*): T
    
    def addV(args: Any*): T
    
    def inject(args: Any*): T
    
    def io(args: Any*): T
    
    def mergeE(args: Any*): T
    
    def mergeV(args: Any*): T
    
    def tx(): Transaction[this.type]
    
    def withBulk(args: Any*): this.type
    
    def withPath(args: Any*): this.type
    
    def withRemote(remoteConnection: RemoteConnection): this.type
    
    def withSack(args: Any*): this.type
    
    def withSideEffect(args: Any*): this.type
    
    def withStrategies(args: Any*): this.type
    
    def with_(args: Any*): this.type
    
    def withoutStrategies(args: Any*): this.type
  }
  object GraphTraversalSource {
    
    inline def apply[T /* <: GraphTraversal */](
      E: /* repeated */ Any => T,
      V: /* repeated */ Any => T,
      addE: /* repeated */ Any => T,
      addV: /* repeated */ Any => T,
      inject: /* repeated */ Any => T,
      io: /* repeated */ Any => T,
      mergeE: /* repeated */ Any => T,
      mergeV: /* repeated */ Any => T,
      tx: () => Transaction[GraphTraversalSource[T]],
      withBulk: /* repeated */ Any => GraphTraversalSource[T],
      withPath: /* repeated */ Any => GraphTraversalSource[T],
      withRemote: RemoteConnection => GraphTraversalSource[T],
      withSack: /* repeated */ Any => GraphTraversalSource[T],
      withSideEffect: /* repeated */ Any => GraphTraversalSource[T],
      withStrategies: /* repeated */ Any => GraphTraversalSource[T],
      with_ : /* repeated */ Any => GraphTraversalSource[T],
      withoutStrategies: /* repeated */ Any => GraphTraversalSource[T]
    ): GraphTraversalSource[T] = {
      val __obj = js.Dynamic.literal(E = js.Any.fromFunction1(E), V = js.Any.fromFunction1(V), addE = js.Any.fromFunction1(addE), addV = js.Any.fromFunction1(addV), inject = js.Any.fromFunction1(inject), io = js.Any.fromFunction1(io), mergeE = js.Any.fromFunction1(mergeE), mergeV = js.Any.fromFunction1(mergeV), tx = js.Any.fromFunction0(tx), withBulk = js.Any.fromFunction1(withBulk), withPath = js.Any.fromFunction1(withPath), withRemote = js.Any.fromFunction1(withRemote), withSack = js.Any.fromFunction1(withSack), withSideEffect = js.Any.fromFunction1(withSideEffect), withStrategies = js.Any.fromFunction1(withStrategies), with_ = js.Any.fromFunction1(with_), withoutStrategies = js.Any.fromFunction1(withoutStrategies))
      __obj.asInstanceOf[GraphTraversalSource[T]]
    }
    
    extension [Self <: GraphTraversalSource[?], T /* <: GraphTraversal */](x: Self & GraphTraversalSource[T]) {
      
      inline def setAddE(value: /* repeated */ Any => T): Self = StObject.set(x, "addE", js.Any.fromFunction1(value))
      
      inline def setAddV(value: /* repeated */ Any => T): Self = StObject.set(x, "addV", js.Any.fromFunction1(value))
      
      inline def setE(value: /* repeated */ Any => T): Self = StObject.set(x, "E", js.Any.fromFunction1(value))
      
      inline def setInject(value: /* repeated */ Any => T): Self = StObject.set(x, "inject", js.Any.fromFunction1(value))
      
      inline def setIo(value: /* repeated */ Any => T): Self = StObject.set(x, "io", js.Any.fromFunction1(value))
      
      inline def setMergeE(value: /* repeated */ Any => T): Self = StObject.set(x, "mergeE", js.Any.fromFunction1(value))
      
      inline def setMergeV(value: /* repeated */ Any => T): Self = StObject.set(x, "mergeV", js.Any.fromFunction1(value))
      
      inline def setTx(value: () => Transaction[GraphTraversalSource[T]]): Self = StObject.set(x, "tx", js.Any.fromFunction0(value))
      
      inline def setV(value: /* repeated */ Any => T): Self = StObject.set(x, "V", js.Any.fromFunction1(value))
      
      inline def setWithBulk(value: /* repeated */ Any => GraphTraversalSource[T]): Self = StObject.set(x, "withBulk", js.Any.fromFunction1(value))
      
      inline def setWithPath(value: /* repeated */ Any => GraphTraversalSource[T]): Self = StObject.set(x, "withPath", js.Any.fromFunction1(value))
      
      inline def setWithRemote(value: RemoteConnection => GraphTraversalSource[T]): Self = StObject.set(x, "withRemote", js.Any.fromFunction1(value))
      
      inline def setWithSack(value: /* repeated */ Any => GraphTraversalSource[T]): Self = StObject.set(x, "withSack", js.Any.fromFunction1(value))
      
      inline def setWithSideEffect(value: /* repeated */ Any => GraphTraversalSource[T]): Self = StObject.set(x, "withSideEffect", js.Any.fromFunction1(value))
      
      inline def setWithStrategies(value: /* repeated */ Any => GraphTraversalSource[T]): Self = StObject.set(x, "withStrategies", js.Any.fromFunction1(value))
      
      inline def setWith_(value: /* repeated */ Any => GraphTraversalSource[T]): Self = StObject.set(x, "with_", js.Any.fromFunction1(value))
      
      inline def setWithoutStrategies(value: /* repeated */ Any => GraphTraversalSource[T]): Self = StObject.set(x, "withoutStrategies", js.Any.fromFunction1(value))
    }
  }
  
  trait Operator extends StObject {
    
    var addAll: EnumValue
    
    var and: EnumValue
    
    var assign: EnumValue
    
    var div: EnumValue
    
    var max: EnumValue
    
    var min: EnumValue
    
    var minus: EnumValue
    
    var mult: EnumValue
    
    var or: EnumValue
    
    var sum: EnumValue
    
    var sumLong: EnumValue
  }
  object Operator {
    
    inline def apply(
      addAll: EnumValue,
      and: EnumValue,
      assign: EnumValue,
      div: EnumValue,
      max: EnumValue,
      min: EnumValue,
      minus: EnumValue,
      mult: EnumValue,
      or: EnumValue,
      sum: EnumValue,
      sumLong: EnumValue
    ): Operator = {
      val __obj = js.Dynamic.literal(addAll = addAll.asInstanceOf[js.Any], and = and.asInstanceOf[js.Any], assign = assign.asInstanceOf[js.Any], div = div.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minus = minus.asInstanceOf[js.Any], mult = mult.asInstanceOf[js.Any], or = or.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any], sumLong = sumLong.asInstanceOf[js.Any])
      __obj.asInstanceOf[Operator]
    }
    
    extension [Self <: Operator](x: Self) {
      
      inline def setAddAll(value: EnumValue): Self = StObject.set(x, "addAll", value.asInstanceOf[js.Any])
      
      inline def setAnd(value: EnumValue): Self = StObject.set(x, "and", value.asInstanceOf[js.Any])
      
      inline def setAssign(value: EnumValue): Self = StObject.set(x, "assign", value.asInstanceOf[js.Any])
      
      inline def setDiv(value: EnumValue): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setMax(value: EnumValue): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: EnumValue): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinus(value: EnumValue): Self = StObject.set(x, "minus", value.asInstanceOf[js.Any])
      
      inline def setMult(value: EnumValue): Self = StObject.set(x, "mult", value.asInstanceOf[js.Any])
      
      inline def setOr(value: EnumValue): Self = StObject.set(x, "or", value.asInstanceOf[js.Any])
      
      inline def setSum(value: EnumValue): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
      
      inline def setSumLong(value: EnumValue): Self = StObject.set(x, "sumLong", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait P extends StObject {
    
    def and(): P = js.native
    def and(arg: Any): P = js.native
    
    def or(): P = js.native
    def or(arg: Any): P = js.native
  }
  
  trait Statics[T /* <: GraphTraversal */] extends StObject {
    
    def V(args: Any*): T
    
    def addE(args: Any*): T
    
    def addV(args: Any*): T
    
    def aggregate(args: Any*): T
    
    def and(args: Any*): T
    
    def as(args: Any*): T
    
    def barrier(args: Any*): T
    
    def both(args: Any*): T
    
    def bothE(args: Any*): T
    
    def bothV(args: Any*): T
    
    def branch(args: Any*): T
    
    def call(args: Any*): T
    
    def cap(args: Any*): T
    
    def choose(args: Any*): T
    
    def coalesce(args: Any*): T
    
    def coin(args: Any*): T
    
    def constant(args: Any*): T
    
    def count(args: Any*): T
    
    def cyclicPath(args: Any*): T
    
    def dedup(args: Any*): T
    
    def drop(args: Any*): T
    
    def elementMap(args: Any*): T
    
    def emit(args: Any*): T
    
    def fail(args: Any*): T
    
    def filter(args: Any*): T
    
    def flatMap(args: Any*): T
    
    def fold(args: Any*): T
    
    def group(args: Any*): T
    
    def groupCount(args: Any*): T
    
    def has(args: Any*): T
    
    def hasId(args: Any*): T
    
    def hasKey(args: Any*): T
    
    def hasLabel(args: Any*): T
    
    def hasNot(args: Any*): T
    
    def hasValue(args: Any*): T
    
    def id(args: Any*): T
    
    def identity(args: Any*): T
    
    def inE(args: Any*): T
    
    def inV(args: Any*): T
    
    def in_(args: Any*): T
    
    def index(args: Any*): T
    
    def inject(args: Any*): T
    
    def is(args: Any*): T
    
    def key(args: Any*): T
    
    def label(args: Any*): T
    
    def limit(args: Any*): T
    
    def local(args: Any*): T
    
    def loops(args: Any*): T
    
    def map(args: Any*): T
    
    def `match`(args: Any*): T
    
    def math(args: Any*): T
    
    def max(args: Any*): T
    
    def mean(args: Any*): T
    
    def mergeE(args: Any*): T
    
    def mergeV(args: Any*): T
    
    def min(args: Any*): T
    
    def not(args: Any*): T
    
    def optional(args: Any*): T
    
    def or(args: Any*): T
    
    def order(args: Any*): T
    
    def otherV(args: Any*): T
    
    def out(args: Any*): T
    
    def outE(args: Any*): T
    
    def outV(args: Any*): T
    
    def path(args: Any*): T
    
    def project(args: Any*): T
    
    def properties(args: Any*): T
    
    def property(args: Any*): T
    
    def propertyMap(args: Any*): T
    
    def range(args: Any*): T
    
    def repeat(args: Any*): T
    
    def sack(args: Any*): T
    
    def sample(args: Any*): T
    
    def select(args: Any*): T
    
    def sideEffect(args: Any*): T
    
    def simplePath(args: Any*): T
    
    def skip(args: Any*): T
    
    def store(args: Any*): T
    
    def subgraph(args: Any*): T
    
    def sum(args: Any*): T
    
    def tail(args: Any*): T
    
    def timeLimit(args: Any*): T
    
    def times(args: Any*): T
    
    def to(args: Any*): T
    
    def toE(args: Any*): T
    
    def toV(args: Any*): T
    
    def tree(args: Any*): T
    
    def unfold(args: Any*): T
    
    def union(args: Any*): T
    
    def until(args: Any*): T
    
    def value(args: Any*): T
    
    def valueMap(args: Any*): T
    
    def values(args: Any*): T
    
    def where(args: Any*): T
  }
  object Statics {
    
    inline def apply[T /* <: GraphTraversal */](
      V: /* repeated */ Any => T,
      addE: /* repeated */ Any => T,
      addV: /* repeated */ Any => T,
      aggregate: /* repeated */ Any => T,
      and: /* repeated */ Any => T,
      as: /* repeated */ Any => T,
      barrier: /* repeated */ Any => T,
      both: /* repeated */ Any => T,
      bothE: /* repeated */ Any => T,
      bothV: /* repeated */ Any => T,
      branch: /* repeated */ Any => T,
      call: /* repeated */ Any => T,
      cap: /* repeated */ Any => T,
      choose: /* repeated */ Any => T,
      coalesce: /* repeated */ Any => T,
      coin: /* repeated */ Any => T,
      constant: /* repeated */ Any => T,
      count: /* repeated */ Any => T,
      cyclicPath: /* repeated */ Any => T,
      dedup: /* repeated */ Any => T,
      drop: /* repeated */ Any => T,
      elementMap: /* repeated */ Any => T,
      emit: /* repeated */ Any => T,
      fail: /* repeated */ Any => T,
      filter: /* repeated */ Any => T,
      flatMap: /* repeated */ Any => T,
      fold: /* repeated */ Any => T,
      group: /* repeated */ Any => T,
      groupCount: /* repeated */ Any => T,
      has: /* repeated */ Any => T,
      hasId: /* repeated */ Any => T,
      hasKey: /* repeated */ Any => T,
      hasLabel: /* repeated */ Any => T,
      hasNot: /* repeated */ Any => T,
      hasValue: /* repeated */ Any => T,
      id: /* repeated */ Any => T,
      identity: /* repeated */ Any => T,
      inE: /* repeated */ Any => T,
      inV: /* repeated */ Any => T,
      in_ : /* repeated */ Any => T,
      index: /* repeated */ Any => T,
      inject: /* repeated */ Any => T,
      is: /* repeated */ Any => T,
      key: /* repeated */ Any => T,
      label: /* repeated */ Any => T,
      limit: /* repeated */ Any => T,
      local: /* repeated */ Any => T,
      loops: /* repeated */ Any => T,
      map: /* repeated */ Any => T,
      `match`: /* repeated */ Any => T,
      math: /* repeated */ Any => T,
      max: /* repeated */ Any => T,
      mean: /* repeated */ Any => T,
      mergeE: /* repeated */ Any => T,
      mergeV: /* repeated */ Any => T,
      min: /* repeated */ Any => T,
      not: /* repeated */ Any => T,
      optional: /* repeated */ Any => T,
      or: /* repeated */ Any => T,
      order: /* repeated */ Any => T,
      otherV: /* repeated */ Any => T,
      out: /* repeated */ Any => T,
      outE: /* repeated */ Any => T,
      outV: /* repeated */ Any => T,
      path: /* repeated */ Any => T,
      project: /* repeated */ Any => T,
      properties: /* repeated */ Any => T,
      property: /* repeated */ Any => T,
      propertyMap: /* repeated */ Any => T,
      range: /* repeated */ Any => T,
      repeat: /* repeated */ Any => T,
      sack: /* repeated */ Any => T,
      sample: /* repeated */ Any => T,
      select: /* repeated */ Any => T,
      sideEffect: /* repeated */ Any => T,
      simplePath: /* repeated */ Any => T,
      skip: /* repeated */ Any => T,
      store: /* repeated */ Any => T,
      subgraph: /* repeated */ Any => T,
      sum: /* repeated */ Any => T,
      tail: /* repeated */ Any => T,
      timeLimit: /* repeated */ Any => T,
      times: /* repeated */ Any => T,
      to: /* repeated */ Any => T,
      toE: /* repeated */ Any => T,
      toV: /* repeated */ Any => T,
      tree: /* repeated */ Any => T,
      unfold: /* repeated */ Any => T,
      union: /* repeated */ Any => T,
      until: /* repeated */ Any => T,
      value: /* repeated */ Any => T,
      valueMap: /* repeated */ Any => T,
      values: /* repeated */ Any => T,
      where: /* repeated */ Any => T
    ): Statics[T] = {
      val __obj = js.Dynamic.literal(V = js.Any.fromFunction1(V), addE = js.Any.fromFunction1(addE), addV = js.Any.fromFunction1(addV), aggregate = js.Any.fromFunction1(aggregate), and = js.Any.fromFunction1(and), as = js.Any.fromFunction1(as), barrier = js.Any.fromFunction1(barrier), both = js.Any.fromFunction1(both), bothE = js.Any.fromFunction1(bothE), bothV = js.Any.fromFunction1(bothV), branch = js.Any.fromFunction1(branch), call = js.Any.fromFunction1(call), cap = js.Any.fromFunction1(cap), choose = js.Any.fromFunction1(choose), coalesce = js.Any.fromFunction1(coalesce), coin = js.Any.fromFunction1(coin), constant = js.Any.fromFunction1(constant), count = js.Any.fromFunction1(count), cyclicPath = js.Any.fromFunction1(cyclicPath), dedup = js.Any.fromFunction1(dedup), drop = js.Any.fromFunction1(drop), elementMap = js.Any.fromFunction1(elementMap), emit = js.Any.fromFunction1(emit), fail = js.Any.fromFunction1(fail), filter = js.Any.fromFunction1(filter), flatMap = js.Any.fromFunction1(flatMap), fold = js.Any.fromFunction1(fold), group = js.Any.fromFunction1(group), groupCount = js.Any.fromFunction1(groupCount), has = js.Any.fromFunction1(has), hasId = js.Any.fromFunction1(hasId), hasKey = js.Any.fromFunction1(hasKey), hasLabel = js.Any.fromFunction1(hasLabel), hasNot = js.Any.fromFunction1(hasNot), hasValue = js.Any.fromFunction1(hasValue), id = js.Any.fromFunction1(id), identity = js.Any.fromFunction1(identity), inE = js.Any.fromFunction1(inE), inV = js.Any.fromFunction1(inV), in_ = js.Any.fromFunction1(in_), index = js.Any.fromFunction1(index), inject = js.Any.fromFunction1(inject), is = js.Any.fromFunction1(is), key = js.Any.fromFunction1(key), label = js.Any.fromFunction1(label), limit = js.Any.fromFunction1(limit), local = js.Any.fromFunction1(local), loops = js.Any.fromFunction1(loops), map = js.Any.fromFunction1(map), math = js.Any.fromFunction1(math), max = js.Any.fromFunction1(max), mean = js.Any.fromFunction1(mean), mergeE = js.Any.fromFunction1(mergeE), mergeV = js.Any.fromFunction1(mergeV), min = js.Any.fromFunction1(min), not = js.Any.fromFunction1(not), optional = js.Any.fromFunction1(optional), or = js.Any.fromFunction1(or), order = js.Any.fromFunction1(order), otherV = js.Any.fromFunction1(otherV), out = js.Any.fromFunction1(out), outE = js.Any.fromFunction1(outE), outV = js.Any.fromFunction1(outV), path = js.Any.fromFunction1(path), project = js.Any.fromFunction1(project), properties = js.Any.fromFunction1(properties), property = js.Any.fromFunction1(property), propertyMap = js.Any.fromFunction1(propertyMap), range = js.Any.fromFunction1(range), repeat = js.Any.fromFunction1(repeat), sack = js.Any.fromFunction1(sack), sample = js.Any.fromFunction1(sample), select = js.Any.fromFunction1(select), sideEffect = js.Any.fromFunction1(sideEffect), simplePath = js.Any.fromFunction1(simplePath), skip = js.Any.fromFunction1(skip), store = js.Any.fromFunction1(store), subgraph = js.Any.fromFunction1(subgraph), sum = js.Any.fromFunction1(sum), tail = js.Any.fromFunction1(tail), timeLimit = js.Any.fromFunction1(timeLimit), times = js.Any.fromFunction1(times), to = js.Any.fromFunction1(to), toE = js.Any.fromFunction1(toE), toV = js.Any.fromFunction1(toV), tree = js.Any.fromFunction1(tree), unfold = js.Any.fromFunction1(unfold), union = js.Any.fromFunction1(union), until = js.Any.fromFunction1(until), value = js.Any.fromFunction1(value), valueMap = js.Any.fromFunction1(valueMap), values = js.Any.fromFunction1(values), where = js.Any.fromFunction1(where))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Statics[T]]
    }
    
    extension [Self <: Statics[?], T /* <: GraphTraversal */](x: Self & Statics[T]) {
      
      inline def setAddE(value: /* repeated */ Any => T): Self = StObject.set(x, "addE", js.Any.fromFunction1(value))
      
      inline def setAddV(value: /* repeated */ Any => T): Self = StObject.set(x, "addV", js.Any.fromFunction1(value))
      
      inline def setAggregate(value: /* repeated */ Any => T): Self = StObject.set(x, "aggregate", js.Any.fromFunction1(value))
      
      inline def setAnd(value: /* repeated */ Any => T): Self = StObject.set(x, "and", js.Any.fromFunction1(value))
      
      inline def setAs(value: /* repeated */ Any => T): Self = StObject.set(x, "as", js.Any.fromFunction1(value))
      
      inline def setBarrier(value: /* repeated */ Any => T): Self = StObject.set(x, "barrier", js.Any.fromFunction1(value))
      
      inline def setBoth(value: /* repeated */ Any => T): Self = StObject.set(x, "both", js.Any.fromFunction1(value))
      
      inline def setBothE(value: /* repeated */ Any => T): Self = StObject.set(x, "bothE", js.Any.fromFunction1(value))
      
      inline def setBothV(value: /* repeated */ Any => T): Self = StObject.set(x, "bothV", js.Any.fromFunction1(value))
      
      inline def setBranch(value: /* repeated */ Any => T): Self = StObject.set(x, "branch", js.Any.fromFunction1(value))
      
      inline def setCall(value: /* repeated */ Any => T): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
      
      inline def setCap(value: /* repeated */ Any => T): Self = StObject.set(x, "cap", js.Any.fromFunction1(value))
      
      inline def setChoose(value: /* repeated */ Any => T): Self = StObject.set(x, "choose", js.Any.fromFunction1(value))
      
      inline def setCoalesce(value: /* repeated */ Any => T): Self = StObject.set(x, "coalesce", js.Any.fromFunction1(value))
      
      inline def setCoin(value: /* repeated */ Any => T): Self = StObject.set(x, "coin", js.Any.fromFunction1(value))
      
      inline def setConstant(value: /* repeated */ Any => T): Self = StObject.set(x, "constant", js.Any.fromFunction1(value))
      
      inline def setCount(value: /* repeated */ Any => T): Self = StObject.set(x, "count", js.Any.fromFunction1(value))
      
      inline def setCyclicPath(value: /* repeated */ Any => T): Self = StObject.set(x, "cyclicPath", js.Any.fromFunction1(value))
      
      inline def setDedup(value: /* repeated */ Any => T): Self = StObject.set(x, "dedup", js.Any.fromFunction1(value))
      
      inline def setDrop(value: /* repeated */ Any => T): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      inline def setElementMap(value: /* repeated */ Any => T): Self = StObject.set(x, "elementMap", js.Any.fromFunction1(value))
      
      inline def setEmit(value: /* repeated */ Any => T): Self = StObject.set(x, "emit", js.Any.fromFunction1(value))
      
      inline def setFail(value: /* repeated */ Any => T): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      inline def setFilter(value: /* repeated */ Any => T): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFlatMap(value: /* repeated */ Any => T): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setFold(value: /* repeated */ Any => T): Self = StObject.set(x, "fold", js.Any.fromFunction1(value))
      
      inline def setGroup(value: /* repeated */ Any => T): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
      
      inline def setGroupCount(value: /* repeated */ Any => T): Self = StObject.set(x, "groupCount", js.Any.fromFunction1(value))
      
      inline def setHas(value: /* repeated */ Any => T): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setHasId(value: /* repeated */ Any => T): Self = StObject.set(x, "hasId", js.Any.fromFunction1(value))
      
      inline def setHasKey(value: /* repeated */ Any => T): Self = StObject.set(x, "hasKey", js.Any.fromFunction1(value))
      
      inline def setHasLabel(value: /* repeated */ Any => T): Self = StObject.set(x, "hasLabel", js.Any.fromFunction1(value))
      
      inline def setHasNot(value: /* repeated */ Any => T): Self = StObject.set(x, "hasNot", js.Any.fromFunction1(value))
      
      inline def setHasValue(value: /* repeated */ Any => T): Self = StObject.set(x, "hasValue", js.Any.fromFunction1(value))
      
      inline def setId(value: /* repeated */ Any => T): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setIdentity(value: /* repeated */ Any => T): Self = StObject.set(x, "identity", js.Any.fromFunction1(value))
      
      inline def setInE(value: /* repeated */ Any => T): Self = StObject.set(x, "inE", js.Any.fromFunction1(value))
      
      inline def setInV(value: /* repeated */ Any => T): Self = StObject.set(x, "inV", js.Any.fromFunction1(value))
      
      inline def setIn_(value: /* repeated */ Any => T): Self = StObject.set(x, "in_", js.Any.fromFunction1(value))
      
      inline def setIndex(value: /* repeated */ Any => T): Self = StObject.set(x, "index", js.Any.fromFunction1(value))
      
      inline def setInject(value: /* repeated */ Any => T): Self = StObject.set(x, "inject", js.Any.fromFunction1(value))
      
      inline def setIs(value: /* repeated */ Any => T): Self = StObject.set(x, "is", js.Any.fromFunction1(value))
      
      inline def setKey(value: /* repeated */ Any => T): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setLabel(value: /* repeated */ Any => T): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLimit(value: /* repeated */ Any => T): Self = StObject.set(x, "limit", js.Any.fromFunction1(value))
      
      inline def setLocal(value: /* repeated */ Any => T): Self = StObject.set(x, "local", js.Any.fromFunction1(value))
      
      inline def setLoops(value: /* repeated */ Any => T): Self = StObject.set(x, "loops", js.Any.fromFunction1(value))
      
      inline def setMap(value: /* repeated */ Any => T): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setMatch(value: /* repeated */ Any => T): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setMath(value: /* repeated */ Any => T): Self = StObject.set(x, "math", js.Any.fromFunction1(value))
      
      inline def setMax(value: /* repeated */ Any => T): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      inline def setMean(value: /* repeated */ Any => T): Self = StObject.set(x, "mean", js.Any.fromFunction1(value))
      
      inline def setMergeE(value: /* repeated */ Any => T): Self = StObject.set(x, "mergeE", js.Any.fromFunction1(value))
      
      inline def setMergeV(value: /* repeated */ Any => T): Self = StObject.set(x, "mergeV", js.Any.fromFunction1(value))
      
      inline def setMin(value: /* repeated */ Any => T): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      inline def setNot(value: /* repeated */ Any => T): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
      
      inline def setOptional(value: /* repeated */ Any => T): Self = StObject.set(x, "optional", js.Any.fromFunction1(value))
      
      inline def setOr(value: /* repeated */ Any => T): Self = StObject.set(x, "or", js.Any.fromFunction1(value))
      
      inline def setOrder(value: /* repeated */ Any => T): Self = StObject.set(x, "order", js.Any.fromFunction1(value))
      
      inline def setOtherV(value: /* repeated */ Any => T): Self = StObject.set(x, "otherV", js.Any.fromFunction1(value))
      
      inline def setOut(value: /* repeated */ Any => T): Self = StObject.set(x, "out", js.Any.fromFunction1(value))
      
      inline def setOutE(value: /* repeated */ Any => T): Self = StObject.set(x, "outE", js.Any.fromFunction1(value))
      
      inline def setOutV(value: /* repeated */ Any => T): Self = StObject.set(x, "outV", js.Any.fromFunction1(value))
      
      inline def setPath(value: /* repeated */ Any => T): Self = StObject.set(x, "path", js.Any.fromFunction1(value))
      
      inline def setProject(value: /* repeated */ Any => T): Self = StObject.set(x, "project", js.Any.fromFunction1(value))
      
      inline def setProperties(value: /* repeated */ Any => T): Self = StObject.set(x, "properties", js.Any.fromFunction1(value))
      
      inline def setProperty(value: /* repeated */ Any => T): Self = StObject.set(x, "property", js.Any.fromFunction1(value))
      
      inline def setPropertyMap(value: /* repeated */ Any => T): Self = StObject.set(x, "propertyMap", js.Any.fromFunction1(value))
      
      inline def setRange(value: /* repeated */ Any => T): Self = StObject.set(x, "range", js.Any.fromFunction1(value))
      
      inline def setRepeat(value: /* repeated */ Any => T): Self = StObject.set(x, "repeat", js.Any.fromFunction1(value))
      
      inline def setSack(value: /* repeated */ Any => T): Self = StObject.set(x, "sack", js.Any.fromFunction1(value))
      
      inline def setSample(value: /* repeated */ Any => T): Self = StObject.set(x, "sample", js.Any.fromFunction1(value))
      
      inline def setSelect(value: /* repeated */ Any => T): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSideEffect(value: /* repeated */ Any => T): Self = StObject.set(x, "sideEffect", js.Any.fromFunction1(value))
      
      inline def setSimplePath(value: /* repeated */ Any => T): Self = StObject.set(x, "simplePath", js.Any.fromFunction1(value))
      
      inline def setSkip(value: /* repeated */ Any => T): Self = StObject.set(x, "skip", js.Any.fromFunction1(value))
      
      inline def setStore(value: /* repeated */ Any => T): Self = StObject.set(x, "store", js.Any.fromFunction1(value))
      
      inline def setSubgraph(value: /* repeated */ Any => T): Self = StObject.set(x, "subgraph", js.Any.fromFunction1(value))
      
      inline def setSum(value: /* repeated */ Any => T): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      inline def setTail(value: /* repeated */ Any => T): Self = StObject.set(x, "tail", js.Any.fromFunction1(value))
      
      inline def setTimeLimit(value: /* repeated */ Any => T): Self = StObject.set(x, "timeLimit", js.Any.fromFunction1(value))
      
      inline def setTimes(value: /* repeated */ Any => T): Self = StObject.set(x, "times", js.Any.fromFunction1(value))
      
      inline def setTo(value: /* repeated */ Any => T): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
      
      inline def setToE(value: /* repeated */ Any => T): Self = StObject.set(x, "toE", js.Any.fromFunction1(value))
      
      inline def setToV(value: /* repeated */ Any => T): Self = StObject.set(x, "toV", js.Any.fromFunction1(value))
      
      inline def setTree(value: /* repeated */ Any => T): Self = StObject.set(x, "tree", js.Any.fromFunction1(value))
      
      inline def setUnfold(value: /* repeated */ Any => T): Self = StObject.set(x, "unfold", js.Any.fromFunction1(value))
      
      inline def setUnion(value: /* repeated */ Any => T): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
      
      inline def setUntil(value: /* repeated */ Any => T): Self = StObject.set(x, "until", js.Any.fromFunction1(value))
      
      inline def setV(value: /* repeated */ Any => T): Self = StObject.set(x, "V", js.Any.fromFunction1(value))
      
      inline def setValue(value: /* repeated */ Any => T): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueMap(value: /* repeated */ Any => T): Self = StObject.set(x, "valueMap", js.Any.fromFunction1(value))
      
      inline def setValues(value: /* repeated */ Any => T): Self = StObject.set(x, "values", js.Any.fromFunction1(value))
      
      inline def setWhere(value: /* repeated */ Any => T): Self = StObject.set(x, "where", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait TextP extends StObject {
    
    def and(): P = js.native
    def and(arg: Any): P = js.native
    
    def or(): P = js.native
    def or(arg: Any): P = js.native
  }
  
  trait Transaction[S /* <: GraphTraversalSource[GraphTraversal] */] extends StObject {
    
    def begin(): S
    
    def close(): js.Promise[Unit]
    
    def commit(): js.Promise[Any]
    
    var isOpen: Boolean
    
    def rollback(): js.Promise[Unit]
  }
  object Transaction {
    
    inline def apply[S /* <: GraphTraversalSource[GraphTraversal] */](
      begin: () => S,
      close: () => js.Promise[Unit],
      commit: () => js.Promise[Any],
      isOpen: Boolean,
      rollback: () => js.Promise[Unit]
    ): Transaction[S] = {
      val __obj = js.Dynamic.literal(begin = js.Any.fromFunction0(begin), close = js.Any.fromFunction0(close), commit = js.Any.fromFunction0(commit), isOpen = isOpen.asInstanceOf[js.Any], rollback = js.Any.fromFunction0(rollback))
      __obj.asInstanceOf[Transaction[S]]
    }
    
    extension [Self <: Transaction[?], S /* <: GraphTraversalSource[GraphTraversal] */](x: Self & Transaction[S]) {
      
      inline def setBegin(value: () => S): Self = StObject.set(x, "begin", js.Any.fromFunction0(value))
      
      inline def setClose(value: () => js.Promise[Unit]): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setCommit(value: () => js.Promise[Any]): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setRollback(value: () => js.Promise[Unit]): Self = StObject.set(x, "rollback", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Translator extends StObject {
    
    def getTraversalSource(): Translator = js.native
    
    def of(traversalSource: String): Unit = js.native
    def of(traversalSource: AnonymousTraversalSource[GraphTraversalSource[GraphTraversal]]): Unit = js.native
    def of(traversalSource: GraphTraversalSource[GraphTraversal]): Unit = js.native
    
    def translate(bytecode: Bytecode): String = js.native
  }
  
  @js.native
  trait Traversal
    extends StObject
       with AsyncIterableIterator[Any] {
    
    def getBytecode(): Bytecode = js.native
    
    def hasNext(): js.Promise[Boolean] = js.native
    
    def iterate(): js.Promise[Unit] = js.native
    
    def next(): js.Promise[IteratorResult[Any, Any]] = js.native
    
    def toList(): js.Promise[js.Array[Traverser]] = js.native
  }
  
  trait TraversalSideEffects extends StObject
  
  trait TraversalStrategies extends StObject {
    
    def addStrategy(strategy: TraversalStrategy): Unit
    
    def applyStrategies(traversal: Traversal): js.Promise[Traversal]
    
    def removeStrategy(strategy: TraversalStrategy): Any
  }
  object TraversalStrategies {
    
    inline def apply(
      addStrategy: TraversalStrategy => Unit,
      applyStrategies: Traversal => js.Promise[Traversal],
      removeStrategy: TraversalStrategy => Any
    ): TraversalStrategies = {
      val __obj = js.Dynamic.literal(addStrategy = js.Any.fromFunction1(addStrategy), applyStrategies = js.Any.fromFunction1(applyStrategies), removeStrategy = js.Any.fromFunction1(removeStrategy))
      __obj.asInstanceOf[TraversalStrategies]
    }
    
    extension [Self <: TraversalStrategies](x: Self) {
      
      inline def setAddStrategy(value: TraversalStrategy => Unit): Self = StObject.set(x, "addStrategy", js.Any.fromFunction1(value))
      
      inline def setApplyStrategies(value: Traversal => js.Promise[Traversal]): Self = StObject.set(x, "applyStrategies", js.Any.fromFunction1(value))
      
      inline def setRemoveStrategy(value: TraversalStrategy => Any): Self = StObject.set(x, "removeStrategy", js.Any.fromFunction1(value))
    }
  }
  
  trait TraversalStrategy extends StObject {
    
    @JSName("apply")
    def apply(traversal: Traversal): js.Promise[Traversal]
  }
  object TraversalStrategy {
    
    inline def apply(apply: Traversal => js.Promise[Traversal]): TraversalStrategy = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[TraversalStrategy]
    }
    
    extension [Self <: TraversalStrategy](x: Self) {
      
      inline def setApply(value: Traversal => js.Promise[Traversal]): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait Traverser extends StObject
  
  trait WithOptions extends StObject {
    
    var all: Double
    
    var ids: Double
    
    var indexer: String
    
    var keys: Double
    
    var labels: Double
    
    var list: Double
    
    var map: Double
    
    var none: Double
    
    var tokens: String
    
    var values: Double
  }
  object WithOptions {
    
    inline def apply(
      all: Double,
      ids: Double,
      indexer: String,
      keys: Double,
      labels: Double,
      list: Double,
      map: Double,
      none: Double,
      tokens: String,
      values: Double
    ): WithOptions = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], indexer = indexer.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithOptions]
    }
    
    extension [Self <: WithOptions](x: Self) {
      
      inline def setAll(value: Double): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setIds(value: Double): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIndexer(value: String): Self = StObject.set(x, "indexer", value.asInstanceOf[js.Any])
      
      inline def setKeys(value: Double): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: Double): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setList(value: Double): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Double): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setNone(value: Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: String): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Double): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    }
  }
}
